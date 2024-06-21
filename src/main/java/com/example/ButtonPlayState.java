package com.example;

public class ButtonPlayState implements MediaPlayerState {

  public void pressButton(MediaPlayer mediaPlayer) {

    mediaPlayer.pause();
    mediaPlayer.setState(new ButtonPauseState());

  }

}
