package lab5OrinyakKI306;
import java.util.Scanner;
import java.io.*;

/**
 * The Mathapp class demonstrates the calculation of a mathematical function y = sin(x) / tan(4x)
 * and performs read/write operations to text and binary files.
 */
public class Mathapp {

    /**
     * The main method where the program execution starts.
     *
     * @param args Command-line arguments.
     */
    public static void main(String[] args) throws FileNotFoundException {
        try (Scanner scanner = new Scanner(System.in)) {
            double result;

            try {
                System.out.print("Enter the value of x: ");
                int inputX = scanner.nextInt();

                calcEquations eq = new calcEquations();
                result = eq.calculate(inputX);

                ReadWritetxt.writeTxt(result);
                ReadWritebin.writeBin(result);
                ReadWritebin.readBin();
                ReadWritetxt.readTxt();
            } catch (CalcException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }
}

/**
 * The ReadWritetxt class provides methods for writing/reading data to/from a text file.
 */
class ReadWritetxt {

    private static final String FILE_NAME = "MyFile.txt";

    /**
     * Writes the calculated result to a text file.
     *
     * @param result The result of the mathematical function.
     */
    public static void writeTxt(double result) {
        try (PrintWriter fout = new PrintWriter(new FileWriter(FILE_NAME))) {
            fout.println("Result of the function y = sin(x) / tan(4x) = " + result);
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }

    /**
     * Reads data from a text file and displays it.
     */
    public static void readTxt() {
        try (BufferedReader br = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error reading from file: " + e.getMessage());
        }
    }
}

/**
 * The ReadWritebin class provides methods for writing/reading data to/from a binary file.
 */
class ReadWritebin {

    private static final String FILE_NAME = "MyFile.bin";

    /**
     * Writes the calculated result to a binary file.
     *
     * @param result The result of the mathematical function.
     */
    public static void writeBin(double result) {
        try (DataOutputStream f = new DataOutputStream(new FileOutputStream(FILE_NAME))) {
            f.writeDouble(result);
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }

    /**
     * Reads data from a binary file and displays it.
     */
    public static void readBin() {
        try (DataInputStream f = new DataInputStream(new FileInputStream(FILE_NAME))) {
            double line = f.readDouble();
            System.out.println(line);
        } catch (IOException e) {
            System.out.println("Error reading from file: " + e.getMessage());
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
 * The calcEquations class performs calculations of the mathematical expression y = sin(x) / tan(4x).
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
