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

import com.webakruti.foodorder.R;

/**
 * Created by DELL on 11/3/2018.
 */

public class CartAdapter extends RecyclerView.Adapter<CartAdapter.ViewHolder> {

    private Context context;
    private int size;

    public CartAdapter(Context context, int size) {
        this.context = context;
        this.size = size;

    }

    @NonNull
    @Override
    public CartAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_cart, viewGroup, false);
        CartAdapter.ViewHolder viewHolder = new CartAdapter.ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull final CartAdapter.ViewHolder viewHolder, final int position) {

        viewHolder.textViewName.setText("Non-veg cuisine italian thali");
        double price = 1 * 400;
        int qty = Integer.parseInt(viewHolder.textViewQty.getText().toString());

        viewHolder.textViewPrice.setText(price + "");
        viewHolder.textViewQuanityAvailable.setText("Quantity Available : " + "20");
        viewHolder.textViewQty.setText(qty + "");

        final double actualPrice = 400;

        viewHolder.imageViewPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int qty = Integer.parseInt(viewHolder.textViewQty.getText().toString());
                if (qty < 20) {
                    qty = qty + 1;
                    viewHolder.textViewQty.setText(qty + "");
                    double price = qty * actualPrice;
                    viewHolder.textViewPrice.setText(price + "");
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
                    double price = qty * actualPrice;
                    viewHolder.textViewPrice.setText(price + "");
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
    }

    @Override
    public int getItemCount() {
        return size;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        CardView cardView;
        TextView textViewName;
        TextView textViewPrice;
        ImageView imageView;
        LinearLayout linearLayoutRemove;
        TextView textViewQuanityAvailable;
        ImageView imageViewMinus;
        ImageView imageViewPlus;
        TextView textViewQty;


        public ViewHolder(View itemView) {
            super(itemView);

            cardView = (CardView) itemView.findViewById(R.id.cardView);
            textViewName = (TextView) itemView.findViewById(R.id.textViewName);
            textViewPrice = (TextView) itemView.findViewById(R.id.textViewPrice);
            imageView = (ImageView) itemView.findViewById(R.id.imageView);
            linearLayoutRemove = (LinearLayout) itemView.findViewById(R.id.linearLayoutRemove);
            textViewQuanityAvailable = (TextView) itemView.findViewById(R.id.textViewQuanityAvailable);

            imageViewMinus = (ImageView) itemView.findViewById(R.id.imageViewMinus);
            imageViewPlus = (ImageView) itemView.findViewById(R.id.imageViewPlus);
            textViewQty = (TextView) itemView.findViewById(R.id.textViewQty);


        }
    }
}
