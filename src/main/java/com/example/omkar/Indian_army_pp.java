package com.example.omkar;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Indian_army_pp extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_indian_army_pp);
    }
    public void bro1(View view) {
        Intent b1 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1BZyoyiKUiaXS8nlZkRFsn-iGsp81HF5T/view"));
        startActivity(b1);
    }
    public void bro2(View view){
        Intent b2=new Intent(Intent.ACTION_VIEW,Uri.parse("https://drive.google.com/file/d/14ZGntlG8r-xAgB2vVM7GjpmUKeT2kY0T/view"));
        startActivity(b2);
    }
    public void bro3(View view){
        Intent b3=new Intent(Intent.ACTION_VIEW,Uri.parse("https://drive.google.com/file/d/1XHBG2SyDVhvrsmkguw6jOKAl9NjPhhLF/view"));
        startActivity(b3);
    }
}
