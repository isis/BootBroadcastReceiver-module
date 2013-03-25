package jp.isisredirect.bootbroadcastreceiver;

import org.appcelerator.titanium.TiApplication;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

public class BootBroadcastReceiver extends BroadcastReceiver {

	@Override
	public void onReceive(Context context, Intent intent) {
		String appname = TiApplication.getInstance().getClass().getName();
		Log.d("BootBroadcastReceiver", "onReceive appname: " + appname);
		String[] packagenameelements = appname.split("\\Q.\\E");
		String packagename = "";
		packagename = packagenameelements[0];
		for (int i = 1, l = packagenameelements.length - 1; i < l; ++i) {
			packagename += "." + packagenameelements[i];
		}
		Log.d("BootBroadcastReceiver", "onReceive packagename: " + packagename);
		
		if ((intent.getAction().equals(Intent.ACTION_PACKAGE_REPLACED) // for update app 
				&& intent.getDataString().contains(packagename))
				|| intent.getAction().equals(Intent.ACTION_BOOT_COMPLETED)) { // for boot
			/* for service 
			Intent i = new Intent(context, NotificationService.class);
			context.startService(i);
			*/
			Log.d("BootBroadcastReceiver", "onReceive");
			/* for app */
			try {

				String activityname = appname.replace("Application", "Activity");
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
