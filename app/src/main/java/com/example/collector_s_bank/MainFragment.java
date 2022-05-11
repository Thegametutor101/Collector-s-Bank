package com.example.collector_s_bank;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

public class MainFragment extends Fragment {

    Button mtgButton;
    Button pokButton;
    Button ygoButton;

    public MainFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        mtgButton = view.findViewById(R.id.mtg_button);
        pokButton = view.findViewById(R.id.pok_button);
        ygoButton = view.findViewById(R.id.ygo_button);

        mtgButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MtgFragment mtgFragment = new MtgFragment();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.fragment_container, mtgFragment)
                        .addToBackStack(null)
                        .commit();
            }
        });
        pokButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(),"POK", Toast.LENGTH_LONG).show();
            }
        });
        ygoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(),"YGO", Toast.LENGTH_LONG).show();
            }
        });
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_main, container, false);
    }
}