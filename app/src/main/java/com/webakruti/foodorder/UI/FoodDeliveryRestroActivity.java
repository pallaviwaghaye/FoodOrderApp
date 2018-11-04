package com.webakruti.foodorder.UI;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.webakruti.foodorder.Adapter.CauroselPageAdapter;
import com.webakruti.foodorder.Adapter.RecommendedAdapter;
import com.webakruti.foodorder.Adapter.RestroMenuCardImageAdapter;
import com.webakruti.foodorder.Adapter.StartersAdapter;
import com.webakruti.foodorder.R;
import com.webakruti.foodorder.pageindicator.PageControl;

import java.util.ArrayList;
import java.util.List;

public class FoodDeliveryRestroActivity extends AppCompatActivity {
    private ViewPager viewPager;
    private ImageView back_nav_arrow;
    private CauroselPageAdapter pagerAdapter;
    private PageControl page_control;
    private RecyclerView recyclerViewRecommended;
    private RecyclerView recyclerViewStarters;

    private LinearLayout linearLayoutShoppingCart;
    private LinearLayout linearLayoutAddToCart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_delivery_restro);


        List<Drawable> list = new ArrayList<>();
        list.add(getResources().getDrawable(R.drawable.kheer));
        list.add(getResources().getDrawable(R.drawable.navab_thali));
        list.add(getResources().getDrawable(R.drawable.chicken_biriyani1));


        initViews();

        // send this list to carousel adapter.

        initCarouselData(list);
    }

    private void initViews()
    {
        linearLayoutShoppingCart = (LinearLayout)findViewById(R.id.linearLayoutShoppingCart);
        linearLayoutShoppingCart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FoodDeliveryRestroActivity.this, CartActivity.class);
                startActivity(intent);
                finish();
            }
        });

        linearLayoutAddToCart = (LinearLayout)findViewById(R.id.linearLayoutAddToCart);
        linearLayoutAddToCart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FoodDeliveryRestroActivity.this, CartActivity.class);
                startActivity(intent);
                finish();
            }
        });

        recyclerViewRecommended = (RecyclerView)findViewById(R.id.recyclerViewRecommended);
        LinearLayoutManager layoutManager = new LinearLayoutManager(FoodDeliveryRestroActivity.this, LinearLayoutManager.HORIZONTAL, false);
        recyclerViewRecommended.setLayoutManager(layoutManager);
        recyclerViewRecommended.setAdapter(new RecommendedAdapter(getApplicationContext(), 2));

        recyclerViewStarters = (RecyclerView)findViewById(R.id.recyclerViewStarters);
        LinearLayoutManager layoutManager1 = new LinearLayoutManager(FoodDeliveryRestroActivity.this, LinearLayoutManager.VERTICAL, false);
        recyclerViewStarters.setLayoutManager(layoutManager1);
        recyclerViewStarters.setAdapter(new StartersAdapter(getApplicationContext(), 6));
    }

    private void initCarouselData(List<Drawable> imageList) {
        viewPager = (ViewPager) findViewById(R.id.viewPager);
        back_nav_arrow = (ImageView) findViewById(R.id.back_nav_arrow);

        back_nav_arrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(FoodDeliveryRestroActivity.this, GoOutForLunchDinnerActivity.class);
                startActivity(i);
                finish();
            }
        });

        viewPager = (ViewPager) findViewById(R.id.viewPager);
        page_control = (PageControl) findViewById(R.id.page_control);

        viewPager.setClipToPadding(true);
        pagerAdapter = new CauroselPageAdapter(FoodDeliveryRestroActivity.this, imageList);
        viewPager.setAdapter(pagerAdapter);
        page_control.setViewPager(viewPager);
        page_control.setPosition(0);
    }

}
