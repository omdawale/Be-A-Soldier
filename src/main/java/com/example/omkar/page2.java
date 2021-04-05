package com.example.omkar;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class page2 extends AppCompatActivity {
    Button btmain;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page2);

        btmain=(Button) findViewById(R.id.info2);
        btmain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent t= new Intent(page2.this,Indian_army_info.class);
                startActivity(t);
            }
        });
        btmain=(Button) findViewById(R.id.eli1);
        btmain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent t1 = new Intent(page2.this,Indian_army_eligibilty.class);
                startActivity(t1);
            }
        });

        btmain=(Button) findViewById(R.id.pp1);
        btmain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent t3= new Intent(page2.this,Indian_army_pp.class);
                startActivity(t3);
            }
        });
    }
    public void brow1(View view){
        Intent br1=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/drive/folders/1ioBOOnK1cy3qjbrWMFzt6Y-QrOtLJ-0p"));
        startActivity(br1);
    }
}
