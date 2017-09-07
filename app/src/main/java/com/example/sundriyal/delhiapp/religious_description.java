package com.example.sundriyal.delhiapp;

        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.widget.ImageView;
        import android.widget.TextView;

public class religious_description extends AppCompatActivity {

    ImageView imageView;
    TextView title,description,address,metro_station,timings,entry_fee;
    int Images[] = {R.drawable.akshardham,R.drawable.cathedralchurch,R.drawable.chattarpur_temple,R.drawable.gurudwara_bangla_sahib,
            R.drawable.gurudwara_sisganj_sahib,R.drawable.iskcon_temple_delhi,R.drawable.laxmi_narayana_temple,R.drawable.nizamuddin_dargah};


    String[] Title = {"Akshardham Temple","Catheral Church of Redemption","Chattarpur Temple","Gurudwara Bangla Sahib","Gurudwara Sis Ganj","ISKCON Temple","Laxmi Narayana Temple","Nizamuddin Dargah"};
    String[] Description = {"Akshardham or Swaminarayan Akshardham complex is a Hindu mandir, and a spiritual-cultural campus. The complex displays millennia of traditional Hindu and Indian culture, spirituality, and architecture. The temple was officially opened on 6 November 2005 by Dr. A.P.J. Abdul Kalam. The complex features an Abhisheka Mandap, Sahaj Anand water show, a thematic garden and three exhibitions namely Sahajanand Darshan (Hall of Values), Neelkanth Darshan (an IMAX film on the early life of Swaminarayan as the teenage yogi, Neelkanth), and Sanskruti Darshan (cultural boat ride). According to Swaminarayan Hinduism, the word Akshardham means the abode of almighty Lord Swaminarayan and believed by followers as a temporal home of God on earth.","Cathedral Church of the Redemption, also known as the Viceroy Church, is among the most beautiful and magnificent churches in India. The church is located east of Parliament House and Rashtrapati Bhavan which was used by then British Viceroy. The Church derives its name from Palladio's Church of Il Redentore in Venice. The building was designed by Henry Medd. The cathedral was built in such a manner that even in the extreme summers it remains cool and serene. The Cathedral Church of the Redemption serves the community through its activities in education and health.","This is the second largest temple complex in India, and is dedicated to Goddess, Katyayani. It is located at Chhatarpur. This temple was considered as the biggest temple in India and second largest in the world, before the Akshardham Temple was created in 2005 in Delhi. This temple is totally constructed from marble and on all the facets there is jaali (perforated stone or latticed screen) work. It can be classified a vessara style of architecture. A side shrine within the main temple houses a shrine of Goddess Katyayani (Durga), which opens only during the bi-annual Navratri season, when thousands of people throng the premises for darshan. Apart from this the complex also has other temples dedicated to Lord Rama, Lord Ganesha and Lord Shiva. The temples have been built in both South and North Indian style of temple architecture.","Gurudwara Bangla Sahib is one of the most prominent Sikh gurdwara, or Sikh house of worship, in Delhi, India and known for its association with the eighth Sikh Guru, Guru Har Krishan, as well as the pool inside its complex, known as the 'Sarovar'. It ranked No. 1 among the best tourist and pilgrimage spot in dehli (SURVEY-2017). It was first built as a small shrine by Sikh General Sardar Bhagel Singh in 1783, who supervised the construction of nine Sikh shrines in Delhi in the same year, during the reign of Mughal Emperor, Shah Alam II. was originally a bungalow belonging to Raja Jai Singh, an Indian ruler in the seventeenth century, and was known as Jaisinghpura Palace. The Gurdwara and its Sarovar are now a place of great reverence for Sikhs, and a place for special congregation on birth anniversary of Guru Har Krishan.","Gurdwara Sis Ganj Sahib, is one of the nine historical gurdwaras in Delhi. First constructed in 1783 by Baghel Singh to commemorate the martyrdom site the ninth Sikh Guru, Guru Tegh Bahadur. Situated in Chandni Chowk in Old Delhi, it marks the site where the ninth Sikh Guru was beheaded on the orders of the Mughal emperor Aurangzeb on 11 November 1675 for refusing to convert to Islam. The present gurudwara structure was built in 1930. The trunk of tree under which the Guru was beheaded is also preserved here as is the well from which he took bath while in the prison. Also standing adjoining the gurudwara is the Kotwali (police station), where Guru was imprisoned and his disciples were tortured.","Sri Sri Radha Parthasarathi Mandir, generally known as the ISKCON Delhi temple, is a well known Vaishnav temple of Lord Krishna and Radharani in the form of Radha Parthasarathi. Opened in 1998. It is one of the top tourist place in Delhi to visit.It is not just a temple but also a Vedic Learning Center in a very scientific way. ISKCON Temple, designed and built by Achyut Kanvinde who in 1993 agreed to accept a pro-bono commission to build this temple complex for the followers of Srila Prabhupada,[1] is one of the largest temple complexes in India. It comprises numerous rooms for priests and for service renders. It has many halls that are used for its administration purposes and various seminars.","The Laxminarayan Temple, also known as the Birla Mandir, is a Hindu temple up to large extent dedicated to Laxminarayan in Delhi, India. Laxminarayan usually refers to Vishnu, Preserver in the Trimurti, also known as Narayan, when he is with his consort Lakshmi. The temple, inaugurated by Mahatma Gandhi, was built by Baldeo Das Birla and his sons (including Ghanshyam Das) from 1933 and 1939. The side temples are dedicated to Shiva, Krishna and Buddha. It was the first large Hindu temple built in Delhi. The temple is spread over 7.5 acres, adorned with many shrines, fountains, and a large garden with Hindu and Nationalistic sculptures, and also houses Geeta Bhawan for discourses. The temple is one of the major attractions of Delhi and attracts thousands of devotees on the festivals of Janmashtami and Diwali.","Hazrat Nizamuddin Dargah is the dargah (mausoleum) of one of the Sufi saints, Khwaja Nizamuddin Auliya (1238 - 1325 CE). he neighborhood surrounding the dargah is named after the saint, and is divided into two parts along Mathura Road: Nizamuddin West where the Dargah complex and a lively market dominated by Muslim vendors is located, and Nizamuddin East, an upper-Nizamuddin Railway Station. The other important monuments in the Nizamuddin heritage area include Humayun's Tomb, Chausath Khamba, Mirza Ghalib's tomb, Barakhamba, Sabz Burj (Blue Gumbad) at the Nizamuddin Circle and Lal Mahal. Qawwali sessions are held every Thursday after Maghrib prayer i.e. sunset time namaz/salat. Often Saturday is also a Qawwali session day but sometimes due to various reasons it is cancelled. But Thursday sessions are never cancelled being precursor to jumme ki raat (i.e. Friday eve)."};
    String[] Address = {"N.H.24, Noida More, New Delhi 110092","1, Church Road, North Avenue, New Delhi, Delhi 110001","Chhatarpur, Near Chhatarpur Metro Station, New Delhi, Delhi 110074","Ashoka Road, Connaught Place, Next to Grand Post Office, New Delhi, Delhi 110001","Sis Ganj Guru Dwara, Kucha Chelan, Maliwara Tiraha Bazar, Chandni Chowk, New Delhi, Delhi 110006","Hare Krishna Hill, Sant Nagar, East of Kailash, New Delhi, Delhi 110065","Mandir Marg, Near Golmarket, New Delhi, 110001","Boali Gate Rd, New Delhi, Delhi 110013"};
    String[] Metro_Station = {"Akshardham (Blue Line) 2Km","Patel Chowk (Yellow Line) 3.1Km","Chattarpur (Yellow Line) 800m","Patel Chowk (Yellow Line) 750m","Chandni Chowk (Yellow Line) 1.1Km","Kailash Colony (Violet Line) 2.2Km","Ram Krishna Ashram Marg (Blue Line) 1.6Km","JLN (Violet Line) 1.3Km"};
    String[] Timings = {"9:30 AM - 8:00 PM (All Days except Monday)","9:00 AM - 5:00 PM (Sunday)","4:00 AM - 11:00 PM (All Days of Week)","12:00 AM - 12:00 AM (All Days of Week)","12:00 AM - 12:00 AM (All Days of Week)","4:30 AM - 1:00 PM\n4:00 PM - 9:00 PM (All Days of Week)","4:30 AM - 1:30 PM\n2:30 PM - 9:00 PM (All Days of Week)","5:00 AM - 10:30 PM (All Days of Week)"};
    String[] Entry_Fee = {"₹170  per person for adults (Exhibition)\n₹100  per person for children (Exhibition) \n₹125 per person for senior citizens (Exhibition) \n₹80  per person for adults (Musical Fountain) \n₹50  per person for children (Musical Fountain) \n₹80  per person for senior citizens (Musical Fountain)","₹0 No Fee","₹0 No Fee","₹0 No Fee","₹0 No Fee","₹0 No Fee","₹0 No Fee\nCameras are Not Allowed","₹0 No Fee"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        Bundle bundle = getIntent().getExtras();
        int Pos = bundle.getInt("Pos");

        super.onCreate(savedInstanceState);
        setContentView(R.layout.religious_description);

        title = (TextView)findViewById(R.id.title);
        description = (TextView)findViewById(R.id.description);
        address = (TextView)findViewById(R.id.address);
        metro_station = (TextView)findViewById(R.id.metro_station);
        timings = (TextView)findViewById(R.id.timings);
        entry_fee = (TextView)findViewById(R.id.entry_fee);
        imageView=(ImageView)findViewById(R.id.viewPager);

        switch (Pos) {
            case 0:
                setTitle(Title[0]);
                title.setText(Title[0]);
                description.setText(Description[0]);
                address.setText(Address[0]);
                metro_station.setText(Metro_Station[0]);
                timings.setText(Timings[0]);
                entry_fee.setText(Entry_Fee[0]);
                imageView.setImageResource(Images[0]);
                break;

            case 1:
                setTitle(Title[1]);
                title.setText(Title[1]);
                description.setText(Description[1]);
                address.setText(Address[1]);
                metro_station.setText(Metro_Station[1]);
                timings.setText(Timings[1]);
                entry_fee.setText(Entry_Fee[1]);
                imageView.setImageResource(Images[1]);
                break;

            case 2:
                setTitle(Title[2]);
                title.setText(Title[2]);
                description.setText(Description[2]);
                address.setText(Address[2]);
                metro_station.setText(Metro_Station[2]);
                timings.setText(Timings[2]);
                entry_fee.setText(Entry_Fee[2]);
                imageView.setImageResource(Images[2]);
                break;
            case 3:
                setTitle(Title[3]);
                title.setText(Title[3]);
                description.setText(Description[3]);
                address.setText(Address[3]);
                metro_station.setText(Metro_Station[3]);
                timings.setText(Timings[3]);
                entry_fee.setText(Entry_Fee[3]);
                imageView.setImageResource(Images[3]);
                break;

            case 4:
                setTitle(Title[4]);
                title.setText(Title[4]);
                description.setText(Description[4]);
                address.setText(Address[4]);
                metro_station.setText(Metro_Station[4]);
                timings.setText(Timings[4]);
                entry_fee.setText(Entry_Fee[4]);
                imageView.setImageResource(Images[4]);
                break;

            case 5:
                setTitle(Title[5]);
                title.setText(Title[5]);
                description.setText(Description[5]);
                address.setText(Address[5]);
                metro_station.setText(Metro_Station[5]);
                timings.setText(Timings[5]);
                entry_fee.setText(Entry_Fee[5]);
                imageView.setImageResource(Images[5]);
                break;

            case 6:
                setTitle(Title[6]);
                title.setText(Title[6]);
                description.setText(Description[6]);
                address.setText(Address[6]);
                metro_station.setText(Metro_Station[6]);
                timings.setText(Timings[6]);
                entry_fee.setText(Entry_Fee[6]);
                imageView.setImageResource(Images[6]);
                break;

            case 7:
                setTitle(Title[7]);
                title.setText(Title[7]);
                description.setText(Description[7]);
                address.setText(Address[7]);
                metro_station.setText(Metro_Station[7]);
                timings.setText(Timings[7]);
                entry_fee.setText(Entry_Fee[7]);
                imageView.setImageResource(Images[7]);
                break;
        }
    }
}
