package com.example;

public class Note implements Playable {

    private final char value;

    public Note(char value) {
        this.value = value;
    }

    public void play() {
        System.out.println(value);
    }

}
