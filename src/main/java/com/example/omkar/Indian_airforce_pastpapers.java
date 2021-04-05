package com.example.omkar;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Indian_airforce_pastpapers extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_indian_airforce_pastpapers);
    }

    public void bro31(View view){
        Intent b13=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1WZH3258uqf2vf8ObAYoWA_Vf8wIW0wYv/view"));
        startActivity(b13);
    }
    public void bro32(View view){
        Intent b23=new Intent(Intent.ACTION_VIEW,Uri.parse("https://drive.google.com/file/d/1UyjhgXvyLMg8Xa2mwAVPVvr07CNABib0/view"));
        startActivity(b23);
    }
    public void bro33(View view){
        Intent b33=new Intent(Intent.ACTION_VIEW,Uri.parse("https://drive.google.com/file/d/1OdE1axHeueSAmjTjbWlH2Kuraglw01mg/view"));
        startActivity(b33);
    }
}
