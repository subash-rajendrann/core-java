package com.abc.controller;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import java.io.*;
public class WebScrap {

	public static void main(String[] args) {
		try {
		       // Here we create a document object and use JSoup to fetch the website
		       Document doc = Jsoup.connect("https://stackoverflow.com/users").get();

		       // With the document fetched, we use JSoup's title() method to fetch the title
		       System.out.printf("Title: %s\n", doc.title());
		      
		       // Get the list of repositories
		       Elements repositories = doc.getElementsByClass("user-info");

		       for (Element repository : repositories) {
		         // Extract the title
		         String repositoryTitle = repository.getElementsByClass("user-details").text();

		         // Extract the number of issues on the repository
		       
		        

		         // Format and print the information to the console
		         System.out.println(repositoryTitle );
		      
		         System.out.println("\n");
		       }

		     // In case of any IO errors, we want the messages written to the console
		     } catch (IOException e) {
		       e.printStackTrace();
		     }
		  }
	}


