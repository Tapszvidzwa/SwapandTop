package com.example.tapiwa.swapandtop.SwapandTop.MainFrontPage.FrontPage;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.tapiwa.swapandtop.R;
import com.example.tapiwa.swapandtop.SwapandTop.MainFrontPage.Electronics.ElectronicsFrontPageActivity;

public class FrontPageActivity extends AppCompatActivity {


    private TextView furnitureTab, vehiclesTab, electronicsTab, jewelleryTab;
    private Activity activity;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_front_page);

        furnitureTab = findViewById(R.id.furniture);
        vehiclesTab = findViewById(R.id.vehicles);
        electronicsTab = findViewById(R.id.electronics);
        jewelleryTab = findViewById(R.id.jewellery);
        activity = this;

        furnitureTab.setTextColor(Color.argb(138, 0, 0, 0));
        vehiclesTab.setTextColor(Color.argb(138, 0, 0, 0));
        electronicsTab.setTextColor(Color.argb(138, 0, 0, 0));
        jewelleryTab.setTextColor(Color.argb(138, 0, 0, 0));

       setTabOnClickListeners();

    }


    private void setTabOnClickListeners() {

        electronicsTab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                electronicsTab.setAlpha(0.6f);
                electronicsTab.setTextColor(getResources().getColor(R.color.colorAccent));

                Intent openElectronics = new Intent(FrontPageActivity.this, ElectronicsFrontPageActivity.class);
                startActivity(openElectronics);
            }
        });

        vehiclesTab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                vehiclesTab.setAlpha(0.6f);
                vehiclesTab.setTextColor(getResources().getColor(R.color.colorAccent));

                Intent openElectronics = new Intent(FrontPageActivity.this, ElectronicsFrontPageActivity.class);
                startActivity(openElectronics);

            }
        });

        jewelleryTab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                jewelleryTab.setAlpha(0.6f);
                jewelleryTab.setTextColor(getResources().getColor(R.color.colorAccent));

                Intent openElectronics = new Intent(FrontPageActivity.this, ElectronicsFrontPageActivity.class);
                startActivity(openElectronics);

            }
        });

        furnitureTab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                furnitureTab.setAlpha(0.6f);
                furnitureTab.setTextColor(getResources().getColor(R.color.colorAccent));

                Intent openElectronics = new Intent(FrontPageActivity.this, ElectronicsFrontPageActivity.class);
                startActivity(openElectronics);

            }
        });

    }

    @Override
    protected void onPostResume() {
        super.onPostResume();

        furnitureTab.setTextColor(Color.argb(138, 0, 0, 0));
        furnitureTab.setAlpha(1.0f);

        jewelleryTab.setTextColor(Color.argb(138, 0, 0, 0));
        jewelleryTab.setAlpha(1.0f);

        vehiclesTab.setTextColor(Color.argb(138, 0, 0, 0));
        vehiclesTab.setAlpha(1.0f);

        electronicsTab.setTextColor(Color.argb(138, 0, 0, 0));
        electronicsTab.setAlpha(1.0f);

    }
}
