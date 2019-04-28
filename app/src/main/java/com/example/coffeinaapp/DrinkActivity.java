package com.example.coffeinaapp;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;


public class DrinkActivity extends Activity
    {

    public final static String EXTRA_DRINKID = "drinkID";

    @Override
    protected void onCreate(Bundle savedInstanceState)
        {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_drink);
            int drinkID = (Integer) getIntent().getExtras().get(EXTRA_DRINKID);
            Drink drink = Drink.drinks[drinkID];
            TextView name = (TextView) findViewById(R.id.name);
            name.setText(drink.getName());
            name.setTextSize(23);
            TextView deskrypszon = (TextView) findViewById(R.id.deskrypszon);
            deskrypszon.setText(drink.getDeskrypszon());
            deskrypszon.setTextSize(20);
            ImageView image = (ImageView) findViewById(R.id.photo);
            image.setImageResource(drink.getImageResourceId());
            image.setContentDescription(drink.getName());

        }
    }
