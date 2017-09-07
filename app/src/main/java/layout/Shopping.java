package layout;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.example.sundriyal.delhiapp.Description;
import com.example.sundriyal.delhiapp.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class Shopping extends Fragment{

    private static final String TAG="ShoppingFragment";
    public Shopping() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view=inflater.inflate(R.layout.fragment_shopping, container, false);
        String[] places={"Janpath","Dilli Haat","Khan Market","Karol Bagh","Sarojini Nagar","Lajpat nagar","Greater Kailash","Chandni Chowk","Connaught place","Tibetan Market"};
        ListAdapter listAdapter=new CustomAdapter(getContext(),places);
        ListView listView=(ListView)view.findViewById(R.id.Shopping_ListView);
        listView.setAdapter(listAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String value=String.valueOf(parent.getItemAtPosition(position));

                Intent intent=new Intent(getActivity(), Description.class);
                intent.putExtra("Val",position);

                startActivity(intent);
            }
        });
        return view;
    }
}
