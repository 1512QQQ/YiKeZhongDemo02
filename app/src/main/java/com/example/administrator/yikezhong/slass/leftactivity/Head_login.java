package com.example.administrator.yikezhong.slass.leftactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.administrator.yikezhong.MainActivity;
import com.example.administrator.yikezhong.R;

public class Head_login extends AppCompatActivity {

    private ImageView back02;
    private TextView from;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_head_login);
        back02 = findViewById(R.id.back02);
        from = findViewById(R.id.from);
        back02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Head_login.this, HeadPic.class);
                startActivity(intent);
            }
        });
        from.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(Head_login.this, MainActivity.class);
                startActivity(intent2);
            }
        });
    }
}
