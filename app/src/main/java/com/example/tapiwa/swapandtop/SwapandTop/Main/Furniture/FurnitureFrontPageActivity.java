package com.example.tapiwa.swapandtop.SwapandTop.Main.Furniture;

import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;

import com.example.tapiwa.swapandtop.R;
import com.example.tapiwa.swapandtop.SwapandTop.Main.Electronics.ElectronicsForSaleFragment;
import com.example.tapiwa.swapandtop.SwapandTop.Main.Electronics.ElectronicsMyItemsFragment;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.storage.FirebaseStorage;

public class FurnitureFrontPageActivity extends AppCompatActivity
implements FurnitureForSaleFragment.OnFragmentInteractionListener,
        FurnitureMyItemsFragment.OnFragmentInteractionListener {

    public FirebaseDatabase firebaseDatabase;
    public FirebaseStorage firebaseStorage;
    public DatabaseReference electronicsDbRef;

    private ViewPager mViewPager;
    private ViewPagerAdapter mViewPagerAdapter;
    private android.support.v7.widget.Toolbar furnitureToolbar;

    public static String ELECTRONICS_DB_REF;
    public static String ELECTRONICS_ST0RAGE_REF;

    public static Button postNewItem;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_furniture__front__page);

        //views
        postNewItem = findViewById(R.id.furniture_post_new_item_btn);

        //toolbar
        furnitureToolbar = findViewById(R.id.furniture_toolbar);
        furnitureToolbar.setTitle(getString(R.string.furniture));
        furnitureToolbar.setTitleTextColor(Color.WHITE);
        setSupportActionBar(furnitureToolbar);
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
        mViewPager = findViewById(R.id.furniture_container);
        mViewPager.setAdapter(mViewPagerAdapter);

        //tablayout
        TabLayout tabLayout = findViewById(R.id.furniture_tab);
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
                case 0: Fragment ForSale = new FurnitureForSaleFragment();
                return ForSale;

                case 1: Fragment MyItems = new FurnitureMyItemsFragment();
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
