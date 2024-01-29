package org.example;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        String url = "https://en.wikipedia.org/wiki/Main_Page"; // URL of the website to scrape

        try {
            // Connect to the website and fetch the HTML document
            Document doc = Jsoup.connect(url).get();

            // Extract text from the HTML document
            String text = doc.text();

            // Print the extracted text
            System.out.println(text);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}