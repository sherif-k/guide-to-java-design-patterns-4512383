package com.example;

public class App {

    private static final MediaPlayerProxy movieMediaPlayerProxy = new MediaPlayerProxy();

    public static void main(String[] args) {
        goToMovieLibrary();
        goToFavoriteMovies();
    }

    private static void goToMovieLibrary() {
        System.out.println("Loading movie library...");
        movieMediaPlayerProxy.playMedia();
    }

    private static void goToFavoriteMovies() {
        System.out.println("Loading favorite movies...");
        movieMediaPlayerProxy.playMedia();
    }

}
