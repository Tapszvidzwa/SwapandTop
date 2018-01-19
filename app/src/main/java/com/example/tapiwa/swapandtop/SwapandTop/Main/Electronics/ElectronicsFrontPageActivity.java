package com.example.tapiwa.swapandtop.SwapandTop.Main.Electronics;

import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.support.design.widget.TabLayout;

import com.example.tapiwa.swapandtop.R;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.storage.FirebaseStorage;

public class ElectronicsFrontPageActivity extends AppCompatActivity
implements ElectronicsForSaleFragment.OnFragmentInteractionListener,
        ElectronicsMyItemsFragment.OnFragmentInteractionListener {

    public FirebaseDatabase firebaseDatabase;
    public FirebaseStorage firebaseStorage;
    public DatabaseReference electronicsDbRef;

    private ViewPager mViewPager;
    private ViewPagerAdapter mViewPagerAdapter;
    private android.support.v7.widget.Toolbar electronicsToolBar;

    public static String ELECTRONICS_DB_REF;
    public static String ELECTRONICS_ST0RAGE_REF;

    public static Button postNewItem;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_electronics__front__page);

        //views
        postNewItem = findViewById(R.id.electronics_post_new_item_btn);

        //toolbar
        electronicsToolBar = findViewById(R.id.electronics_toolbar);
        electronicsToolBar.setTitle(getString(R.string.electronics));
        electronicsToolBar.setTitleTextColor(Color.WHITE);
        setSupportActionBar(electronicsToolBar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        //viewpager setup

        //database stuff
        ELECTRONICS_DB_REF = getString(R.string.electronics_db_ref);
        ELECTRONICS_ST0RAGE_REF = getString(R.string.electronics_storage_ref);
        firebaseDatabase = FirebaseDatabase.getInstance();
        firebaseStorage = FirebaseStorage.getInstance();
        electronicsDbRef = firebaseDatabase.getReference(ELECTRONICS_DB_REF);

        //viewPager
        mViewPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager());
        mViewPager = findViewById(R.id.container);
        mViewPager.setAdapter(mViewPagerAdapter);

        //tablayout
        TabLayout tabLayout = (TabLayout) findViewById(R.id.electronics_tab);
        tabLayout.setupWithViewPager(mViewPager);
        tabLayout.setSelectedTabIndicatorColor(Color.WHITE);
        tabLayout.setTabTextColors(Color.WHITE, Color.WHITE);


        populateElectronicsGrid();
        setListeners();

    }

    private void populateElectronicsGrid() {

    }


    private void setListeners() {

        mViewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {

            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });

        postNewItem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent openPostNewElectronic = new Intent(ElectronicsFrontPageActivity.this, PostItemActivity.class);
                startActivity(openPostNewElectronic);
            }
        });


    }

    @Override
    public void onFragmentInteraction(Uri uri){
        //you can leave it empty
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }


    public class ViewPagerAdapter extends FragmentPagerAdapter {

        public ViewPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {

            switch (position) {
                case 0: Fragment ForSale = new ElectronicsForSaleFragment();
                return ForSale;

                case 1: Fragment MyItems = new ElectronicsMyItemsFragment();
                return MyItems;

                default:
                    return null;
            }
        }

        @Override
        public int getCount() {
            // Show 2 total pages.
            return 2;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            switch (position) {
                case 0:
                    return "FOR SALE";
                case 1:
                    return "MY ITEMS";
            }
            return null;
        }
    }

}
