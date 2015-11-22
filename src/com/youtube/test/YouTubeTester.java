package com.youtube.test;

import java.util.List;

import com.youtube.YouTubeManager;
import com.youtube.model.YouTubeVideo;


public class YouTubeTester {
	
	public static void main(String[] args) throws Exception {
		
		String clientID = "My Id";
		String textQuery = "java code";
		int maxResults = 10;
		boolean filter = true;
		int timeout = 2000;
		
		YouTubeManager ym = new YouTubeManager(clientID);
		
		List<YouTubeVideo> videos = ym.retrieveVideos(textQuery, maxResults, true, timeout);
		
		for (YouTubeVideo youtubeVideo : videos) {
			System.out.println(youtubeVideo.getWebPlayerUrl());
			System.out.println("Thumbnails");
			for (String thumbnail : youtubeVideo.getThumbnails()) {
				System.out.println("\t" + thumbnail);
			}
			System.out.println(youtubeVideo.getEmbeddedWebPlayerUrl());
			System.out.println("**************************************************");
		}
		
	}

}
