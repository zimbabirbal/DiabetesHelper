package com.example.bjimba.diabeteshelper;

import android.annotation.TargetApi;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Build;
import android.support.v4.app.NotificationCompat;

public class NotificationHelper extends ContextWrapper {
    public static final  String channel1Id="channel1ID";
    public static final  String channel1Name="channel 1";
    public static final  String channel2Id="channel2ID";
    public static final  String channel2Name="channel 2";
    private NotificationManager manager;
    public NotificationHelper(Context base) {
        super(base);
        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.O){
            createChannels();
        }

    }

    @TargetApi(Build.VERSION_CODES.O)
    private void createChannels() {
        NotificationChannel channel1 =new NotificationChannel(channel1Id,channel1Name, NotificationManager.IMPORTANCE_DEFAULT);
        channel1.enableLights(true);
        channel1.enableVibration(true);
        channel1.setLightColor(R.color.colorPrimary);
        channel1.setLockscreenVisibility(Notification.VISIBILITY_PRIVATE);
        getManager().createNotificationChannel(channel1);

        NotificationChannel channel2 =new NotificationChannel(channel2Id,channel2Name, NotificationManager.IMPORTANCE_DEFAULT);
        channel2.enableLights(true);
        channel2.enableVibration(true);
        channel2.setLightColor(R.color.colorPrimary);
        channel2.setLockscreenVisibility(Notification.VISIBILITY_PRIVATE);
        getManager().createNotificationChannel(channel2);
    }
    public NotificationManager getManager()
    {
        if(manager ==null)
        {
            manager = (NotificationManager)getSystemService(Context.NOTIFICATION_SERVICE);
        }
        return manager;
    }
    public NotificationCompat.Builder getChannel1Notification (String title,String message){
        return new NotificationCompat.Builder(getApplicationContext(),channel1Id).setContentTitle(title).setContentText(message).setSmallIcon(R.drawable.ic_face);
    }
    public NotificationCompat.Builder getChannel2Notification (String title,String message){
        return new NotificationCompat.Builder(getApplicationContext(),channel2Id).setContentTitle(title).setContentText(message).setSmallIcon(R.drawable.ic_face);
    }

}
