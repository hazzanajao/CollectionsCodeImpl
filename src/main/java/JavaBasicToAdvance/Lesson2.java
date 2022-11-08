package JavaBasicToAdvance;

import java.util.Scanner;

// Design a simple program to perform calculations
public class Lesson2 {

    public static int performAddition(int x, int y) {
        int additionResult = x + y;
        return additionResult;
    }


    static int performMultiplication(int x, int y) {
        int multiplicationResult = x * y;
        return multiplicationResult;
    }

    static int performDivision(int x, int y) {
        int divResult = x / y;
        return divResult;
    }

    public static int performSubtraction(int x, int y) {
        int subResult = x - y;
        return subResult;
    }

    // main method observe the difference between static and public computation

    public static void main(String[] args) {
        /* when using public not static, it is better to use this class Object approach*/
        System.out.println(" ");
        System.out.println("The Given Numbers are 10 and 5");
        System.out.println(" ");
        Lesson2 addResult = new Lesson2();
        System.out.println("Result from class Object approach: " + addResult.performAddition(10, 5));

        System.out.println("================");

        /* Addition*/
        int add = performAddition(10, 5);
        System.out.println("Addition Result:" + add);
        /* Subtraction*/
        int sub = performSubtraction(10, 5);
        System.out.println("Subtraction Result:" + sub);
        /* Multiplications*/
        int mul = performMultiplication(10, 5);
        System.out.println("Multiplication Result:" + mul);
        /* Multiplications*/
        int div = performDivision(10, 5);
        System.out.println("Division Result:" + div);

        System.out.println(" ");

        System.out.println("For Additions ");
        System.out.println("=================");

        /* Performing Addition with console*/
        Scanner input = new Scanner(System.in);
        System.out.println("Enter data1");
        int data1 = input.nextInt();
        System.out.println("Enter data2");
        int data2 = input.nextInt();
        System.out.println(performAddition(data1, data2));

        System.out.println(" ");

        /* Performing Subtraction with console*/
        System.out.println("For Subtractions ");
        System.out.println("=================");
        Scanner input2 = new Scanner(System.in);
        System.out.println("Enter data1");
        int data3 = input2.nextInt();
        System.out.println("Enter data2");
        int data4 = input2.nextInt();
        System.out.println(performSubtraction(data3, data4));

    }


}
