package layout;


import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

import com.example.sundriyal.delhiapp.R;
import com.example.sundriyal.delhiapp.gallerylist;
import com.example.sundriyal.delhiapp.historiclist;
import com.example.sundriyal.delhiapp.religiouslist;

/**
 * A simple {@link Fragment} subclass.
 */
public class Tourism extends Fragment {

    private static final String TAG = "Tourism";

    ImageButton historicbtn,religiousbtn,gallerybtn;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_tourism,container,false);

        historicbtn = (ImageButton) view.findViewById(R.id.historicallogo);
        religiousbtn = (ImageButton) view.findViewById(R.id.religiouslogo);
        gallerybtn = (ImageButton) view.findViewById(R.id.gallerylogo);

        historicbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),historiclist.class);
                startActivity(intent);
            }
        });

        religiousbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),religiouslist.class);
                startActivity(intent);
            }
        });

        gallerybtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),gallerylist.class);
                startActivity(intent);
            }
        });

        return view;
    }
}
