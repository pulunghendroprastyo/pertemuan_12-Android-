package com.example.pertemuan_12;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class CLV_DataUser extends ArrayAdapter<String> {
    //Declarasi variable
    private final Activity context;
    private ArrayList<String> vName;
    private ArrayList<String> vNim;
    private ArrayList<String> vAddress;
    private ArrayList<String> vHobby;
    private ArrayList<String> vPhoto;

    public CLV_DataUser(Activity context, ArrayList<String> Name, ArrayList<String> Nim, ArrayList<String> Address,ArrayList<String> Hobby,ArrayList<String> Photo)
    {
        super(context, R.layout.list_item,Name);
        this.context    = context;
        this.vName      = Name;
        this.vNim       = Nim;
        this.vAddress   = Address;
        this.vHobby     = Hobby;
        this.vPhoto     = Photo;
    }



    @Override
    public View getView(int position, View view, ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        //Load Custom Layout untuk list
        View rowView= inflater.inflate(R.layout.list_item, null, true);

        //Declarasi komponen
        TextView name       = rowView.findViewById(R.id.idTXTName);
        TextView nim        = rowView.findViewById(R.id.idTXTNim);
        ImageView photo     = rowView.findViewById(R.id.idIVGambar);

        //Set Parameter Value sesuai widget textview
        name.setText(vName.get(position));
        nim.setText(vNim.get(position));

        if (vPhoto.get(position).equals(""))
        {
            Picasso.get().load("http://mobile.undangmi.com/image/noimage.png").into(photo);
        }
        else
        {
            Picasso.get().load("http://mobile.undangmi.com/image/"+vPhoto.get(position)).into(photo);
        }

        //Load the animation from the xml file and set it to the row
        //load animasi untuk listview
        Animation animation = AnimationUtils.loadAnimation(getContext(), R.anim.down_from_top);
        animation.setDuration(500);
        rowView.startAnimation(animation);

        return rowView;
    }


}