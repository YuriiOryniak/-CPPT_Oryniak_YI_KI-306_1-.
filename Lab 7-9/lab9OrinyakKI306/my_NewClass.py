
# новий клас, який не успадковує властивості інших класів, але може бути успадкований
class NewClass:
    # конструктор
    def __init__(self, xproperty="default_property"):
        # власна властивість для нового класу
        self.__property = xproperty

    # метод повернення властивості нового класу
    def getProperty(self):
        return self.__property

    # метод встановлення властивості нового класу
    def setProperty(self, xproperty):
        self.__property = xproperty

    # метод для друку інформації про новий клас
    def printInfo(self):
        print("Інформація про новий клас:")
        print(f"Властивість: {self.__property}")

# основна програма для перевірки нового класу
if __name__ == "__main__":
    # створення об'єкту класу NewClass
    new_object = NewClass("custom_property")

    # використання методів класу
    new_object.printInfo()