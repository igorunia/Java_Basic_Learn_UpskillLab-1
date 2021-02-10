package module4.TheSimplestClassesAndObjects.Task4;

/**
 * Создайте класс Train, содержащий поля: название пункта назначения, номер поезда, время отправления.
 * Создайте данные в массив из пяти элементов типа Train, добавьте возможность сортировки элементов массива по номерам
 * поездов. Добавьте возможность вывода информации о поезде, номер которого введен пользователем.
 * Добавьте возможность сортировки массив по пункту назначения, причем поезда с одинаковыми пунктами назначения должны
 * быть упорядочены по времени отправления.
 */
public class Train {
    private final String nameOfDestination;
    private final String numberOfTrain;
    private final String timeOfDeparture;

    public Train(String nameOfDestination, String numberOfTrain, String timeOfDeparture) {
        this.nameOfDestination = nameOfDestination;
        this.numberOfTrain = numberOfTrain;
        this.timeOfDeparture = timeOfDeparture;
    }

    public String getNameOfDestination() {
        return nameOfDestination;
    }

    public String getNumberOfTrain() {
        return numberOfTrain;
    }

    public String getTimeOfDeparture() {
        return timeOfDeparture;
    }

    public int compareToNumberOfTrain(Train o) {
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

    public int compareToTimeOfDeparture(Train o) {
        int i = this.getNameOfDestination().compareTo(o.getNameOfDestination());
        if (i == 0) {
            return this.getTimeOfDeparture().compareTo(o.getTimeOfDeparture());
        } else {
            return i;
        }
    }
}