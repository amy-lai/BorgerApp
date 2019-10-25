package com.example.borgerapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class FoodInDetail extends AppCompatActivity {
    private TextView foodName;
    private TextView foodDesc;
    private TextView foodPrice;
    private TextView amount;
    private ImageView foodPic;
    private Button addToOrder;
    private Button viewOrder;
    private Button add;
    private Button minus;
    public int amt = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_in_detail);

        Intent intent = getIntent();
        String name = intent.getStringExtra("FOOD_NAME");
        final Food foodItem = theDatabase.getFoodByName(name);

        foodName = findViewById(R.id.food_name);
        foodDesc = findViewById(R.id.food_desc);
        foodPrice = findViewById(R.id.food_price);
        addToOrder = findViewById(R.id.add_to_order);
        viewOrder = findViewById(R.id.view_order);
        amount = findViewById(R.id.amount_wanted);
        add = findViewById(R.id.add);
        minus = findViewById(R.id.minus);
        foodPic = findViewById(R.id.big_food_image);

        amount.setText("1");
        foodName.setText(name);
        foodDesc.setText(foodItem.getDesc());
        String price = "$" + foodItem.getPrice();
        foodPrice.setText(price);
        foodPic.setImageResource(foodItem.getImageSource());

        viewOrder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Context context = v.getContext();
                Intent intent = new Intent(context,MyOrder.class);
                context.startActivity(intent);
            }
        });
        addToOrder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                theDatabase.addToOrder(foodItem,amt);
                amt = 1;
            }
        });
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                amt += 1;
                amount.setText(Integer.toString(amt));
            }
        });
        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                amt -= 1;
                amount.setText(Integer.toString(amt));
            }
        });
    }
}
