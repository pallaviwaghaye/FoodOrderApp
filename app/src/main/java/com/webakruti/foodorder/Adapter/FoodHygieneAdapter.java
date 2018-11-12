package com.webakruti.foodorder.Adapter;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;
import com.webakruti.foodorder.R;
import com.webakruti.foodorder.UI.FoodDeliveryRestroActivity;
import com.webakruti.foodorder.UI.GoOutForLunchDinnerActivity;

public class FoodHygieneAdapter extends RecyclerView.Adapter<FoodHygieneAdapter.ViewHolder> {

    private Context context;
    private int size;

    public FoodHygieneAdapter(Context context, int size) {
        this.context = context;
        this.size = size;

    }

    @NonNull
    @Override
    public FoodHygieneAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_food_hygiene, viewGroup, false);
        FoodHygieneAdapter.ViewHolder viewHolder = new FoodHygieneAdapter.ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull FoodHygieneAdapter.ViewHolder viewHolder, final int position) {

        /*//final Student.Studentbatch studentbatch = list.get(position);

        viewHolder.textViewBatchCourseName.setText(size[position]);
        viewHolder.textViewBatchTime.setText(studentbatch.getBatch().getStartTime());
        viewHolder.textViewCourseTeacher.setText(studentbatch.getWhoAssinged());

        viewHolder.textViewBatchCourseDuration.setText(studentbatch.getBatch().getCourse().getDuration());
        viewHolder.textViewBatchStartDate.setText(studentbatch.getBatch().getStartDate());
        viewHolder.textViewBatchEndDate.setText(studentbatch.getBatch().getEndDate());*/
        viewHolder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, FoodDeliveryRestroActivity.class);
                context.startActivity(intent);

            }
        });

        Picasso.with(context)
                .load(R.drawable.food2)
                .into(viewHolder.imageViewFoodHyegineImage);
    }

    @Override
    public int getItemCount() {
        return size;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {


        private CardView cardView;
        private ImageView imageViewFoodHyegineImage;
        public ViewHolder(View itemView) {
            super(itemView);

            cardView = (CardView)itemView.findViewById(R.id.cardView);
            imageViewFoodHyegineImage = (ImageView)itemView.findViewById(R.id.imageViewFoodHyegineImage);
        }
    }
}
