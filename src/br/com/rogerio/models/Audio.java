package br.com.rogerio.models;

public class Audio {
    private String title;
    private int totalReproductions;
    private int totalLikes;
    private boolean liked;
    private double rating;

    public void like() {
        this.totalLikes++;
        this.liked = true;
    }

    public void play() {
        this.totalReproductions++;
        System.out.println("Now playing: " + this.title);
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

    public boolean isLiked() {
        return liked;
    }
}
