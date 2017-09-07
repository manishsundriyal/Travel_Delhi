package com.example.sundriyal.delhiapp;

import android.app.ActionBar;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Locale;

public class Description extends AppCompatActivity {

    ImageView imageView;
    TextView title,description,address,metro_station,timings,entry_fee;
    int [] Images={R.drawable.janpath,R.drawable.dilli_haat,R.drawable.khan_market,R.drawable.karol_bagh,R.drawable.sarojni_nagar,
            R.drawable.lajpat_nagar_market,R.drawable.greater_kailash,R.drawable.chandni_chowk,R.drawable.connaught_place,R.drawable.tibetan_market};
    String[] Title={"Janpath","Dilli Haat","Khan Market","Karol Bagh","Sarojini Nagar","Lajpat nagar","Greater Kailash","Chandni Chowk","Connaught place","Tibetan Market"};

    String [] details={"The Janpath market stretches around 1.5-km from the Outer Circle of Connaught Place to Windsor Place.Janpath Market is one of the most famous markets for tourists (both Indian and foreign) in New Delhi. The market essentially is a long line of boutique stores selling products which cannot be found in today's malls and showrooms of the city. It is also one of the oldest markets of New Delhi with establishment of some boutiques dating back to 1950. It is most popular for the exquisite Pashmina Shawl from Kashmir. Most markets in Delhi are known to carry duplicates however one can find the original quality here. Among other exquisite items are the Kashmiri wool shawls and scarves, Indian Kurtis and Churidars brass ornaments and artefacts, carpets and other gift items.",
                        "Dilli Haat is an open-air food plaza and craft bazaar located in Delhi, run by Delhi Tourism and Transportation Development Corporation (DTTDC).\n" +
                                "There are three Dilli Haat in Delhi right now:-\n" +
                                "1. Dilli Haat, INA Market\n" +
                                "2. Dilli Haat, Pitampura\n" +
                                "3. Dilli Haat, Janak Puri East\n"+
                                "Extensive foundation work, small thatched roof cottages and kiosks give the plaza a village atmosphere. Some shops are permanent but other sellers are rotated, usually for fifteen days.Products offered may include rosewood and sandalwood carvings, embellished camel hide footwear, sophisticated fabric and drapery, gems, beads, brassware, metal crafts, and silk and wool fabrics. A number of shows promoting handicrafts and handlooms are held at the exhibition hall in the complex.",
                        "Established in 1951 and named in honour of Khan Abdul Jabbar Khan, has been ranked as the costliest retail location in India.Today it has grown to become one of the most expensive commercial real estate locations in the city. It has a wide variety of stores, including modern showrooms of most of well-known brands, like Nike, Puma, Reebok, Ogaan, Goodearth and others. Silver jewellery stores Amrapali, Safeera, Silverline, etc., delicatessens, bookstores, paints and hardware stores, electronics, kitchenware, and fabric stores mingle with some of the better restaurants.",
                        "Karol Bagh, is a mixed residential-cum-commercial neighbourhood in Delhi, India, known for its shopping streets, like the Ghaffar Market and Ajmal Khan Road. Some Wholesale markets are located in the area namely. Tank Road Garmet Market, Hardhyan Singh Road Leather market etc.Pizza Hut, TGIF, Reebok, Sketchers, Puma and Lacoste have all established successful businesses in Karol Bagh.. Many eateries also exist such as Pind Balluchi etc. You can buy everything needed by a girl here. From shoes to jewelry and to dress of your dreams. But you need to search thoroughly for the item you need and bargain fiercely for it.",
                        "Sarojini Nagar (or SN as it is sometimes called) is one of the places in the city to buy clothes and fabrics. Apart from a large number of large sized showrooms for various international and local brands, the crux of the market is formed by street side shops which sell garments of all sizes, designs and colors.",
                        "Lajpat Nagar is a residential and commercial neighbourhood of the South Delhi district of Delhi. It is named in honour of Lala Lajpat Rai, also known the Lion of Punjab, and is today most known for the Lajpat Nagar Central Market.Lajpat Nagar is the shopping adda for women. You can buy everything here from kurtis, clothes, latest footwears and bags,sarees, and all the things you might need at the cheapest prices. You just need to be skilled at bargaining to buy stuff at the cheapest prices.",
                        "One of the posh market in Delhi. It is divided into two parts Greater Kailash I and Greater Kailash II.  GK 1 markets in M and N Block are some of the most popular markets among Delhites and tourists because of its wide range of shopping, restaurant's, bars etc. M-Block, GK II is a popular market, with many restaurants and coffee shops and sanitary shops. It is one of the largest hubs for sanitary ware in Northern India",
                        "Chandni Chowk (Moonlight Square) is one of the oldest and busiest markets in Old Delhi. The market was once divided by canals (now closed) to reflect moonlight and remains one of India's largest wholesale markets. Chandni Chowk's speciality is its variety and authenticity: food, delicacies and sweets of more than 1,000 kinds, sarees with chikan and zari. Narrow lanes host shops sell books, clothing, electronic, consumer goods, shoes and leather goods. It is the location of the original Haldiram's and brands such as Gianis. A particular local delicacy are the jalebis, which are fried in pure ghee (clarified butter). The Cloth Market, supplies home furnishing fabrics, including ready-made items as well as design services. Nai Sarak is the wholesale market of stationery, books, paper and decorative materials. It house folder stores including SOLO and Shipra.",
                        "Connaught Place (कनॉट प्लेस) is one of the largest financial, commercial and business centres in New Delhi, India.  It is a logically planned area and houses one of India's first underground markets, the Palika Bazaar (Municipal Market), named after nagarpalika. The Outer Circle is known as the Connaught Circus (officially Indira Chowk), having rows of restaurants, shops and hotels. The Middle Circle has offices, Banks, Exchange houses such as Thomascook, Atwexchange, PVR cinema and eating outlets.",
                        "Often called the Little Tibet in Delhi, this colony was originally set up to house a few Tibetan refugees. Decades later, not only has the little colony market grown in size but its name and fame have also spread far and wide. It is popularly known as the Monastery Market.  A surprisingly large market, chock-a-block with stalls selling statues, incense, shawls, paintings and Tibetan artefacts, including jewellery and semi-precious stones. Shops selling clothes and  accessories are a huge hit among the young crowd of Delhi. Also popular are the shops selling footwear and other leather products. Most products are stylish and good value-for-money."};
    String [] Address={"Janpath Rd | Connaught Place, New Delhi",
            "Dilli Haat, INA, Aurbindo Marg, New Delhi\nDilli Haat, Pitampura, New Delhi\n Lal Sai Mandir Marg Opposite Hari Nagar Bus Depot, Janakpuri, New Delhi",
            "46, Khan Market Rd, Rabindra Nagar, New Delhi",
            "Block 1, WEA, Karol Bagh, New Delhi",
            "Sarojini Nagar Market, Sarojini Nagar, New Delhi",
            "Central Market, Lajpat Nagar II, Lajpat Nagar, New Delhi",
            "Greater Kailash I, Kailash Colony, New Delhi",
            "Chandni Chowk, New Delhi",
            "Connaught Place, Near Rajiv Chowk Metro Station, New Delhi",
            "Ladakh Buddhist Vihar, Ladakh Budh Vihar Colony, Civil Lines, New Delhi"};
    String [] Metro_Station={"Rajiv Chowk & Janpath Metro Station",
                            "INA  Metro Station\nNetaji Subhash Place Metro Station\nJanak Puri East Metro Station",
                            "Khan Market Metro Station",
                            "Karol Bagh Metro Station",
                            "INA Metro Station",
                            "Lajpat Nagar Metro Station",
                            "Kailash Colony Metro Station",
                            "Chandni Chowk Metro Station (Yellow Line)",
                            "Rajiv Chowk (Blue Line)",
                            "Civil Lines (Yellow Line)"};
    String [] Timings={"11:00 AM - 08:00 PM",
                        "11.00 AM to 10.00 PM",
                        "10.30AM to 8PM Mon-Sat",
                        "10AM to 10PM",
                        "10:00AM to 9:00PM",
                        "9:00 AM to 6:00 PM",
                        "10:00 AM to 9:00 PM",
                        "9:30 AM to 8:00 PM except Sunday",
                        "10:00 AM to 8:00 PM except Sunday",
                        "11:00 AM – 08:30 PM except Monday"};
    String [] Entry_Fee={"No Fee",
                         "₹10 to ₹30",
                        "No Fee",
                        "No Fee",
                        "No Fee",
                        "No Fee",
                        "No Fee",
                        "No Fee",
                        "No Fee",
                        "No Fee"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        Bundle extras=getIntent().getExtras();
        int val=extras.getInt("Val");

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_description);

