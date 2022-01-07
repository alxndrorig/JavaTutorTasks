package programming_with_classes.simplest_classes.thirdTask;

import java.util.Arrays;

/**
 * Создайте класс с именем Student, содержащий поля: фамилия и инициалы, номер группы, успеваемость (массив
 * из пяти элементов). Создайте массив из десяти элементов такого типа. Добавьте возможность вывода фамилий и
 * номеров групп студентов, имеющих оценки, равные только 9 или 10.
 */

public class Student {
    private String fullName;
    private int group;
    private int[] marks;

    public Student(String fullName, int group, int[] marks) {
        this.fullName = fullName;
        this.group = group;
        this.marks = marks;
    }

    private static boolean isExcellentStudent(Student student) {
        int[] marks = student.marks;
        Arrays.sort(marks);
        return marks[0] > 8;
    }

    public void show() {
        if (isExcellentStudent(this)) System.out.printf("---\nName: %s\nGroup: %d\n---\n", this.fullName, this.group);
    }
}
