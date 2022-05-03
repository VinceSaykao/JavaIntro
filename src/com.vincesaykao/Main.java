import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;
import java.awt.*;


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

        Scanner scanner = new Scanner(System.in);
        System.out.println("Name: ");
        String name = scanner.next();
        System.out.println("You are" + " " + name);


    
    }
}

// primitive type, we define the data, store number, characters, booleans
// reference type, we create referenced data that has the address to that value data, store complex objects (date, mail messages)
// methods: 
// indexOf() = index of start character 
// replace() = replace target:, replacement: 

