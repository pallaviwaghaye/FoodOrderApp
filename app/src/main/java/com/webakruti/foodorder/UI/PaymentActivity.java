package com.webakruti.foodorder.UI;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.webakruti.foodorder.R;

public class PaymentActivity extends AppCompatActivity {
    private Button buttonProceed;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment);

        buttonProceed = (Button)findViewById(R.id.buttonProceed);
        buttonProceed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PaymentActivity.this, SuccessActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
