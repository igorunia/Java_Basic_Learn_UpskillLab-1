package module4.TheSimplestClassesAndObjects.Task3;

/**
 * Создайте класс с именем Student, содержащий поля: фамилия и инициалы, номер группы, успеваемость
 * (массив из пяти элементов). Создайте массив из десяти элементов такого типа. Добавьте возможность вывода фамилий и
 * номеров групп студентов, имеющих оценки, равные только 9 или 10.
 */

public class Student {
    private final String name;
    private final int numberOfGroup;
    private final int[] rating;

    public Student(String name, int numberOfGroup, int[] rating) {
        this.name = name;
        this.numberOfGroup = numberOfGroup;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public int getNumberOfGroup() {
        return numberOfGroup;
    }

    public int[] getRating() {
        return rating;
    }

    public int getMinimalRating() {

        int minRating = Integer.MAX_VALUE;
        for (int rating : this.rating) {
            if (minRating > rating) {
                minRating = rating;
            }
        }
        return minRating;

    }
}



