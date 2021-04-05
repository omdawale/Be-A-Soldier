package com.example.omkar;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Indian_navy_pastpapers extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_indian_navy_pastpapers);
    }

    public void bro12(View view){
        Intent b12=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1USnEL8h7_5RSptnEHzu8a3jfiIedH3i9/view"));
        startActivity(b12);
    }
    public void bro22(View view){
        Intent b22=new Intent(Intent.ACTION_VIEW,Uri.parse("https://drive.google.com/file/d/18T4kitnSbznESRbE3mMhf8ksSJV22ZYz/view"));
        startActivity(b22);
    }
    public void bro32(View view){
        Intent b32=new Intent(Intent.ACTION_VIEW,Uri.parse("https://drive.google.com/file/d/1WBsbMbqUEH52F6chTY-P2cDq-6sLMKUc/view"));
        startActivity(b32);
    }
}
