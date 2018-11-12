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
import com.webakruti.foodorder.UI.GoOutForLunchDinnerActivity;

public class GoOutLunchDinnerAdapter extends RecyclerView.Adapter<GoOutLunchDinnerAdapter.ViewHolder> {

    private Context context;
    private int size;

    public GoOutLunchDinnerAdapter(Context context, int size) {
        this.context = context;
        this.size = size;

    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_go_out_lunch_dinner_adapter, viewGroup, false);
        GoOutLunchDinnerAdapter.ViewHolder viewHolder = new GoOutLunchDinnerAdapter.ViewHolder(view);
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

        Picasso.with(context)
                .load(R.drawable.navab_thali)
                .into(viewHolder.imageViewVegImage);

        viewHolder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, GoOutForLunchDinnerActivity.class);
                context.startActivity(intent);

            }
        });
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
        private CardView cardView;


        public ViewHolder(View itemView) {
            super(itemView);

            cardView = (CardView)itemView.findViewById(R.id.cardView);
            textViewVegFoodName = (TextView)itemView.findViewById(R.id.textViewVegFoodName);
            textViewAddress = (TextView)itemView.findViewById(R.id.textViewAddress);
            textViewLocation = (TextView)itemView.findViewById(R.id.textViewLocation);
            textViewRestoType = (TextView)itemView.findViewById(R.id.textViewRestoType);
            textViewFoodType = (TextView)itemView.findViewById(R.id.textViewFoodType);
            imageViewVegImage = (ImageView)itemView.findViewById(R.id.imageViewVegImage);



        }
    }
}
