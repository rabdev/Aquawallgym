package com.aquawallgym.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.aquawallgym.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class MyTrainings extends Fragment {

    TextView trainer1, trainer2, trainer3;

    public MyTrainings() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View mytrainings = inflater.inflate(R.layout.fragment_my_trainings, container, false);
        trainer1 = (TextView) mytrainings.findViewById(R.id.trainer1);
        trainer2 = (TextView) mytrainings.findViewById(R.id.trainer2);
        trainer3 = (TextView) mytrainings.findViewById(R.id.trainer3);

        trainer1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PopUpTrainer popUpTrainer = new PopUpTrainer();
                FragmentManager fragmentManager=getActivity().getSupportFragmentManager();
                fragmentManager.beginTransaction()
                        .replace(R.id.mytrainings_frame,popUpTrainer, popUpTrainer.getTag())
                        .addToBackStack(null)
                        .commit();
            }
        });

        trainer2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PopUpTrainer popUpTrainer = new PopUpTrainer();
                FragmentManager fragmentManager=getActivity().getSupportFragmentManager();
                fragmentManager.beginTransaction()
                        .replace(R.id.mytrainings_frame,popUpTrainer, popUpTrainer.getTag())
                        .addToBackStack(null)
                        .commit();
            }
        });

        trainer3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PopUpTrainer popUpTrainer = new PopUpTrainer();
                FragmentManager fragmentManager=getActivity().getSupportFragmentManager();
                fragmentManager.beginTransaction()
                        .replace(R.id.mytrainings_frame,popUpTrainer, popUpTrainer.getTag())
                        .addToBackStack(null)
                        .commit();
            }
        });

        return mytrainings;
    }

}
