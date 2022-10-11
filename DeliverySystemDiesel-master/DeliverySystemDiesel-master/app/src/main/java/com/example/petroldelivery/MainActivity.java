package com.example.petroldelivery;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {

    String name,oName,address,q,pNumber;

    EditText nameInput;
    EditText organizationName;

    EditText phoneNumber;
    EditText quantity;
    EditText organizationAddress;


    Button submitButton;
    DatabaseReference databaseUsers;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        databaseUsers=FirebaseDatabase.getInstance().getReference("users");


        nameInput=(EditText) findViewById(R.id.nameInput);
        organizationName=(EditText) findViewById(R.id.organizationName);
        organizationAddress=(EditText) findViewById(R.id.organizationAddress);

        phoneNumber=(EditText) findViewById(R.id.phoneNumber);
        quantity=(EditText) findViewById(R.id.quantity);

        submitButton=(Button) findViewById(R.id.submitButton);
        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addUser();
                Intent intent = new Intent(getApplicationContext(),AfterOrder.class);
                startActivity(intent);
            }
        });


    }
    private void addUser(){
        name = nameInput.getText().toString();
        oName = organizationName.getText().toString();
        address = organizationAddress.getText().toString();
        pNumber =phoneNumber.getText().toString();
        q =quantity.getText().toString();

        if(!TextUtils.isEmpty(name)){
           String id = databaseUsers.push().getKey();
            Users user = new Users(name,id,oName,address,pNumber,q);
            databaseUsers.child(id).setValue(user);
            Toast.makeText(this,"Sent to Us. We Will get back to you in a moment!",Toast.LENGTH_LONG).show();
        }
        else{
            Toast.makeText(this,"Enter Text",Toast.LENGTH_LONG).show();
        }


    }



}
