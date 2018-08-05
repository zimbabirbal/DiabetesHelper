package com.example.bjimba.diabeteshelper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    TextView mainText1,mainText2,mainText3,mainText4,mainText5,mainText6,mainText7,mainText8,mainText9,mainText10,mainText11,mainText12
    ,mainText13,mainText14,mainText15,mainText16,mainText17,mainText18;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        mainText1= (TextView) findViewById(R.id.mainText1);
        mainText2= (TextView) findViewById(R.id.mainText2);
        mainText3=(TextView) findViewById(R.id.mainText3);
        mainText4= (TextView) findViewById(R.id.mainText4);
        mainText5= (TextView) findViewById(R.id.mainText5);
        mainText6=(TextView) findViewById(R.id.mainText6);
        mainText7= (TextView) findViewById(R.id.mainText7);
        mainText8= (TextView) findViewById(R.id.mainText8);
        mainText9=(TextView) findViewById(R.id.mainText9);
        mainText10= (TextView) findViewById(R.id.mainText10);
        mainText11= (TextView) findViewById(R.id.mainText11);
        mainText12=(TextView) findViewById(R.id.mainText12);
        mainText13= (TextView) findViewById(R.id.mainText13);
        mainText14=(TextView) findViewById(R.id.mainText14);
        mainText15= (TextView) findViewById(R.id.mainText15);
        mainText16= (TextView) findViewById(R.id.mainText16);
        mainText17=(TextView) findViewById(R.id.mainText17);
        mainText18=(TextView) findViewById(R.id.mainText18);

        mainText1.setText("मधुमेह: सामान्य जानकारी");
        mainText2.setText("प्यांक्रियाज नामक ग्रन्थिले प्रयाप्त इन्सुलिन हर्मोन उत्पादन नगर्दा वा उत्पादन भएको इन्सुलिनप्रति शरीरका कोषहरूले राम्रोसँग प्रतिक्रिया जनाउन नसक्दा रगतमा ग्लुकोजको मात्रा चाहिने भन्दा बढी हुने अवस्थालाई मधुमेह अर्थात डाइबेटिस भनिन्छ । यो रोग सरुवा रोग होइन तर मानिसको आफनै खानपान र रहनसहनको कारणबाट देखापर्दछ । कुनै–कुनै प्रकारको मधुमेह वंशानुगत पनि हुन्छ ।");
        mainText3.setText("मधुमेहका प्रकार\n" +
                "मधुमेह मुख्यतया तिन प्रकारका हुन्छन्।\n" +
                "क. पहिलो किसिमको मधुमेह (Type 1 diabetes)\n" +
                " शरीरमा इन्सुलिनको उत्पादन सुन्य अर्थात अत्यन्त कमहुंदा रगतमा ग्लुकोजको मात्रा सामान्यभन्दा बढी हुने अवस्थालाई पहिलो किसिमको मधुमेह भनिन्छ । जुनसुकै उमेरमा देखापर्न सक्ने भएतापनि यस्तो मुधमेह विशेष गरी बाल्यावस्था वा किशोरावस्थामा शुरु हुने र दुब्लापातला मानिसमा बढी देखिने गर्दछ । यस्ता बिरामीलाई बचाउन जीवनभर कृत्रिम रुपमा इन्जेक्सनद्धारा इन्सुलिन दिनुपर्ने हुन्छ ।\n" +
                "ख. दोस्रो किसिमको मधुमेह (Type 2 diabetes)\n" +
                "शरीरमा चाहिने जति प्यांक्रियाजले इन्सुलिन उत्पादन गर्न नसक्दा वा उत्पादित इन्सुलिन प्रभावकारी नहुदा वा उत्पादित इन्सुलिनले प्रभावकारी काम गर्न नसक्दा ग्लुकोजको मात्रा बढी देखिएको अवस्थालाई दोस्रो किसिमको मधुमेह भनिन्छ । यो सामान्यतया प्रौढ अवस्थामा हुने गर्छ र विश्वमा भएका मधुमेही  मध्ये धेरै यही प्रकारको मधुमेहका रोगी रहेका छन् ।  उमेर बढ्दै जादा यो प्रकारको मधुमेहबाट व्यक्ति ग्रसित बन्ने गर्छन् । यसको उपचारमा सन्तुलित खानपान र नियमित व्यायामको साथसाथै आवश्यकता अनुसार खाने औषधि र कहिलेका“ही इन्सुलिनको पनि आवश्यकता पर्न सक्दछ । यस्तो मधुमेह सामान्यतया ४० बषको उमेरपछि प्रायःमोटाघाटा व्यक्तिहरुमा देखापरेको पाइन्छ ।\n" +
                "ग. जेस्टेसनल मधुमेहः  गर्भबती महिलाहरुमा जुनैपनि बेला रगतमा  चिनीको मात्रा उच्च हुनगइ मधुमेह हुनजान्छ। यस्तो प्रकारको मधुमेहलाई जेस्टेसनल मधुमेह भनिन्छ । यस्तो मधुमेह गर्भवती महिलामा पहिला कहिल्यै नभएको भए पनि रगतमा चिनीको मात्रा बढेर अचानक देखा पर्ने गर्दछ ।\n" +
                "मधुमेह रोगका लक्षणहरु :\n" +
                "१. मुख सुख्खा हुने, बढी तिर्खा लाग्ने।\n" +
                "२. पटक पटक पिसाब लाग्ने, पिसाबको मात्रा धेरै हुनु ।\n" +
                "३. राम्ररी खाना खाए पनि दुब्लाउदै जाने, भोक धेरै लाग्ने।\n" +
                "४ बराबर घाउ खटिरा आउनु तर समयमानिको नहुनु ।\n" +
                "५. शरीर खास गरी गुप्ताङ्ग चिलाउनु ।\n" +
                "६. दृष्टि धमिलो हुनु ।\n" +
                "७. हातगोडा झमझमाउने, रिंगटा लाग्ने ।\n" +
                "८. वाकवाकी लाग्ने, थकाई महसुस हुने ।\n" +
                "७. घाउ चोटपटक लामो समय सम्म निको नहुने ।\n" +
                "तर, धेरै बिरामीमा यी लक्षण नदेखिन पनि सक्छन् । त्यसैले नियमित स्वास्थ्य परीक्षण गर्नुपर्छ। मधुमेहले शरीरका विभिन्न भागमा असर गर्छ । यो रोग लागेपछि अन्धोपना, मिर्गौलामा असर, मुटु रोग, पक्षघात, अल्सर, मानसिक रोग, बिर्सने रोग, यौनमा कमजोरी, नसारोग, पाचन प्रणाली कमजोर हुनेजस्ता रोग पनि थपिन्छन्  ।\n" +
                "\n" +
                "मधुमेहको निदान :\n" +
                "OGTT (Oral Glucose Tolerance Test): मधुमेह रोग पत्ता लगाउने प्रमुख तरिका हो । यसमा बिरामीको रगत जाँच गरेर शरिरमा चिनीको मात्र पत्ता लगाईन्छ।\n");
        mainText4.setText("भोको पेटमा रगतको जाँच ");
        mainText5.setText("ग्लुकोज खाएपछि रगतको जाँच ");
        mainText6.setText("अतिजोखिम");
        mainText7.setText("७.0 mmol/l भन्दा बढी ");
        mainText8.setText("अतिजोखिम");
        mainText9.setText("११.१ mmol/l भन्दा बढी");
        mainText10.setText("जोखिम");
        mainText11.setText("६.१ mmol/l देखि  ७. 0 mmol/l सम्म  ");
        mainText12.setText("जोखिम");
        mainText13.setText("७.८ mmol/l देखि ११.१ mmol/l सम्म ");
        mainText14.setText("सामान्य");
        mainText15.setText("६.१ mmol/l भन्दा कम ");
        mainText16.setText("सामान्य");
        mainText17.setText("७.८ mmol/l भन्दा कम ");
        mainText18.setText("•\tभोको पेटमा रगतको जाँच (Fasting Blood Glucose): यसमा बिरामीलाई ८ देखि १४ घण्टा भोको राखेर रगतमा चिनीको मात्र जाँच गरिन्छ । \n" +
                "•\tग्लुकोज खाएपछि रगतको जाँच ( Random Blood Glucose): यसमा बिरामीलाई २५०-३०० मि.लि. पानीमा ७५ ग्राम ग्लुकोज मिलाएर खाएको २ घण्टा पछि फेरी रगतमा चिनीको मात्र जाँच गरिन्छ।\n" +
                "•\tमधुमेहका कारण हुने जतिलाताहरु:\n" +
                "•\tआँखाको रोग, मुखमा घाउ \n" +
                "•\tमिर्गौलाको रोग \n" +
                "•\tमुटुको रोग \n" +
                "•\tस्नायु / मस्तिष्क रोग , छालाको रोग \n" +
                "•\tखुट्टामा समस्याहरु\n" +
                "•\tप्रारम्भिक चरणमा मधुमेहको ब्यवस्थापन गर्न गाह्रो हुन्छ तर जीवनशैली र खानपानमा सुधार गर्यो भने समस्याहरु समाधान गर्न सकिन्छ ।\n" +
                "•\tनोट : मधुमेहको पूर्ण उपचार हुदैन, केहि केशमा रोकथाम गर्न सकिन्छ र सबै केशलाई व्यवस्थापन गर्न सकिन्छ ।\n");





    }
}
