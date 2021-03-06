package com.webakruti.foodorder.Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.webakruti.foodorder.R;

/**
 * Created by DELL on 11/3/2018.
 */

public class StartersAdapter extends RecyclerView.Adapter<StartersAdapter.ViewHolder> {

    private Context context;
    private int size;

    public StartersAdapter(Context context, int size) {
        this.context = context;
        this.size = size;

    }

    @NonNull
    @Override
    public StartersAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_starters_adapter, viewGroup, false);
        StartersAdapter.ViewHolder viewHolder = new StartersAdapter.ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull StartersAdapter.ViewHolder viewHolder, final int position) {

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




        public ViewHolder(View itemView) {
            super(itemView);




        }
    }
}
