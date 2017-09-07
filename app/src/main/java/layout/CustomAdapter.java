package layout;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.sundriyal.delhiapp.R;

/**
 * Created by Sundriyal on 7/29/2017.
 */
public class CustomAdapter extends ArrayAdapter {

    int [] IMAGES={R.drawable.janpath,R.drawable.dilli_haat,R.drawable.khan_market,R.drawable.karol_bagh,R.drawable.sarojni_nagar,
            R.drawable.lajpat_nagar_market,R.drawable.greater_kailash,R.drawable.chandni_chowk,R.drawable.connaught_place,R.drawable.tibetan_market};
    public CustomAdapter(Context context,String[] places) {
        super(context, R.layout.custom_listview,places);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater layoutInflater=LayoutInflater.from(getContext());
        View customView=convertView;
        if(customView==null) {
            customView=layoutInflater.inflate(R.layout.custom_listview, parent, false);
        }
        String placeName= (String) getItem(position);
        TextView textView=(TextView)customView.findViewById(R.id.Custom_Text);
        ImageView imageView=(ImageView)customView.findViewById(R.id.Custom_Image);

        textView.setText(placeName);
        imageView.setImageResource(IMAGES[position]);
        return customView;
    }
}
