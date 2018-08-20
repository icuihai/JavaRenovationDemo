package com.example.ch.javarenovationdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.alibaba.android.arouter.launcher.ARouter;
import com.example.module_one.Constants;
import com.example.module_one.UserInfo;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.btn1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ARouter.getInstance().build(Constants.ROUTE_MODULE_ONE).navigation();
            }
        });
        findViewById(R.id.btn2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ARouter.getInstance().build(Constants.ROUTE_MODULE_ONE).withString(Constants.STRING,"icuihai.com").navigation();
            }
        });
        findViewById(R.id.btn3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                UserInfo userInfo = new UserInfo();
                userInfo.setId(1);
                userInfo.setName("ich");
                Bundle bundle = new Bundle();
                bundle.putParcelable(Constants.USERINFO, userInfo);
                ARouter.getInstance().build(Constants.ROUTE_MODULE_ONE).with(bundle).navigation();
            }
        });
    }
}
