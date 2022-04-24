# javaCrash

### Data types, casting
```
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

------------------------------------------------------------------
Above are primitive types

Non-primitive types:
     Strings, Arrays, Classes, Interface etc.,
------------------------------------------------------------------
     
String[] cars = {"Volvo", "Mazda"};
int[] marks = {40, 100, 30};
```

### Methods
```
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

// number
Math.min(4,5);
Math.sqrt(3);
Math.abs(-3); // absolute positive value
int rnd = (int) (Math.random() * 101);
System.out.println("random number " + rnd);

// array
String[] cars = {"Volvo", "Mazda"};
System.out.println("No of cars " + cars.length);
```

### Conditions
```
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
```