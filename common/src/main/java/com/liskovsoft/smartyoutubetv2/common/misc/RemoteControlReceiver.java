package com.liskovsoft.smartyoutubetv2.common.misc;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.liskovsoft.sharedutils.mylogger.Log;
import com.liskovsoft.smartyoutubetv2.common.app.presenters.PlaybackPresenter;

public class RemoteControlReceiver extends BroadcastReceiver {
    private static final String TAG = RemoteControlReceiver.class.getSimpleName();

    @Override
    public void onReceive(Context context, Intent intent) {
        Log.d(TAG, "Initializing remote control listener...");
        PlaybackPresenter.instance(context);
    }
}
