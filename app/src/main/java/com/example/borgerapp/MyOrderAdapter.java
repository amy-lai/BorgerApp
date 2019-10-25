package com.example.borgerapp;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

public class MyOrderAdapter extends RecyclerView.Adapter<MyOrderAdapter.FoodViewHolder>{

    private ArrayList<Food> data;

    public void setData(ArrayList<Food> data) {
        this.data = data;
    }

    public class FoodViewHolder extends RecyclerView.ViewHolder{
//        public View view;
//        public TextView name;
//        public TextView desc;
//        public TextView price;
        public TextView orderItem;

        public FoodViewHolder(@com.example.borgerapp.NonNull View itemView){
            super(itemView);
//            view = itemView;
            orderItem = itemView.findViewById(R.id.item_ordered);
//            name = itemView.findViewById(R.id.food_name);
//            desc = itemView.findViewById(R.id.food_desc);
//            price = itemView.findViewById(R.id.food_price);
        }
    }
    @NonNull
    @Override
    public FoodViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
    View view =
            LayoutInflater.from(parent.getContext())
                    .inflate(R.layout.order_item, parent, false);
    FoodViewHolder foodViewHolder = new FoodViewHolder(view);
        return foodViewHolder;
}
    @Override
    public void onBindViewHolder(@NonNull FoodViewHolder holder, int position) {
        //  Bundle extras = new Bundle();
        final Food food = data.get(position);
        String temp = "x1 " + food.getName() + " $" + Double.toString(food.getPrice());
        holder.orderItem.setText(temp);
//
//        holder.view.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Context context = v.getContext();
//                Intent intent = new Intent(context, FoodInDetail.class);
//                intent.putExtra("FOOD_NAME", food.getName());
//                context.startActivity(intent);
//            }
//        });

    }

    @Override
    public int getItemCount() {
        return data.size();
    }


}
