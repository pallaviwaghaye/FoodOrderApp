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

public class NonVegFoodDetailsAdapter extends RecyclerView.Adapter<NonVegFoodDetailsAdapter.ViewHolder> {

    private Context context;
    private int size;

    public NonVegFoodDetailsAdapter(Context context, int size) {
        this.context = context;
        this.size = size;

    }

    @NonNull
    @Override
    public NonVegFoodDetailsAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_nonveg_food, viewGroup, false);
        NonVegFoodDetailsAdapter.ViewHolder viewHolder = new NonVegFoodDetailsAdapter.ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull NonVegFoodDetailsAdapter.ViewHolder viewHolder, final int position) {

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

        private TextView textViewNonVegFoodName;
        private TextView textViewAddress;
        private TextView textViewLocation;

        private TextView textViewRestoType;
        private TextView textViewFoodType;
        private TextView textViewRating;
        private ImageView imageViewNonVegImage;


        public ViewHolder(View itemView) {
            super(itemView);

            textViewNonVegFoodName = (TextView)itemView.findViewById(R.id.textViewNonVegFoodName);
            textViewRating = (TextView)itemView.findViewById(R.id.textViewRating);
            textViewAddress = (TextView)itemView.findViewById(R.id.textViewAddress);
            textViewLocation = (TextView)itemView.findViewById(R.id.textViewLocation);
            textViewRestoType = (TextView)itemView.findViewById(R.id.textViewRestoType);
            textViewFoodType = (TextView)itemView.findViewById(R.id.textViewFoodType);
            imageViewNonVegImage = (ImageView)itemView.findViewById(R.id.imageViewNonVegImage);


        }
    }
}
