package com.example.bjimba.diabeteshelper;


import android.graphics.Typeface;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.SeekBar;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class DietPage extends Fragment {
    EditText editText,editText1,editText2;
    Handler seekBarHandler;
    Button btn;
    View view;
    SeekBar sb;
    RadioButton maleBtn, femaleBtn;
    TextView seekbarText, tv1,tv2,tv3,tv4,tv5,tv6,tv7,tv8,tv9,tv10,tv11,tv12,tv13,tv14,tv15,tv16,tv17,tv18,tv19,tv20,tv21,tv22,tv23,tv24,tv25,tv26,tv27;
    public DietPage() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view= inflater.inflate(R.layout.fragment_diet_page, container, false);
        goStaticPortion(view);


        btn = (Button) view.findViewById(R.id.btnclk);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(getContext(),"sfsdflljslf",Toast.LENGTH_SHORT).show();
                goItemCheck(view);

            }
        });

        seekBarHandler = new Handler();
        sb=(SeekBar) view.findViewById(R.id.seekBar);
        sb.setMax(0);
        sb.setMax(10);
        sb.setProgress(0);

        sb.setOnTouchListener(new View.OnTouchListener(){
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                return true;
            }
        });

        //seekbarText.setText("Good" + sb.getProgress());


        //sb.setEnabled(false);



        //Typeface myCostumFonts = Typeface.createFromAsset(getActivity().getAssets(),"Kantipur Reg.ttf");
        //tv1.setTypeface(myCostumFonts);
        return view;
    }

    private void goItemCheck(View view) {
        seekbarText = view.findViewById(R.id.seekbarText);
        maleBtn =(RadioButton) view.findViewById(R.id.radioMale);
        editText =(EditText)view.findViewById(R.id.edit);
        editText1 =(EditText)view.findViewById(R.id.edit1);
        editText2 =(EditText)view.findViewById(R.id.edit2);
        String string1 = editText.getText().toString();
        String string2 = editText1.getText().toString();
        String string3 = editText2.getText().toString();


        if(string1.equals("") && string2.equals("") && string3.equals(""))
        {
            Toast.makeText(getContext(),"कृपया आफ्नो वजन र उचाई हाल्नुस...",Toast.LENGTH_SHORT).show();
        }
        else if(string1.equals("")){
            Toast.makeText(getContext(),"कृपया आफ्नो वजन हाल्नुस...",Toast.LENGTH_SHORT).show();
        }
        else if(string2.equals("")){
            Toast.makeText(getContext(),"कृपया आफ्नो उचाई हाल्नुस...",Toast.LENGTH_SHORT).show();
        }
        else if(string3.equals("")){
            Toast.makeText(getContext(),"कृपया आफ्नो इन्च हाल्नुस...",Toast.LENGTH_SHORT).show();
        }
        else {
            if(maleBtn.isChecked())
            {
                MaleDesc(Integer.parseInt(string1),Float.parseFloat(string2),Float.parseFloat(string3));
            }
            else {
                FemaleDesc(Integer.parseInt(string1),Float.parseFloat(string2),Float.parseFloat(string3));
            }
            goDynamicPortion(view,string1);
        }
    }

    private void FemaleDesc(int weight, float height,float inch) {
        if(height< 5)
        {
            if(weight >=51&& weight <= 54)
            {
                sb.setProgress(5);
                seekbarText.setText("राम्रो");
            }
            else if (weight < 51)
            {
                sb.setProgress(1 + weight/100);
                seekbarText.setText("अलि नराम्रो");
            }
            else{
                sb.setProgress(9 + weight/100);
                seekbarText.setText("अलि नराम्रो");
            }
        }
        else if (height==5 && (inch >=0 && inch<1))
        {
            if(weight >= 52 && weight < 55)
            {
                sb.setProgress(5);
                seekbarText.setText("राम्रो");
            }
            else if (weight < 51)
            {
                sb.setProgress(1 + weight/100);
                seekbarText.setText("अलि नराम्रो");
            }
            else{
                sb.setProgress(9 + weight/100);
                seekbarText.setText("अलि नराम्रो");
            }
        }
        else if(height==5 && (inch >=1 && inch<2))
        {
            if(weight >= 54 && weight < 57)
            {
                sb.setProgress(5);
                seekbarText.setText("राम्रो");
            }
            else if (weight < 54)
            {
                sb.setProgress(1 + weight/100);
                seekbarText.setText("अलि नराम्रो");
            }
            else{
                sb.setProgress(9 + weight/100);
                seekbarText.setText("अलि नराम्रो");
            }
        }
        else if(height==5 && (inch >=2 && inch<3))
        {
            if(weight >= 55 && weight < 58)
            {
                sb.setProgress(5);
                seekbarText.setText("राम्रो");
            }
            else if (weight < 55)
            {
                sb.setProgress(1 + weight/100);
                seekbarText.setText("अलि नराम्रो");
            }
            else{
                sb.setProgress(9 + weight/100);
                seekbarText.setText("अलि नराम्रो");
            }
        }
        else if(height==5 && (inch >=3 && inch<4))
        {
            if(weight >= 55 && weight < 59)
            {
                sb.setProgress(5);
                seekbarText.setText("राम्रो");
            }
            else if (weight < 55)
            {
                sb.setProgress(1 + weight/100);
                seekbarText.setText("अलि नराम्रो");
            }
            else{
                sb.setProgress(9 + weight/100);
                seekbarText.setText("अलि नराम्रो");
            }
        }
        else if(height==5 && (inch >=4 && inch<5))
        {
            if(weight >= 57 && weight < 61)
            {
                sb.setProgress(5);
                seekbarText.setText("राम्रो");
            }
            else if (weight < 57)
            {
                sb.setProgress(1 + weight/100);
                seekbarText.setText("अलि नराम्रो");
            }
            else{
                sb.setProgress(9 + weight/100);
                seekbarText.setText("अलि नराम्रो");
            }
        }
        else if(height==5 && (inch >=5 && inch<6))
        {
            if(weight >= 58 && weight < 63)
            {
                sb.setProgress(5);
                seekbarText.setText("राम्रो");
            }
            else if (weight < 58)
            {
                sb.setProgress(1 + weight/100);
                seekbarText.setText("अलि नराम्रो");
            }
            else{
                sb.setProgress(9 + weight/100);
                seekbarText.setText("अलि नराम्रो");
            }
        }
        else if(height==5 && (inch >=6 && inch<7))
        {
            if(weight >= 61 && weight < 65)
            {
                sb.setProgress(5);
                seekbarText.setText("राम्रो");
            }
            else if (weight < 61)
            {
                sb.setProgress(1 + weight/100);
                seekbarText.setText("अलि नराम्रो");
            }
            else{
                sb.setProgress(9 + weight/100);
                seekbarText.setText("अलि नराम्रो");
            }
        }
        else if(height==5 && (inch >=7 && inch<8))
        {
            if(weight >= 62 && weight < 66)
            {
                sb.setProgress(5);
                seekbarText.setText("राम्रो");
            }
            else if (weight < 62)
            {
                sb.setProgress(1 + weight/100);
                seekbarText.setText("अलि नराम्रो");
            }
            else{
                sb.setProgress(9 + weight/100);
                seekbarText.setText("अलि नराम्रो");
            }
        }
        else if(height==5 && (inch >=8 && inch<9))
        {
            if(weight >= 64 && weight < 68)
            {
                sb.setProgress(5);
                seekbarText.setText("राम्रो");
            }
            else if (weight < 64)
            {
                sb.setProgress(1 + weight/100);
                seekbarText.setText("अलि नराम्रो");
            }
            else{
                sb.setProgress(9 + weight/100);
                seekbarText.setText("अलि नराम्रो");
            }
        }
        else if(height==5 && (inch >=9 && inch<10))
        {
            if(weight >= 67 && weight < 70)
            {
                sb.setProgress(5);
                seekbarText.setText("राम्रो");

            }
            else if (weight < 67)
            {
                sb.setProgress(1 + weight/100);
                seekbarText.setText("अलि नराम्रो");
            }
            else{
                sb.setProgress(9 + weight/100);
                seekbarText.setText("अलि नराम्रो");
            }
        }
        else if(height==5 && (inch >=10 && inch<11))
        {
            if(weight >= 67 && weight < 71)
            {
                sb.setProgress(5);
                seekbarText.setText("राम्रो");

            }
            else if (weight < 67)
            {
                sb.setProgress(1 + weight/100);
                seekbarText.setText("अलि नराम्रो");
            }
            else{
                sb.setProgress(9 + weight/100);
                seekbarText.setText("अलि नराम्रो");
            }
        }
        else if(height==5 && (inch >=11 && inch<12))
        {
            if(weight >= 68 && weight < 72)
            {
                sb.setProgress(5);
                seekbarText.setText("राम्रो");

            }
            else if (weight < 68)
            {
                sb.setProgress(1 + weight/100);
                seekbarText.setText("अलि नराम्रो");
            }
            else{
                sb.setProgress(9 + weight/100);
                seekbarText.setText("अलि नराम्रो");
            }
        }
        else
        {

        }

    }

    private void MaleDesc(int weight, float height,float inch) {
        if(height< 5)
        {
            if(weight >=50&& weight <= 60)
            {
                sb.setProgress(5);
                seekbarText.setText("राम्रो");
            }
            else if (weight < 50)
            {
                sb.setProgress(1 + weight/100);
                seekbarText.setText("अलि नराम्रो");
            }
            else{
                sb.setProgress(8 + weight/100);
                seekbarText.setText("अलि नराम्रो");
            }
        }
        else if (height==5 && (inch >=0 && inch<1))
        {
            if(weight >= 56 && weight < 61)
            {
                sb.setProgress(5);
                seekbarText.setText("राम्रो");
            }
            else if (weight < 56)
            {
                sb.setProgress(1 + weight/100);
                seekbarText.setText("अलि नराम्रो");
            }
            else{
                sb.setProgress(8 + weight/100);
                seekbarText.setText("अलि नराम्रो");
            }
        }
        else if(height==5 && (inch >=1 && inch<2))
        {
            if(weight >= 57 && weight < 63)
            {
                sb.setProgress(5);
                seekbarText.setText("राम्रो");
            }
            else if (weight < 57)
            {
                sb.setProgress(1 + weight/100);
                seekbarText.setText("अलि नराम्रो");
            }
            else{
                sb.setProgress(8 + weight/100);
                seekbarText.setText("अलि नराम्रो");
            }
        }
        else if(height==5 && (inch >=2 && inch<3))
        {
            if(weight >= 58 && weight < 63)
            {
                sb.setProgress(5);
                seekbarText.setText("राम्रो");
            }
            else if (weight < 58)
            {
                sb.setProgress(1 + weight/100);
                seekbarText.setText("अलि नराम्रो");
            }
            else{
                sb.setProgress(8 + weight/100);
                seekbarText.setText("अलि नराम्रो");
            }
        }
        else if(height==5 && (inch >=3 && inch<4))
        {
            if(weight >= 59 && weight < 64)
            {
                sb.setProgress(5);
                seekbarText.setText("राम्रो");
            }
            else if (weight < 59)
            {
                sb.setProgress(1 + weight/100);
                seekbarText.setText("अलि नराम्रो");
            }
            else{
                sb.setProgress(8 + weight/100);
                seekbarText.setText("अलि नराम्रो");
            }
        }
        else if(height==5 && (inch >=4 && inch<5))
        {
            if(weight >= 61 && weight < 65)
            {
                sb.setProgress(5);
                seekbarText.setText("राम्रो");
            }
            else if (weight < 61)
            {
                sb.setProgress(1 + weight/100);
                seekbarText.setText("अलि नराम्रो");
            }
            else{
                sb.setProgress(8 + weight/100);
                seekbarText.setText("अलि नराम्रो");
            }
        }
        else if(height==5 && (inch >=5 && inch<6))
        {
            if(weight >= 62 && weight < 66)
            {
                sb.setProgress(5);
                seekbarText.setText("राम्रो");
            }
            else if (weight < 61)
            {
                sb.setProgress(1 + weight/100);
                seekbarText.setText("अलि नराम्रो");
            }
            else{
                sb.setProgress(8 + weight/100);
                seekbarText.setText("अलि नराम्रो");
            }
        }
        else if(height==5 && (inch >=6 && inch<7))
        {
            if(weight >= 64 && weight < 69)
            {
                sb.setProgress(5);
                seekbarText.setText("राम्रो");
            }
            else if (weight < 64)
            {
                sb.setProgress(1 + weight/100);
                seekbarText.setText("अलि नराम्रो");
            }
            else{
                sb.setProgress(8 + weight/100);
                seekbarText.setText("अलि नराम्रो");
            }
        }
        else if(height==5 && (inch >=7 && inch<8))
        {
            if(weight >= 65 && weight < 70)
            {
                sb.setProgress(5);
                seekbarText.setText("राम्रो");
            }
            else if (weight < 65)
            {
                sb.setProgress(1 + weight/100);
                seekbarText.setText("अलि नराम्रो");
            }
            else{
                sb.setProgress(8 + weight/100);
                seekbarText.setText("अलि नराम्रो");
            }
        }
        else if(height==5 && (inch >=8 && inch<9))
        {
            if(weight >= 67 && weight < 72)
            {
                sb.setProgress(5);
                seekbarText.setText("राम्रो");
            }
            else if (weight < 67)
            {
                sb.setProgress(1 + weight/100);
                seekbarText.setText("अलि नराम्रो");
            }
            else{
                sb.setProgress(8 + weight/100);
                seekbarText.setText("अलि नराम्रो");
            }
        }
        else if(height==5 && (inch >=9 && inch<10))
        {
            if(weight >= 69 && weight < 73)
            {
                sb.setProgress(5);
                seekbarText.setText("राम्रो");

            }
            else if (weight < 69)
            {
                sb.setProgress(1 + weight/100);
                seekbarText.setText("अलि नराम्रो");
            }
            else{
                sb.setProgress(8 + weight/100);
                seekbarText.setText("अलि नराम्रो");
            }
        }
        else if(height==5 && (inch >=10 && inch<11))
        {
            if(weight >= 71 && weight < 76)
            {
                sb.setProgress(5);
                seekbarText.setText("राम्रो");

            }
            else if (weight < 71)
            {
                sb.setProgress(1 + weight/100);
                seekbarText.setText("अलि नराम्रो");
            }
            else{
                sb.setProgress(8 + weight/100);
                seekbarText.setText("अलि नराम्रो");
            }
        }
        else if(height==5 && (inch >=11 && inch<12))
        {
            if(weight >= 74 && weight < 78)
            {
                sb.setProgress(5);
                seekbarText.setText("राम्रो");

            }
            else if (weight < 74)
            {
                sb.setProgress(1 + weight/100);
                seekbarText.setText("अलि नराम्रो");
            }
            else{
                sb.setProgress(8 + weight/100);
                seekbarText.setText("अलि नराम्रो");
            }
        }
        else
        {

        }



    }

    private void goDynamicPortion(View view,String number) {

        Typeface myCostumFonts = Typeface.createFromAsset(getActivity().getAssets(),"Kantipur Reg.ttf");
        tv6 = (TextView) view.findViewById(R.id.textView6);
        tv9 = (TextView) view.findViewById(R.id.textView9);
        tv12 = (TextView) view.findViewById(R.id.textView12);
        tv15 = (TextView) view.findViewById(R.id.textView15);
        tv18 = (TextView) view.findViewById(R.id.textView18);
        tv21 = (TextView) view.findViewById(R.id.textView21);

        //Toast.makeText(getContext(),"happy",Toast.LENGTH_SHORT).show();


            int result = Integer.parseInt(number);
            //Toast.makeText(getContext(),"result"+ result,Toast.LENGTH_SHORT).show();
            result = result *30;
            if(result <= 1000)
            {
                tv6.setText("! sk\n" +
                        "Pp6f\n" +
                        "! j6f\n");
                tv9.setText(
                        "!–# sk jf # j6f\n" +
                        "!–@ sk\n" +
                        "! sk\n" +
                        "! sk\n" +
                        "!–@ sk\n" +
                        "OR5f cg';f/\n");
                tv12.setText("@ j6f\n" +
                        "! sk\n" +
                        "!–@ j6f jf ! d'7L\n");
                tv15.setText("! j6f\n" +
                        "@ rDrf\n" +
                        "!–@ j6f jf ! d'7L\n");
                tv18.setText("!–$ sk jf # j6f\n" +
                        "#–$sk\n" +
                        "OR5f cg';f/\n" +
                        "! sk\n" +
                        "$)–^) u|fd\n" +
                        "OR5f cg';f/\n");
                tv21.setText("! lunf;");
            }
            else if (result <=1400)
            {
                tv6.setText("! sk\n" +
                        "Pp6f\n" +
                        "! j6f\n");
                tv9.setText("!–$ sk jf # j6f\n" +
                        "#–$ sk\n" +
                        "! sk\n" +
                        "! sk\n" +
                        "!–@ sk\n" +
                        "OR5f cg';f/\n");
                tv12.setText("@ j6f\n" +
                        "! sk\n" +
                        "!–@ j6f jf ! d'7L\n");
                tv15.setText("! j6f\n" +
                        "@ rDrf\n" +
                        "!–@ j6f jf ! d'7L\n");
                tv18.setText("!–$ sk jf # j6f\n" +
                        "#–$ sk\n" +
                        "OR5f cg';f/\n" +
                        "! sk\n" +
                        "$)–^) u|fd\n" +
                        "OR5f cg';f/\n");
                tv21.setText("! lunf;");
            }
            else if (result <=1600)
            {
                tv6.setText("! sk\n" +
                        "Pp6f\n" +
                        "! j6f\n");
                tv9.setText("@–# sk jf # j6f\n" +
                        "! sk\n" +
                        "OR5f cg';f/\n" +
                        "! sk\n" +
                        "!–@ sk\n" +
                        "OR5f cg';f/\n");
                tv12.setText("@ j6f\n" +
                        "! sk\n" +
                        "@ j6f jf # d'7L\n");
                tv15.setText("! j6f\n" +
                        "@ rDrf\n" +
                        "!–@ j6f jf ! d'7L\n");
                tv18.setText("!–$ sk jf # j6f\n" +
                        "! sk\n" +
                        "OR5f cg';f/\n" +
                        "! sk\n" +
                        "$)–^) u|fd\n" +
                        "OR5f cg';f/\n");
                tv21.setText("! lunf;");
            }
            else if (result <=1800)
            {
                tv6.setText("! sk\n" +
                        "Pp6f\n" +
                        "! j6f\n");
                tv9.setText("!–@ sk jf # j6f\n" +
                        "! sk\n" +
                        "! sk\n" +
                        "! sk\n" +
                        "!–@ sk\n" +
                        "OR5f cg';f/\n");
                tv12.setText("# j6f\n" +
                        "! sk\n" +
                        "# j6f jf ! –@ d'7\n");
                tv15.setText("! j6f\n" +
                        "@ rDrf\n" +
                        "!–@ j6f jf ! d'7L\n");
                tv18.setText("!–$ sk jf # j6f\n" +
                        "! sk\n" +
                        "OR5f cg';f/\n" +
                        "! sk\n" +
                        "$)–^) u|fd\n" +
                        "OR5f cg';f/\n");
                tv21.setText("! lunf;");
            }
            else if(result <=7000)
            {
                tv6.setText("! sk\n" +
                        "Pp6f\n" +
                        "! j6f\n");
                tv9.setText("!–@ sk jf # j6f\n" +
                        "! sk\n" +
                        "! sk\n" +
                        "! sk\n" +
                        "!–@ sk\n" +
                        "OR5f cg';f/\n");
                tv12.setText("@ j6f\n" +
                        "! sk\n" +
                        "#–$ j6f jf !–@ d'7L\n");
                tv15.setText("! j6f\n" +
                        "@ rDrf\n" +
                        "!–@ j6f jf ! d'7L\n");
                tv18.setText("# sk jf $ j6f\n" +
                        "! sk\n" +
                        "OR5f cg';f/\n" +
                        "! sk\n" +
                        "$)–^) u|fd\n" +
                        "OR5f cg';f/\n");
                tv21.setText("! lunf;");

            }
            else {
                Toast.makeText(getContext(),"कृपया आफ्नो वास्तविक वजन हाल्नुस...",Toast.LENGTH_SHORT).show();
                tv6.setText(" ");
                tv9.setText(" ");
                tv12.setText(" ");
                tv15.setText(" ");
                tv18.setText(" ");
                tv21.setText(" ");
            }
            tv6.setTypeface(myCostumFonts);
            tv9.setTypeface(myCostumFonts);
            tv12.setTypeface(myCostumFonts);
            tv15.setTypeface(myCostumFonts);
            tv18.setTypeface(myCostumFonts);
            tv21.setTypeface(myCostumFonts);





    }

    private void goStaticPortion(View view) {
        Typeface myCostumFonts = Typeface.createFromAsset(getActivity().getAssets(),"Kantipur Reg.ttf");

        tv1 = (TextView) view.findViewById(R.id.textView1);
        tv2 = (TextView) view.findViewById(R.id.textView2);
        tv3 = (TextView) view.findViewById(R.id.textView3);
        tv4 = (TextView) view.findViewById(R.id.textView4);
        tv5 = (TextView) view.findViewById(R.id.textView5);
        tv7 = (TextView) view.findViewById(R.id.textView7);
        tv8 = (TextView) view.findViewById(R.id.textView8);
        tv10 = (TextView) view.findViewById(R.id.textView10);
        tv11 = (TextView) view.findViewById(R.id.textView11);
        tv13 = (TextView) view.findViewById(R.id.textView13);
        tv14 = (TextView) view.findViewById(R.id.textView14);
        tv16 = (TextView) view.findViewById(R.id.textView16);
        tv17 = (TextView) view.findViewById(R.id.textView17);
        tv19 = (TextView) view.findViewById(R.id.textView19);
        tv20 = (TextView) view.findViewById(R.id.textView20);
        tv22 = (TextView) view.findViewById(R.id.textView22);
        tv23 = (TextView) view.findViewById(R.id.textView23);
        tv24 = (TextView) view.findViewById(R.id.textView24);
        tv25 = (TextView) view.findViewById(R.id.textView25);
        tv26 = (TextView) view.findViewById(R.id.textView26);


        //Below information




        tv1.setText(";do");
        tv2.setText("Vffgf");
        tv3.setText("Sofnf]/L");
        tv4.setText("laxfgsf] rd]gf"+"\n" +
                "& – &M#) ah]");
        tv5.setText("b'w ÷ lrof\n" +
                "pdfn]sf]  c08f -;]tf] efu_\n" +
                "kfp/f]6L\n");
        tv7.setText("laxfgsf] vfgf\n" +
                "*–!) ah]\n");
        tv8.setText("Efft jf /f]6L\n" +
                "bfn\n" +
                "t/sf/L\n" +
                "bxL -u'lnof] gePsf]_\n" +
                "u]8fu'8L\n" +
                "lu|g ;nfb\n");
        tv10.setText("lbp;f]sf] klxnf] vfhf\n" +
                "! –@ ah]\n");
        tv11.setText("g'lgnf] la:s'6 \n" +
                "lrof jfskmL\n" +
                "kfp/f]6L jf Ro'/f\n");
        tv13.setText("lbp;f]sf] bf];|f] vfhf\n" +
                "$–% ah]\n");
        tv14.setText("kmnkm\"n\n" +
                "rgf\n" +
                "kfp/f]6L jf Ro'/f\n");
        tv16.setText("a]n'sLsf] vfgf\n" +
                "*–( ah]\n");
        tv17.setText("Efft jf /f]6L\n" +
                "bfn\n" +
                ";fu\n" +
                "bxL -u'lnof] gePsf]_\n" +
                "df;'\n" +
                "lu|g ;nfb\n");
        tv19.setText(";'Tg] a]nf");
        tv20.setText("b'w");
        tv22.setText("Zffsfxf/Lsf] nfuL bxL, b'w tyf df+;fxf/Lsf] nfuL df;'\n" +
                "! sk "+"M"+";fwf/0f l;;fsf] lroflunf;sf] ! lunf;\n" +"Dffqf M df;'afx]s c? vfgfkfls;s]kl5sf]\n" +
                "#)–$) Sofnf]/L k|lt s]=hL= jhgcg';f/\n");
        tv23.setText("!=vfggx'g] s'/fx?M\n" +
                "u'lnof] kbfy{x?MlrgL, ld7fO{, ;Vv/, hfd, \n u'lnof] k]o -sf]sfsf]nf, km]G6f, \n k|m'6h';_ l6gdf /fv]sf kmnkm\"nx?_,  cfO;lqmd, \n /S;L, lao/, l:j6jfOg OToflb .\n" +"lrNnf] tf/]sfvfgfx?");
        tv24.setText("@= yf]/} dfqfdfvfgx'g] kbfy{M \n" + "cGgx?Mrfdn, uxF', ds}, Ro'/f . \n"+"lrgLgePsf] kfp/f]6L, la:s'6, rfprfp .\n"+"kmnkm\"nx?McfFk, s]/f / d]jf");
        tv25.setText("#= ;fwf/0f dfqfdfvfgx'g] kbfy{x?M \n"+
                "bfn / u]8fu'8Lx?Mrgf, s]/fp e6df;, ;'hLcflb \n"+"b'w / o;af6 ag]sf kbfy{x?MbxL, klg/ \n"+
        "df;', df5f, c08f \n"+
        "kmnkm\"nx?M ;'Gtnf, df};d, :ofp, gf:kftL \n" + "sGbd'nx?Mcfn', lkF8fn', t?n, ;Vv/v08 cflb \n");
        tv26.setText("$= OR5fcg';f/ vfPx'g] kbfy{x?M \n" + "t/sf/LM sfpnL, aGbf, ufh/, d'nfRofp, l;dL, Kofh, ;nud,\n uf]ne]+8f, k/j/, eG6f, km;L{, /fof];fu, kfn'\uDB40\uDDBCËf], rD;'/ OToflb . \n"+
        "kmnkm\"nx?M v/a'hf, sfFqmf], sfutL . \n" +"lkpg] kbfy{x?MlkmSsflrof, skmL / t/sf/Lsf ;'kx? . \n"+
        "cGoM ;nfb, d;nf, hL/f, wlgof, dl/r OToflb . \n");
        //Below information





        tv1.setTypeface(myCostumFonts);
        tv2.setTypeface(myCostumFonts);
        tv3.setTypeface(myCostumFonts);
        tv4.setTypeface(myCostumFonts);
        tv5.setTypeface(myCostumFonts);
        tv7.setTypeface(myCostumFonts);
        tv8.setTypeface(myCostumFonts);
        tv10.setTypeface(myCostumFonts);
        tv11.setTypeface(myCostumFonts);
        tv13.setTypeface(myCostumFonts);
        tv14.setTypeface(myCostumFonts);
        tv16.setTypeface(myCostumFonts);
        tv17.setTypeface(myCostumFonts);
        tv19.setTypeface(myCostumFonts);
        tv20.setTypeface(myCostumFonts);
        tv22.setTypeface(myCostumFonts);
        tv23.setTypeface(myCostumFonts);
        tv24.setTypeface(myCostumFonts);
        tv25.setTypeface(myCostumFonts);
        tv26.setTypeface(myCostumFonts);


    }

}
