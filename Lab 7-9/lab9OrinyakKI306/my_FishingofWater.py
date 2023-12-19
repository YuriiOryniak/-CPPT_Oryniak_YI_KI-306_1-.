# клас риболовля на водоймі
class FishingofWater:
    # конструктор
    def __init__(self, Amountoffish=0):
        self.__amountoffish = Amountoffish
    # метод повернення кількості риби
    def getAmountofFish(self):
        return self.__amountoffish
    # метод встановлення кількості риби
    def setAmountofFish(self, Amountoffish):
        self.__amountoffish = Amountoffish
    # метод Риболовля
    def Fishing(self):
        return self.__amountoffish - 5

    # метод Зариблення водойми
    def Stockapond(self):
        self.__amountoffish=10000
        return self.__amountoffish
