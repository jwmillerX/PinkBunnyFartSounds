package com.randomandroidapps.pinkbunnyfs;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.media.MediaPlayer;
import android.os.Bundle;
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

    public void closeMP() {
        if (mp.isPlaying()) {
            mp.pause();
            mp.reset();
            mp.release();
        } else {
            mp.reset();
            mp.release();
        }

    }

    public void showDialogClose(String title, String message) {
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
                        if (mp != null) {
                            closeMP();
                        }
                        if (dialog != null) {
                            dialog.cancel();
                            dialog.dismiss();
                        }
                    }
                });

        // create alert dialog
        dialog = alertDialogBuilder.create();
        dialog.show();

    }

    public void playCommon(View view) {
        // Kabloey
        mp = MediaPlayer.create(this, com.randomandroidapps.pinkbunnyfs.R.raw.common_fart);
        mp.start();
        showDialogClose("The Common", "The Common Fart is the fart heard most often. Usually there is no odor with this fart.");
    }


    public void playTight(View view) {
        // Kabloey
        mp = MediaPlayer.create(this, com.randomandroidapps.pinkbunnyfs.R.raw.tight_bunn_fart);
        mp.start();
        showDialogClose("The Tight Fart", "The Tight Fart is always recognizable. It sounds like the farter's buns were so tight the he/she was in pain while farting.");
    }

    public void playWet(View view) {
        // Kabloey
        mp = MediaPlayer.create(this, com.randomandroidapps.pinkbunnyfs.R.raw.wet_fart);
        mp.start();
        showDialogClose("The Wet Fart", "The Wet Fart is one that sounds quite juicy. Quite often this fart is cause for alarm, and an indication that a trip to the toilet is imminent.");
    }

    public void playRipper(View view) {
        // Kabloey
        mp = MediaPlayer.create(this, com.randomandroidapps.pinkbunnyfs.R.raw.ripper_fart);
        mp.start();
        showDialogClose("The Ripper Fart", "One of the best farts around is The Ripper. It is loud, rough, and always raises an eyebrow or two. Characteristics of The Ripper often show up in other farts, but make no mistake - this fart is a single, powerful gas-bubble that comes screaming from the farter's butt.");
    }

    public void playAnxious(View view) {
        // Kabloey
        mp = MediaPlayer.create(this, com.randomandroidapps.pinkbunnyfs.R.raw.anxious_fart);
        mp.start();
        showDialogClose("The Anxious Fart", "The Anxious Fart is let in a place where someone does not want the fart to be heard. They are generally controlled, usually barely audible, and require much skill to master.");
    }

    public void playBlower(View view) {
        // Kabloey
        mp = MediaPlayer.create(this, com.randomandroidapps.pinkbunnyfs.R.raw.blower_fart);
        mp.start();
        showDialogClose("The Blower Fart", "This fart is similar to the ripper, except it has a bit of a hollow, windy sound to it. This is due to farter blowing all the gas out quickly. This fart will almost always get a laugh.");
    }

    public void playCoughing(View view) {
        // Kabloey
        mp = MediaPlayer.create(this, com.randomandroidapps.pinkbunnyfs.R.raw.coughing_fart);
        mp.start();
        showDialogClose("The Coughing Fart", "The Coughing Fart is one that the farter tries to cover up with a cough. It can be embarrassing for the farter, and those around the farter, if the timing is off at all, or if the fart is longer than anticipated.");
    }

    public void playRidgeway(View view) {
        // Kabloey
        mp = MediaPlayer.create(this, com.randomandroidapps.pinkbunnyfs.R.raw.ridgeway);
        mp.start();
        showDialogClose("The Ridgeway Fart", "The Ridgeway Fart is one of the  better tonal quality farts.");
    }

    public void playSmooth(View view) {
        // Kabloey
        mp = MediaPlayer.create(this, com.randomandroidapps.pinkbunnyfs.R.raw.smooth_fart);
        mp.start();
        showDialogClose("The Smooth Fart", "The Smooth Fart is one of the smoothest farts. It is a slow and easy, real smooth.");
    }

    public void playBean(View view) {
        // Kabloey
        mp = MediaPlayer.create(this, com.randomandroidapps.pinkbunnyfs.R.raw.bean_fart);
        mp.start();
        showDialogClose("The Bean Fart", "The Bean Fart is one you are likely to have after eating a can of beans. Long and Stinky!");
    }

    public void showThanks(View view) throws InterruptedException {
        // Kabloey
        mp = null;
        showDialogClose("Thanks To", "The Fart File\nhttp://birdsnest.com/fart_file.htm");
    }


    public void closeIt(View view) {
        if (mp != null) {
            closeMP();
        }
        if (dialog != null) {
            dialog.cancel();
            dialog.dismiss();
        }
        // Kabloey
        MainActivity.this.finish();
    }


}
