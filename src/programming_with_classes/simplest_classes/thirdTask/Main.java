package programming_with_classes.simplest_classes.thirdTask;

public class Main {

    private static Student[] getStudents() {
        return new Student[]{
                new Student("Rita Cooper", 28, new int[] {10, 9, 9, 10, 10}),
                new Student("Jorge Harper", 112, new int[]{8, 5, 10, 4, 6}),
                new Student("Richard Allen", 37, new int[]{10, 9, 9, 10, 8}),
                new Student("Robert Cross", 245, new int[]{10, 10, 9, 10, 9}),
                new Student("Henry Long", 358, new int[]{6, 7, 4, 5, 7}),
                new Student("Terry Alexander", 81, new int[]{10, 8, 10, 9, 10}),
                new Student("Maria Guzman", 41, new int[]{7, 8, 10, 8, 9}),
                new Student("Ruth Mills", 51, new int[]{10, 10, 9, 10, 9}),
                new Student("Betty Smith", 229, new int[]{10, 10, 10, 10, 10}),
                new Student("Mary Williams", 21, new int[]{8, 9, 10, 9, 8})
        };
    }

    public static void main(String[] args) {
        Student[] students = getStudents();
        for (Student student: students) {
            student.show();
        }
    }
}
