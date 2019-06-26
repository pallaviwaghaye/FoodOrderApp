package com.webakruti.foodorder.UI;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.webakruti.foodorder.Adapter.CheckoutAdapter;
import com.webakruti.foodorder.Adapter.RestroMenuCardImageAdapter;
import com.webakruti.foodorder.R;

public class CheckoutActivity extends AppCompatActivity {
    private RecyclerView recycler_view1;
    private ImageView imageViewBack;
    private LinearLayout linearLayoutPayment;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checkout);

        imageViewBack = (ImageView)findViewById(R.id.imageViewBack);
        imageViewBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CheckoutActivity.this, CartActivity.class);
                startActivity(intent);
                finish();
            }
        });


        linearLayoutPayment = (LinearLayout)findViewById(R.id.linearLayoutPayment);
        linearLayoutPayment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CheckoutActivity.this, PaymentActivity.class);
                startActivity(intent);
                finish();
            }
        });

        recycler_view1 = (RecyclerView)findViewById(R.id.recycler_view1);
        LinearLayoutManager layoutManager = new LinearLayoutManager(CheckoutActivity.this, LinearLayoutManager.VERTICAL, false);
        recycler_view1.setLayoutManager(layoutManager);
        recycler_view1.setAdapter(new CheckoutAdapter(getApplicationContext(), 2));

    }
}
