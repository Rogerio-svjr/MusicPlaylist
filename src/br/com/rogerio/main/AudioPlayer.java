package br.com.rogerio.main;

import br.com.rogerio.models.Audio;

import java.util.Scanner;

public class AudioPlayer {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("------------------\n   AUDIO PLAYER\n------------------");
        while (true) {
            System.out.print("""
                    Main menu\n
                     1 - Play
                     2 - Add track
                     3 - Liked Tracks\n
                    Your choice:""");
            int menu = keyboard.nextInt();

            switch (menu) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                default:
                    System.out.println(String.format("The option %d doesn't exist, please type again!", menu));
                    break;
            }
            // return;
        }
    }
}
