package org.fiction;

public class Main3 {
    public static void main(String[] args) {
        double myDouble = 20.00;

        double mySecondDouble = 80.00;

        double doubleCalculations = (myDouble + mySecondDouble) * 100.00;

        double result = doubleCalculations % 40.00;

        boolean myBoolean = result == 0.00;

        System.out.println(myBoolean);

        if (!myBoolean) {
            System.out.println("Got some remainder");
        }
    }
}
