package com.example.admin.mycontactlistapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        List<Contact> Contactlist = new ArrayList<Contact>();
        listView=findViewById(R.id.listView);
        Contactlist.add(new Contact(R.drawable.men,"Prashant","9602147358"));
        Contactlist.add(new Contact(R.drawable.men,"Pankaj","8005618596"));
        Contactlist.add(new Contact(R.drawable.men,"Ranjit","9950202576"));
        Contactlist.add(new Contact(R.drawable.men,"Ronak","8005527937"));
        Contactlist.add(new Contact(R.drawable.men,"Dwarika","9672314499"));
        Contactlist.add(new Contact(R.drawable.men,"Omji","8769591987"));
        Contactlist.add(new Contact(R.drawable.men,"vicky","7726015790"));
        Contactlist.add(new Contact(R.drawable.men,"Rajveer","9829340793"));
        Contactlist.add(new Contact(R.drawable.men,"Rajveer","9829340793"));
        Contactlist.add(new Contact(R.drawable.men,"Rajveer","9829340793"));
        Contactlist.add(new Contact(R.drawable.men,"Rajveer","9829340793"));
        Contactlist.add(new Contact(R.drawable.men,"Rajveer","9829340793"));
        Contactlist.add(new Contact(R.drawable.men,"Rajveer","9829340793"));


        MyListAdapter adapter=new MyListAdapter(this,R.layout.my_custom_list,Contactlist);
        listView.setAdapter(adapter);
    }
}

