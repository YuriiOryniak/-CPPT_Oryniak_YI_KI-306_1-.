package lab3OrinyakKI306;

import java.io.FileNotFoundException;

/**
 * The Seaapp class contains the main method to demonstrate various operations
 * and functionalities related to the Sea class.
 */
public class Seaapp {
    public static void main(String[] args) throws FileNotFoundException {
        // Create a Sea object named blacksea with specified depth and salinity
        Sea blacksea = new Sea(13, 4.75);

        // Set parameters for the square of the water body
        blacksea.setParametersforSquare(45.1, 64.5);
        blacksea.GetCalcSquare(); // Calculate the square of the water body
        blacksea.setParameterforFishing(1000); // Set parameters for fishing
        blacksea.ResultFishing(); // Get the result of fishing
        blacksea.RunStockapond(); // Run stocking a pond
        blacksea.setParametersforNaturalWord("ламінарія, зелена водорость", "cудак, дельфін, камбала, бичок");
        // Set parameters for natural world
        System.out.println("Ширина водойми: " + blacksea.getWidthforWater()); // Print width of water body
        System.out.println("Довжина водойми: " + blacksea.getLengthforWater()); // Print length of water body
        blacksea.SetDepthWater(1000.75); // Set depth of water body
        blacksea.SituationofWater(); // Determine the situation of water
        blacksea.getInformation(); // Get information
        blacksea.checkSalinity(); // Check salinity of water
        System.out.print("Об'єм води становить: ");
        blacksea.Print(blacksea.calculateVolume()); // Calculate and print the volume of water
        blacksea.WritetoFile("Об'єм води становить: "); // Write information to a file
        blacksea.WritetoFile(blacksea.calculateVolume()); // Write volume information to a file
    }
}
