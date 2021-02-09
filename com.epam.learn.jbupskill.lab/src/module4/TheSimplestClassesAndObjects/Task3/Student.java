package module4.TheSimplestClassesAndObjects.Task3;

/**
 * Создайте класс с именем Student, содержащий поля: фамилия и инициалы, номер группы, успеваемость
 * (массив из пяти элементов). Создайте массив из десяти элементов такого типа. Добавьте возможность вывода фамилий и
 * номеров групп студентов, имеющих оценки, равные только 9 или 10.
 */

public class Student {
    public String nameStudents;
    public int numberOfGroup;
    public int[] ratingStudents;

    public Student(String nameStudents, int numberOfGroup, int[] ratingStudents) {
        this.nameStudents = nameStudents;
        this.numberOfGroup = numberOfGroup;
        this.ratingStudents = ratingStudents;
    }

    public int getMinimalRating() {

        int minRating = Integer.MAX_VALUE;
        for (int rating : ratingStudents) {
            if (minRating > rating) {
                minRating = rating;
            }
        }
        return minRating;

    }
}



