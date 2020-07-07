package com.example.bottomnavbar;

import androidx.appcompat.app.AppCompatActivity;


import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.util.Log;

import com.ismaeldivita.chipnavigation.ChipNavigationBar;

public class MainActivity extends AppCompatActivity {

    ChipNavigationBar BottomNav;
    FragmentManager fragmentManager;



    private String myString = "hello";
    private String myString2 = "hello2";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BottomNav = findViewById(R.id.bottom_nav);

        Fragment fragment = new HomeFragment();

        fragmentManager = getSupportFragmentManager();
        fragmentManager.beginTransaction().replace(R.id.fragment_container, fragment).commit();







        BottomNav.setOnItemSelectedListener(new ChipNavigationBar.OnItemSelectedListener() {
            @Override
            public void onItemSelected(int id) {

                Fragment fragment = null;

                switch (id){
                    case  R.id.home:
                        fragment = new HomeFragment();
                        break;

                    case  R.id.discover:
                        fragment = new DiscoverFragment();
                        break;

                    case  R.id.account:
                        fragment = new AccountFragment();
                        break;
                    case  R.id.account2:
                        fragment = new DiscoverFragment();
                        break;
                    case  R.id.account3:
                        fragment = new HomeFragment();
                        break;

                }

                if (fragment != null){
                    fragmentManager = getSupportFragmentManager();
                    fragmentManager.beginTransaction().replace(R.id.fragment_container, fragment).commit();
                }else {
                    Log.e("hi","fffff");
                }
            }
        });



    }

    public String getMyData() {
        return myString;
    }
    public String getMyDataa() {
        return myString2;
    }
}
