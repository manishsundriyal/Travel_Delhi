package com.example.sundriyal.delhiapp;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class gallery_description extends AppCompatActivity {

    ImageView imageView;
    int Images[] = {R.drawable.air_force_museum,R.drawable.garden_of_five_senses,R.drawable.gandhi_smriti,R.drawable.lodhi_garden,R.drawable.national_modern_art,
            R.drawable.nehru_museum,R.drawable.nehru_planetarium,R.drawable.national_railway_museum,R.drawable.national_science_centre};

    TextView title,description,address,metro_station,timings,entry_fee;
    String[] Title = {"Museum of Air Force","Garden of Five Senses","Gandhi Smriti","Lodhi Garden","National Modern Art Gallery","Nehru Museum and Library","Nehru Planetarium","National Railway Museum","National Science Centre"};
    String[] Description = {"The Indian Air Force Museum, Palam, is the museum of the Indian Air Force. The museum was the only one of its kind in India until the unveiling of the Naval Aviation Museum in Goa in 1998. The Museum entrance features an indoor display gallery that contains historic photographs, memorabilia, uniforms and personal weapons of the Indian Air Force from its inception in 1932. The gallery leads to a hangar exhibiting small aircraft and Air Force inventory like anti-aircraft guns, vehicles and ordnance. Larger aircraft are exhibited outside the hangar. This outdoor gallery contains aircraft that also displays several war trophies, radar equipment and captured enemy vehicles.","The Garden of Five Senses is a park spread over 20 acres, designed by Delhi architect Mr.Pradeep Sachdeva. Partly built over a rocky terrain, the garden has various theme areas, including a section on the lines of Mughal Gardens, plus pools of water lilies, bamboo courts, herb gardens and solar energy park. The Garden of Five Senses is a park developed by Delhi Tourism Transportation Development Corporation. Inaugurated in February 2003, the garden is designed to stimulate our five senses with its beauty and attractions and give us a chance to touch, smell, hear and see our natural surroundings.","Gandhi Smriti formerly known as Birla House or Birla Bhavan, is a museum dedicated to Mahatma Gandhi. It is the location where Mahatma Gandhi spent the last 144 days of his life and was assassinated on 30 January 1948. It was originally the house of the Indian business tycoons, the Birla family. It is now also home to the Eternal Gandhi Multimedia Museum, which was established in 2005. The museum in the building houses a number of articles associated with Gandhi's life and death. Visitors can tour the building and grounds, viewing the preserved room where Gandhi lived and the place on the grounds where he was shot while holding his nightly public walk.","Lodi Gardens or Lodhi Gardens is a city park situated in New Delhi, India. Spread over 90 acres (360,000 m2), it contains, Mohammed Shah's Tomb, Tomb of Sikandar Lodi, Shisha Gumbad and Bara Gumbad, architectural works of the 15th century by Lodis- who ruled parts of northern India and Punjab and Khyber Pakhtunkhwa province of modern-day Pakistan, from 1451 to 1526. The site is now protected by the Archaeological Survey of India. Lodi Gardens or Lodhi Gardens is a city park situated in New Delhi, India. Spread over 90 acres (360,000 m2),[1] it contains, Mohammed Shah's Tomb, Tomb of Sikandar Lodi, Shisha Gumbad and Bara Gumbad,[2] architectural works of the 15th century by Lodis- who ruled parts of northern India and Punjab and Khyber Pakhtunkhwa province of modern-day Pakistan, from 1451 to 1526. The site is now protected by the Archaeological Survey of India.","The National Gallery of Modern Art (NGMA) is the premier art gallery under Ministry of Culture, Government of India.[1] The main museum at Jaipur House in New Delhi was established on March 29, 1954 by the Government of India, with subsequent branches at Mumbai and Bangalore. Its collection of more than 14,000 works includes works by artists such as Thomas Daniell, Raja Ravi Verma, Abanindranath Tagore, Rabindranath Tagore, Gaganendranath Tagore, Nandalal Bose, Jamini Roy, Amrita Sher-Gil as well as foreign artists, apart from sculptures by various artists. Some of the oldest works preserved here date back to 1857. With 12,000 square meters of exhibition space,[2] the Delhi branch is one of the world's largest modern art museums.","The Nehru Memorial Museum and Library (NMML) is a museum and library in New Delhi, India, which aims to preserve and reconstruct the history of the Indian independence movement. Housed within the Teen Murti House complex, it is an autonomous institution under the Indian Ministry of Culture, and was founded in 1964 after the death of India's first prime minister. Today, the Nehru Memorial Library is the world’s leading resource centre on India’s first prime minister and its archives contain the bulk of Mahatma Gandhi's writings apart from private papers of C. Rajagopalachari, B. C. Roy, Jayaprakash Narayan, Charan Singh, Sarojini Naidu and Rajkumari Amrit Kaur. In March 2010 it launched a digitization project of its archives, under which by June 2011, 867,000 pages of manuscripts and 29,807 photographs were scanned and 500,000 pages uploaded on the digital library website.","Nehru Planetariums are the five planetariums in India, named after India's first Prime Minister, Jawaharlal Nehru. These are located in Mumbai, New Delhi, Pune and Bangalore, plus there is a Jawahar Planetarium in Allahabad. Nehru Planetarium in Pune was the first one in Asia, established in 1954. The Nehru Planetarium in New Delhi is situated on the grounds of Teen Murti Bhavan, officially known as 'Nehru Memorial Museum and Library', earlier the official residence of India's first Prime Minister, Jawaharlal Nehru and now a museum in his memory. In 1964, the Jawaharlal Nehru Memorial Fund was set up to promote his ideas and it undertook to build the Nehru Planetarium with its aim being the promotion of astronomy education. One of the major attractions of this place is the Soyuz T-10 which carried India’s first cosmonaut Rakesh Sharma to space, along with his space suit and mission journal. The Sky Theatre shown at Jawaharlal Nehru Planetarium are very popular and attract about more than 200,000 visitors per year.The sky theatre is a dome shaped theatre . It shows information on constellations,planets . Visuals such as Cartoons, Paintings, Computer animations, video clippings and special effects are liberally used in the programmes at the sky theatre.","The National Rail Museum is a museum in Chanakyapuri, New Delhi which focuses on the rail heritage of India. It opened on the 1 February 1977. It is located in over 10 acres (40,000 m2) of land with both indoor and outdoor exhibits. A toy train offers rides around that site on regular days. It is now equipped with 1:8 scale train, Diesel simulator, Steam Simulator, Coach Simulator and many more.","The National Science Centre established in 1992, is a science museum in Delhi, India. It is part of the National Council of Science Museums (NCSM), an autonomous body under India's Ministry of Culture. The National Science Centre is the northern zonal headquarters of the National Council of Science Museums. The Museum houses a unique collection of science models to arouse interest among children. The children are made aware of the effective use of science in our lives. The museum is all about learning and having fun. It provides a wide description of Indian heritage and Technology, and its evolution throughout till now."};
    String[] Address = {"Palam, New Delhi, Delhi 110010","Mehrauli-Badarpur Road, Village : Said-ul-Ajaib, Near Saket Metro Station, New Delhi, Delhi 110030","5, Tees January Marg, Tees January Road Area, Motilal Nehru Marg Area, New Delhi, Delhi 110001","Lodhi Rd, Lodhi Gardens, Lodhi Estate, New Delhi, Delhi 110003","Rajpath Marg, India Gate, New Delhi, Delhi 110001","Teen Murti Bhawan, New Delhi, Delhi 110011","Teen Murti House, New Delhi, Delhi 110011","Shanti Path, Chanakyapuri, Near Bhutan Embassy, New Delhi, Delhi 110021","Near Gate No.1, Bhairon Road, Pragati Maidan, New Delhi, Delhi 110001"};
    String[] Metro_Station = {"Dwarka Sector-9 (Blue Line) 8.9Km","Saket (Yellow Line) 2.4Km","Lok Kalyan Marg (Yellow Line) 1.0Km","Khan Market (Violet Line) 2.0Km","Khan Market (Violet Line) 1.5Km","Lok Kalyan Marg (Yellow Line) 1.0Km","Lok Kalyan Marg (Yellow Line) 2.0Km","Dhaula Kuan (Airport Line) 4.5Km","Pragati Maidan (Blue Line) 2.0Km"};
    String[] Timings = {"10:00 AM - 5:00 PM (All Days except Monday and Tuesday)","9:00 AM - 6:00 PM (October to March)\n9:00 AM - 7:00 PM (April to September)\nAll Days of Week","10:00 AM - 5:30 PM (All Days except Monday)","6:00 AM - 7:00 PM (All Days of Week)","10:00 AM - 5:00 PM (All Days except Monday)","9:00 AM - 6:30 AM (All Days of Week)","11:00 AM - 5:00 PM (All Days except Monday)\nShow Timings : 11:30 AM (English), 1:30 PM (Hindi), 3:00 PM (English) and 4:00 PM (Hindi)","9:30 AM - 5:30 PM (All Days except Monday)","10:00 AM - 5:30 PM (All Days of Week)"};
    String[] Entry_Fee = {"₹0 No Fee","₹30 per person for adults\n₹10 per child for children (upto 12 yrs)\n₹10 per person for senior citizens\n₹0 free entry for Handicapped","₹0 No Fee","₹0 No Fee","₹10  per person for adults\n₹150  per person for foregin tourists\n₹1  per person for children","₹0 No Fee","₹50 per person for adults\n₹30 per child for children (between 4 - 12 years)\n₹20 per person for school students","₹10 Per Person","₹50  per person General Entry (Visiting Centre only)\n₹40 per person General Entry (Visiting Centre only in a group of more than 25 persons)\n₹20 per person Students' Entry (Organised School Group)\n₹10 per person Students' Entry (Govt. / MCD School Group)\n₹5 per person General Entry (BPL Card holder)\n₹25 per person for Adults (3D Film Entry Ticket)\n₹20 per person for Children (3D Film Entry Ticket)\n₹20 per person 3D Film Entry Ticket (Group of more than 25 persons)\n₹10 per person 3D Film Entry Ticket (Govt. / MCD School Group)"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        Bundle bundle = getIntent().getExtras();
        int Pos = bundle.getInt("Pos");

        super.onCreate(savedInstanceState);
        setContentView(R.layout.gallery_description);

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

            case 8:
                setTitle(Title[8]);
                title.setText(Title[8]);
                description.setText(Description[8]);
                address.setText(Address[8]);
                metro_station.setText(Metro_Station[8]);
                timings.setText(Timings[8]);
                entry_fee.setText(Entry_Fee[8]);
                imageView.setImageResource(Images[8]);
                break;
        }
    }
}
