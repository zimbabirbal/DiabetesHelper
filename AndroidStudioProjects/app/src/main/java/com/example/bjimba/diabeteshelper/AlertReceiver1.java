package com.example.bjimba.diabeteshelper;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.support.v4.app.NotificationCompat;

public class AlertReceiver1 extends BroadcastReceiver {




    @Override
    public void onReceive(Context context, Intent intent) {



                    NotificationHelper1 notificationHelper = new NotificationHelper1(context);
                    NotificationCompat.Builder nb = notificationHelper.getChannel2Notification("बेलुका औसधि खाने समय","कृपया खाना अगाडी खाने औसधि खानु होश र आधा घण्टामा खाना खानुस");
                    notificationHelper.getManager().notify(3,nb.build());



    }
}
