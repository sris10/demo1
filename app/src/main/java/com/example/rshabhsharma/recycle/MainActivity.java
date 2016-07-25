package com.example.rshabhsharma.recycle;

import android.app.NotificationManager;
import android.content.Context;
import android.graphics.BitmapFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.app.NotificationCompat;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.LinearLayout;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Batch> batches;
    RCVadapter adapter;
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        batches.add(new Batch("andr",40));
        batches.add(new Batch("cpp",40));
        batches.add(new Batch("java",40));
        batches.add(new Batch("ror",40));
        batches.add(new Batch("andr",40));
        batches.add(new Batch("cpp",40));
        batches.add(new Batch("java",40));
        batches.add(new Batch("ror",40));
        batches.add(new Batch("andr",40));
        batches.add(new Batch("cpp",40));
        batches.add(new Batch("java",40));
        batches.add(new Batch("ror",40));

        adapter =  new RCVadapter(this,batches);
        recyclerView.setAdapter(adapter);
        adapter.notifyDataSetChanged();

        LinearLayoutManager lm = new LinearLayoutManager();
        recyclerView.setLayoutManager(lm);

        //when button clicked
        NotificationCompat.Builder builder = new NotificationCompat.Builder(this);
        builder.setSmallIcon(android.R.drawable.ic_dialog_email)
                .setLargeIcon(BitmapFactory.decodeResource(getResources(),android.R.drawable.alert_dark_frame))
                .setTicker("Blah Blah Blah Blah Blha Blah Blah bLah")
                .setContentTitle("title")
                .setContentText("text text texttext text text text text text ")
                .setAutoCancel(true);
        NotificationManager manager = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
        manager.notify(1,builder.build());

    }
}
