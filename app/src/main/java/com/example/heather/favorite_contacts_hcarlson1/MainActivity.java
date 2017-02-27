package com.example.heather.favorite_contacts_hcarlson1;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btn1Call, btn2Call, btn3Call, btn1Text, btn2Text, btn3Text;
    TextView tvStatus;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvStatus = (TextView) findViewById(R.id.textViewStatus);
        setupButtonClickEvents();


    }

    private void setupButtonClickEvents() {
        btn1Call = (Button) findViewById(R.id.button1Call);
        btn1Call.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Do something in response to button click
                tvStatus.setText("Call button for contact 1 was pressed");
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:" + "6122368854"));
                if (intent.resolveActivity(getPackageManager()) != null) {
                    startActivity(intent);
                }
            }
        });

        btn2Call = (Button) findViewById(R.id.button2Call);
        btn2Call.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Do something in response to button click
                tvStatus.setText("Call button for contact 2 was pressed");
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:" + "6513734309"));
                if (intent.resolveActivity(getPackageManager()) != null) {
                    startActivity(intent);
                }
            }
        });

        btn3Call = (Button) findViewById(R.id.button3Call);
        btn3Call.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Do something in response to button click
                tvStatus.setText("Call button for contact 3 was pressed");
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:" + "9524541397"));
                if (intent.resolveActivity(getPackageManager()) != null) {
                    startActivity(intent);
                }
            }
        });

        btn1Text = (Button) findViewById(R.id.button1Text);
        btn1Text.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Do something in response to button click
                tvStatus.setText("Text button for contact 1 was pressed");
                Intent sendIntent = new Intent(Intent.ACTION_VIEW);
                sendIntent.setData(Uri.parse("sms:6122368854"));
                sendIntent.putExtra("sms_body", "Hello");
                startActivity(sendIntent);
            }
        });

        btn2Text = (Button) findViewById(R.id.button2Text);
        btn2Text.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
            tvStatus.setText("Text button for contact 2 was pressed");
            Intent sendIntent = new Intent(Intent.ACTION_VIEW);
            sendIntent.setData(Uri.parse("sms:6513734309"));
            sendIntent.putExtra("sms_body", "Hello");
            startActivity(sendIntent);
    }
});

        btn3Text = (Button) findViewById(R.id.button3Text);
        btn3Text.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                tvStatus.setText("Text button for contact 3 was pressed");
            Intent sendIntent = new Intent(Intent.ACTION_VIEW);
            sendIntent.setData(Uri.parse("sms:9524541397"));
            sendIntent.putExtra("sms_body", "Hello");
            startActivity(sendIntent);
            }
        });


    }
}
