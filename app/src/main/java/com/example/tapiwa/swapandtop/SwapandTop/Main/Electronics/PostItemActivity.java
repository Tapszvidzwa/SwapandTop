package com.example.tapiwa.swapandtop.SwapandTop.Main.Electronics;

import android.Manifest;
import android.app.Activity;
import android.content.pm.PackageManager;
import android.support.design.widget.Snackbar;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.esafirm.imagepicker.features.ImagePicker;
import com.example.tapiwa.swapandtop.R;
import com.example.tapiwa.swapandtop.SwapandTop.Main.CameraGallery.CameraGallery;

import java.util.ArrayList;

public class PostItemActivity extends AppCompatActivity implements ActivityCompat.OnRequestPermissionsResultCallback {


    private CardView imageCardView;
    private ImageView cameraImageView;
    public static Activity activity;
    public static ArrayList<String> filepaths;

    private static final int MY_PERMISSIONS_REQUEST_READ_EXTERNAL_STORAGE = 121;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_post_item);

        imageCardView = findViewById(R.id.electronics_post_image_cardv);
        cameraImageView = findViewById(R.id.image_add_imgv);
        activity = this;
        filepaths = new ArrayList<>();

        setListeners();

    }


    private void setListeners() {

        imageCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            checkStoragePermission();

          //      }

            }
        });

        cameraImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {



            }
        });

    }

    private void checkStoragePermission() {




        ActivityCompat.requestPermissions(activity,
                new String[]{Manifest.permission.READ_EXTERNAL_STORAGE, Manifest.permission.CAMERA},
                MY_PERMISSIONS_REQUEST_READ_EXTERNAL_STORAGE);


    /*    if (ContextCompat.checkSelfPermission(activity,
                Manifest.permission.READ_EXTERNAL_STORAGE)
                != PackageManager.PERMISSION_GRANTED) {

            // Should we show an explanation?
            if (ActivityCompat.shouldShowRequestPermissionRationale(activity,
                    Manifest.permission.READ_CONTACTS)) {

                // Show an explanation to the user *asynchronously* -- don't block
                // this thread waiting for the user's response! After the user
                // sees the explanation, try again to request the permission.

            } else {

                // No explanation needed, we can request the permission.

                ActivityCompat.requestPermissions(activity,
                        new String[]{Manifest.permission.READ_EXTERNAL_STORAGE},
                        MY_PERMISSIONS_REQUEST_READ_EXTERNAL_STORAGE);
            }
        } */
        //   ImagePicker.cameraOnly().start(activity);
    }


    @Override
    public void onRequestPermissionsResult(int requestCode,
                                           String[] permissions, int[] grantResults) {
        switch (requestCode) {
            case MY_PERMISSIONS_REQUEST_READ_EXTERNAL_STORAGE:

                if (grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                    // do your stuff


                    String here = "I am here";


                    ImagePicker.create(this) // Activity or Fragment
                            .start();

                } else {
                    Toast.makeText(getApplicationContext(), "Denied Access",
                            Toast.LENGTH_SHORT).show();
                }
                break;

            default:
                super.onRequestPermissionsResult(requestCode, permissions,
                        grantResults);
        }
    }





}
