package com.example.lodudice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private ImageView diceimage;
    private Random random = new Random();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        diceimage = findViewById(R.id.image_view_dice);

        diceimage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rollDice();
            }
        });

    }

    private void rollDice() {
        int randomNumber = random.nextInt(6) + 1;
        switch (randomNumber) {
            case 1:
                diceimage.setImageResource(R.drawable.dice1);
                break;
            case 2:
                diceimage.setImageResource(R.drawable.dice2);
                break;
            case 3:
                diceimage.setImageResource(R.drawable.dice3);
                break;
            case 4:
                diceimage.setImageResource(R.drawable.dice4);
                break;
            case 5:
                diceimage.setImageResource(R.drawable.dice5);
                break;
            case 6:
                diceimage.setImageResource(R.drawable.dice6);
                break;
        }
    }
}