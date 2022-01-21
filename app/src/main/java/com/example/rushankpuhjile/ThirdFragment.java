package com.example.rushankpuhjile;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.Toast;

public class ThirdFragment extends Fragment {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_third, container, false);
        view.findViewById(R.id.sendButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str = ((EditText)view.findViewById(R.id.inputText)).getText().toString();
                if (str == null || str.equals("")) {
                    Toast.makeText(getContext(), "Write anything!", Toast.LENGTH_SHORT).show();
                    return;
                }
                Toast.makeText(getContext(), "You write: " + str, Toast.LENGTH_SHORT).show();
            }
        });

        // Inflate the layout for this fragment
        return view;
    }
}