package com.sty.fragment.communication;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Shi Tianyi on 2018/3/18/0018.
 */

public class Fragment2 extends Fragment {
    private TextView tvText;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment2, null);
        tvText = view.findViewById(R.id.tv_text);
        return view;
    }

    //修改textview值的方法
    public void setText(String content){
        tvText.setText(content);
    }
}
