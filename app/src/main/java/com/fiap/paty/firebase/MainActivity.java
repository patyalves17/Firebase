package com.fiap.paty.firebase;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.crashlytics.android.Crashlytics;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.messaging.FirebaseMessaging;

import io.fabric.sdk.android.Fabric;

public class MainActivity extends AppCompatActivity {

    private FirebaseAnalytics mFirebaseAnalytics;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        mFirebaseAnalytics=FirebaseAnalytics.getInstance(this);
        FirebaseMessaging.getInstance().subscribeToTopic("mob");
    }


    public void ClickMe(View v){
        Log.i("Click","Click");
        Bundle params =new Bundle();
        params.putString("Nome","Paty");
        mFirebaseAnalytics.logEvent("clickMe",params);
    }

   


}
