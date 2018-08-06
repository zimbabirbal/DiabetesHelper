package com.example.bjimba.diabeteshelper;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.NotificationCompat;

public class AlertReceiver extends BroadcastReceiver {




    @Override
    public void onReceive(Context context, Intent intent) {


                NotificationHelper notificationHelper = new NotificationHelper(context);
                NotificationCompat.Builder nb = notificationHelper.getChannel1Notification("बिहान औसधि खाने समय","कृपया खाना अगाडी खाने औसधि खानु होश र आधा घण्टामा खाना खानुस");
                notificationHelper.getManager().notify(1,nb.build());



    }
}
