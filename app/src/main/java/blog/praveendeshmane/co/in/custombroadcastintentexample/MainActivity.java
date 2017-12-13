package blog.praveendeshmane.co.in.custombroadcastintentexample;

import android.content.Intent;
import android.content.IntentFilter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    MyRegisteredReceiver myRegisteredReceiver;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        IntentFilter intent = new IntentFilter("com.example.Broadcast");
        myRegisteredReceiver = new MyRegisteredReceiver();
        registerReceiver(myRegisteredReceiver,intent);
    }

    public void broadcast(View view){
        Intent intent = new Intent();
        intent.setAction("blog.praveendeshmane.co.in.custombroadcastintentexample_CUSTOM_INTENT");
        sendBroadcast(intent);
        Intent intent1 = new Intent();
        intent1.setAction("com.example.Broadcast");
        sendBroadcast(intent1);
    }

    public void unregister(View view){
        unregisterReceiver(myRegisteredReceiver);
    }
}
