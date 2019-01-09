package com.webakruti.foodorder.UI;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.webakruti.foodorder.R;

public class PaymentActivity extends AppCompatActivity {
    private Button buttonProceed;

    private RadioGroup checkout_payment_radio_group;
    private RadioButton checkout_payment_paypal_radio;
    private RadioButton checkout_payment_cod_radio;

    int paymentIDSelected;
    private ImageView imageViewBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment);

        checkout_payment_radio_group = (RadioGroup) findViewById(R.id.checkout_payment_radio_group);
        checkout_payment_paypal_radio = (RadioButton) findViewById(R.id.checkout_payment_paypal_radio);
        checkout_payment_cod_radio = (RadioButton) findViewById(R.id.checkout_payment_cod_radio);

        initRadioButtons();

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

    private void initRadioButtons() {
        checkout_payment_radio_group.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int id) {
                if (id == R.id.checkout_payment_paypal_radio) {
                    paymentIDSelected = 1;
                    checkout_payment_paypal_radio.setButtonDrawable(R.drawable.form_checkbox_enabled);
                    checkout_payment_cod_radio.setButtonDrawable(R.drawable.form_checkbox_radio_disabled);

                } else if (id == R.id.checkout_payment_cod_radio) {
                    paymentIDSelected = 2;
                    checkout_payment_paypal_radio.setButtonDrawable(R.drawable.form_checkbox_radio_disabled);
                    checkout_payment_cod_radio.setButtonDrawable(R.drawable.form_checkbox_enabled);
                }
            }
        });
    }
}
