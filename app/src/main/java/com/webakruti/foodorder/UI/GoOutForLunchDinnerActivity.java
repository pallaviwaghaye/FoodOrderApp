package com.webakruti.foodorder.UI;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import com.webakruti.foodorder.Adapter.CauroselPageAdapter;
import com.webakruti.foodorder.Adapter.RestroMenuCardImageAdapter;
import com.webakruti.foodorder.R;

import java.util.ArrayList;
import java.util.List;

public class GoOutForLunchDinnerActivity extends AppCompatActivity {
    private ViewPager viewPager;
    private ImageView left_nav;
    private ImageView right_nav;
    private ImageView back_nav_arrow;
    private CauroselPageAdapter pagerAdapter;

    private RecyclerView recyclerViewMenu;
    private Button buttonOrderDelivery;
    private RelativeLayout relativeLayoutShare;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_go_out_for_lunch_dinner);

        List<Drawable> list = new ArrayList<>();
        list.add(getResources().getDrawable(R.drawable.navab_thali));
        list.add(getResources().getDrawable(R.drawable.lunch_img1));
        list.add(getResources().getDrawable(R.drawable.lunch_img2));
        list.add(getResources().getDrawable(R.drawable.lunch_img3));

        initViews();

        relativeLayoutShare = (RelativeLayout)findViewById(R.id.relativeLayoutShare);
        relativeLayoutShare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.setType("text/plain");
                String shareBody = "share";
                String shareSub = "https://dzone.com/articles/how-to-create-badges-item-counts-in-android , Bajaj Nagar, Nagpur";
                intent.putExtra(Intent.EXTRA_SUBJECT,shareBody);
                intent.putExtra(Intent.EXTRA_TEXT,shareSub);
                startActivity(Intent.createChooser(intent,"Share"));

            }
        });

        buttonOrderDelivery = (Button)findViewById(R.id.buttonOrderDelivery);
        buttonOrderDelivery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(GoOutForLunchDinnerActivity.this,FoodDeliveryRestroActivity.class);
                startActivity(i);
                finish();
            }
        });




        // send this list to carousel adapter.

        initCarouselData(list);
    }

    private void initViews()
    {

        recyclerViewMenu = (RecyclerView)findViewById(R.id.recyclerViewMenu);
        LinearLayoutManager layoutManager = new LinearLayoutManager(GoOutForLunchDinnerActivity.this, LinearLayoutManager.HORIZONTAL, false);
        recyclerViewMenu.setLayoutManager(layoutManager);
        recyclerViewMenu.setAdapter(new RestroMenuCardImageAdapter(getApplicationContext(), 2));
    }

    private void initCarouselData(List<Drawable> imageList) {
        viewPager = (ViewPager) findViewById(R.id.viewPager);
        left_nav = (ImageView) findViewById(R.id.left_nav);
        right_nav = (ImageView) findViewById(R.id.right_nav);
        back_nav_arrow = (ImageView) findViewById(R.id.back_nav_arrow);

        back_nav_arrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(GoOutForLunchDinnerActivity.this, HomeActivity.class);
                startActivity(i);
                finish();
            }
        });


        viewPager.setClipToPadding(true);
        pagerAdapter = new CauroselPageAdapter(GoOutForLunchDinnerActivity.this, imageList);
        viewPager.setAdapter(pagerAdapter);
/*

        if(imageList.toArray().length == 1)
        {
            right_nav.setVisibility(View.GONE);
            left_nav.setVisibility(View.GONE);

        }
        else{
            right_nav.setVisibility(View.VISIBLE);
            left_nav.setVisibility(View.VISIBLE);
        }
*/

        left_nav.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewPager.arrowScroll(ViewPager.FOCUS_LEFT);
                /*int tab = viewPager.getCurrentItem();
                if (tab > 0) {
                    tab--;
                    viewPager.setCurrentItem(tab);
                } else if (tab == 0) {
                    viewPager.setCurrentItem(tab);
                }*/
            }
        });

        right_nav.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewPager.arrowScroll(ViewPager.FOCUS_RIGHT);
                /*int tab = viewPager.getCurrentItem();
                tab++;
                viewPager.setCurrentItem(tab);*/
            }
        });

    }

        public void toggleArrowVisibility(boolean isAtZeroIndex, boolean isAtLastIndex) {
            if(isAtZeroIndex) {
                left_nav.setVisibility(View.INVISIBLE);
            }else {
                left_nav.setVisibility(View.VISIBLE);
            }
            if(isAtLastIndex) {
                right_nav.setVisibility(View.INVISIBLE);
            }else {
                right_nav.setVisibility(View.VISIBLE);
            }
        }
}
