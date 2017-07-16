package com.designpatterns.ui.example.behavioral.state;

import android.media.MediaPlayer;

public class ReadyState extends State {

    public ReadyState(StateExampleFragment fragment, MediaPlayer mediaPlayer) {
        super(fragment, mediaPlayer);
    }

    @Override
    public void onPlay() {
        mediaPlayer.start();
        fragment.changeState(new PlayingState(fragment, mediaPlayer));
    }
}
