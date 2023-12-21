package se.yrgo.oop.application;

import se.yrgo.oop.library.*;
import se.yrgo.oop.library.helpers.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, world!");
        System.out.println(ImportantStuff.getNumber());
        // we can't do this using the module system since it is not exported
        System.out.println(se.yrgo.oop.library.helpers.InternalHelper.getInternalNumber());
    }
}
