package se.yrgo.oop;

import java.io.*;
import java.nio.file.*;
import java.util.*;

public class PokemonData {
    public static List<Pokemon> readFile(Path file) throws IOException {
        List<String> lines = Files.readAllLines(file);

        List<Pokemon> allPokemon = new ArrayList<>();

        for (String pokemonLine : lines) {
            String[] parts = pokemonLine.split(",");

            String name = parts[0];
            String type1 = parts[1];
            String type2 = parts[2];
            int powerLevel = Integer.parseInt(parts[3]);

            if (type2.trim().length() == 0) {
                Pokemon pokemon = new Pokemon(name, powerLevel, type1);
                allPokemon.add(pokemon);
            }
            else {
                Pokemon pokemon = new Pokemon(name, powerLevel, type1, type2);
                allPokemon.add(pokemon);
            }
        }

        return allPokemon;
    }
}
