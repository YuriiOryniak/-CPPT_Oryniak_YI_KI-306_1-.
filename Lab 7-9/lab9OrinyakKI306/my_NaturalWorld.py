# клас природній світ водойми
class NaturalWorld:
    # конструктор
    def __init__(self, Flora="default", Fauna="default"):
        self.__flora = Flora
        self.__fauna = Fauna
    # метод повернення рослинності водойми
    def getFlora(self):
        return self.__flora
    # метод повернення тваринності водойми
    def getFauna(self):
        return self.__fauna
    # метод встановлення рослинності водойми
    def setFlora(self, Flora ):
        self.__flora = Flora
    # метод встановлення тваринності водойми
    def setFauna(self, Fauna):
        self.__fauna = Fauna
