package com.webakruti.foodorder.Fragment;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.webakruti.foodorder.Adapter.CauroselPageAdapter;
import com.webakruti.foodorder.Adapter.FavoriteCuisineAdapter;
import com.webakruti.foodorder.Adapter.FoodHygieneAdapter;
import com.webakruti.foodorder.Adapter.InspiredCollectionsAdapter;
import com.webakruti.foodorder.Adapter.GetFoodDeliveredAdapter;
import com.webakruti.foodorder.Adapter.GoOutLunchDinnerAdapter;
import com.webakruti.foodorder.R;
import com.webakruti.foodorder.pageindicator.PageControl;

import java.util.ArrayList;
import java.util.List;

public class HomeFragment extends Fragment {
    private View rootView;

    private ViewPager viewPager;
    private PageControl page_control;
    private CauroselPageAdapter pagerAdapter;

    //veg food details
    private RecyclerView recyclerView;

    //non veg food details
    private  RecyclerView recyclerView1;
    private  RecyclerView recyclerView2;
    private  RecyclerView recyclerView3;
    private  RecyclerView recyclerView4;
    //private  RecyclerView recyclerView1;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        rootView = inflater.inflate(R.layout.fragment_home, container, false);

        initViews();



        List<Drawable> list = new ArrayList<>();
        list.add(getResources().getDrawable(R.drawable.berger));
        list.add(getResources().getDrawable(R.drawable.cake));
        list.add(getResources().getDrawable(R.drawable.non_veg_thali));
        list.add(getResources().getDrawable(R.drawable.fish_nuggets));
        list.add(getResources().getDrawable(R.drawable.pizza));
        list.add(getResources().getDrawable(R.drawable.samosa_with_chutney));
        list.add(getResources().getDrawable(R.drawable.breakfast));
        list.add(getResources().getDrawable(R.drawable.chicken_biriyani));



        // send this list to carousel adapter.

        initCarouselData(list);

        return rootView;
    }

    private void initViews() {
        recyclerView = (RecyclerView) rootView.findViewById(R.id.recyclerView);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity(), LinearLayoutManager.HORIZONTAL, false);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(new GoOutLunchDinnerAdapter(getActivity(), 6));

        recyclerView1 = (RecyclerView) rootView.findViewById(R.id.recyclerView1);
        LinearLayoutManager layoutManager1 = new LinearLayoutManager(getActivity(), LinearLayoutManager.HORIZONTAL, false);
        recyclerView1.setLayoutManager(layoutManager1);
        recyclerView1.setAdapter(new GetFoodDeliveredAdapter(getActivity(), 6));

        recyclerView2 = (RecyclerView) rootView.findViewById(R.id.recyclerView2);
        LinearLayoutManager layoutManager2 = new LinearLayoutManager(getActivity(), LinearLayoutManager.HORIZONTAL, false);
        recyclerView2.setLayoutManager(layoutManager2);
        recyclerView2.setAdapter(new InspiredCollectionsAdapter(getActivity(), 6));

        recyclerView3 = (RecyclerView) rootView.findViewById(R.id.recyclerView3);
        LinearLayoutManager layoutManager3 = new LinearLayoutManager(getActivity(), LinearLayoutManager.HORIZONTAL, false);
        recyclerView3.setLayoutManager(layoutManager3);
        recyclerView3.setAdapter(new FoodHygieneAdapter(getActivity(), 6));

        recyclerView4 = (RecyclerView) rootView.findViewById(R.id.recyclerView4);
        LinearLayoutManager layoutManager4 = new LinearLayoutManager(getActivity(), LinearLayoutManager.HORIZONTAL, false);
        recyclerView4.setLayoutManager(layoutManager4);
        recyclerView4.setAdapter(new FavoriteCuisineAdapter(getActivity(), 6));
    }




    private void initCarouselData(List<Drawable> imageList) {
        viewPager = (ViewPager) rootView.findViewById(R.id.viewPager);
        page_control = (PageControl) rootView.findViewById(R.id.page_control);

        viewPager.setPageMargin(10);
        viewPager.setClipToPadding(false);
        pagerAdapter = new CauroselPageAdapter(getActivity(), imageList);
        viewPager.setAdapter(pagerAdapter);
        page_control.setViewPager(viewPager);
        page_control.setPosition(0);

    }
}
