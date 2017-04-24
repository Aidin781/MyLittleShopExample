package com.example.alexwalker.mylittleshop;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by alexwalker on 24.04.17.
 */

public class CustomListViewAdapter extends ArrayAdapter <Product> {
    private Context context;

    public CustomListViewAdapter(@NonNull Context context, @LayoutRes int resource, @NonNull ArrayList <Product> products) {
        super(context, 0, products);
        this.context = context;
    }



    @Override
    public View getView(int position, final View convertView, ViewGroup parent) {
        View listItemView = convertView;

        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item_layout, parent, false);
        }

        Product currentProduct = getItem(position);

        final TextView nameTextView = (TextView)listItemView.findViewById(R.id.productNameTextView);
        if(currentProduct.getName()!= null){
            nameTextView.setText(currentProduct.getName());
        }
        TextView descriptionTextView = (TextView)listItemView.findViewById(R.id.productDescriptionTextView);
        if(currentProduct.getDescription() != null){
            descriptionTextView.setText(currentProduct.getDescription());
        }
        TextView priceTextView = (TextView)listItemView.findViewById(R.id.productPriceTextView);
        if(currentProduct.getPrice() != null){
            priceTextView.setText(currentProduct.getPrice());
        }

        Button button = (Button)listItemView.findViewById(R.id.itemButton);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, Main2Activity.class);
                context.startActivity(intent);

            }
        });

        return listItemView;
    }





}
