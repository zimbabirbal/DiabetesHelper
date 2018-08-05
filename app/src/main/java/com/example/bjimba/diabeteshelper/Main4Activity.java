package com.example.bjimba.diabeteshelper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main4Activity extends AppCompatActivity {
    TextView main31Text1,main32Text2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        main31Text1= (TextView) findViewById(R.id.main3Text1);
        main32Text2= (TextView) findViewById(R.id.main3Text2);

        main31Text1.setText("मधुमेह: जोखिम व्यवहार");
        main32Text2.setText("सुर्तीजन्य पदार्थ प्रयोग नगर्ने \n" +
                "सुर्तीजन्य पदार्थका प्रकारहरु :\n" +
                "बिडी \n" +
                "सिगरेट \n" +
                "धुवा रहित सुर्तीजन्य पदार्थ: जर्दा, जुल, सदपता, खैनी, पान मसला आदि \n" +
                "विधुतीय सिगरेट वा इ-सिगरेट \n" +
                "हुक्का \n" +
                "सुर्तीजन्य पदार्थ प्रयोगबाट हुने जटिलताहरु:\n" +
                "फोक्सोको रोगहरु \n" +
                "रगतमा ग्लुकोजको मात्रा बढाउछ \n" +
                "आँखाको रोगहरु  \n" +
                "गिजाको रोग र दात झर्ने \n" +
                "स्नायु प्रणालीमा असर गर्ने भएकोले शरीरको विभिन्न भागहरु दुख्ने \n" +
                "हिर्दय घात र आघात \n" +
                "मृगौलाको रोगहरु  \n" +
                "खुट्टा काट्नुपर्ने \n");
    }
}
