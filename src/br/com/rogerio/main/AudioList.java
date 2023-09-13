package br.com.rogerio.main;
import java.util.ArrayList;
import java.util.Scanner;

import br.com.rogerio.models.Audio;
import br.com.rogerio.models.Music;
import br.com.rogerio.models.Podcast;

public class AudioList {
    static void listLikedTracks() {
        ;
    }

    static void listMusic(ArrayList<Music> musics) {
        int track = 0; // Track to play
        String liked;  // Like music
        Scanner scan = new Scanner(System.in);
        Scanner scan2 = new Scanner(System.in);

        // Prints each music name and its number on the list
        System.out.println("-----------------------");
        for (Music m : musics) {
            System.out.println(musics.indexOf(m)+1 + " - " + m.getTitle());
        }
        System.out.println("-----------------------");

        // User chooses which track will play
        System.out.print("Play track: ");
        track = scan.nextInt() - 1;         // User enters the desired music's number
        Audio audio = musics.get(track);    // Gets the music object
        audio.play();                       // PLays the chosen music
        // User chooses whether to like the music
        System.out.print("Like this music? [Y/N]  ");
        liked = scan2.nextLine().strip().toUpperCase();
        if (liked.equals("Y")) {
                audio.like();         
        }
    }

    static void listPodcast(ArrayList<Podcast> podcasts) {
        int track = 0;  // Track to play
        String liked;  // Like music
        Scanner scan = new Scanner(System.in);
        Scanner scan2 = new Scanner(System.in);

        // Prints each podcast name and its number on the list
        System.out.println("-----------------------");
        for (Podcast p : podcasts) {
            System.out.println(podcasts.indexOf(p)+1 + " - " +p.getTitle());
        }
        System.out.println("-----------------------");

        // User chooses which track will play
        System.out.print("Play track: ");
        track = scan.nextInt() - 1;
        Audio audio = podcasts.get(track);
        audio.play();
        // User chooses whether to like the podcast
        System.out.print("Like this podcast? [Y/N]  ");
        liked = scan2.nextLine().strip().toUpperCase();
        if (liked.equals("Y")) {
                audio.like();         
        }
    }

    static void addMusic(ArrayList<Music> musics) {
        // Create the object Music with the data provided by the user
        Scanner scan = new Scanner(System.in);
        Music music = new Music();
        System.out.print("--------------------------\nType the music name: ");
        music.setTitle(scan.nextLine());
        System.out.print("Type the music album: ");
        music.setAlbum(scan.nextLine());
        System.out.print("Type the music artist: ");
        music.setArtist(scan.nextLine());
        System.out.print("Type the music genre: ");
        music.setGenre(scan.nextLine());
        // Adds the object to the music array
        musics.add(music);
    }

    static void addPodcast(ArrayList<Podcast> podcasts) {
        // Create the object Podcast with the data provided by the user
        Scanner scan = new Scanner(System.in);
        Podcast podcast = new Podcast();
        System.out.print("--------------------------\nType the podcast name: ");
        podcast.setTitle(scan.nextLine());
        System.out.print("Type the host name: ");
        podcast.setHost(scan.nextLine());
        System.out.print("Type the podcast description: ");
        podcast.setDescription(scan.nextLine());
        // Adds the object to the podcast array
        podcasts.add(podcast);
    }
}
