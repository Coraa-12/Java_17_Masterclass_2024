package org.fiction;

public class Main2 {
    public static void main(String[] args) {
        boolean haveIdentityCard = false;
        int age = 22;
        boolean studentID = false;

        // String isAllowedToDrink = haveIdentityCard && age == 22 ? "You are allowed to drink alcohol." : "You are not allowed to drink alcohol.";
        // System.out.println(isAllowedToDrink);

        String haveIdentity = haveIdentityCard == true || studentID == true ? "You have an identity card." : "You don't have an identity card.";
        System.out.println(haveIdentity);

        if (haveIdentityCard || studentID) {
            System.out.println("You have an identity card.");
        } else {
            System.out.println("You don't have an identity card.");
        }
    }
}