package com.Q1;
import java.util.*;

public class MainDriver {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Set<Song> song = new HashSet<>();
		for(int i=0;i<=2;i++) {
			System.out.println("Enter a movie name :-");
			String movie1 = sc.next();
			System.out.println("Enter a song name :-");
			String song1 = sc.next();
			
			Song music = new Song(song1,movie1);
			song.add(music);	
		}
		
		List <Song> song1 = new ArrayList<>(song);
		PlayList playlist = new PlayList();
		for(int i = 0; i < song1.size(); i++) {
			playlist.addSong(song1.get(i));
		}

		for(int j=0; j<playlist.songs.size();j++) {
			Song music = playlist.songs.get(j);
			music.play();
			
		}
		sc.close();
	}

}
