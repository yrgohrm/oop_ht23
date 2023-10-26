package se.yrgo.oop;

import java.io.*;
import java.nio.file.*;
import java.util.*;
import java.util.logging.*;

public class App {
    static {
        System.setProperty("java.util.logging.config.file", "logging.properties");
    }

    private static final Logger logger = Logger.getLogger(App.class.getName());

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter a Pokemon type:");
            String type = scanner.nextLine();

            List<Pokemon> pokemonOfType = listAllPokemonOfType(type);
            printPokemonList(pokemonOfType);
        }
        catch (IOException ex) {
            System.err.println("Could not find the pokemons.");
            logger.log(Level.SEVERE, "unable to find pokemons", ex);
        }
    }

    private static List<Pokemon> listAllPokemonOfType(String type) throws IOException {
        List<Pokemon> allPokemon = PokemonData.readFile(Path.of("pokemon.csv"));
        return filterPokemonByType(allPokemon, type);
    }

    private static List<Pokemon> filterPokemonByType(List<Pokemon> allPokemon, String type) {
        List<Pokemon> resultPokemons = new ArrayList<>();
        for (Pokemon pokemon : allPokemon) {
            if (pokemon.getTypes().contains(type)) {
                resultPokemons.add(pokemon);
            }
        }
        return resultPokemons;
    }

    private static void printPokemonList(List<Pokemon> pokemonOfType) {
        for (Pokemon pokemon : pokemonOfType) {
            System.out.printf("%s, pl: %d, types: %s%n", 
                    pokemon.getName(), 
                    pokemon.getPowerLevel(),
                    pokemon.getTypes().toString());
        }
    }
}
