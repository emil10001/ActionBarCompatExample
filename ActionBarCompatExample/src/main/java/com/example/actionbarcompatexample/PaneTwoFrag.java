package com.example.actionbarcompatexample;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by ejohn on 8/28/13.
 */
public class PaneTwoFrag extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.frags, container, false);

        v.setBackgroundColor(Color.YELLOW);
        TextView tv = (TextView)v.findViewById(R.id.textView);
        tv.setText("Pane Two");

        return v;
    }

}
