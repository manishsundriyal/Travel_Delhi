package com.example.sundriyal.delhiapp;

        import android.os.Build;
        import android.support.v4.content.ContextCompat;
        import android.support.v4.view.ViewPager;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.WindowManager;
        import android.widget.ImageView;
        import android.widget.TextView;

public class historic_description extends AppCompatActivity {

    TextView title,description,address,metro_station,timings,entry_fee;
    ImageView imageView;
    int[] Images = {R.drawable.agrasen_ki_baoli,R.drawable.humayun_tomb,
            R.drawable.india_gate,R.drawable.jama_masjid,R.drawable.jantar_mantar,R.drawable.lotus_temple,R.drawable.old_fort,
            R.drawable.q_minar,R.drawable.rajghat,R.drawable.rashtrapati_bhawan,R.drawable.red_fort,
            R.drawable.tomb_of_safdarjung,R.drawable.tughlaqabad_fort};
    String[] Title = {"Agrasen Ki Baoli","Humayun's Tomb","India Gate","Jama Masjid","Jantar Mantar","Lotus Temple","Old Fort","Qutub Minar","Raj Ghat","Rashtrapati Bhawan(President House)","Red Fort","Tomb of Safdarjung","Tughlaqabad Fort"};

    String[] Description = {"Agrasen Ki Baoli is a 60-meter long and 15-meter wide historical step well. Although there are no know historical records to prove who built Agrasen ki Baoli, it is believed that it was originally built by the legendary king Agrasen. Baoli or bawdi is a hindi word for step well. This Baoli, with 108 steps, is among a few of its kind in Delhi. There are stories that Agrasen Ki Baoli is haunted and that the ‘black water’ of the baoli invited people to jump into it and commit suicide. How much of it is true is actually difficult to say. The baoli nowadays remains almost waterless. The very little water that is there in the well is anything but black",
            "Humayun's tomb (Maqbara e Humayun) is the tomb of the Mughal Emperor Humayun. The tomb was commissioned by Humayun's first wife and chief consort, Empress Bega Begum (also known as Haji Begum), in 1569-70, and designed by Mirak Mirza Ghiyas, a Persian architect chosen by her. It was the first garden-tomb on the Indian subcontinent. The complex encompasses the main tomb of the Emperor Humayun, which houses the graves of Bega Begum herself, Hamida Begum, and also Dara Shikoh, great-great-grandson of Humayun and son of the later Emperor Shah Jahan, as well as numerous other subsequent Mughals, including Emperor Jahandar Shah, Farrukhsiyar, Rafi Ul-Darjat, Rafi Ud-Daulat, Muhammad Kam Bakhsh and Alamgir II. It represented a leap in Mughal architecture, and together with its accomplished Charbagh garden, typical of Persian gardens, but never seen before in India, it set a precedent for subsequent Mughal architecture.",
            "The India Gate, (originally called the All India War Memorial), is a war memorial located astride the Rajpath.  India Gate is a memorial to 82,000 soldiers of the Indian Army who died in the period 1914–21 in the First World War, in France, Flanders, Mesopotamia, Persia, East Africa, Gallipoli and elsewhere in the Near and the Far East, and the Third Anglo-Afghan War. 13,300 servicemen's names, including some soldiers and officers from the United Kingdom, are inscribed on the gate. The cornice of the India Gate is inscribed with the Imperial suns while both sides of the arch have INDIA, flanked by the dates MCMXIV (1914 left) and MCMXIX (1919 right). Below the word INDIA, in capital letters, is inscribed:\n\nTO THE DEAD OF THE INDIAN ARMIES WHO FELL AND ARE HONOURED IN FRANCE AND FLANDERS MESOPOTAMIA AND PERSIA EAST AFRICA GALLIPOLI AND ELSEWHERE IN THE NEAR AND THE FAR-EAST AND IN SACRED MEMORY ALSO OF THOSE WHOSE NAMES ARE HERE RECORDED AND WHO FELL IN INDIA OR THE NORTH-WEST FRONTIER AND DURING THE THIRD AFGHAN WAR \n\n Amar Jawan Jyoti, or the flame of the immortal soldier, is a structure consisting of black marble plinth, with reversed L1A1 Self-loading rifle, capped by war helmet, bound by four urns, each with the permanent light (jyoti) from (CNG) flames, erected under the India Gate in the wake Liberation of Bangladesh in December 1971 to commemorate Indian soldiers killed in the defense of their country.",
            "The Masjid-i Jahān-Numā (World-reflecting Mosque), commonly known as the Jama Masjid of Delhi, is one of the largest mosques in India. t was built by Mughal emperor Shah Jahan between 1644 and 1656 at a cost of 1 million rupees, and was inaugurated by an imam from Bukhara, present-day Uzbekistan. The mosque was completed in 1656 AD with three great gates, four towers and two 40 m high minarets constructed of strips of red sandstone and white marble. The courtyard can accommodate more than 25,000 persons. There are three domes on the terrace which are surrounded by the two minarets. On the floor, a total of 899 black borders are marked for worshippers. The architectural plan of Badshahi Masjid, built by Shah Jahan's son Aurangzeb at Lahore, Pakistan, is similar to the Jama Masjid, Delhi.",
            "Jantar Mantar consists of 13 architectural astronomy instruments. The site is one of five built by Maharaja Jai Singh II of Jaipur, from 1723 onwards, as he was given by Mughal emperor Muhammad Shah the task of revising the calendar and astronomical tables. There is a plaque fixed on one of the structures in the Jantar Mantar observatory in New Delhi that was placed there in 1910 mistakenly dating the construction of the complex to the year 1710. Later research, though, suggests 1724 as the actual year of construction. The primary purpose of the observatory was to compile astronomical tables, and to predict the times and movements of the sun, moon and planets. Some of these purposes nowadays would be classified as astronomy.",
            "The Lotus Temple, located in Delhi, India, is a Bahá'í House of Worship completed in 1986. Notable for its flowerlike shape, it has become a prominent attraction in the city. Like all Bahá'í Houses of Worship, the Lotus Temple is open to all, regardless of religion or any other qualification. The building is composed of 27 free-standing marble-clad 'petals' arranged in clusters of three to form nine sides, with nine doors opening onto a central hall with height of slightly over 40 metres and a capacity of 2,500 people. The Lotus Temple has won numerous architectural awards and been featured in hundreds of newspaper and magazine articles. A 2001 CNN report referred to it as the most visited building in the world.",
            "Purana Qila (Old Fort) is one of the oldest forts in Delhi. Its current form was built by Sher Shah Suri, the founder of the Sur Empire. Sher Shah raised the citadel of Purana Qila with an extensive city-area sprawling around it. It is believed that the Purana Qila was still incomplete at Sher Shah's death in 1545, and was perhaps completed by his son Islam Shah, although it is not certain which parts were built by whom. The fort was the inner citadel of the city of Din Panah during Humayun's rule who renovated it in 1533 and completed five years later. The walls of the Fort rise to a height of 18 metres, traverse about 1.5 km, and have three arched gateways: The Bara Darwaza (Big Gate) facing west, The Humayun Gate facin south, and lastly The Talaqi Gate(Forbidden Gate).",
            "Qutub Minar is a minaret that forms part of the Qutb complex, a UNESCO World Heritage Site in the Mehrauli area of Delhi. Made of red sandstone and marble, Qutub Minar is a 73-metre (240 feet) tall tapering tower of five storeys, with a 14.3 metre (47 feet) base diameter, reducing to 2.7 metres (9 feet) at the peak. It contains a spiral staircase of 379 steps. Its design is thought to have been based on the Minaret of Jam, in western Afghanistan. Qutb al-Din Aibak, founder of the Delhi Sultanate, started construction of the Qutub Minar's first storey around 1192. In 1220, Aibak's successor and son-in-law Iltutmish completed a further three storeys. In 1369, a lightning strike destroyed the top storey. Firoz Shah Tughlaq replaced the damaged storey, and added one more. The Minar is surrounded by several historically significant monuments of the Qutb complex, including Quwwat-ul-Islam Mosque, which was built at the same time as the Minar, and the much older Iron Pillar of Delhi. The nearby pillared Cupola known as Smith's Folly is a remnant of the tower's 19th century restoration, which included an ill-advised attempt to add a sixth storey.",
            "Raj Ghat is a memorial dedicated to Mahatma Gandhi. It is a black marble platform that marks the spot of Mahatma Gandhi's cremation, Antyesti (Antim Sanskar) on 31 January 1948, a day after his assassination. It is left open to the sky while an eternal flame burns perpetually at one end. It is located on the banks of the river Yamuna in Delhi in India on Ring Road officially known as Mahatma Gandhi Road. A stone footpath flanked by lawns leads to the walled enclosure that houses the memorial. All guests must remove their footwear before entering the Raj Ghat walls. It is also dedicated to many of the Iconic leaders, Jawaharlal Nehru, Lal Bahadur Shastri, Indira Gandhi, Rajiv Gandhi, Choudary Charan Singh and many more.",
            "The Rashtrapati Bhavan is the official home of the president located at the Western end of Rajpath in New Delhi, India. It may refer to only the mansion (the 340-room main building) that has the president's official residence, halls, guest rooms and offices; it may also refer to the entire 130-hectare (320 acre) President Estate that additionally includes huge presidential gardens (Mughal Gardens), large open spaces, residences of bodyguards and staff, stables, other offices and utilities within its perimeter walls. In terms of area, it is one of the largest residences of a head of state in the world.",
            "The Red Fort is a historical fort in the city of Delhi in India. It was the main residence of the emperors of the Mughal dynasty for nearly 200 years, until 1857. It is located in the center of Delhi and houses a number of museums. In addition to accommodating the emperors and their households, it was the ceremonial and political centre of the Mughal state and the setting for events critically impacting the region. Constructed in 1639 by the fifth Mughal Emperor Shah Jahan as the palace of his fortified capital Shahjahanabad, the Red Fort is named for its massive enclosing walls of red sandstone and is adjacent to the older Salimgarh Fort, built by Islam Shah Suri in 1546. Every year on the Independence day of India (15 August), the Prime Minister hoists the Indian 'tricolour flag' at the main gate of the fort and delivers a nationally-broadcast speech from its ramparts.",
            "Safdarjung's Tomb is a sandstone and marble mausoleum in New Delhi, India. It was built in 1754 in the late Mughal Empire style for the statesman Safdarjung. The monument has an ambiance of spaciousness and an imposing presence with its domed and arched red brown and white coloured structures. Safdarjung was made prime minister of the Mughal Empire (Wazir ul-Mamlak-i-Hindustan) when Ahmad Shah Bahadur ascended the throne in 1748. The Safdarjung tomb, the last monumental tomb garden of the Mughals, was planned and built like an enclosed garden tomb in line with the style of the Humayun tomb. The tomb has four key features which are: The Char Bagh plan with the mausoleum at the center, a ninefold floor plan, a five-part façade and a large podium with a hidden stairway.",
            "Tughlaqabad Fort is a ruined fort in Delhi, stretching over 6 km, built by Ghiyas-ud-din Tughlaq, the founder of Tughlaq dynasty, of the Delhi Sultanate of India in 1321, as he established the third historic city of Delhi, which was later abandoned in 1327. It lends its name to the nearby Tughlaqabad residential-commercial area as well as the Tughlaqabad Institutional Area. Tughluqabad still consists of remarkable, massive stone fortifications that surround the irregular ground plan of the city. The sloping rubble-filled city walls, a typical feature of monuments of the Tughluq dynasty, are between 10 and 15 meters high, topped by battlemented parapets and strengthened by circular bastions of up to two stories height. The city is supposed to once have had as many as 52 gates of which only 13 remain today. Today most of the city is inaccessible due to dense thorny vegetation. An ever increasing part of the former city area is occupied by modern settlement, especially in the vicinity of its lakes."};

