package com.example;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class App {
    public static void main(String[] args) {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        User user = new User("Alice", 30, "alice@example.com");
        String json = gson.toJson(user);
        System.out.println("Serialized to JSON:");
        System.out.println(json);

        User parsed = gson.fromJson(json, User.class);
        System.out.println("\nDeserialized back:");
        System.out.println(parsed);
    }
}
