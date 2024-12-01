package com.mycompany.hamza_17_1;
import java.util.Scanner;
import java.util.Vector;

public class Hamza_17_1 {
    public static void main(String[] args) {
        
        // Dichiarazione
        int num1, num2, sum = 0;
        Vector<Integer> vector1 = new Vector<>();
        Vector<Integer> vector2 = new Vector<>();
        Scanner sc = new Scanner(System.in);
        
        // Input
        System.out.print("Enter first number: ");
        num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        num2 = sc.nextInt();
        
        // Processing
        System.out.println("The sum equals to: " + (num1 + num2));
        System.out.println("The difference equals to: " + (num1 - num2));
        System.out.println("The division equals to: " + ( (double) num1 / num2) );
        System.out.println("The multiplication equals to: " + (num1 * num2));
        
        int index = 0, modless;
        while (num1 != 0) {
            modless = num1 % 10;
            vector1.add(index, modless);
            index++;
            sum += modless;
            num1 /= 10;
        }
        
        index = 0;
        while (num2 != 0) {
            modless = num2 % 10;
            vector2.add(index, modless);
            index++;
            sum += modless;
            num2 /= 10;
        }
        
        index = 0;
        int index1 = vector1.size() - 1, test = 0;
        if ((vector1.size() % 2) == 1) {
            System.out.println("The first number is not a palindrome number.");
        } else {
            while (index < (vector1.size() / 2)) {
                if (!vector1.get(index).equals(vector1.get(index1))) {
                    test++;
                    break;
                }
                index++;
                index1--;
            }
            if (test == 0) {
                System.out.println("The first number is a palindrome number.");
            } else {
                System.out.println("The first number is not a palindrome number.");
            }
        }
        
        index = 0;
        index1 = vector2.size() - 1;
        test = 0;
        if ((vector2.size() % 2) == 1) {
            System.out.println("The second number is not a palindrome number.");
        } else {
            while (index < (vector2.size() / 2)) {
                if (!vector2.get(index).equals(vector2.get(index1))) {
                    test++;
                    break;
                }
                index++;
                index1--;
            }
            if (test == 0) {
                System.out.println("The second number is a palindrome number.");
            } else {
                System.out.println("The second number is not a palindrome number.");
            }
        }
        
        index = 0;
        index1 = 0;
        test = 0;
        int counter = 0;
        while (index1 < vector1.size()) {
            index = index1 + 1;
            while (index < vector1.size()) {
                if (vector1.get(index1).equals(vector1.get(index))) {
                    counter++;
                    test = vector1.get(index);
                }
                index++;
            }
            if (test != 0) {
                System.out.println("The repeated number in the first vector is: " + test);
            }
            index1++;
        }
        
        if (test == 0) {
            System.out.println("No repeated number found in the first vector.");
        }
        
        index = 0;
        index1 = 0;
        test = 0;
        counter = 0;
        while (index1 < vector2.size()) {
            index = index1 + 1;
            while (index < vector2.size()) {
                if (vector2.get(index1).equals(vector2.get(index))) {
                    counter++;
                    test = vector2.get(index);
                }
                index++;
            }
            if (test != 0) {
                System.out.println("The repeated number in the second vector is: " + test);
                break; 
            }
            index1++;
        }
        
        if (test == 0) {
            System.out.println("No repeated number found in the second vector.");
        }
        
        // Output
        System.out.println("The modulus sum of the two numbers equals to: " + sum);
    }
}
