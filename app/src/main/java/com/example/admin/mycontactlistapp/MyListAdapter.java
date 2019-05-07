package com.example.admin.mycontactlistapp;

import android.Manifest;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.support.annotation.Nullable;
import android.support.annotation.NonNull;
import android.support.v4.app.ActivityCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;


public class MyListAdapter extends ArrayAdapter<Contact> {

    List<Contact> contactList;
    Context context;
    int resource;

    public MyListAdapter(Context context, int resource, List<Contact> contactList) {
        super(context, resource, contactList);
        this.contactList = contactList;
        this.context = context;
        this.resource = resource;
    }


    @Override
    public View getView(int position,View convertView, ViewGroup parent) {

        LayoutInflater layoutInflater=LayoutInflater.from(context);
        View view = layoutInflater.inflate(resource, null, false);
        CircleImageView imageView = view.findViewById(R.id.imageView);

        TextView textViewName = view.findViewById(R.id.textViewName);
        TextView textViewNickname = view.findViewById(R.id.textViewNickName);
        Button buttonCall = view.findViewById(R.id.buttonCall);

        final Contact contact=contactList.get(position);
        imageView.setImageDrawable(context.getResources().getDrawable(contact.getImage()));
        textViewName.setText(contact.getName());
        textViewNickname.setText(contact.getNickname());

        buttonCall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_CALL,Uri.parse("tel:"+contact.getNickname()));

                    context.startActivity(intent);

            }
        });

        return view;
    }
}

