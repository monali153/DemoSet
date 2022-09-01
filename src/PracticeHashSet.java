/*Create a Set of 5 Student objects, where Student is a user defined class.
        Student class contains three private fields int rollNo, String name, and double cpi.
        Student class must override String toString(), equals and hashCode method of Object class.
        Try to add duplicate objects, objects with same values.
        Kindly display the student set.
        And also delete the students whose name starts with "A" & "J".*/

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class PracticeHashSet {

    public static void main(String[] args) {

        PracticeHashSet practiceHashSet = new PracticeHashSet();

        Set<Student2> student2s = practiceHashSet.createSet();
        practiceHashSet.display(student2s);

        boolean result = practiceHashSet.remove(student2s);
        if (result) {
            System.out.println("Student Name start with A & J is deleted");
        } else {
            System.out.println("Student Name start with A not found");
        }

        practiceHashSet.display(student2s);


    }

    public Set<Student2> createSet() {
        Set<Student2> student2s = new HashSet<>();

        student2s.add(new Student2(12, "Vaibhav", 100));
        student2s.add(new Student2(20, "Ramesh", 80));
        student2s.add(new Student2(25, "Suresh", 70));
        student2s.add(new Student2(16, "Amit", 60));

        return student2s;

    }

    public void display(Set<Student2> student2s) {
        Iterator<Student2> iterator = student2s.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    public boolean remove(Set<Student2> student2s) {

        boolean response = false;
        Iterator<Student2> iterator = student2s.iterator();

        while (iterator.hasNext()) {
            Student2 temp = iterator.next();
            if (temp.getName().charAt(0) == 'A' || temp.getName().charAt(0) == 'J') {
                iterator.remove();
                response = true;
            }
        }

        return response;
    }
}
