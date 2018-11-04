package com.webakruti.foodorder.UI;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.webakruti.foodorder.R;

public class SuccessActivity extends AppCompatActivity {
    private Button buttonBackToHome;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_success);

        buttonBackToHome = (Button)findViewById(R.id.buttonBackToHome);
        buttonBackToHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(SuccessActivity.this,HomeActivity.class);
                startActivity(i);
                finish();
            }
        });

    }
}
