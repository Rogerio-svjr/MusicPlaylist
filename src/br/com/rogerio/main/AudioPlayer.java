package br.com.rogerio.main;

import br.com.rogerio.models.Audio;
import br.com.rogerio.models.Music;
import br.com.rogerio.models.Podcast;

import java.util.Scanner;
import java.util.ArrayList;

public class AudioPlayer {
    public static void main(String[] args) {
        // Objects declarations
        Scanner keyboard = new Scanner(System.in); // Scanner
        ArrayList<Music> musics = new ArrayList<Music>(); // Muiscs array
        ArrayList<Podcast> podcasts = new ArrayList<Podcast>(); // Podcasts array
        // Variables declarations
        int menu = 0; // Menu choices
        boolean player = true; // Exit audio player flag

        System.out.println("-----------------------\n     AUDIO PLAYER");
        while (player) {
            // Show main menu
            System.out.print("""
                    -----------------------
                          MAIN MENU\n
                     1 - Play
                     2 - Add track
                     3 - Liked Tracks
                     4 - Exit Audio Player\n
                    Your choice: """);
            // User chooses what to do
            menu = keyboard.nextInt();

            switch (menu) {
                case 1: // "Play" choice
                    // Separate musics from podcasts
                    System.out.print("""
                            -----------------------
                                  PLAY TRACK\n
                            Choose the audio format:
                             1 - Music
                             2 - Podcast\n
                            Your choice: """);
                            menu = keyboard.nextInt();
                    // Lists the musics and podcasts
                    if (menu == 1) {
                        AudioList.listMusic(musics);
                    }
                    if (menu == 2) {
                        AudioList.listPodcast(podcasts);
                    }
                    break;
                case 2:
                    System.out.print("""
                            -----------------------
                                  ADD TRACK\n
                            Choose the audio format:
                             1 - Music
                             2 - Podcast\n
                            Your choice: """);
                    menu = keyboard.nextInt();
                    if (menu == 1) {
                        AudioList.addMusic(musics);
                    }
                    if (menu == 2) {
                        AudioList.addPodcast(podcasts);
                    }
                    break;
                case 3:
                    break;
                case 4:
                    player = false;
                    break;
                default:
                    System.out.println(String.format("The option \"%d\" doesn't exist, please type again!", menu));
                    break;
            }
        }
        keyboard.close();
    }
}
