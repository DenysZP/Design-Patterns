package com.designpatterns.ui.example.behavioral.state;

import android.media.MediaPlayer;

public class StoppedState extends State {

    public StoppedState(StateExampleFragment fragment, MediaPlayer mediaPlayer) {
        super(fragment, mediaPlayer);
    }

    @Override
    public void onPlay() {
        mediaPlayer.start();
        fragment.changeState(new PlayingState(fragment, mediaPlayer));
    }

    @Override
    public void onNext() {
        currentTrack = currentTrack == playlist.size() - 1 ? --currentTrack : ++currentTrack;
        fragment.changeState(new EnabledState(fragment, mediaPlayer));
    }

    @Override
    public void onPrevious() {
        currentTrack = currentTrack == playlist.size() - 1 ? --currentTrack : ++currentTrack;
        fragment.changeState(new EnabledState(fragment, mediaPlayer));
    }
}
