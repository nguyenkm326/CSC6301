import java.util.Stack;
import java.util.Collections;
import java.util.Scanner;

/**
 * This is a simple program that prompt for a list of integer to be input
 * and the value get stored into a stack array. The integer should be
 * separated by a whitespace, the program will sort the array in
 * ascending order and output the array.
 * @author Khoi Nguyen
 * @version 1.0.0
 * @since CSC6301 Week 5
 */
public class IntegerStack {
    /**
     * Main method to execute the program logic. Take the input as a string
     * then a for loop to iterate through the list and parse each object to
     * store each object as an integer.
     * @param args String default parameter
     */
    public static void main(String[] args) {
        // Initialize stack attribute
        Stack<Integer> integers = new Stack<>();
        // Initialize scanner object for integer input
        Scanner input = new Scanner(System.in);

        // Integer list input should be separated by whitespace
        System.out.print("Enter a list of integers seperated by whitespace: ");
        // Storing integer list as string for initial input
        String [] tokens = input.nextLine().split("\\s");
        
        // Iterate through integer list and stored each object as an integer into a stack
        for (int i = 0; i < tokens.length; i++)
        integers.push(Integer.parseInt(tokens[i]));

        // sorting the stack in ascending order
        Collections.sort(integers);

        // Output the sorted stack
        System.out.println("Your sorted Stack: " + integers);
    }
}
