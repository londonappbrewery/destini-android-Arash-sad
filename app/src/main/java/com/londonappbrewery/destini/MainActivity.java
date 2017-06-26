package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
    TextView storyTextView;
    Button buttonTop;
    Button buttonButtom;
    int mStroyIndex = 1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
        storyTextView = (TextView) findViewById(R.id.storyTextView);
        buttonTop = (Button) findViewById(R.id.buttonTop);
        buttonButtom = (Button) findViewById(R.id.buttonBottom);


        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:
        buttonTop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mStroyIndex == 1 || mStroyIndex == 2) {
                    mStroyIndex = 3;
                    storyTextView.setText(R.string.T3_Story);
                    buttonTop.setText(R.string.T3_Ans1);
                    buttonButtom.setText(R.string.T3_Ans2);

                } else if (mStroyIndex == 3){
                    mStroyIndex = 6;
                    storyTextView.setText(R.string.T6_End);
                    buttonTop.setVisibility(View.GONE);
                    buttonButtom.setVisibility(View.GONE);
                }

            }
        });




        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:
        buttonButtom.setOnClickListener(new View.OnClickListener() {
            @Override
            public  void onClick(View v) {
                if (mStroyIndex == 1) {
                    mStroyIndex = 2;
                    storyTextView.setText(R.string.T2_Story);
                    buttonTop.setText(R.string.T2_Ans1);
                    buttonButtom.setText(R.string.T2_Ans2);

                } else if (mStroyIndex == 2) {
                    mStroyIndex = 4;
                    storyTextView.setText(R.string.T4_End);
                    buttonTop.setVisibility(View.GONE);
                    buttonButtom.setVisibility(View.GONE);

                } else if (mStroyIndex == 3) {
                    mStroyIndex = 5;
                    storyTextView.setText(R.string.T5_End);
                    buttonTop.setVisibility(View.GONE);
                    buttonButtom.setVisibility(View.GONE);

                }

            }
        });

    }

}
