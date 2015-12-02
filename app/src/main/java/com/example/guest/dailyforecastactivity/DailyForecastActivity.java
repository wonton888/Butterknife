package com.example.guest.dailyforecastactivity;

import android.app.ListActivity;
import android.os.Bundle;
import android.widget.TextView;

import butterknife.Bind;
import butterknife.ButterKnife;

public class DailyForecastActivity extends ListActivity {

    @Bind(R.id.welcomeText)
    TextView welcomeText;

    @Bind(R.id.goButton)
    TextView goButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daily_forecast);

        ButterKnife.bind(this);

    }
}

