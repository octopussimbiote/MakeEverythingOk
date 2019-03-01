package com.example.vil.makeeverythingok;

import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.os.SystemClock;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MakeEverythingOK extends AppCompatActivity {

    private Button mMakeOKButton;
    private ProgressBar mProgressBar;
    private TextView mAlert;

    private static final TimeInterpolator ANIMATION_INTER = new DecelerateInterpolator(2);
    private static final int MAX_LEVEL = 100;
    private static final long DURATION = 10000;

    int progress = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_make_everything_ok);

        mAlert = (TextView)findViewById(R.id.alertText);
        mProgressBar = (ProgressBar)findViewById(R.id.progressBar);
        mMakeOKButton = (Button)findViewById(R.id.makeOkButton);
        mMakeOKButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ObjectAnimator animator = ObjectAnimator.ofInt(mProgressBar, "Progress",0,MAX_LEVEL);

                mAlert.setVisibility(View.VISIBLE);
                mProgressBar.setVisibility(View.VISIBLE);
                animator.setInterpolator(ANIMATION_INTER);
                animator.setDuration(DURATION);
                animator.start();

                public void timer(final int time){
                }

                }
        });
    }


    @Override
    public void onStart() {
        super.onStart();
    }
    @Override
    public void onPause() {
        super.onPause();
    }
    @Override
    public void onResume() {
        super.onResume();
    }
    @Override
    public void onStop() {
        super.onStop();
    }
    @Override
    public void onDestroy() {
        super.onDestroy();
    }

}
