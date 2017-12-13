package blog.praveendeshmane.co.in.custombroadcastintentexample;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class MyReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context,"custom intent",Toast.LENGTH_SHORT).show();
    }
}
