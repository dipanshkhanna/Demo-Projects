package com.dipansh.tabhostdemo;

import android.app.TabActivity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TabHost;

public class MainActivity extends TabActivity {
    TabHost tabHost;
    TabHost.TabSpec tabSpec1,tabSpec2,tabSpec3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tabHost = (TabHost)findViewById(android.R.id.tabhost);
        tabSpec1=tabHost.newTabSpec("Call");
        tabSpec2=tabHost.newTabSpec("Chat");
        tabSpec3=tabHost.newTabSpec("Contact");

        tabSpec1.setIndicator("Call");
        tabSpec2.setIndicator("Chat");
        tabSpec3.setIndicator("Contact");

        tabSpec1.setContent(new Intent(this,Call.class));
        tabSpec2.setContent(new Intent(this,Chat.class));
        tabSpec3.setContent(new Intent(this,Contact.class));
        tabHost.addTab(tabSpec1);
        tabHost.addTab(tabSpec2);
        tabHost.addTab(tabSpec3);
    }
}
