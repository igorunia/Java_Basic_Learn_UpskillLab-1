package module4.TheSimplestClassesAndObjects;

/**
 * Создайте класс с именем Student, содержащий поля: фамилия и инициалы, номер группы, успеваемость
 * (массив из пяти элементов). Создайте массив из десяти элементов такого типа. Добавьте возможность вывода фамилий и
 * номеров групп студентов, имеющих оценки, равные только 9 или 10.
 */

public class Task3 {

    String nameStudents;
    int numberOfGroup;
    int[] ratingStudents;

    private Task3(String nameStudents, int numberOfGroup, int[] ratingStudents) {
        this.nameStudents = nameStudents;
        this.numberOfGroup = numberOfGroup;
        this.ratingStudents = ratingStudents;
    }

    public static void printExcellentStudent(Task3[] students) {
        for (Task3 student : students) {
            int minRating = 10;
            for (int rating : student.ratingStudents) {
                if (rating < minRating) {
                    minRating = rating;
                }
            }
            if (minRating >= 9) {
                System.out.print("Excellent student: " + student.nameStudents + student.numberOfGroup);
            }
        }
    }

    public static void main(String[] args) {
        Task3[] students = new Task3[10];

        students[0] = new Task3("Igor I.A.", 25, new int[]{7, 6, 5, 7, 9});
        students[1] = new Task3("Ivan I.I.", 20, new int[]{9, 8, 9, 10, 9});
        students[2] = new Task3("Boris M.V.", 15, new int[]{4, 3, 7, 10, 6});
        students[3] = new Task3("Rak A.S.", 45, new int[]{10, 1, 10, 1, 10});
        students[4] = new Task3("Kal E.A.", 20, new int[]{7, 6, 3, 7, 9});
        students[5] = new Task3("Per Y.A.", 25, new int[]{9, 9, 1, 10, 9});
        students[6] = new Task3("Dol I.V.", 25, new int[]{9, 9, 1, 10, 9});
        students[7] = new Task3("Taj M.M.", 15, new int[]{3, 6, 1, 7, 4});
        students[8] = new Task3("Toma D.A.", 15, new int[]{7, 9, 1, 7, 9});
        students[9] = new Task3("Maska I.P.", 15, new int[]{10, 9, 9, 10, 9});

        printExcellentStudent(students);

    }
}
