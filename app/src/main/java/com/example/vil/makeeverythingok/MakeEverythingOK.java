package com.example.vil.makeeverythingok;

import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;



public class MakeEverythingOK extends AppCompatActivity {

    private Button mMakeOKButton;
    private ProgressBar mProgressBar;
    public TextView mAlert;

    private static final TimeInterpolator ANIMATION_INTER = new DecelerateInterpolator(2);
    private static final int MAX_LEVEL = 100;
    private static final long DURATION = 9000;
    private static String TAG = "Tag";

    int progress = 0;

    public void rewright(){
        mAlert.setText(R.string.alertDone);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_make_everything_ok);

        Log.d(TAG, "onCreate(Bundle) called");

        mAlert = (TextView)findViewById(R.id.alertText);
        mProgressBar = (ProgressBar)findViewById(R.id.progressBar);
        mMakeOKButton = (Button)findViewById(R.id.makeOkButton);


        mMakeOKButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ObjectAnimator animator = ObjectAnimator.ofInt(mProgressBar, "Progress", 0, MAX_LEVEL);

                mAlert.setText(R.string.alert);
                animator.setInterpolator(ANIMATION_INTER);
                animator.setDuration(DURATION);
                animator.start();


                final Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        rewright();
                    }
                }, DURATION);
            }
        });
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.d(TAG, "onStart() called");
    }
    @Override
    public void onPause() {
        super.onPause();
        Log.d(TAG, "onPause() called");
    }
    @Override
    public void onResume() {
        super.onResume();
        Log.d(TAG, "onResume() called");
    }
    @Override
    public void onStop() {
        super.onStop();
        Log.d(TAG, "onStop() called");
    }
    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy() called");
    }
}