package com.webakruti.foodorder.Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.squareup.picasso.Picasso;
import com.webakruti.foodorder.R;

/**
 * Created by DELL on 11/3/2018.
 */

public class RecommendedAdapter extends RecyclerView.Adapter<RecommendedAdapter.ViewHolder> {

    private Context context;
    private int size;

    public RecommendedAdapter(Context context, int size) {
        this.context = context;
        this.size = size;

    }

    @NonNull
    @Override
    public RecommendedAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_bestseller_recommended, viewGroup, false);
        RecommendedAdapter.ViewHolder viewHolder = new RecommendedAdapter.ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull final RecommendedAdapter.ViewHolder viewHolder, final int position) {

       /* viewHolder.textViewName.setText("Non-veg cuisine italian thali");
        double price = 1 * 400;
        int qty = Integer.parseInt(viewHolder.textViewQty.getText().toString());

        viewHolder.textViewPrice.setText(price + "");
        viewHolder.textViewQuanityAvailable.setText("Quantity Available : " + "20");
        viewHolder.textViewQty.setText(qty + "");*/

        //final double actualPrice = 213;

        viewHolder.imageViewPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int qty = Integer.parseInt(viewHolder.textViewQty.getText().toString());
                if (qty < 10) {
                    qty = qty + 1;
                    viewHolder.textViewQty.setText(qty + "");
//                    double price = qty * actualPrice;
//                    viewHolder.textViewPrice.setText(price + "");
                    //cart.setQtyOrdered(qty);

                    //updateCartValueToFirebase(cart);
                } else {
                    Toast.makeText(context, "Maximum available quantity of food item reached.", Toast.LENGTH_SHORT).show();
                }
            }
        });

        viewHolder.imageViewMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int qty = Integer.parseInt(viewHolder.textViewQty.getText().toString());
                if (qty > 1) {
                    qty = qty - 1;
                    viewHolder.textViewQty.setText(qty + "");
//                    double price = qty * actualPrice;
//                    viewHolder.textViewPrice.setText(price + "");
//                    cart.setQtyOrdered(qty);
//                    updateCartValueToFirebase(cart);

                } else {
                    Toast.makeText(context, "Minimum 1 food item should buy...", Toast.LENGTH_SHORT).show();
                }
            }
        });

        /*//final Student.Studentbatch studentbatch = list.get(position);

        viewHolder.textViewBatchCourseName.setText(size[position]);
        viewHolder.textViewBatchTime.setText(studentbatch.getBatch().getStartTime());
        viewHolder.textViewCourseTeacher.setText(studentbatch.getWhoAssinged());

        viewHolder.textViewBatchCourseDuration.setText(studentbatch.getBatch().getCourse().getDuration());
        viewHolder.textViewBatchStartDate.setText(studentbatch.getBatch().getStartDate());
        viewHolder.textViewBatchEndDate.setText(studentbatch.getBatch().getEndDate());*/

        Picasso.with(context)
                .load(R.drawable.navab_thali1)
                .into(viewHolder.imageViewVegImage);
    }

    @Override
    public int getItemCount() {
        return size;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        CardView cardView;
        ImageView imageViewVegImage;
        ImageView imageViewMinus;
        ImageView imageViewPlus;
        TextView textViewQty;


        public ViewHolder(View itemView) {
            super(itemView);

            cardView = (CardView) itemView.findViewById(R.id.cardView);
            imageViewVegImage = (ImageView) itemView.findViewById(R.id.imageViewVegImage);
            imageViewMinus = (ImageView) itemView.findViewById(R.id.imageViewMinus);
            imageViewPlus = (ImageView) itemView.findViewById(R.id.imageViewPlus);
            textViewQty = (TextView) itemView.findViewById(R.id.textViewQty);
        }
    }
}
