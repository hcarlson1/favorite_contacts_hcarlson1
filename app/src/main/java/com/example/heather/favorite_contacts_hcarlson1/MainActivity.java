package com.example.heather.favorite_contacts_hcarlson1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvStatus;
    ListView lvContacts;
    ArrayAdapter<Contacts>;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvStatus = (TextView) findViewById(R.id.textViewStatus);
        lvContacts = (ListView) findViewById(R.id.listViewContacts);
    }
}
