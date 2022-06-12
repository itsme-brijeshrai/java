package com.Q1;
import java.util.*;
public class PlayList {
	 List<Song> songs = new ArrayList<>();
	
	public void addSong(Song song) {
		if(songs.add(song)){
			System.out.println("Song added to the playlist sucessfully.");
		}else {
			System.out.println("Song is already added in the playlist");
		}
	}
	
}
