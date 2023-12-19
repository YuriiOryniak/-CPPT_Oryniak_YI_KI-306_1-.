package lab4OrinyakKI306;


import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * The Mathapp class demonstrates the calculation of a mathematical function y = sin(x) / tan(4x)
 * and writes the result to a file.
 */
public class Mathapp {

    /**
     * The main method where the program execution starts.
     *
     * @param args Command-line arguments.
     */
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            double result;

            try {
                int inputX;
                System.out.print("Enter the value of x: ");
                inputX = scanner.nextInt();

                calcEquations eq = new calcEquations();
                result = eq.calculate(inputX);

                System.out.print("Result of the function y = sin(x) / tan(4x): ");
                System.out.println(result);

                writeResultToFile(result);
            } catch (CalcException ex) {
                System.out.println(ex.getMessage());
            } catch (FileNotFoundException e) {
                System.out.println("File not found!");
            }
        }
    }

    /**
     * Writes the calculated result to a file named "MyFile.txt".
     *
     * @param result The result of the mathematical function.
     * @throws FileNotFoundException If the file is not found.
     */
    private static void writeResultToFile(double result) throws FileNotFoundException {
        try (PrintWriter fileOutput = new PrintWriter("MyFile.txt")) {
            fileOutput.println("Result of the function y = sin(x) / tan(4x): " + result);
        }
    }
}

/**
 * Custom exception class CalcException for handling specific calculation errors.
 */
class CalcException extends Exception {
    public CalcException() {
    }

    public CalcException(String cause) {
        super(cause);
    }
}

/**
 * The calcEquations class calculates the mathematical expression y = sin(x) / tan(4x).
 */
class calcEquations {

    /**
     * Calculates the mathematical expression y = sin(x) / tan(4x).
     *
     * @param x Angle in degrees.
     * @return The calculated value of the expression.
     * @throws CalcException If there is an error during calculation.
     */
    public double calculate(int x) throws CalcException {
        double y, rad, rad1;
        rad = Math.toRadians(x);
        rad1 = 4 * rad;

        try {
            y = Math.sin(rad) / Math.tan(rad1);
            if (Double.isNaN(y) || Double.isInfinite(y) || x == 90 || x == -90) {
                throw new CalcException("Error: Invalid angle value for tangent calculation!");
            }
        } catch (ArithmeticException ex) {
            if (x == 0) {
                throw new CalcException("Error: x = 0");
            } else {
                throw new CalcException("Unknown error occurred during calculation!");
            }
        }
        return y;
    }
}
