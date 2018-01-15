package com.example.tapiwa.swapandtop.SwapandTop.MainFrontPage.FrontPage;

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


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_front_page);

        furnitureTab = findViewById(R.id.furniture);
        vehiclesTab = findViewById(R.id.vehicles);
        electronicsTab = findViewById(R.id.electronics);
        jewelleryTab = findViewById(R.id.jewellery);

        furnitureTab.setTextColor(Color.argb(138, 0, 0, 0));
        vehiclesTab.setTextColor(Color.argb(138, 0, 0, 0));
        electronicsTab.setTextColor(Color.argb(138, 0, 0, 0));
        jewelleryTab.setTextColor(Color.argb(138, 0, 0, 0));

        electronicsTab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              electronicsTab.setAlpha(0.5f);
              electronicsTab.setTextColor(getResources().getColor(R.color.colorAccent));

              Intent openElectronics = new Intent(FrontPageActivity.this, ElectronicsFrontPageActivity.class);
              startActivity(openElectronics);

            }
        });


    }


}
