package com.example.sundriyal.delhiapp;

        import android.content.Intent;
        import android.os.Bundle;
        import android.support.annotation.Nullable;
        import android.support.v4.app.Fragment;
        import android.support.v7.app.AppCompatActivity;
        import android.util.Log;
        import android.view.LayoutInflater;
        import android.view.View;
        import android.view.ViewGroup;
        import android.widget.AdapterView;
        import android.widget.BaseAdapter;
        import android.widget.ImageView;
        import android.widget.ListView;
        import android.widget.TextView;
        import android.widget.Toast;

public class historiclist extends AppCompatActivity {
    ListView listView;
    int[] IMAGES = {R.drawable.agrasen_ki_baoli,R.drawable.humayun_tomb,
            R.drawable.india_gate,R.drawable.jama_masjid,R.drawable.jantar_mantar,R.drawable.lotus_temple,R.drawable.old_fort,
            R.drawable.q_minar,R.drawable.rajghat,R.drawable.rashtrapati_bhawan,R.drawable.red_fort,
            R.drawable.tomb_of_safdarjung,R.drawable.tughlaqabad_fort};

    String[] NAMES = {"Agrasen Ki Baoli","Humayun's Tomb","India Gate","Jama Masjid","Jantar Mantar","Lotus Temple","Old Fort",
            "Qutub Minar","Raj Ghat","Rashtrapati Bhawan(President House)","Red Fort","Tomb of Safdarjung","Tughlaqabad Fort"};

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tourism_list);

        listView = (ListView)findViewById(R.id.list);
        CustomAdapter customAdapter = new CustomAdapter();
        listView.setAdapter(customAdapter);


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(historiclist.this,historic_description.class);
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
