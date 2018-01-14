package com.example.tapiwa.swapandtop.SwapandTop.Authentication;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.tapiwa.swapandtop.R;
import com.example.tapiwa.swapandtop.SwapandTop.MainFrontPage.FrontPage;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;


public class SplashScreen extends Activity {

    private TextView appNameTxtV;
    private ImageView appLogo;
    public FirebaseAuth mAuth;
    private Activity thisActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_splash_screen);
        appNameTxtV = findViewById(R.id.splash_screen_appname);
        mAuth = FirebaseAuth.getInstance();
        appLogo = findViewById(R.id.app_logo);
        thisActivity = this;

        //app name fade in
        ObjectAnimator fadeIn = ObjectAnimator.ofFloat(appNameTxtV, "alpha", 0f, 1f);
        fadeIn.setDuration(3000);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(fadeIn);
        animatorSet.start();

        //app logo fade in
        Animation myFadeInAnimation = AnimationUtils.loadAnimation(this, R.anim.fade_in_logo);
        appLogo.startAnimation(myFadeInAnimation);

        Thread myThread = new Thread() {
            @Override
            public void run() {
                try {
                    sleep(3000);

                    mAuth.addAuthStateListener(new FirebaseAuth.AuthStateListener() {
                        @Override
                        public void onAuthStateChanged(@NonNull FirebaseAuth firebaseAuth) {

                            FirebaseUser user =  firebaseAuth.getCurrentUser();

                            if(user != null) {
                                Intent openFrontPage = new Intent(SplashScreen.this,FrontPage.class);
                                startActivity(openFrontPage);
                                thisActivity.finish();
                            } else {
                                Intent openRegistrationPage = new Intent(SplashScreen.this, LoginScreenActivity.class);
                                startActivity(openRegistrationPage);
                                thisActivity.finish();
                            }
                        }
                    });

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        myThread.start();
    }


}
