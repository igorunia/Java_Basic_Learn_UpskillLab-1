package module4.TheSimplestClassesAndObjects.Task3;

/**
 * Создайте класс с именем Student, содержащий поля: фамилия и инициалы, номер группы, успеваемость
 * (массив из пяти элементов). Создайте массив из десяти элементов такого типа. Добавьте возможность вывода фамилий и
 * номеров групп студентов, имеющих оценки, равные только 9 или 10.
 */

public class Student {
    private final String nameStudents;
    private final int numberOfGroup;
    private final int[] ratingStudents;

    public Student(String nameStudents, int numberOfGroup, int[] ratingStudents) {
        this.nameStudents = nameStudents;
        this.numberOfGroup = numberOfGroup;
        this.ratingStudents = ratingStudents;
    }

    public String getNameStudents() {
        return nameStudents;
    }

    public int getNumberOfGroup() {
        return numberOfGroup;
    }

    public int[] getRatingStudents() {
        return ratingStudents;
    }

    public int getMinimalRating() {

        int minRating = Integer.MAX_VALUE;
        for (int rating : getRatingStudents()) {
            if (minRating > rating) {
                minRating = rating;
            }
        }
        return minRating;

    }
}



