package teaonly.droideye;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

import teaonly.droideye.MainActivity;

/**
 * Created by ashi on 10/22/14.
 */

/**
 * Start main activity whenever the device boots
 */
public class StartupService extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        Log.d("Various", "Starting up!");
        if (intent.getAction().equals(Intent.ACTION_BOOT_COMPLETED)){
            Log.d("Various", "Starting up!!!!!");
            Intent launchActivityIntent = new Intent(context, MainActivity.class);
            launchActivityIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            context.startActivity(launchActivityIntent);
        }
    }
}