    String[] Address = {"Hailey Road, Near Diwanchand Imaging Centre, K G Marg, New Delhi, Delhi 110001",
            "Opposite Dargah Nizamuddin, Mathura Road, New Delhi, Delhi 110013",
            "Rajpath Marg, India Gate, New Delhi, Delhi 110001",
            "Meena Bazaar, Jama Masjid, Chandni Chowk, New Delhi, Delhi 110006",
            "Sansad Marg, Connaught Place, New Delhi, Delhi 110001",
            "Lotus Temple Rd, Bahapur, Shambhu Dayal Bagh, Kalkaji, New Delhi, Delhi 110019",
            "Mathura Rd, Pragati Maidan, New Delhi, Delhi 110003",
            "Mehrauli, New Delhi, Delhi 110030",
            "Gandhi Smriti, Raj Ghat, New Delhi, Delhi 110006",
            "Rashtrapati Bhawan, President's Estate, New Delhi, Delhi 110004",
            "Netaji Subhash Marg, Lal Qila, Chandni Chowk, New Delhi, Delhi 110006",
            "Airforce Golf Course, Delhi Race Club, New Delhi, Delhi 110021",
            "Tughlaqabad Fort, Tughlakabad, New Delhi, Delhi 110044"};

    String[] Metro_Station = {"Janpath (Violet Line) 850m",
            "Jangpura (Violet Line) 2.5Km",
            "Khan Market (Violet Line) 1.4Km",
            "Jama Masjid (Violet Line) 700m",
            "Janpath (Violet Line) 750m",
            "Kalkaji Mandir (Violet Line) 550m",
            "Khan Market (Violet Line) 1.8Km",
            "Malviya Nagar (Yellow Line) 2.3Km",
            "Delhi Gate (Violet Line) 900m",
            "Udyog Bhawan (Yellow Line) 1.2Km",
            "Lal Quila (Violet Line) 450m",
            "Lok Kalyan Marg (Yellow Line) 3.0Km",
            "Jasola Apollo (Violet Line) 7.3Km"};

