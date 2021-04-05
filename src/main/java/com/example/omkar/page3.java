package com.example.omkar;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class page3 extends AppCompatActivity {
    Button btmain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page3);

        btmain = findViewById(R.id.info3);
        btmain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent p1= new Intent(page3.this,Indian_airforce_info.class);
                startActivity(p1);

            }
        });
        btmain=findViewById(R.id.eli2);
        btmain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent p3=new Intent(page3.this,Indian_airforce_eligibility.class);
                startActivity(p3);
            }
        });
        btmain=findViewById(R.id.pp2);
        btmain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent p4=new Intent(page3.this,Indian_airforce_pastpapers.class);
                startActivity(p4);
            }
        });
    }
    public void brow2(View view){
        Intent br2=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/drive/folders/1_EwukT9cDDZhBXW_HyxRYx24xWIxjedj"));
        startActivity(br2);
    }
}
