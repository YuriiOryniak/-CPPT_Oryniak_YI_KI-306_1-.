
from my_Sea import Sea
from my_Ocean import Ocean
# основна програма
if __name__ == "__main__":
    # об'єкт на основі класу море
    black = Sea(27, 11, 21)

    # використання методів класу за допомогою створеного об'єкта
    black.setParametersSquare(11.5, 32)
    black.Printer("Площа водойми:", black.getCalcSquare(), "m^2")
    black.setParametersforNaturalWord("ламінарія, зелена водорость", "cудак, дельфін, камбала, бичок")
    black.getInformation()
    black.checkSalinity()
    black.setParameterforFishing(1000)
    black.ResultFishing()
    black.RunStockapond()
    black.SituationofWater()
    black.Printer("Об'єм води становить: ",black.calculateVolume(), "litr")
    ocean = Ocean(27, 11, 21, wave_height=5, random_property="Some value")
    print("Wave Height:", ocean.getWaveHeight())
    print(ocean.calculateVolume())
    print(ocean.getSeaInformation())
    print(ocean.getRandomClassProperty())
