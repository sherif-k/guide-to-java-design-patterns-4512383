package com.example;

public class MediaPlayer {
    private MediaPlayerState mediaPlayerState;

    public MediaPlayer() {
        this.mediaPlayerState = new ButtonPauseState();
    }

    public void pressButton() {
        mediaPlayerState.pressButton(this);
    }

    public void play() {
        System.out.println("Playing");
        System.out.println("Displaying pause icon");
    }

    public void pause() {
        System.out.println("Paused");
        System.out.println("Displaying play icon");
    }

    public void setState(MediaPlayerState mediaPlayerState) {
        this.mediaPlayerState = mediaPlayerState;
    }

}
