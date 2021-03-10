package com.company;

public class Song {
    private String title;
    private double duration;

    public Song(String title, double duration) {
        this.title = title;
        this.duration = duration;
    }

    public String getTitle() {
        return title;
    }

    @Override  // good way to print out quickly what the object is used for
    public String toString() {
        return this.title + " : " + this.duration;
    }
}
