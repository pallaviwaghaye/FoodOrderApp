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

import com.webakruti.foodorder.R;
import com.webakruti.foodorder.UI.FoodDeliveryRestroActivity;

public class GetFoodDeliveredAdapter extends RecyclerView.Adapter<GetFoodDeliveredAdapter.ViewHolder> {

    private Context context;
    private int size;

    public GetFoodDeliveredAdapter(Context context, int size) {
        this.context = context;
        this.size = size;

    }

    @NonNull
    @Override
    public GetFoodDeliveredAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_get_food_delivered_adapter, viewGroup, false);
        GetFoodDeliveredAdapter.ViewHolder viewHolder = new GetFoodDeliveredAdapter.ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull GetFoodDeliveredAdapter.ViewHolder viewHolder, final int position) {

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
                Intent i = new Intent(context, FoodDeliveryRestroActivity.class);
                context.startActivity(i);
            }
        });
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
        private CardView cardView;

        public ViewHolder(View itemView) {
            super(itemView);

            textViewNonVegFoodName = (TextView)itemView.findViewById(R.id.textViewNonVegFoodName);
            textViewRating = (TextView)itemView.findViewById(R.id.textViewRating);
            textViewAddress = (TextView)itemView.findViewById(R.id.textViewAddress);
            textViewLocation = (TextView)itemView.findViewById(R.id.textViewLocation);
            textViewRestoType = (TextView)itemView.findViewById(R.id.textViewRestoType);
            textViewFoodType = (TextView)itemView.findViewById(R.id.textViewFoodType);
            imageViewNonVegImage = (ImageView)itemView.findViewById(R.id.imageViewNonVegImage);
            cardView = (CardView)itemView.findViewById(R.id.cardView);

        }
    }
}
