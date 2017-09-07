package com.example.sundriyal.delhiapp;

        import android.content.Intent;
        import android.os.Bundle;
        import android.support.annotation.Nullable;
        import android.support.v7.app.AppCompatActivity;
        import android.view.View;
        import android.view.ViewGroup;
        import android.widget.AdapterView;
        import android.widget.BaseAdapter;
        import android.widget.ImageView;
        import android.widget.ListView;
        import android.widget.TextView;

public class gallerylist extends AppCompatActivity {

    int IMAGES[] = {R.drawable.air_force_museum,R.drawable.garden_of_five_senses,R.drawable.gandhi_smriti,R.drawable.lodhi_garden,R.drawable.national_modern_art,
            R.drawable.nehru_museum,R.drawable.nehru_planetarium,R.drawable.national_railway_museum,R.drawable.national_science_centre};

    String NAMES[] = {"Museum of Air Force","Garden of Five Senses","Gandhi Smriti","Lodhi Garden","National Modern Art Gallery",
            "Nehru Museum and Library","Nehru Planetarium","National Railway Museum","National Science Centre"};

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tourism_list);

        ListView listView = (ListView)findViewById(R.id.list);
        gallerylist.CustomAdapter customAdapter = new CustomAdapter();
        listView.setAdapter(customAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent =new Intent(gallerylist.this,gallery_description.class);
                intent.putExtra("Pos",position);
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
