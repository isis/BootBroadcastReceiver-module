/*
Copyright (c) 2013 Katsumi ISHIDA. All rights reserved.

Permission is hereby granted, free of charge, to any person obtaining a copy of 
this software and associated documentation files (the "Software"), to deal in the 
Software without restriction, including without limitation the rights to use, copy, 
modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, 
and to permit persons to whom the Software is furnished to do so, subject to the 
following conditions:

The above copyright notice and this permission notice shall be included in all copies
 or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, 
INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR
 PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE 
 LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, 
 TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE 
 OR OTHER DEALINGS IN THE SOFTWARE.
 */
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
