package module4.TheSimplestClassesAndObjects.Task3;

public class Runner {
    public static void main(String[] args) {
       Student[] students = new Student[10];

        students[0] = new Student("Igor I.A.", 25, new int[]{7, 6, 5, 7, 9});
        students[1] = new Student("Ivan I.I.", 20, new int[]{9, 8, 9, 10, 9});
        students[2] = new Student("Boris M.V.", 15, new int[]{4, 3, 7, 10, 6});
        students[3] = new Student("Rak A.S.", 45, new int[]{10, 1, 10, 1, 10});
        students[4] = new Student("Kal E.A.", 20, new int[]{7, 6, 3, 7, 9});
        students[5] = new Student("Per Y.A.", 25, new int[]{9, 9, 1, 10, 9});
        students[6] = new Student("Dol I.V.", 25, new int[]{9, 9, 1, 10, 9});
        students[7] = new Student("Taj M.M.", 15, new int[]{3, 6, 1, 7, 4});
        students[8] = new Student("Toma D.A.", 15, new int[]{7, 9, 1, 7, 9});
        students[9] = new Student("Maska I.P.", 15, new int[]{10, 9, 9, 10, 9});

        printExcellentStudent(students);

    }
    public static void printExcellentStudent(Student[] students){
        for(Student student : students){
            if(student.getMinimalRating() >= 9){
                System.out.println("Excellent student: " + student.nameStudents + student.numberOfGroup);
            }

        }
    }
}
