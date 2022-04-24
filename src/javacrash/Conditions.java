package javacrash;

public class Conditions {

    public void  output() {
        int x = 1;
        int y = 10;

        // if else
        if (x < y) {
            System.out.println(x + " is less than " + y);
        } else if (x == y) {
            System.out.println(x + " is equal to " + y);
        } else {
            System.out.println(x + " is greater than " + y);
        }

        // switch case
        switch (x) {
            case 1:
                System.out.println("Number is one");
                break;
            case 2:
                System.out.println("Number is two");
                break;
            default:
                System.out.println("Checkout the numbers");
                break;
        }

        // while
        while (x < 5) {
            System.out.println(x);
            x++;
        }

        do {
            System.out.println(x);
            x--;
        } while (x > 0);

        // for
        for (int i = x; i < 5; i++) {
            System.out.println(i);
        }

        // for each : array
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        for (String car : cars) {
            System.out.println(car);
        }

    }
}
