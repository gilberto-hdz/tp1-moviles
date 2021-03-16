package com.gha.tp1hernandez;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.hardware.usb.UsbManager;
import android.net.Uri;
import android.widget.Toast;

public class UsbConectado extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        if ("android.hardware.usb.action.USB_STATE".equals(intent.getAction())) {
//
            boolean connected = intent.getBooleanExtra("connected", false);
            if (connected) {
                Toast.makeText(context, "funciona!", Toast.LENGTH_LONG).show();
                Intent i = new Intent(Intent.ACTION_CALL);
                i.setData(Uri.parse("tel: 555"));
                context.startActivity(i);
            }
        }
//        Intent i = new Intent(Intent.ACTION_CALL, Uri.parse("tel: 555"), context, MainActivity.class);

    }
}
