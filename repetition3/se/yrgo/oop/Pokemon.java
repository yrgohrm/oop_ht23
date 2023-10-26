package se.yrgo.oop;

import java.util.*;

public class Pokemon {
    private String name;
    private int powerLevel;
    private List<String> types;

    public Pokemon(String name, int powerLevel, String... types) {
        if (types.length == 0) {
            throw new IllegalArgumentException("pokemons must have at least one type");
        }

        if (types.length > 2) {
            throw new IllegalArgumentException("pokemons can't have more than two types");
        }

        this.name = name;
        this.powerLevel = powerLevel;
        this.types = Arrays.asList(types);
    }

    public String getName() {
        return name;
    }

    public int getPowerLevel() {
        return powerLevel;
    }

    public List<String> getTypes() {
        return new ArrayList<>(types);
    }

    @Override
    public String toString() {
        return "Pokemon [name=" + name + ", powerLevel=" + powerLevel + ", types=" + types + "]";
    }
}
