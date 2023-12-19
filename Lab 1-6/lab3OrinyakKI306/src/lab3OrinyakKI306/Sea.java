package lab3OrinyakKI306;

import java.io.FileNotFoundException;

/**
 * The Volume interface represents a contract for classes that can calculate volume.
 * Classes implementing this interface must provide an implementation for the calculateVolume method.
 */
interface Volume {
	double calculateVolume();
}
/**
 * The Sea class represents a body of water in the program, extending the WaterBody class
 * and implementing the Volume interface. It encapsulates information about the salinity
 * and depth of the sea.
 */
public class Sea extends WaterBody implements Volume {
	private double salinity;
    private int depth;
    /**
     * Constructs a Sea object with specified depth and salinity.
     *
     * @param Xdepth    The depth of the sea.
     * @param Xsalinity The salinity level of the sea.
     */
  public Sea(int Xdepth, double Xsalinity) throws FileNotFoundException {
      depth = Xdepth;
      salinity =Xsalinity;
  }
  /**
   * Gets the salinity of the sea.
   *
   * @return The salinity value.
   */
  public double getSalinity() {
      return salinity;
  }
  /**
   * Sets the salinity level of the sea.
   *
   * @param Xsalinity The salinity value to set.
   */
  public void setSalinity(double Xsalinity) {
      salinity = Xsalinity;
  }
  /**
   * Gets the depth of the sea.
   *
   * @return The depth value.
   */
  public int getDepth() {
      return depth;
  }
  /**
   * Sets the depth of the sea.
   *
   * @param Xdepth The depth value to set.
   */
  public void setDepth(int Xdepth) {
      depth = Xdepth;
  }
  /**
   * Checks the salinity level of the sea and prints a message accordingly.
   */
  public void checkSalinity() {
      if (salinity < 1.0) {
          System.out.println("У морі недостатня солоність води!!!");
          fout.println("У морі недостатня солоність води!!!");
      } else {
          System.out.println("Солоність води в межах норми!.");
          fout.println("Солоність води в межах норми!.");
      }
  }
  /**
   * Calculates the volume of the sea based on width, length, and depth.
   *
   * @return The calculated volume.
   */
  public double calculateVolume() {
      double volume = getWidthforWater()*getLengthforWater() * depth; 
      return volume;
  }
  /**
   * Prints the provided line.
   *
   * @param line The line to be printed.
   */
  public void Print(double line) {
      System.out.println(line);
  }
  /**
   * Writes the provided line to a file.
   *
   * @param line The line to be written to the file.
   */
  public void WritetoFile(double line) {
      if (line == 0) {
          fout.close();
      }
      fout.println(line);
      fout.flush();
  } 
  /**
   * Writes the provided string to a file.
   *
   * @param line The string to be written to the file.
   */
  public void WritetoFile(String line) {
      if (line == null) {
          fout.close();
      }
      fout.print(line);
      fout.flush();
  }
}
