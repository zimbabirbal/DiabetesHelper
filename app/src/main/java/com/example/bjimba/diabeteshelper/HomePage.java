package com.example.bjimba.diabeteshelper;


import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class HomePage extends Fragment {

    Button btn1,btn2,btn3,btn4;
    Fragment fragment;
    Context context;
    public HomePage() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        final View view= inflater.inflate(R.layout.fragment_home_page, container, false);
        btn1= view.findViewById(R.id.button5);
        btn2= view.findViewById(R.id.button6);
        btn3= view.findViewById(R.id.button7);
        btn4= view.findViewById(R.id.button8);
        fragment =null;
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Main2Activity.class);
                startActivity(intent);

               // Intent intent = new Intent(startActivity(getActivity(),Main2Activity.class));
              //  f
                //Fragment fragment = new FirstMain();
                //FragmentManager fm = getActivity().getSupportFragmentManager();
                //FragmentTransaction ft = fm.beginTransaction();
                //ft.addToBackStack(null);
                //ft.replace(R.id.homePage, fragment);
                //ft.commit();

            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Main3Activity.class);
                startActivity(intent);

            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Main4Activity.class);
                startActivity(intent);

            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Main5Activity.class);
                startActivity(intent);

            }
        });


        return  view;
    }

}
