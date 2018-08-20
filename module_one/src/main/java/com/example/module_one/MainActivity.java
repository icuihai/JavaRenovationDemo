package com.example.module_one;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.alibaba.android.arouter.facade.annotation.Route;

@Route(path = Constants.ROUTE_MODULE_ONE)
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_module_one);
        TextView textView = findViewById(R.id.tv1);
        if (getIntent() != null) {
            UserInfo userInfo = getIntent().getParcelableExtra(Constants.USERINFO);
            if (userInfo != null) {
                textView.setText(userInfo.getId() + userInfo.getName());
            }
            if (getIntent().getStringExtra(Constants.STRING) != null) {
                textView.setText(getIntent().getStringExtra(Constants.STRING));
            }
        }
    }
}

