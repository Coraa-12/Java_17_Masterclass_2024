package org.fiction;

public class Main {
    public static void main(String[] args) {
        boolean haveIdentityCard = false;
        int age = 22;

        if (haveIdentityCard && age >= 21) {
            System.out.println("You are allowed to drink alcohol.");
        } else {
            System.out.println("You are not allowed to drink alcohol.");
        }
    }
}