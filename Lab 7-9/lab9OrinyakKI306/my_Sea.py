from my_Water import Water

#клас море
class Sea(Water):

   #конструктор
    def __init__(self, xdepth=0.0, Xdepth=0.0, Xsalinity=0):
        super().__init__(xdepth)
        self.__depth = Xdepth
        self.__salinity = Xsalinity

    #метод повернення солоності
    def getSalinity(self):
        return self.__salinity

    #метод встановлення солоності
    def setSalinity(self,Xsalinity):
        self.__salinity = Xsalinity

    #метод повернення глибини
    def getDepth(self):
        return self.__depth

    #метод встановлення солоності
    def setDepth(self, Xdepth):
        self.__depth = Xdepth

    #метод обраховує солоність
    def checkSalinity(self):
        if (self.__salinity < 1.0):
            print("У морі недостатня солоність води!!!")
        else:
            print("Солоність води в межах норми!");

    def calculateVolume(self):
        volume = self.getWidthforWater() * self.getLengthforWater() * self.__depth;
        return volume
        # метод виводить на екран властивості класу
    def Printer(self, line,line1, line3):
        print(line, line1, line3)

