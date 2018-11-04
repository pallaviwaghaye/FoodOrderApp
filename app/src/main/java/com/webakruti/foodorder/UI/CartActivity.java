package com.webakruti.foodorder.UI;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.webakruti.foodorder.Adapter.CartAdapter;
import com.webakruti.foodorder.Adapter.RestroMenuCardImageAdapter;
import com.webakruti.foodorder.R;

public class CartActivity extends AppCompatActivity {
    private RecyclerView recycler_view;
    private LinearLayout linearLayoutCheckout;
    private ImageView imageViewBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cart);

        imageViewBack = (ImageView)findViewById(R.id.imageViewBack);
        imageViewBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CartActivity.this, FoodDeliveryRestroActivity.class);
                startActivity(intent);
                finish();
            }
        });

        linearLayoutCheckout = (LinearLayout)findViewById(R.id.linearLayoutCheckout);
        linearLayoutCheckout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CartActivity.this, CheckoutActivity.class);
                startActivity(intent);
                finish();
            }
        });

        recycler_view = (RecyclerView)findViewById(R.id.recycler_view);
        LinearLayoutManager layoutManager = new LinearLayoutManager(CartActivity.this, LinearLayoutManager.VERTICAL, false);
        recycler_view.setLayoutManager(layoutManager);
        recycler_view.setAdapter(new CartAdapter(getApplicationContext(), 3));

    }
}
