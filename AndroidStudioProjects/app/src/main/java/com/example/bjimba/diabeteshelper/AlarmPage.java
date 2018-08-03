package com.example.bjimba.diabeteshelper;


import android.app.Activity;
import android.app.AlarmManager;
import android.app.DialogFragment;
import android.app.PendingIntent;
import android.app.TimePickerDialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.Toast;


import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Calendar;


/**
 * A simple {@link Fragment} subclass.
 */
public class AlarmPage extends Fragment implements TimePickerDialog.OnTimeSetListener  {

    TextView tr,tr1;
    Button btnSet, btnCancel,btnSet1, btnCancel1;
    View view;
    public static String value="";
    private FragmentActivity myContext;
    public AlarmPage() {
        // Required empty public constructor
    }

    Calendar c ;
    SeekBar sb;
    int hour,minute;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view  = inflater.inflate(R.layout.fragment_alarm_page, container, false);

        btnSet =(Button) view.findViewById(R.id.btnAlarm);
        btnCancel =(Button)view.findViewById(R.id.btnCancel);
        btnSet1 =(Button) view.findViewById(R.id.btnAlarm1);
        btnCancel1 =(Button)view.findViewById(R.id.btnCancel1);
        tr= (TextView) view.findViewById(R.id.ter);
        tr1= (TextView)view.findViewById(R.id.ter1);
        c =Calendar.getInstance();
        hour = c.get(Calendar.HOUR_OF_DAY);
        minute=c.get((Calendar.MINUTE));




        btnSet1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TimePickerDialog timePickerDialog;
                timePickerDialog = new TimePickerDialog(getContext(), new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
                        value="2";
                        Calendar c2 = Calendar.getInstance();
                        c2.set(Calendar.HOUR_OF_DAY,hourOfDay);
                        c2.set (Calendar.MINUTE,minute);
                        c2.set(Calendar.SECOND,0);

                        updateTimeText1(c2);
                        startAlarm1(c2);

                        tr1.setText(hourOfDay+":"+minute);
                        Toast.makeText(getContext(),"Notification has been set",Toast.LENGTH_SHORT).show();
                    }
                },hour,minute,true);
                timePickerDialog.show();

            }
        });
        btnCancel1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cancelAlarm1();
            }
        });


        /*btnSet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DialogFragment timepicker = new TimePickerFragment();
                timepicker.show(getActivity().getFragmentManager(),"TimePicker");

            }
        });*/
        btnSet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TimePickerDialog timePickerDialog;
                timePickerDialog = new TimePickerDialog(getContext(), new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
                        value="1";
                        Calendar c1 = Calendar.getInstance();
                        c1.set(Calendar.HOUR_OF_DAY,hourOfDay);
                        c1.set (Calendar.MINUTE,minute);
                        c1.set(Calendar.SECOND,0);

                        updateTimeText(c1);
                        startAlarm(c1);

                        tr.setText(hourOfDay+":"+minute);
                        Toast.makeText(getContext(),"Notification has been set",Toast.LENGTH_SHORT).show();
                    }
                },hour,minute,true);
                timePickerDialog.show();

            }
        });

        btnCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cancelAlarm();
            }
        });


        return view;
    }

    private void cancelAlarm() {
        AlarmManager alarmManager =(AlarmManager) getActivity().getSystemService(Context.ALARM_SERVICE);
        Intent intent = new Intent(getContext(), AlertReceiver.class);
        final int _id = (int) System.currentTimeMillis();
        PendingIntent pendingIntent =PendingIntent.getBroadcast(getContext(),_id,intent,0);

        alarmManager.cancel(pendingIntent);
        Toast.makeText(getContext(),"Alarm Cancelled",Toast.LENGTH_SHORT).show();
    }



    @Override
    public void onTimeSet(TimePicker view, int hourOfDay, int minute) {

      /*  Toast.makeText(getContext(),"hey hour",Toast.LENGTH_SHORT).show();
        Calendar c = Calendar.getInstance();
        c.set(Calendar.HOUR_OF_DAY,hourOfDay);
        c.set (Calendar.MINUTE,minute);
        c.set(Calendar.SECOND,0);

        //updateTimeText(c);
       // startAlarm(c);
        textView.setText("Hour:" + hourOfDay + "Minute"+minute);
*/


    }
    private void updateTimeText1(Calendar c) {
        String timeText="";
        timeText += DateFormat.getTimeInstance(DateFormat.SHORT).format(c.getTime());
        tr1.setText(timeText);
    }


    private void startAlarm1(Calendar c) {
        AlarmManager alarmManager =(AlarmManager) getActivity().getSystemService(Context.ALARM_SERVICE);
        Intent intent = new Intent(getContext(), AlertReceiver1.class);
        final int _id = (int) System.currentTimeMillis();
        //intent.putExtra("key1", value);
        PendingIntent pendingIntent =PendingIntent.getBroadcast(getContext(),_id,intent,PendingIntent.FLAG_UPDATE_CURRENT);

        if(c.before(Calendar.getInstance()))
        {
            c.add(Calendar.DATE,1);
        }
        //alarmManager.setExact(AlarmManager.RTC_WAKEUP,c.getTimeInMillis(),pendingIntent);
        alarmManager.setRepeating(AlarmManager.RTC_WAKEUP, c.getTimeInMillis(), AlarmManager.INTERVAL_DAY, pendingIntent);


    }
    private void cancelAlarm1() {
        AlarmManager alarmManager =(AlarmManager) getActivity().getSystemService(Context.ALARM_SERVICE);
        Intent intent = new Intent(getContext(), AlertReceiver1.class);
        final int _id = (int) System.currentTimeMillis();
        PendingIntent pendingIntent =PendingIntent.getBroadcast(getContext(),_id,intent,PendingIntent.FLAG_ONE_SHOT);

        alarmManager.cancel(pendingIntent);
        Toast.makeText(getContext(),"Alarm Cancelled",Toast.LENGTH_SHORT).show();

    }

    private void updateTimeText(Calendar c) {
        String timeText = "";
        timeText += DateFormat.getTimeInstance(DateFormat.SHORT).format(c.getTime());
        tr.setText(timeText);
    }


    private void startAlarm(Calendar c) {
        AlarmManager alarmManager =(AlarmManager) getActivity().getSystemService(Context.ALARM_SERVICE);
        Intent intent = new Intent(getContext(), AlertReceiver.class);
        //intent.putExtra("key1", value);
        final int _id = (int) System.currentTimeMillis();
        PendingIntent pendingIntent =PendingIntent.getBroadcast(getContext(),_id,intent,PendingIntent.FLAG_UPDATE_CURRENT);

        if(c.before(Calendar.getInstance()))
        {
            c.add(Calendar.DATE,1);
        }
       // alarmManager.setExact(AlarmManager.RTC_WAKEUP,c.getTimeInMillis(),pendingIntent);
        alarmManager.setRepeating(AlarmManager.RTC_WAKEUP, c.getTimeInMillis(), AlarmManager.INTERVAL_DAY, pendingIntent);


    }









}
