package br.com.rogerio.models;

public class Audio {
    private String title;
    private int totalReproductions;
    private int totalLikes;
    private double rating;

    void like() {
        this.totalLikes++;
    }

    void play() {
        this.totalReproductions++;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getTotalReproductions() {
        return totalReproductions;
    }

    public int getTotalLikes() {
        return totalLikes;
    }

    public double getRating() {
        return rating;
    }
}
