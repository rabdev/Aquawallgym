package com.aquawallgym.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

import com.aquawallgym.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class PopUpTrainer extends Fragment {


    public PopUpTrainer() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View popup=inflater.inflate(R.layout.fragment_pop_up_trainer, container, false);
        FrameLayout popupframe= (FrameLayout) popup.findViewById(R.id.pop_up_frame);
        popupframe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getActivity().onBackPressed();
            }
        });
        return popup;
    }

}
