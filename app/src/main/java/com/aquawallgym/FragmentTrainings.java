package com.aquawallgym;


import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.aquawallgym.fragments.Trainers;
import com.aquawallgym.fragments.Trainings;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentTrainings extends Fragment {

    private ViewPager trainingsvp;
    private SectionsPagerAdapter mSectionPagerAdapter;

    public FragmentTrainings() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View trainings = inflater.inflate(R.layout.fragment_trainings, container, false);

        mSectionPagerAdapter = new SectionsPagerAdapter(getChildFragmentManager());
        trainingsvp = (ViewPager) trainings.findViewById(R.id.trainings_container);
        trainingsvp.setAdapter(mSectionPagerAdapter);

        TabLayout tabLayout = (TabLayout) trainings.findViewById(R.id.trainings_tab);
        tabLayout.setupWithViewPager(trainingsvp);

        return trainings;

    }
    public class SectionsPagerAdapter extends FragmentPagerAdapter {

        public SectionsPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            switch (position){
                case 0:
                    Trainings trainings = new Trainings();
                    return trainings;
                case 1:
                    Trainers trainers = new Trainers();
                    return trainers;
                default:
                    return null;
            }
        }

        @Override
        public int getCount() {
            // Show 4 total pages.
            return 2;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            switch (position) {
                case 0:
                    return "Edzések";
                case 1:
                    return "Edzők";
            }
            return null;
        }
    }
}
