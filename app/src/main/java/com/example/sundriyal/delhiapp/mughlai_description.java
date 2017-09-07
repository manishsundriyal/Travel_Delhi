package com.example.sundriyal.delhiapp;

        import android.support.v4.view.ViewPager;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.widget.ImageView;
        import android.widget.TextView;

        import org.w3c.dom.Text;

public class mughlai_description extends AppCompatActivity {

    ImageView imageView;

    int[] Images = {R.drawable.art_of_spices,R.drawable.khan_chacha};
    TextView title,address,phone,timings,known;
    String[] Title = {"Art Of Spices","Khan Chacha"};
    String[] Address={"53, BG-8, Ground Floor, DDA Market, Near Teachers Colony, Paschim Vihar, New Delhi","Shop 50, 1st Floor, Middle Lane, Khan Market, New Delhi"};
    String[] Phone={"011-42334544","011 43680449"};
    String[] Timings={"11:00 AM - 11:00 PM","11:00 AM - 11:00 PM"};
    String[] Known={"Kathi Rolls","Chicken Tikka Roll"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        Bundle bundle = getIntent().getExtras();
        int flag = bundle.getInt("flag");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mughlai_description);

        imageView=(ImageView)findViewById(R.id.viewPager);
        title = (TextView)findViewById(R.id.title);
        address = (TextView)findViewById(R.id.address);
        timings = (TextView)findViewById(R.id.timings);
        phone = (TextView)findViewById(R.id.phone);
        known = (TextView)findViewById(R.id.known);

        switch (flag){
            case 0:
                setTitle(Title[0]);
                title.setText(Title[0]);
                address.setText(Address[0]);
                timings.setText(Timings[0]);
                phone.setText(Phone[0]);
                known.setText(Known[0]);
                imageView.setImageResource(Images[0]);
                break;

            case 1:
                setTitle(Title[1]);
                title.setText(Title[1]);
                address.setText(Address[1]);
                timings.setText(Timings[1]);
                phone.setText(Phone[1]);
                known.setText(Known[1]);
                imageView.setImageResource(Images[1]);
                break;

            default:break;
        }

    }
}

