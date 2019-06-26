package com.webakruti.foodorder.Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;
import com.webakruti.foodorder.R;

/**
 * Created by DELL on 11/3/2018.
 */

public class CheckoutAdapter extends RecyclerView.Adapter<CheckoutAdapter.ViewHolder> {

    private Context context;
    private int size;

    public CheckoutAdapter(Context context, int size) {
        this.context = context;
        this.size = size;

    }

    @NonNull
    @Override
    public CheckoutAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_checkout, viewGroup, false);
        CheckoutAdapter.ViewHolder viewHolder = new CheckoutAdapter.ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull CheckoutAdapter.ViewHolder viewHolder, final int position) {

        /*//final Student.Studentbatch studentbatch = list.get(position);

        viewHolder.textViewBatchCourseName.setText(size[position]);
        viewHolder.textViewBatchTime.setText(studentbatch.getBatch().getStartTime());
        viewHolder.textViewCourseTeacher.setText(studentbatch.getWhoAssinged());

        viewHolder.textViewBatchCourseDuration.setText(studentbatch.getBatch().getCourse().getDuration());
        viewHolder.textViewBatchStartDate.setText(studentbatch.getBatch().getStartDate());
        viewHolder.textViewBatchEndDate.setText(studentbatch.getBatch().getEndDate());*/

        Picasso.with(context)
                .load(R.drawable.non_veg_thali1)
                .into(viewHolder.imageView);
    }

    @Override
    public int getItemCount() {
        return size;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {


        private ImageView imageView;

        public ViewHolder(View itemView) {
            super(itemView);


            imageView = (ImageView)itemView.findViewById(R.id.imageView);

        }
    }
}
