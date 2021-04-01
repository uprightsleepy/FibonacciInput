package academy.learnprogramming;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Calculate the Fibonacci sequence to the Nth term.");
        Scanner scanner = new Scanner(System.in);

        System.out.println();

        System.out.print("N = ");

        boolean hasNextInt = scanner.hasNextInt();

        System.out.println("Sequence:");
        if (hasNextInt) {
            fibSequence(scanner.nextInt());
        }
    }

    public static void fibSequence(int term) {
        int numOne = 0;
        int numTwo = 1;
        int counter = 0;
        int evenSum = 0;
        int evenTemp = 0;

        while (counter < term) {
            System.out.print(numOne + " ");

            int temp = numTwo + numOne;
            numOne = numTwo;
            numTwo = temp;
            counter++;
        }
    }
}
