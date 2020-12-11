package com.example.app_th_passiocoffe.View;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class Fragment_ChonMon extends FragmentPagerAdapter {
    public Fragment_ChonMon(@NonNull FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new ChonMon_1();
            case 1:
                return new ChonMon_2();
            case 2:
                return new ChonMon_3();
            case 3:
                return new ChonMon_4();

            default:
                return new ChonMon_1();
        }
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        String title = null;
        if (position == 0) {
            title = "Trà sữa";
        } else if (position == 1) {
            title = "Cà phê";
        }
        else if (position == 2) {
            title = "Passio coffe";
        }
        else if (position == 3) {
            title = "Thức uống";
        }
        return title;
    }
}