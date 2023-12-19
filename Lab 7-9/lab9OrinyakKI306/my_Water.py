from my_square import Square
from my_FishingofWater import FishingofWater
from my_NaturalWorld import NaturalWorld

#клас водойма
class Water:
    # конструктор
    def __init__(self, xdepth=0.0):
        self.__squareofwater = Square()
        self.__naturalsituation = NaturalWorld()
        self.__fishingwater = FishingofWater()
        self.__depth = xdepth

    # метод встановлення глибини
    def SetDepthWater (self, xdepth):
        self.__depth = xdepth

    # метод перевірки водного режиму
    def SituationofWater(self):
        if(self.__depth < 2.0):
            print("Водойма на стадії обміління!")
        else:
            print("У водойми хороший водний режим!!! ")

    # метод для отримання площі водойми
    def getCalcSquare(self):
        return self.__squareofwater.CalcSquare()

    # метод для встановлення параметрів для обчислення площі
    def setParametersSquare(self, xwidth, xlength):
        self.__squareofwater.setWidth(xwidth)
        self.__squareofwater.setLength(xlength)

    # метод для поверненя ширини
    def getWidthforWater(self):
        return self.__squareofwater.getWidth()

    # метод для повернення довжини
    def getLengthforWater(self):
        return self.__squareofwater.getLength()

    # метод для встановлення параметрів риболовлі на водоймі
    def setParameterforFishing(self, xAmountoffish):
        self.__fishingwater.setAmountofFish(xAmountoffish)

    # метод для проведення риболовлі
    def ResultFishing(self):
        print("Кількість риби яка лишилася після риболовлі: ", self.__fishingwater.Fishing())

    # метод для зариблення водойми
    def RunStockapond(self):
        print("Зариблення водойми пройшло успішно, кількість риби: ", self.__fishingwater.Stockapond())

    # метод для встановлення інформації про природній світ водойми
    def setParametersforNaturalWord(self, xFlora,  xFauna):
        self.__naturalsituation.setFlora(xFlora)
        self.__naturalsituation.setFauna(xFauna)


    # метод для отримання повної інформації про природній світ водойми
    def getInformation(self):
        print("Рослини водойми: ", self.__naturalsituation.getFlora())
        print("Тварини водойми: ", self.__naturalsituation.getFauna())
