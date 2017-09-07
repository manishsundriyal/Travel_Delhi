package com.example.sundriyal.delhiapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class streetfoodlist extends AppCompatActivity {

    int[] IMAGES = {R.drawable.bishan_swaroop_chaat_bhandaar,R.drawable.bitto_tikki_wala,
            R.drawable.old_famous_jalebi_wala,R.drawable.natraj_dahi_bhalle,R.drawable.khandani_pakode};

    String[] NAMES = {"Bishan Swaroop Chaat Bhandar","Bittoo Tikki Wala","Old Famous Jalebi Wala","Natraj Dahi Bhalle Wala","Khandani Pakode Wala"};

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.street_food_list_view);

        ListView listView = (ListView)findViewById(R.id.liststreetfood);
        CustomAdapter customAdapter = new CustomAdapter();
        listView.setAdapter(customAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(streetfoodlist.this,streetfood_description.class);
                intent.putExtra("flag",position);
                startActivity(intent);
            }
        });
    }


    class CustomAdapter extends BaseAdapter {
        @Override
        public int getCount() {
            return IMAGES.length;
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View view, ViewGroup viewGroup) {
            view = getLayoutInflater().inflate(R.layout.custom_listview,null);
            ImageView imageView = (ImageView)view.findViewById(R.id.Custom_Image);
            TextView textView = (TextView)view.findViewById(R.id.Custom_Text);

            imageView.setImageResource(IMAGES[position]);
            textView.setText(NAMES[position]);

            return view;
        }
    }
}

