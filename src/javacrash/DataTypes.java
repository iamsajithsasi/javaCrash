package javacrash;

public class DataTypes {
    public void output() {
        String name = "John";
        int age = 28; // 10 digits; more-> long; less-> short(6 digits)
        float cgpa = 6; // 6 to 7 digits; more-> double
        char sex = 'M';
        boolean married = true;

        final int height = 6;

        double cgpaNew = cgpa;
        int cgpaOld = (int) cgpaNew;

        System.out.println("Auto Casting int to double " + cgpaNew);
        System.out.println("Manual Casting int to double " + cgpaOld);

        /*
            Above are primitive types

            Non-primitive types:
                 Strings, Arrays, Classes, Interface
         */
    }
}
