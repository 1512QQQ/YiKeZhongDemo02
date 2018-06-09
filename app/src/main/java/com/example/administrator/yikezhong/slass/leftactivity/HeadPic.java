package com.example.administrator.yikezhong.slass.leftactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.administrator.yikezhong.MainActivity;
import com.example.administrator.yikezhong.R;

public class HeadPic extends AppCompatActivity {

    private TextView it_longin;
    private ImageView back01;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_head_pic);
        it_longin = findViewById(R.id.it_longin);
        back01 = findViewById(R.id.back01);
        it_longin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HeadPic.this, Head_login.class);
                startActivity(intent);
            }
        });
        back01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(HeadPic.this, MainActivity.class);
                startActivity(intent2);
            }
        });
    }
}
