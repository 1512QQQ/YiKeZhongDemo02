package com.example.administrator.yikezhong.slass.leftactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.administrator.yikezhong.MainActivity;
import com.example.administrator.yikezhong.R;

public class Head_white extends AppCompatActivity {

    private TextView cord2;
    private TextView from2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_head_white);
        cord2 = findViewById(R.id.cord2);
        from2 = findViewById(R.id.from2);
        cord2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Head_white.this, Head_login.class);
                startActivity(intent);
            }
        });
        from2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(Head_white.this, MainActivity.class);
                startActivity(intent2);
            }
        });
    }
}
