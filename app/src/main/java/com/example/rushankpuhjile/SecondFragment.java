package com.example.rushankpuhjile;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextClock;
import android.widget.TextView;


public class SecondFragment extends Fragment {
    private static int count = 0;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_second, container, false);
        ((TextView)view.findViewById(R.id.outText)).setText("Count: " + count);
        view.findViewById(R.id.clicker).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count++;
                ((TextView)view.findViewById(R.id.outText)).setText("Count: " + count);
            }
        });
        return view;
    }
}