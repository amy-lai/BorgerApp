package com.example.borgerapp;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;


public class MyOrder extends AppCompatActivity{
    private TextView totalCost;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.order);

        RecyclerView recyclerView = findViewById(R.id.order_rv);
        ArrayList<Food> order = theDatabase.getOrder();

        MyOrderAdapter adapter = new MyOrderAdapter();
        adapter.setData(order);
        recyclerView.setAdapter(adapter);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);

        totalCost = findViewById(R.id.total);
        totalCost.setText(calculateTotal(order));
    }
    public String calculateTotal (ArrayList<Food> order){
        double total = 0;
        for (int i = 0; i<order.size(); i++) {
            total = total + order.get(i).getPrice();
        }
        total = Math.round(total*100.0)/100.0;
        return "Total: $" + Double.toString(total);
    }

}
