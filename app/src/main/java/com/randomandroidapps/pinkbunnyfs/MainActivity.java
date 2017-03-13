package com.randomandroidapps.pinkbunnyfs;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    MediaPlayer mp = null;
    AlertDialog dialog = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(com.randomandroidapps.pinkbunnyfs.R.layout.activity_main);
    }

    public void showDialog(String title, String message, long delayTime){
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(
                this);

        // set title
        alertDialogBuilder.setTitle(title);
        // set dialog message
        alertDialogBuilder
                .setMessage(message)
                .setCancelable(false)
                .setNeutralButton("Close", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        // if this button is clicked, just close
                        // the dialog box and do nothing
                        dialog.cancel();
                    }
                });

        // create alert dialog
        dialog = alertDialogBuilder.create();
        dialog.show();
        delay(delayTime);
//        dialog.cancel();
//        dialog.dismiss();
//        dialog = null;


    }
    public void delay(long time){
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            public void run() {
                dialog.dismiss();
            }
        }, time);
    }

    public void playCommon(View view) {
        // Kabloey
        mp = MediaPlayer.create(this, com.randomandroidapps.pinkbunnyfs.R.raw.common_fart);
        mp.start();
        showDialog("The Common", "The Common Fart is the fart heard most often. Usually there is no odor with this fart.", 5000);
    }


    public void playTight(View view) {
        // Kabloey
        mp = MediaPlayer.create(this, com.randomandroidapps.pinkbunnyfs.R.raw.tight_bunn_fart);
        mp.start();
        showDialog("The Tight Fart", "The Tight Fart is always recognizable. It sounds like the farter's buns were so tight the he/she was in pain while farting.", 5000);
    }

    public void playWet(View view) {
        // Kabloey
        mp = MediaPlayer.create(this, com.randomandroidapps.pinkbunnyfs.R.raw.wet_fart);
        mp.start();
        showDialog("The Wet Fart", "The Wet Fart is one that sounds quite juicy. Quite often this fart is cause for alarm, and an indication that a trip to the toilet is imminent.", 5000);
    }

    public void playRipper(View view) {
        // Kabloey
        mp = MediaPlayer.create(this, com.randomandroidapps.pinkbunnyfs.R.raw.ripper_fart);
        mp.start();
        showDialog("The Ripper Fart", "One of the best farts around is The Ripper. It is loud, rough, and always raises an eyebrow or two. Characteristics of The Ripper often show up in other farts, but make no mistake - this fart is a single, powerful gas-bubble that comes screaming from the farter's butt.", 5000);
    }

    public void playAnxious(View view) {
        // Kabloey
        mp = MediaPlayer.create(this, com.randomandroidapps.pinkbunnyfs.R.raw.anxious_fart);
        mp.start();
        showDialog("The Anxious Fart", "The Anxious Fart is let in a place where someone does not want the fart to be heard. They are generally controlled, usually barely audible, and require much skill to master.", 5000);
    }

    public void playBlower(View view) {
        // Kabloey
        mp = MediaPlayer.create(this, com.randomandroidapps.pinkbunnyfs.R.raw.blower_fart);
        mp.start();
        showDialog("The Blower Fart", "This fart is similar to the ripper, except it has a bit of a hollow, windy sound to it. This is due to farter blowing all the gas out quickly. This fart will almost always get a laugh.", 5000);
    }

    public void playCoughing(View view) {
        // Kabloey
        mp = MediaPlayer.create(this, com.randomandroidapps.pinkbunnyfs.R.raw.coughing_fart);
        mp.start();
        showDialog("The Coughing Fart", "The Coughing Fart is one that the farter tries to cover up with a cough. It can be embarrassing for the farter, and those around the farter, if the timing is off at all, or if the fart is longer than anticipated.", 5000);
    }

    public void playRidgeway(View view) {
        // Kabloey
        mp = MediaPlayer.create(this, com.randomandroidapps.pinkbunnyfs.R.raw.ridgeway);
        mp.start();
        showDialog("The Ridgeway Fart", "The Ridgeway Fart is one of the  better tonal quality farts.", 5000);
    }

    public void playSmooth(View view) {
        // Kabloey
        mp = MediaPlayer.create(this, com.randomandroidapps.pinkbunnyfs.R.raw.smooth_fart);
        mp.start();
        showDialog("The Smooth Fart", "The Smooth Fart is one of the smoothist farts. It is a slow and easy, real smooth.", 5000);
    }

    public void playBean(View view) {
        // Kabloey
        mp = MediaPlayer.create(this, com.randomandroidapps.pinkbunnyfs.R.raw.bean_fart);
        mp.start();
        showDialog("The Bean Fart", "The Bean Fart is one you are likely to have after eating a can of bean. Long and Sticky!", 5000);
    }

    public void showThanks(View view) throws InterruptedException {
        // Kabloey
        showDialog("Thanks To", "The Fart File\nhttp://birdsnest.com/fart_file.htm", 5000);
    }


    public void closeIt(View view) {
        // Kabloey
        if (mp != null) {
            mp.stop();
            mp.reset();
            mp.release();
            mp = null;
        }
        if (dialog != null){
            dialog.cancel();
            dialog.dismiss();
            dialog = null;
        }
        MainActivity.this.finish();
    }


}
