package com.example.tapiwa.swapandtop.SwapandTop.MainFrontPage.FrontPage;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.tapiwa.swapandtop.R;
import com.example.tapiwa.swapandtop.SwapandTop.MainFrontPage.Electronics.ElectronicsFrontPageActivity;

import static java.lang.Thread.sleep;

public class FrontPageActivity extends AppCompatActivity {


    private TextView furnitureTab, vehiclesTab, electronicsTab, jewelleryTab, selectCategory;
    private Activity activity;
    public static ImageView arrow1, arrow2, arrow3, arrow4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_front_page);

        furnitureTab = findViewById(R.id.furniture);
        vehiclesTab = findViewById(R.id.vehicles);
        electronicsTab = findViewById(R.id.electronics);
        jewelleryTab = findViewById(R.id.jewellery);
        selectCategory = findViewById(R.id.select_category_txtV);

        arrow1 = findViewById(R.id.arrow1_imgv);
        arrow2 = findViewById(R.id.arrow2_imgv);
        arrow3 = findViewById(R.id.arrow3_imgv);
        arrow4 = findViewById(R.id.arrow4_imgv);

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

        selectCategory.setOnClickListener(new View.OnClickListener() {

            //indicate which categories to choose from
            @Override
            public void onClick(View view) {

                arrow1.setVisibility(View.VISIBLE);
                arrow2.setVisibility(View.VISIBLE);
                arrow3.setVisibility(View.VISIBLE);
                arrow4.setVisibility(View.VISIBLE);

                Thread thread = new Thread(){
                    @Override
                    public void run() {
                        try {
                            synchronized (this) {

                                wait(200);


                                runOnUiThread(new Runnable() {
                                    @Override
                                    public void run() {


                                        arrow1.setVisibility(View.INVISIBLE);
                                        arrow2.setVisibility(View.INVISIBLE);
                                        arrow3.setVisibility(View.INVISIBLE);
                                        arrow4.setVisibility(View.INVISIBLE);

                                    }
                                });

                            }
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    };
                };

                thread.start();
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
