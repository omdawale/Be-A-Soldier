package com.example.omkar;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Page4 extends AppCompatActivity {
    Button btmain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page4);

        btmain=findViewById(R.id.info4);
        btmain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a1=new Intent(Page4.this,Indian_navy_info.class);
                startActivity(a1);
            }
        });
        btmain=findViewById(R.id.pp3);
        btmain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a2= new Intent(Page4.this,Indian_navy_pastpapers.class);
                startActivity(a2);
            }
        });
        btmain=findViewById(R.id.eli3);
        btmain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a4= new Intent(Page4.this,Indian_navy_eliibility.class);
                startActivity(a4);
            }
        });
    }
    public void brow3(View view){
        Intent br3=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/drive/folders/16McSfJQg6M2K-U_uCTPuVsQEw8axLZhc"));
        startActivity(br3);
    }
}
