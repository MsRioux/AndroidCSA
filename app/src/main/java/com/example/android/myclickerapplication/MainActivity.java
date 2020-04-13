package com.example.android.myclickerapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        View v = findViewById(R.id.toAct3Btn);
        v.setOnClickListener(this);

        configureNextButton();
    }// end onCreate method

    private void configureNextButton()
    {
        Button nextButton = (Button) findViewById(R.id.nextButton);
        nextButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                startActivity(new Intent(MainActivity.this, SecondActivity.class));
            }

        });
    }//end next button method

    public void topClick(View v)
    {
        Toast.makeText(this, "You clicked the top button", Toast.LENGTH_SHORT).show();
        Log.i("info", "The user clicked the top button");
        Log.i("info", "The user clicked the top button");

    }//close method topClick attached to button1

    public void bottomClick(View v)
    {
        Toast.makeText(this, "You clicked the bottom button", Toast.LENGTH_SHORT).show();
        Log.i("info", "The user clicked the bottom button");
        Log.i("info", "The user clicked the bottom button");

    }//close method topClick attached to button2

    @Override
    public void onClick(View arg0) {
        if(arg0.getId() ==  R.id.toAct3Btn)
        {
            Intent intent = new Intent (this, ThirdActivity.class);
            this.startActivity(intent);
        }
    }//end onClick method
}
