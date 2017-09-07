package com.example.sundriyal.delhiapp;


        import android.support.v4.view.ViewPager;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.widget.ImageView;
        import android.widget.TextView;

        import org.w3c.dom.Text;

public class fastfood_description extends AppCompatActivity {

    ImageView imageView;
    TextView title,address,phone,timings,known;
    int[] Images = {R.drawable.byd,R.drawable.dolma_momos_aunty,
            R.drawable.hashtag_foods};
    String[] Title = {"Big Yellow Door","Dolma Aunty's Momos","Hashtag Foods"};
    String[] Address={"2521, 2nd Floor, Kingsway Camp, Hudson Lane, GTB Nagar, New Delhi","Shop 39-B, Central Market, Lajpat Nagar 2, New Delhi","G-89, Aggarwal Millennium, Tower 2, Netaji Subhash Place, New Delhi"};
    String[] Phone={"9717392123","9810654581","011 45565793"};
    String[] Timings={"10:00 AM - 11:00 PM","12:00 PM - 9:00 PM","9:00 AM - 12:00 AM"};
    String[] Known={"Pasta","Momos","Pasta"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        Bundle bundle = getIntent().getExtras();
        int flag = bundle.getInt("flag");

        super.onCreate(savedInstanceState);
        setContentView(R.layout.fastfood_description);


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

            default:break;
        }

    }
}

