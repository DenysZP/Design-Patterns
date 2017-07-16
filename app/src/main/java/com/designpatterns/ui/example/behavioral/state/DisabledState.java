package com.designpatterns.ui.example.behavioral.state;

import android.media.MediaPlayer;

public class DisabledState extends State {

    public DisabledState(StateExampleFragment fragment, MediaPlayer mediaPlayer) {
        super(fragment, mediaPlayer);
    }

    @Override
    public void onTurnOn() {
        fragment.changeState(new EnabledState(fragment, mediaPlayer));
    }
}
