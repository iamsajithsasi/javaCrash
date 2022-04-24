package javacrash;

import java.util.Arrays;

public class Methods {
    public void output() {

        // string
        String name = "John";
        System.out.println("Length of string " + name.length());
        name.toUpperCase();
        name.toLowerCase();
        name.indexOf("o");
        name.concat(" Doe");
        name.contains("oh");
        name.isEmpty();
        String new_name = name.replace("J", "H"); // replaceFirst(), replaceAll()
        var name_split = new_name.split("");
        var name_op = Arrays.toString(name_split);
        System.out.println("op " + String.join("", name_split));




        // math
        Math.min(4,5);
        Math.sqrt(3);
        Math.abs(-3); // absolute positive value
        int rnd = (int) (Math.random() * 101);
        System.out.println("random number " + rnd);


        // array
        String[] cars = {"Volvo", "Mazda"};
        System.out.println("No of cars " + cars.length);

        // objects


    }
}
