package com.example.agnesbrite.mypocketconverter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class Setting extends AppCompatActivity {

    public static boolean isPlay;
    public static boolean isSound;
    public static boolean isNoti;
    private ImageView playing;
    private ImageView sounding;
    private ImageView noti;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);

        playing = (ImageView) findViewById(R.id.music2);
        playing.setImageResource(isPlay ? R.drawable.cross : R.drawable.tick);
        sounding = (ImageView) findViewById(R.id.sound2);
        sounding.setImageResource(isSound ? R.drawable.cross : R.drawable.tick);
        noti = (ImageView) findViewById(R.id.notification2);
        noti.setImageResource(isNoti ? R.drawable.cross : R.drawable.tick);

    }

    public void music2 (View view) {

        isPlay = !isPlay;
        // alternate between picture while on/off audio
        playing.setImageResource(isPlay ? R.drawable.cross : R.drawable.tick);

        if(!isPlay) {
            Music.play(this, R.raw.chocobo);
            Toast.makeText(Setting.this, "Music On", Toast.LENGTH_SHORT).show();
        } else {
            Music.stop(this);
            Toast.makeText(Setting.this, "Music Off", Toast.LENGTH_SHORT).show();
        }
    }

    public void sound2 (View view) {

        isSound = !isSound;
        // alternate between picture while on/off sound
        sounding.setImageResource(isSound ? R.drawable.cross : R.drawable.tick);

        if(!isSound) {
            sounding.setSoundEffectsEnabled(true);
            Toast.makeText(Setting.this, "Sound On", Toast.LENGTH_SHORT).show();
        } else {
            sounding.setSoundEffectsEnabled(false);
            Toast.makeText(Setting.this, "Sound Off", Toast.LENGTH_SHORT).show();
        }
    }

    public void notification2 (View view) {
        isNoti = !isNoti;
        // altenate between picture while on/off notification
        noti.setImageResource(isNoti ? R.drawable.cross : R.drawable.tick);

        if(!isNoti) {
            Toast.makeText(Setting.this, "Notification On", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(Setting.this, "Notification Off", Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    protected void onPause() {
        super.onPause();
        Music.stop(this);
    }
}
