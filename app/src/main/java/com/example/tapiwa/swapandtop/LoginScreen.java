package com.example.tapiwa.swapandtop;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class LoginScreen extends AppCompatActivity {

    private EditText firstNameTxtV, lastNameTxtV, phoneNumberTxtV;
    private RelativeLayout loginRelativeLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_screen);

        firstNameTxtV = findViewById(R.id.login_firstName);
        lastNameTxtV = findViewById(R.id.login_lastName);
        phoneNumberTxtV = findViewById(R.id.login_phonenumber);
        loginRelativeLayout = findViewById(R.id.login_relativeLayout);

       // loginRelativeLayout.getBackground().setAlpha(180);

       phoneNumberTxtV.setOnFocusChangeListener(new View.OnFocusChangeListener() {
           @Override
           public void onFocusChange(View view, boolean b) {
               if(b) {
                   phoneNumberTxtV.setHint("+263 711 111 222");
               } else {
                   phoneNumberTxtV.setHint("Phone Number");
               }
              // return false;
           }
       });



    }
}