        title = (TextView)findViewById(R.id.title);
        description = (TextView)findViewById(R.id.description);
        address = (TextView)findViewById(R.id.address);
        metro_station = (TextView)findViewById(R.id.metro_station);
        timings = (TextView)findViewById(R.id.timings);
        entry_fee = (TextView)findViewById(R.id.entry_fee);
        imageView=(ImageView)findViewById(R.id.viewPager);

       switch (val){
           case 0:
               setTitle(Title[0]);
               title.setText(Title[0]);
               description.setText(details[0]);
               address.setText(Address[0]);
               metro_station.setText(Metro_Station[0]);
               timings.setText(Timings[0]);
               entry_fee.setText(Entry_Fee[0]);
               imageView.setImageResource(Images[0]);
               break;
           case 1:
               setTitle(Title[1]);
               title.setText(Title[1]);
               description.setText(details[1]);
               address.setText(Address[1]);
               metro_station.setText(Metro_Station[1]);
               timings.setText(Timings[1]);
               entry_fee.setText(Entry_Fee[1]);
               imageView.setImageResource(Images[1]);
               break;
           case 2:
               setTitle(Title[2]);
               title.setText(Title[2]);
               description.setText(details[2]);
               address.setText(Address[2]);
               metro_station.setText(Metro_Station[2]);
               timings.setText(Timings[2]);
               entry_fee.setText(Entry_Fee[2]);
               imageView.setImageResource(Images[2]);
               break;
           case 3:
               setTitle(Title[3]);
               title.setText(Title[3]);
               description.setText(details[3]);
               address.setText(Address[3]);
               metro_station.setText(Metro_Station[3]);
               timings.setText(Timings[3]);
               entry_fee.setText(Entry_Fee[3]);
               imageView.setImageResource(Images[3]);
               break;
           case 4:
               setTitle(Title[4]);
               title.setText(Title[4]);
               description.setText(details[4]);
               address.setText(Address[4]);
               metro_station.setText(Metro_Station[4]);
               timings.setText(Timings[4]);
               entry_fee.setText(Entry_Fee[4]);
               imageView.setImageResource(Images[4]);
               break;
           case 5:
               setTitle(Title[5]);
               title.setText(Title[5]);
               description.setText(details[5]);
               address.setText(Address[5]);
               metro_station.setText(Metro_Station[5]);
               timings.setText(Timings[5]);
               entry_fee.setText(Entry_Fee[5]);
               imageView.setImageResource(Images[5]);
               break;
           case 6:
               setTitle(Title[6]);
               title.setText(Title[6]);
               description.setText(details[6]);
               address.setText(Address[6]);
               metro_station.setText(Metro_Station[6]);
               timings.setText(Timings[6]);
               entry_fee.setText(Entry_Fee[6]);
               imageView.setImageResource(Images[6]);
               break;
           case 7:
               setTitle(Title[7]);
               title.setText(Title[7]);
               description.setText(details[7]);
               address.setText(Address[7]);
               metro_station.setText(Metro_Station[7]);
               timings.setText(Timings[7]);
               entry_fee.setText(Entry_Fee[7]);
               imageView.setImageResource(Images[7]);
               break;
           case 8:
               setTitle(Title[8]);
               title.setText(Title[8]);
               description.setText(details[8]);
               address.setText(Address[8]);
               metro_station.setText(Metro_Station[8]);
               timings.setText(Timings[8]);
               entry_fee.setText(Entry_Fee[8]);
               imageView.setImageResource(Images[8]);
               break;
           case 9:
               setTitle(Title[9]);
               title.setText(Title[9]);
               description.setText(details[9]);
               address.setText(Address[9]);
               metro_station.setText(Metro_Station[9]);
               timings.setText(Timings[9]);
               entry_fee.setText(Entry_Fee[9]);
               imageView.setImageResource(Images[9]);
               break;

       }
    }
}
