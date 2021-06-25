package com.inforcap.codingdojo;

import java.util.HashMap;
import java.util.Set;

public class MapaHashmatique {

	public static void main(String[] args) {
		HashMap<String, String> tracklist = new HashMap<String, String>();
		tracklist.put("Billie Jean", "Billie Jean is not my lover...");
		tracklist.put("Black or White", "It's black, it's white...");
		tracklist.put("Thriller", "'Cause this is thriller, thriller night...");
		tracklist.put("You Are Not Alone", "Another day has gone...");
		
		String cancion = tracklist.get("Billie Jean");
		System.out.println("Cancion: "+cancion);		
		
		Set<String> keys = tracklist.keySet();
		for (String key : keys) {
			System.out.println(key+": "+tracklist.get(key));			
		}
	}

}
