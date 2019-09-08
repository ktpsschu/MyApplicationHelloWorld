package com.example.myapplicationhello_world;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView tv_show;
    private Button btn_show;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); //R->res

        tv_show = findViewById(R.id.tv_show); //不需要casting (TextView)
        btn_show = findViewById(R.id.btn_show); //不需要casting (Button

        btn_show.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //這裡放按下按鈕後要做的事
                tv_show.setText("Button Clicked");
                tv_show.setTextSize(100);

                btn_show.setText("nothing happens");
            }
        });
    }
}
