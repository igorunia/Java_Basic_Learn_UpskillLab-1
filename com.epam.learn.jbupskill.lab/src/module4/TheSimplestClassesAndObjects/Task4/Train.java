package module4.TheSimplestClassesAndObjects.Task4;

/**
 * Создайте класс Train, содержащий поля: название пункта назначения, номер поезда, время отправления.
 * Создайте данные в массив из пяти элементов типа Train, добавьте возможность сортировки элементов массива по номерам
 * поездов. Добавьте возможность вывода информации о поезде, номер которого введен пользователем.
 * Добавьте возможность сортировки массив по пункту назначения, причем поезда с одинаковыми пунктами назначения должны
 * быть упорядочены по времени отправления.
 */
public class Train {
    public String nameOfDestination;
    public String numberOfTrain;
    public String timeOfDeparture;

    public Train(String nameOfDestination, String  numberOfTrain, String timeOfDeparture){
        this.nameOfDestination = nameOfDestination;
        this.numberOfTrain = numberOfTrain;
        this.timeOfDeparture = timeOfDeparture;
    }

    public int compareToNumberOfTrain ( Train o){
        return this.numberOfTrain.compareTo(o.numberOfTrain);
    }

    @Override
    public String toString() {
        return "Train{" +
                "nameOfDestination='" + nameOfDestination + '\'' +
                ", numberOfTrain='" + numberOfTrain + '\'' +
                ", timeOfDeparture='" + timeOfDeparture + '\'' +
                '}';
    }
    public int compareToNameOfDestination(Train o){
        return this.nameOfDestination.compareTo(o.nameOfDestination);
    }

    public int compareToTimeOfDeparture(Train o){
        return this.timeOfDeparture.compareTo(o.timeOfDeparture);
    }
}
