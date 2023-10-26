package se.yrgo.oop;

public class App {
    public static void main(String[] args) {
        Pokemon nisse = new Pokemon("Nisse", 1234, "Fire", "Grass");
        System.out.println(nisse.getTypes());

        Pokemon bosse = new Pokemon("Bosse", 1234, "Poison");
        System.out.println(bosse);
    }
}
