package com.example.apurp_000.dementiaapp;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.Button;
import android.support.v4.app.NotificationCompat;
import android.support.v4.app.NotificationManagerCompat;
import android.widget.EditText;

import static com.example.apurp_000.dementiaapp.R.string.edit_message;


public class HelloWorldActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello_world);
        Button wearButton = (Button)findViewById(R.id.wearButton);
        final EditText mEdit = (EditText) findViewById(R.id.edit_message);
        wearButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int notificationId = 001;

                NotificationCompat.Builder notificationBuilder =
                        new NotificationCompat.Builder(HelloWorldActivity.this)
                                .setSmallIcon(R.mipmap.ic_launcher)
                                .setContentTitle("HelloWorld")
                                .setContentText(mEdit.getText().toString());
                NotificationManagerCompat notificationManager =
                        NotificationManagerCompat.from(HelloWorldActivity.this);

                notificationManager.notify(notificationId, notificationBuilder.build());
            }
        });

    }
}
