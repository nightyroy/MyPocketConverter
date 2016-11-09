package com.example.agnesbrite.mypocketconverter;

import android.content.Context;
import android.media.MediaPlayer;

/**
 * Created by AgnesBrite on 05/11/2016.
 */

public class Music {

    private static MediaPlayer mp = null;

    public static void play(Context context, int resource) {
        stop(context);
        mp = MediaPlayer.create(context, resource);
        mp.setLooping(true);
        mp.start();
        if(Setting.isPlay) {
            mp.stop();
        }
    }

    // stopping the music
    public static void stop(Context context) {
        if (mp != null) {
            mp.stop();
            mp.release();
            mp = null;
        }
    }
}
