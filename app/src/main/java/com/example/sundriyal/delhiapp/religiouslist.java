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

public class religiouslist extends AppCompatActivity {

    int IMAGES[] = {R.drawable.akshardham,R.drawable.cathedralchurch,R.drawable.chattarpur_temple,R.drawable.gurudwara_bangla_sahib,
            R.drawable.gurudwara_sisganj_sahib,R.drawable.iskcon_temple_delhi,R.drawable.laxmi_narayana_temple,R.drawable.nizamuddin_dargah};

    String NAMES[] = {"Akshardham Temple","Catheral Church of Redemption","Chattarpur Temple","Gurudwara Bangla Sahib",
            "Gurudwara Sis Ganj","ISKCON Temple","Laxmi Narayana Temple","Nizamuddin Dargah"};

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tourism_list);

        ListView listView = (ListView)findViewById(R.id.list);
        religiouslist.CustomAdapter customAdapter = new CustomAdapter();
        listView.setAdapter(customAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(religiouslist.this,religious_description.class);
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
