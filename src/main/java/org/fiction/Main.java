package org.fiction;

public class Main {
    public static void main(String[] args) {
        double numberOfPounds = 200;
        double poundsEqualKilograms = 0.45359237;

        double convertedKilograms = numberOfPounds * poundsEqualKilograms;
        System.out.println("Converted kilograms = " + convertedKilograms);
    }
}