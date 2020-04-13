package com.example.android.myclickerapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SecondActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        View v = findViewById(R.id.to3Button);
        v.setOnClickListener(this);

        configureBackButton();

    }//end onCreate

    private void configureBackButton()
    {
        Button backButton = (Button) findViewById(R.id.backButton);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }//end back button method

//    private void configureTo3Button()
//    {
//        Button to3Button = (Button) findViewById(R.id.to3Button);
//        to3Button.setOnClickListener(new View.OnClickListener()
//        {
//            @Override
//            public void onClick(View v)
//            {
//                startActivity(new Intent(SecondActivity.this, ThirdActivity.class));
//            }
//
//        });
//    }//end next button method

    @Override
    public void onClick(View arg0) {
        if(arg0.getId() == R.id.to3Button)
        {
            Intent intent = new Intent(this, ThirdActivity.class);
            this.startActivity(intent);
        }
    }// end Click Handler
}// end class Second Activity
