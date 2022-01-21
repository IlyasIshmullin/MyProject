package com.example.rushankpuhjile;

import android.graphics.Color;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link FirstFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class FirstFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static boolean yandex;
    {
        yandex = false;
    }
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_first, container, false);
        view.findViewById(R.id.changeColor).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (yandex)
                    view.findViewById(R.id.linAlyout1).setBackgroundColor(Color.argb(255, 255, 204, 0));
                else
                    view.findViewById(R.id.linAlyout1).setBackgroundColor(Color.argb(255, 0, 102, 255));
                yandex = !yandex;
            }
        });
        // Inflate the layout for this fragment
        return view;
    }

}