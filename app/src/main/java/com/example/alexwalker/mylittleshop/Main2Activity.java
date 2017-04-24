package com.example.alexwalker.mylittleshop;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Main2Activity extends AppCompatActivity {

    EditText nameEditText;
    EditText descriptionEditText;
    EditText priceEditText;
    Button saveButton;
    FirebaseDatabase firebaseDatabase;
    DatabaseReference databaseReference;
    Product product;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        init();

        saveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                product.setName(nameEditText.getText().toString());
                product.setDescription(descriptionEditText.getText().toString());
                product.setPrice(priceEditText.getText().toString());

                databaseReference.push().setValue(product);

            }
        });



    }

    private void init() {
        nameEditText = (EditText)findViewById(R.id.productNameEditText);
        descriptionEditText = (EditText)findViewById(R.id.productDescriptionEditText);
        priceEditText = (EditText)findViewById(R.id.productPriceEditText);
        saveButton = (Button)findViewById(R.id.saveButton);

        firebaseDatabase = FirebaseDatabase.getInstance();
        databaseReference = firebaseDatabase.getReference("Product");
        product = new Product();

    }
}
