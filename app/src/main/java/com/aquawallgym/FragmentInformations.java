package com.aquawallgym;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.design.widget.TabLayout;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.aquawallgym.fragments.About;
import com.aquawallgym.fragments.MainPage;
import com.aquawallgym.fragments.TrainingSystem;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentInformations extends Fragment {

    private ViewPager informationsvp;
    private SectionsPagerAdapter mSectionPagerAdapter;

    public FragmentInformations() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View informations = inflater.inflate(R.layout.fragment_informations, container, false);

        mSectionPagerAdapter = new SectionsPagerAdapter(getChildFragmentManager());
        informationsvp = (ViewPager) informations.findViewById(R.id.informations_container);
        informationsvp.setAdapter(mSectionPagerAdapter);

        TabLayout tabLayout = (TabLayout) informations.findViewById(R.id.informations_tab);
        tabLayout.setupWithViewPager(informationsvp);

        return informations;
    }

    public class SectionsPagerAdapter extends FragmentPagerAdapter {

        public SectionsPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            switch (position){
                case 0:
                    MainPage mainPage = new MainPage();
                    return mainPage;
                case 1:
                    About about = new About();
                    return about;
                case 2:
                    TrainingSystem trainingSystem = new TrainingSystem();
                    return trainingSystem;
                default:
                    return null;
            }
        }

        @Override
        public int getCount() {
            // Show 4 total pages.
            return 3;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            switch (position) {
                case 0:
                    return "Főoldal";
                case 1:
                    return "Aquawallgym";
                case 2:
                    return "Training System";
            }
            return null;
        }
    }

}