    String[] Timings = {"7:00 AM - 6:00 PM (All Days of Week)",
            "7:00 AM - 6:00 PM (All Days of Week)",
            "5:00 AM - 12:00 AM (All Days of Week)",
            "5:00 AM - 12:00 AM (All Days of Week)",
            "6:00 AM - 6:00 PM (All Days of Week)",
            "9:00 AM - 7:00 PM (Summer)\n9:00 AM - 5:30 PM (Winter)\n(All Days of Week)",
            "7:00 AM - 5:00 PM (All Days of Week)",
            "6:00 AM - 6:00 PM (All Days of Week)",
            "5:30 AM - 7:00 PM (All Days of Week)",
            "9:00 AM - 4:00 PM (Friday, Saturday, Sunday)",
            "9:30 AM - 4:30 PM (All Days except Monday)",
            "7:00 AM - 5:00 PM (All Days of Week",
            "5:30 AM - 7:00 PM (All Days of Week)"};

    String[] Entry_Fee = {"₹6 No Fee",
            "₹30 per person for Indiansn\n₹500 per person for Foreign tourists\n₹25 for video filming",
            "₹0 No Fee",
            "₹0 No Fee\n₹200 For Photography",
            "₹15  per person for Indians\n₹200  per person for foreign tourists\n₹25  per camera for video filming",
            "₹0 No Fee",
            "₹5 per person for Indians\n₹100 per person for Foreign tourists\n₹25 per person for Camcorder",
            "₹30 per person for Indians\n₹500 per person for foreign tourists",
            "₹0 No Fee",
            "₹50 per person\n₹1,200 group of 30 persons",
            "₹35 per person for Indians\n₹500 per person for Foreign tourists\n₹25 per camcorder camcorder\n₹80 per person for adults on weekends(Light and Sound Show)\n₹30 per person for children on weekends (Light and Sound Show)\n₹60 per person for adults on weekdays (Light and Sound Show)",
            "₹5 per person Indian\n₹100 per person Foreigners\n₹25 video camera",
            "₹5 per person Indians\n₹100 per person Foreigners"};



