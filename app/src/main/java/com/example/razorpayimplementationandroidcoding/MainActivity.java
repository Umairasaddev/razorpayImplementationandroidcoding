package com.example.razorpayimplementationandroidcoding;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.razorpay.Checkout;

import org.json.JSONException;
import org.json.JSONObject;

public class MainActivity extends AppCompatActivity {

    Button btPay;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    btPay = findViewById(R.id.bt_pay);

    String sAmount = "100";

    //convert and round off
        int amount  = Math.round(Float.parseFloat(sAmount)*100);
        btPay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //initialize razor pay checkout
                Checkout checkout = new Checkout();
                //set key id
                checkout.setKeyID("rzp_test_UyN0qpU9RvU5Ju");
                //initialize json object
                JSONObject object  = new JSONObject();

                try {
                    //Put name
                    
                    object.put("name","Just Checking");
                //put description
                    object.put("description","Test payment");
                    //put theme color
                    object.put("theme.color","#0093DD");
                    //put currency unit
                    object.put("currency","INR");
                    //put  amount
                    object.put("amount",amount);
                    //put  mobile number
                    object.put("prefill.contact","9876543210");
                    //put  amount
                    object.put("amount",amount);
                    //put  email
                    object.put("amount",amount);




                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        });
    }
}