package com.example;

public class ButtonPauseState implements MediaPlayerState {

  public void pressButton(MediaPlayer mediaPlayer) {

    mediaPlayer.play();
    mediaPlayer.setState(new ButtonPlayState());

  }

}
