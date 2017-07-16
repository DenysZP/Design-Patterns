package com.designpatterns.ui.example.behavioral.state;

import android.media.MediaPlayer;

public class EnabledState extends State implements MediaPlayer.OnPreparedListener {

    public EnabledState(StateExampleFragment fragment, MediaPlayer mediaPlayer) {
        super(fragment, mediaPlayer);
        if (mediaPlayer != null) {
            mediaPlayer.stop();
            mediaPlayer.release();
        }
        mediaPlayer = MediaPlayer.create(fragment.getContext(), playlist.get(currentTrack));
        mediaPlayer.setOnPreparedListener(this);
    }

    @Override
    public void onPrepared(MediaPlayer mp) {
        mediaPlayer = mp;
        fragment.changeState(new ReadyState(fragment, mediaPlayer));
    }
}
