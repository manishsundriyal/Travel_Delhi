package com.example.sundriyal.delhiapp;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class north_description extends AppCompatActivity {

    ImageView imageView;
    TextView title,address,phone,timings,known;
    int[] Images = {R.drawable.art_of_spices,R.drawable.bille_di_hatte,
            R.drawable.kake_di_hatti,R.drawable.sadarji_amritsari,R.drawable.sitaram_diwan_chand};

    String[] Title = {"Art Of Spices","Bille Di Hatte","Kake Di Hatti","Sardarji's Amritsari Kulcha","Sitaram Diwan Chand"};
    String[] Address={"53, BG-8, Ground Floor, DDA Market, Near Teachers Colony, Paschim Vihar, New Delhi","72-D, Kamla Nagar, New Delhi","654-666, Church Mission Road, Fatehpuri, Chandni Chowk, New Delhi","Flat 22, RU Block, Opposite Power House, Pitampura, New Delhi","2246, Chuna Mandi, Paharganj, New Delhi"};
    String[] Phone={"011-42334544","011 45537004","9650907169","9810973129","011 23587380"};
    String[] Timings={"11:00 AM - 11:00 PM","7:00 AM - 4:00 PM","8:00 AM - 1:00 AM","10:00 AM - 10:00 PM","8:00 AM - 6:00 PM"};
    String[] Known={"KAthi Rolls","Chole Puri, Lassi","Daal Makhani","Stuffed Kulcha","Chole Bhature"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        Bundle bundle = getIntent().getExtras();
        int flag = bundle.getInt("flag");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.north_description);

        title = (TextView)findViewById(R.id.title);
        address = (TextView)findViewById(R.id.address);
        timings = (TextView)findViewById(R.id.timings);
        phone = (TextView)findViewById(R.id.phone);
        known = (TextView)findViewById(R.id.known);
        imageView=(ImageView)findViewById(R.id.viewPager);
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

            case 2:
                setTitle(Title[2]);
                title.setText(Title[2]);
                address.setText(Address[2]);
                timings.setText(Timings[2]);
                phone.setText(Phone[2]);
                known.setText(Known[2]);
                imageView.setImageResource(Images[2]);
                break;

            case 3:
                setTitle(Title[3]);
                title.setText(Title[3]);
                address.setText(Address[3]);
                timings.setText(Timings[3]);
                phone.setText(Phone[3]);
                known.setText(Known[3]);
                imageView.setImageResource(Images[3]);
                break;

            case 4:
                setTitle(Title[4]);
                title.setText(Title[4]);
                address.setText(Address[4]);
                timings.setText(Timings[4]);
                phone.setText(Phone[4]);
                known.setText(Known[4]);
                imageView.setImageResource(Images[4]);
                break;

            default:break;
        }

    }
}


