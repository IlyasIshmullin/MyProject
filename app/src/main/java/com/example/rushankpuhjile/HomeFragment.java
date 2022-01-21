package com.example.rushankpuhjile;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.NavDirections;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

public class HomeFragment extends Fragment {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        view.findViewById(R.id.button1).setOnClickListener(Navigation.createNavigateOnClickListener(R.id.action_homeFragment_to_firstFragment));
        view.findViewById(R.id.button2).setOnClickListener(Navigation.createNavigateOnClickListener(R.id.action_homeFragment_to_secondFragment));
        view.findViewById(R.id.button3).setOnClickListener(Navigation.createNavigateOnClickListener(R.id.action_homeFragment_to_thirdFragment));
        // Inflate the layout for this fragment
        return view;
    }
}