    @Override
    protected void onCreate(Bundle savedInstanceState) {

        Bundle bundle = getIntent().getExtras();
        int Pos = bundle.getInt("Pos");

        super.onCreate(savedInstanceState);
        setContentView(R.layout.historic_description);

        title = (TextView)findViewById(R.id.title);
        description = (TextView)findViewById(R.id.description);
        address = (TextView)findViewById(R.id.address);
        metro_station = (TextView)findViewById(R.id.metro_station);
        timings = (TextView)findViewById(R.id.timings);
        entry_fee = (TextView)findViewById(R.id.entry_fee);
        imageView=(ImageView) findViewById(R.id.viewPager);

        switch (Pos){
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

            case 9:
                setTitle(Title[9]);
                title.setText(Title[9]);
                description.setText(Description[9]);
                address.setText(Address[9]);
                metro_station.setText(Metro_Station[9]);
                timings.setText(Timings[9]);
                entry_fee.setText(Entry_Fee[9]);
                imageView.setImageResource(Images[9]);
                break;

            case 10:
                setTitle(Title[10]);
                title.setText(Title[10]);
                description.setText(Description[10]);
                address.setText(Address[10]);
                metro_station.setText(Metro_Station[10]);
                timings.setText(Timings[10]);
                entry_fee.setText(Entry_Fee[10]);
                imageView.setImageResource(Images[10]);
                break;

            case 11:
                setTitle(Title[11]);
                title.setText(Title[11]);
                description.setText(Description[11]);
                address.setText(Address[11]);
                metro_station.setText(Metro_Station[11]);
                timings.setText(Timings[11]);
                entry_fee.setText(Entry_Fee[11]);
                imageView.setImageResource(Images[11]);
                break;

            case 12:
                setTitle(Title[12]);
                title.setText(Title[12]);
                description.setText(Description[12]);
                address.setText(Address[12]);
                metro_station.setText(Metro_Station[12]);
                timings.setText(Timings[12]);
                entry_fee.setText(Entry_Fee[12]);
                imageView.setImageResource(Images[12]);
                break;

            default:
                break;
        }


    }
}

