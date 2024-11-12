package org.fiction;

public class Main {
    public static void main(String[] args) {
        boolean haveIdentityCard = true;
        int age = 22;

        if (haveIdentityCard && age >= 21) {
            System.out.println("You are allowed to drink alcohol.");
        } else {
            System.out.println("You are not allowed to drink alcohol.");
        }

        int newValue = 50;
        if (newValue == 50) {
            System.out.println("This is true.");
        }

        boolean isCar = false;
        if (isCar == true) {
            System.out.println("This is not supposed to happen.");
        }

        String makeOfCar = "Volkswagen";
        boolean isDomestic = makeOfCar == "Folkswagen" ? true : false;
    }
}