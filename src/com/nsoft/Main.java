package com.nsoft;

public class Main {
    public static void main(String[] args) {
        String url = "https://dummyjson.com/products";

        HTTPRequestHandler httpRequestHandler = new HTTPRequestHandler();
        String jsonData = httpRequestHandler.getJSONData(url);

        //Print total JSON data
        if (jsonData != null) {
            System.out.println("JSON Data retrieved from " + url + ":");
            System.out.println(jsonData + "\n");

            // Print the titles
            JSONHandler jsonHandler = new JSONHandler();
            jsonHandler.processJSON(jsonData);

       }
    }
}
