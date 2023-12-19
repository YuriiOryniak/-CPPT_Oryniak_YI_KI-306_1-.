package lab2OrinyakKI306;
import java.io.*;
public class WaterBodyapp {
	/**
     * @param args
     * @throws FileNotFoundException
     */
	public static void main(String[] args) throws FileNotFoundException {
	WaterBody lake = new WaterBody(1.25);
	lake.setParametersforSquare(45.1, 64.5);
	lake.GetCalcSquare();
	lake.setParameterforFishing(1000);
	lake.ResultFishing();
	lake.RunStockapond();;
	lake.setParametersforNaturalWord("жовте латаття, зелена водорость","карась, щука, плотва, окунь");
	System.out.println("Ширина водойми: "+ lake.getWidthforWater());
	System.out.println("Довжина водойми: " +lake.getLengthforWater());
	lake.SituationofWater();
	lake.getInformation();
}
}
