package com.aquawallgym.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.aquawallgym.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class Administration extends Fragment {


    public Administration() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View administration = inflater.inflate(R.layout.fragment_administration, container, false);
        return administration;
    }

}
