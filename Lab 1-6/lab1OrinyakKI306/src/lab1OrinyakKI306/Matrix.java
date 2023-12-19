package lab1OrinyakKI306;
import java.io.*;
import java.util.*;

/**
 * The Matrix class generates a square matrix filled with a specified symbol
 * and writes the matrix to a text file.
 */
public class Matrix {
    public static void main(String[] args) throws FileNotFoundException {
        
        // Initializing necessary variables and objects
        Scanner in = new Scanner(System.in); // Scanner object for user input
        PrintWriter fout = new PrintWriter("MyFile.txt"); // PrintWriter object for writing to a file
        char[][] arr; // 2D array to store the matrix
        int n__ROWS; // Variable to store the size of the square matrix
        String symbol; // Variable to store the symbol used to fill the matrix
        
        // User input for the size of the square matrix
        System.out.println("Enter the size of the square matrix: ");
        n__ROWS = in.nextInt();
        
        // User input for the symbol to fill the matrix
        System.out.println("Enter the filling symbol: \n");
        in.nextLine(); // Consuming the newline character left after previous nextInt()
        symbol = in.nextLine();
        
        // Validating the length of the input symbol
        if (symbol.length() != 1) {
            System.out.print("\nIncorrect filling symbol input.");
            fout.print("\nIncorrect filling symbol input");
            System.exit(0); // Exiting the program if the symbol is invalid
        }
        
        arr = new char[n__ROWS][]; // Initializing the 2D array for the matrix
        
        int checking__of__the__array = 0; // Variable for checking array conditions
        
        // Generating and filling the matrix based on user input
        for (int i = 0; i < n__ROWS; i++) {
            arr[i] = new char[n__ROWS/2]; // Initializing array elements
            
            // Filling the first half of each row with the input symbol
            if (checking__of__the__array < n__ROWS/2) {
                for (int j = 0; j < n__ROWS/2; j++) {
                    arr[i][j] = (char) symbol.codePointAt(0);
                    // Printing and writing the symbol to file
                    System.out.print(arr[i][j]);
                    fout.write(arr[i][j]);
                }
                // Filling the second half of the row with spaces
                for (int k = n__ROWS/2; k < n__ROWS; k++) {
                    System.out.print(" ");
                    fout.write(" ");
                }
                System.out.println();
                fout.println();
            } else {
                // Filling the first half of the row with spaces
                arr[i] = new char[n__ROWS/2];
                for (int k = 0; k < n__ROWS/2; k++) {
                    System.out.print(" ");
                    fout.write(" ");
                }
                // Filling the second half of each row with the input symbol
                for (int j = 0; j < n__ROWS/2; j++) {
                    arr[i][j] = (char) symbol.codePointAt(0);
                    // Printing and writing the symbol to file
                    System.out.print(arr[i][j]);
                    fout.write(arr[i][j]);
                }
                System.out.println();
                fout.println();
            }
            
            // Incrementing the checker variable for array conditions
            checking__of__the__array += 1;
        }
        
        // Closing the file writer and scanner objects
        fout.close();
        in.close();
    }
}
