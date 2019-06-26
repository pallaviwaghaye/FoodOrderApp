package com.webakruti.foodorder.Adapter;

import android.content.Context;
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

public class FavoriteCuisineAdapter extends RecyclerView.Adapter<FavoriteCuisineAdapter.ViewHolder> {

    private Context context;
    private int size;

    public FavoriteCuisineAdapter(Context context, int size) {
        this.context = context;
        this.size = size;

    }

    @NonNull
    @Override
    public FavoriteCuisineAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_favorite_cuisines, viewGroup, false);
        FavoriteCuisineAdapter.ViewHolder viewHolder = new FavoriteCuisineAdapter.ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull FavoriteCuisineAdapter.ViewHolder viewHolder, final int position) {

        /*//final Student.Studentbatch studentbatch = list.get(position);

        viewHolder.textViewBatchCourseName.setText(size[position]);
        viewHolder.textViewBatchTime.setText(studentbatch.getBatch().getStartTime());
        viewHolder.textViewCourseTeacher.setText(studentbatch.getWhoAssinged());

        viewHolder.textViewBatchCourseDuration.setText(studentbatch.getBatch().getCourse().getDuration());
        viewHolder.textViewBatchStartDate.setText(studentbatch.getBatch().getStartDate());
        viewHolder.textViewBatchEndDate.setText(studentbatch.getBatch().getEndDate());*/


        Picasso.with(context)
                .load(R.drawable.fastfood1)
                .into(viewHolder.imageViewCuisinesImage);

        Picasso.with(context)
                .load(R.drawable.coffee22)
                .into(viewHolder.imageViewCuisines1Image);
    }

    @Override
    public int getItemCount() {
        return size;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {


        private ImageView imageViewCuisinesImage;
        private ImageView imageViewCuisines1Image;
        private CardView cardViewCuisines1;
        private CardView cardView;


        public ViewHolder(View itemView) {
            super(itemView);

            imageViewCuisinesImage = (ImageView)itemView.findViewById(R.id.imageViewCuisinesImage);
            imageViewCuisines1Image = (ImageView)itemView.findViewById(R.id.imageViewCuisines1Image);
            cardView = (CardView)itemView.findViewById(R.id.cardView);
            cardViewCuisines1 = (CardView)itemView.findViewById(R.id.cardViewCuisines1);


        }
    }
}
