package com.designpatterns.ui.example.behavioral.state;

import android.media.MediaPlayer;

public class PlayingState extends State {

    public PlayingState(StateExampleFragment fragment, MediaPlayer mediaPlayer) {
        super(fragment, mediaPlayer);
    }

    @Override
    public void onStop() {
        mediaPlayer.pause();
        mediaPlayer.seekTo(0);
        fragment.changeState(new StoppedState(fragment, mediaPlayer));
    }

    @Override
    public void onPrevious() {
        currentTrack = currentTrack == playlist.size() - 1 ? --currentTrack : ++currentTrack;
        fragment.changeState(new EnabledState(fragment, mediaPlayer));
    }

    @Override
    public void onNext() {
        currentTrack = currentTrack == playlist.size() - 1 ? --currentTrack : ++currentTrack;
        fragment.changeState(new EnabledState(fragment, mediaPlayer));
    }
}
