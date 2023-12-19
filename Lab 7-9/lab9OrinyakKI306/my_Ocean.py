# my_Ocean.py
from my_Sea import Sea
from my_square import Square
from my_FishingofWater import FishingofWater
from my_NaturalWorld import NaturalWorld

# Довільний клас для демонстрації множинного наслідування
class RandomClass:
    def __init__(self, some_property):
        self.some_property = some_property

# Клас океан, який успадковує класи Sea та RandomClass
class Ocean(Sea, RandomClass):
    def __init__(self, xdepth=0.0, Xdepth=0.0, Xsalinity=0, wave_height=0, random_property=""):
        # Викликаємо конструктори батьківських класів
        Sea.__init__(self, xdepth, Xdepth, Xsalinity)
        RandomClass.__init__(self, random_property)
        self.__wave_height = wave_height

    def getWaveHeight(self):
        return self.__wave_height

    def setWaveHeight(self, wave_height):
        self.__wave_height = wave_height

    def calculateVolume(self):
        base_volume = super().calculateVolume()  # Викликаємо метод calculateVolume з класу Sea
        volume_with_waves = base_volume * (1 + self.__wave_height / 10)
        return volume_with_waves

    def getSeaInformation(self):
        # Доступ до методів та властивостей класу Sea через успадкування
        return f"Depth: {self.getDepth()}, Salinity: {self.getSalinity()}"

    def getRandomClassProperty(self):
        # Доступ до властивостей класу RandomClass через успадкування
        return self.some_property


if __name__ == "__main__":
    ocean = Ocean(27, 11, 21, wave_height=5, random_property="Some value")

    print("Wave Height:", ocean.getWaveHeight())
    print(ocean.calculateVolume())
    print(ocean.getSeaInformation())
    print(ocean.getRandomClassProperty())
