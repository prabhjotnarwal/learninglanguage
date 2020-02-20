package com.example.learninglanguage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class levelActivity extends AppCompatActivity {
public Button ad,in,ba;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level);
        ad=findViewById(R.id.advance);
        in=findViewById(R.id.inter);
        ba=findViewById(R.id.basic);
        int value = getIntent().getExtras().getInt("position");
        
        ad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(levelActivity.this,AdvanceLevel.class);
                startActivity(intent);
            }
        });
        in.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(levelActivity.this,alphaLesson2.class);
                startActivity(intent);
            }
        });
        ba.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(levelActivity.this,alphaLesson1.class);
                startActivity(intent);
            }
        });
    }
}
