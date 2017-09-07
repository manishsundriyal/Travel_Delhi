package com.example.sundriyal.delhiapp;


        import android.support.v4.view.ViewPager;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.widget.ImageView;
        import android.widget.TextView;

        import org.w3c.dom.Text;

public class streetfood_description extends AppCompatActivity {


    TextView title,address,phone,timings,known;
    ImageView imageView;

    int[] Images = {R.drawable.bishan_swaroop_chaat_bhandaar,R.drawable.bitto_tikki_wala,
            R.drawable.old_famous_jalebi_wala,R.drawable.natraj_dahi_bhalle,R.drawable.khandani_pakode};
    String[] Title = {"Bhishan Swaroop Chaat Bhandar","Bittoo Tikki Wala","Old Famous Jalebi Wala","Natraj Dhahi Bhalle Wala","Khandani Pakode Wala"};
    String[] Address={"1421, Near Ashish Medicos, Chandni Chowk, New Delhi","G-46, Aggarwal Millenium Tower, Netaji Subhash Place, New Delhi","Dariba Kalan, Chandni Chowk, New Delhi","1396, Main Road Near Central Bank, Opposite Paranthe Wali Gali, Chandni Chowk, New Delhi","Ring Road Market, Nauroji Nagar, Near Sarojini Nagar, New Delhi"};
    String[] Phone={"9818364070","9310340160","011 23256973","9811208811","NA"};
    String[] Timings={"10:00 AM - 9:00 PM","11:00 AM - 11:00 PM","8:00 AM - 10:00 PM","11:00 AM - 9:00 PM","9:00 AM - 10:00 PM"};
    String[] Known={"Aloo Chaat","Aloo Tikki","Jalebi","Dahi Bhalle","Pakodas"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        Bundle bundle = getIntent().getExtras();
        int flag = bundle.getInt("flag");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.streetfood_description);

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
