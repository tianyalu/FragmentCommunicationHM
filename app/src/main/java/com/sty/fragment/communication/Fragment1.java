package com.sty.fragment.communication;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

/**
 * Created by Shi Tianyi on 2018/3/18/0018.
 */

public class Fragment1 extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment1, null);
        view.findViewById(R.id.btn_change).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "这是fragment1中的Toast", Toast.LENGTH_SHORT).show();
                Fragment2 fragment2 = (Fragment2) getActivity().getFragmentManager().findFragmentByTag("f2");
                fragment2.setText("啦啦啦啦啦");
            }
        });
        return view;
    }
}
