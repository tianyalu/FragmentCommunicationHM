package com.sty.fragment.communication;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //1.获取Fragment管理者
        FragmentManager fragmentManager = getFragmentManager();
        //2.开启事务
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        //3.动态替换
        fragmentTransaction.replace(R.id.ll_l1, new Fragment1(), "f1");
        fragmentTransaction.replace(R.id.ll_l2, new Fragment2(), "f2");

        //4. commit
        fragmentTransaction.commit();
    }
}
