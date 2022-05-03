import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;
import java.awt.*;
import java.text.NumberFormat;

public class Main {
    public static void main(String[] args) {
        // System.out.println("Hello World");
        // byte age = 30;
        // int viewsCount = 123_456_483;
        // // console.log(age);
        // Date now = new Date();
        // System.out.println(now);

        // Point point1 = new Point(1, 1);
        // Point point2 = point1;
        // point1.x = 2;
        // System.out.println(point2);

        // String message = "Hello World" + "!!";
        // System.out.println(message.replace("!","~"));

        // int[] numbers = new int[5];
        // numbers[0] = 1;
        // numbers[1] = 2;
        // System.out.println(Arrays.toString(numbers));

        // int[] numbers = {2,3,4,1,2};
        // System.out.println(numbers.length);

        // int[][] numbers = {{1,2,3}, {3,2,3}};
        // numbers[0][0] = 1;
        // System.out.println(Arrays.deepToString(numbers));

        // final float PI = 3.14F;

        // int x = 1;
        // x += 1;
        // System.out.println(x);

        // Scanner scanner = new Scanner(System.in);
        // System.out.println("Name: ");
        // String name = scanner.nextLine().trim();
        // System.out.println("You are" + " " + name);


        // Mortage Calculator START *********

        // final byte MONTHS_IN_YEAR = 12;
        // final byte PERCENT = 100;

        // Scanner scanner = new Scanner(System.in);

        // System.out.println("Principal: ");
        // int principal = scanner.nextInt();

        // System.out.print("Annual Interest Rate: ");
        // float annualInterest = scanner.nextFloat();
        // float monthlyInterest = annualInterest / PERCENT / MONTHS_IN_YEAR;

        // System.out.println("Period (Years): ");
        // byte years = scanner.nextByte();
        // int numberOfPayments = years * MONTHS_IN_YEAR;

        // double mortage = principal
        //         * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments))
        //         / (Math.pow(1 + monthlyInterest, numberOfPayments));
        // String mortageFormatted = NumberFormat.getCurrencyInstance().format(mortage);
        // System.out.println("Mortage: " + mortageFormatted);

        // Mortage Calculator END *********

        // Logical Operator

        // int temperature = 12;
        // boolean isWarm = temperature > 20 && temperature < 30;
        // System.out.println(isWarm);

        // int temp = 1;
        // if (temp > 30) {
        //     System.out.println("It's a hot day, drink water!");
        // } else if (temp > 20 && temp <= 30) {
        //     System.out.println("Beautiful day");
        // } else {
        //     System.out.println("Brrr cold");
        // };

        // int income = 120_000;
        // // boolean hasHighIncome = (income > 100_000);
        // String className = (income > 100_000 ? "First" : "Economy");
        // System.out.println(className);

        // String role = "stuff";

        // switch (role) {
        //     case "admin": 
        //         System.out.println("You are an admin");
        //     break;

        //     case "mod":
        //         System.out.println("You are a mod");
        //     break;

        //     default:
        //     System.out.println("You are a guest");
        // }

        // System.out.println(role);

        // Scanner scanner = new Scanner(System.in);
        // System.out.print("Number: ");
        // int number = scanner.nextInt();

        // if ( number % 5 == 0 && number % 3 == 0)
        //     System.out.println("Fizz Buzz");
        // else if (number % 3 == 0)
        //     System.out.println("Buzz");
        // else if (number % 5 == 0)
        //     System.out.println("Fizz");

        // for (int i=5; i>0; i--)
        //     System.out.println("Hello World" + i);

        String input = "";
        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.println("Input: " + input);
            input = scanner.next().toLowerCase();
            // System.out.println(input);
            if(input.equals("pass"))
            continue;
            if(input.equals("quit"))
            break;
        }

        // do {

        // } while (!input.equals("quit"));
        // System.out.println("Input: ");
        // input = scanner.next().toLowerCase();
        // System.out.println(input);
        
    }
}

// primitive type, we define the data, store number, characters, booleans
// reference type, we create referenced data that has the address to that value
// data, store complex objects (date, mail messages)
// methods:
// indexOf() = index of start character
// replace() = replace target:, replacement:
