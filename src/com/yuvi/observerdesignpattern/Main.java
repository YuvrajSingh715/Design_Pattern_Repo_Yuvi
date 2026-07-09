package com.yuvi.observerdesignpattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		YoutubeChannel channel = new YoutubeChannel();
		
		Subscriber s1 = new Subscriber("Sersei");
		Subscriber s2 = new Subscriber("Jamei");
		
		channel.subscribe(s1);
		channel.subscribe(s2);
		
		channel.newVideoUploaded("Nature Exploring Videos");
		channel.newVideoUploaded("Core java complete crass course");
		System.out.println(System.lineSeparator());
		
//===============================================================================================================\\
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while(true) {
			System.out.println("Press 1 to upload video");
			System.out.println("Press 2 to create new Subscriber");
			System.out.println("Press 3 to Unsubscribe the Channel");
			System.out.println("Press 4 to exit from YouTube");
			
			
			int c = Integer.parseInt(br.readLine());   //throws the Exception
			
			if(c == 1) {
				//new video upload code
				System.out.println("Enter video title ");
				String videoTittle = br.readLine();
				channel.newVideoUploaded(videoTittle);
				
			}else if(c == 2){
				//create new subscriber
				System.out.println("Enter the name of subscriber ");
				String subsName = br.readLine();
				Subscriber s3 = new Subscriber(subsName);
				channel.subscribe(s3);
				
//			}else if(c == 3) {
//				//unsubscribe the channel
//				System.out.println("Enter the name of Unbscriber ");
//				String unsubsName = br.readLine();
//				Subscriber s4 = new Subscriber(unsubsName);
//				channel.unsubscribe(s4);

			}else if(c == 4) {
				//exit from the YouTube
				System.out.println("ThankYou for watching my videos");
				break;
				
			}else {
				//exit with wrong input
				System.out.println("Wrong Input1");
			}
		}
	}
	
}
