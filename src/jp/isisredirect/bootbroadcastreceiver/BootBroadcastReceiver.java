package jp.isisredirect.bootbroadcastreceiver;

import org.appcelerator.titanium.TiApplication;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

public class BootBroadcastReceiver extends BroadcastReceiver {

	@Override
	public void onReceive(Context context, Intent intent) {
		if ((intent.getAction().equals(Intent.ACTION_PACKAGE_REPLACED) // for update app 
				/*&& intent
				.getDataString().contains("com.my.app")*/)
				|| intent.getAction().equals(Intent.ACTION_BOOT_COMPLETED)) { // for boot
			/* for service 
			Intent i = new Intent(context, NotificationService.class);
			context.startService(i);
			*/
			Log.d("BootBroadcastReceiver", "onReceive");
			/* for app */
			try {

				String activityname = TiApplication.getInstance().getClass().getName().replace("Application", "Activity");
				Log.d("BootBroadcastReceiver", "activityname:" + activityname);				
				Class<?> activityclass;
					activityclass = Class.forName(activityname);
				Intent i = new Intent(context, activityclass); 
		        i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
		        context.startActivity(i);
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
		}
	}

}
