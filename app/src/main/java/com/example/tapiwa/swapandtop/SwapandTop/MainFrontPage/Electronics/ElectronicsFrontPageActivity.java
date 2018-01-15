package com.example.tapiwa.swapandtop.SwapandTop.MainFrontPage.Electronics;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.GridView;

import com.example.tapiwa.swapandtop.R;
import com.example.tapiwa.swapandtop.SwapandTop.MainFrontPage.FrontPage.FrontPageActivity;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.storage.FirebaseStorage;

public class ElectronicsFrontPageActivity extends AppCompatActivity {

    public FirebaseDatabase firebaseDatabase;
    public FirebaseStorage firebaseStorage;
    public DatabaseReference electronicsDbRef;
    public static GridView electronicsGridView;

    public static String ELECTRONICS_DB_REF;
    public static String ELECTRONICS_ST0RAGE_REF;

    public static Button postNewItem;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_electronics__front__page);




    }

}
