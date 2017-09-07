package layout;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

import com.example.sundriyal.delhiapp.R;
import com.example.sundriyal.delhiapp.fastfoodlist;
import com.example.sundriyal.delhiapp.mughlailist;
import com.example.sundriyal.delhiapp.northindianlist;
import com.example.sundriyal.delhiapp.streetfoodlist;

/**
 * A simple {@link Fragment} subclass.
 */
public class Food extends Fragment {

    private static final String TAG="FoodFragment";
    ImageButton north_indian_btn,mughlai_btn,fast_food_btn,street_food_btn;
    public Food() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_food, container, false);

        north_indian_btn=(ImageButton)view.findViewById(R.id.north_indian_btn);
        mughlai_btn=(ImageButton)view.findViewById(R.id.mughlai_btn);
        fast_food_btn=(ImageButton)view.findViewById(R.id.fast_food_btn);
        street_food_btn=(ImageButton)view.findViewById(R.id.street_food_btn);

        north_indian_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(),"Great Choice You Got There !",Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getActivity(),northindianlist.class);
                startActivity(intent);

            }
        });

        mughlai_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(),"You got a royal taste !",Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getActivity(),mughlailist.class);
                startActivity(intent);

            }
        });


        fast_food_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(),"Great for a busy schedule !",Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getActivity(),fastfoodlist.class);
                startActivity(intent);

            }
        });


        street_food_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(),"Ahh! Lovely True Flavours of Delhi",Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getActivity(),streetfoodlist.class);
                startActivity(intent);

            }
        });


        return view;
    }

}


