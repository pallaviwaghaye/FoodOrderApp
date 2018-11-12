package com.webakruti.foodorder.Adapter;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.squareup.picasso.Picasso;
import com.webakruti.foodorder.R;
import com.webakruti.foodorder.UI.FoodDeliveryRestroActivity;

public class InspiredCollectionsAdapter extends RecyclerView.Adapter<InspiredCollectionsAdapter.ViewHolder> {

    private Context context;
    private int size;

    public InspiredCollectionsAdapter(Context context, int size) {
        this.context = context;
        this.size = size;

    }

    @NonNull
    @Override
    public InspiredCollectionsAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_inspired_collections, viewGroup, false);
        InspiredCollectionsAdapter.ViewHolder viewHolder = new InspiredCollectionsAdapter.ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull InspiredCollectionsAdapter.ViewHolder viewHolder, final int position) {

        /*//final Student.Studentbatch studentbatch = list.get(position);

        viewHolder.textViewBatchCourseName.setText(size[position]);
        viewHolder.textViewBatchTime.setText(studentbatch.getBatch().getStartTime());
        viewHolder.textViewCourseTeacher.setText(studentbatch.getWhoAssinged());

        viewHolder.textViewBatchCourseDuration.setText(studentbatch.getBatch().getCourse().getDuration());
        viewHolder.textViewBatchStartDate.setText(studentbatch.getBatch().getStartDate());
        viewHolder.textViewBatchEndDate.setText(studentbatch.getBatch().getEndDate());*/

        Picasso.with(context)
                .load(R.drawable.inspired)
                .into(viewHolder.imageViewInspiredImage);


        viewHolder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, FoodDeliveryRestroActivity.class);
                context.startActivity(intent);

            }
        });
    }

    @Override
    public int getItemCount() {
        return size;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private RelativeLayout relativeLayoutInspired;
        private ImageView imageViewInspiredImage;

        private CardView cardView;


        public ViewHolder(View itemView) {
            super(itemView);


            relativeLayoutInspired = (RelativeLayout)itemView.findViewById(R.id.relativeLayoutInspired);
            imageViewInspiredImage = (ImageView)itemView.findViewById(R.id.imageViewInspiredImage);
            cardView = (CardView)itemView.findViewById(R.id.cardView);


        }
    }
}
