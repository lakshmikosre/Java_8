package java8_Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ClassRoom {

    public static void main(String[] args) {
        Student s1 = new Student(1, "Lakshmi");
        Student s2 = new Student(2, "Ankita");
        Student s3 = new Student(3, "Gayatri");

        List<Student> list = new ArrayList<>();
        list.add(s1);
        list.add(s2);
        list.add(s3);

        Collections.sort(list, (a, b) -> b.id - a.id);

        System.out.println("Your Identity  : -" + list);
    }

    static class Student {

        public int id;
        public String name;

        public Student(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public String toString() {
            return this.id + ":   " + this.name;
        }
    }
}
