package com.designpatterns.ui.example.behavioral.state;

import android.media.MediaPlayer;

import com.designpatterns.R;

import java.util.ArrayList;
import java.util.List;

public abstract class State {

    protected static int currentTrack;
    protected StateExampleFragment fragment;
    protected MediaPlayer mediaPlayer;
    protected List<Integer> playlist;

    public State(StateExampleFragment fragment, MediaPlayer mediaPlayer) {
        this.fragment = fragment;
        this.mediaPlayer = mediaPlayer;
        if (playlist == null) {
            playlist = new ArrayList<>();
            playlist.add(R.raw.track_1);
            playlist.add(R.raw.track_2);
        }
    }

    public void onTurnOn() {
    }

    public void onTurnOff() {
        if (mediaPlayer != null) {
            mediaPlayer.stop();
            mediaPlayer.release();
        }
        fragment.changeState(new DisabledState(fragment, mediaPlayer));
    }

    public void onPlay() {
    }

    public void onStop() {
    }

    public void onNext() {
    }

    public void onPrevious() {
    }
}
