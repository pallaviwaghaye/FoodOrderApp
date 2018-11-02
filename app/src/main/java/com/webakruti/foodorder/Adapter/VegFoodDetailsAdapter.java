package com.webakruti.foodorder.Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


import com.webakruti.foodorder.R;

import java.util.List;

public class VegFoodDetailsAdapter extends RecyclerView.Adapter<VegFoodDetailsAdapter.ViewHolder> {

    private Context context;
    private int size;

    public VegFoodDetailsAdapter(Context context, int size) {
        this.context = context;
        this.size = size;

    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_veg_food, viewGroup, false);
        VegFoodDetailsAdapter.ViewHolder viewHolder = new VegFoodDetailsAdapter.ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, final int position) {


        /*//final Student.Studentbatch studentbatch = list.get(position);

        viewHolder.textViewBatchCourseName.setText(size[position]);
        viewHolder.textViewBatchTime.setText(studentbatch.getBatch().getStartTime());
        viewHolder.textViewCourseTeacher.setText(studentbatch.getWhoAssinged());

        viewHolder.textViewBatchCourseDuration.setText(studentbatch.getBatch().getCourse().getDuration());
        viewHolder.textViewBatchStartDate.setText(studentbatch.getBatch().getStartDate());
        viewHolder.textViewBatchEndDate.setText(studentbatch.getBatch().getEndDate());*/
    }

    @Override
    public int getItemCount() {
        return size;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private TextView textViewVegFoodName;
        private TextView textViewAddress;
        private TextView textViewLocation;

        private TextView textViewRestoType;
        private TextView textViewFoodType;

        private ImageView imageViewVegImage;


        public ViewHolder(View itemView) {
            super(itemView);

            textViewVegFoodName = (TextView)itemView.findViewById(R.id.textViewVegFoodName);
            textViewAddress = (TextView)itemView.findViewById(R.id.textViewAddress);
            textViewLocation = (TextView)itemView.findViewById(R.id.textViewLocation);
            textViewRestoType = (TextView)itemView.findViewById(R.id.textViewRestoType);
            textViewFoodType = (TextView)itemView.findViewById(R.id.textViewFoodType);
            imageViewVegImage = (ImageView)itemView.findViewById(R.id.imageViewVegImage);


        }
    }
}
