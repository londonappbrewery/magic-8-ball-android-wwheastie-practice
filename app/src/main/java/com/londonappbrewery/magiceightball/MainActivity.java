package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    ImageView eightBallImage;
    Button askButton;
    int[] eightBallImagesArray = new int[] {
            R.drawable.ball1,
            R.drawable.ball2,
            R.drawable.ball3,
            R.drawable.ball4,
            R.drawable.ball5
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        eightBallImage = findViewById(R.id.image_eightBall);
        askButton = findViewById(R.id.button_ask);

        askButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changeEightBall();
            }
        });
    }

    private void changeEightBall() {

        Random randomNumberGenerator = new Random();

        int randomNumber = randomNumberGenerator.nextInt(5);

        eightBallImage.setImageResource(eightBallImagesArray[randomNumber]);

    }
}
