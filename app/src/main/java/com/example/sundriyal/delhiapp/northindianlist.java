package com.example.sundriyal.delhiapp;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class northindianlist extends AppCompatActivity {

    int[] IMAGES = {R.drawable.art_of_spices,R.drawable.bille_di_hatte,
            R.drawable.kake_di_hatti,R.drawable.sadarji_amritsari,R.drawable.sitaram_diwan_chand};

    String[] NAMES = {"Art Of Spices","Bille Di Hatti","Kake Di Hatti","Sardarji's Amritsari Kulcha","Sitaram Diwan Chand "};

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.north_indian_list_view);

        ListView listView = (ListView)findViewById(R.id.listnorthindian);
        CustomAdapter customAdapter = new CustomAdapter();
        listView.setAdapter(customAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent intent = new Intent(northindianlist.this,north_description.class);
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
