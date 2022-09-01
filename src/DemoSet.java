import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class DemoSet {

    public static void main(String[] args) {

        Set<String> set = new HashSet<>();

        System.out.println("set.add(\"vaibhav\") = " + set.add("vaibhav"));
        System.out.println("set.add(\"ramesh\") = " + set.add("ramesh"));
        System.out.println("set.add(\"suresh\") = " + set.add("suresh"));
        System.out.println("set.add(\"vaibhav\") = " + set.add("vaibhav"));
        System.out.println("set.add(\"vaibhavi\") = " + set.add("vaibhavi"));

        System.out.println(set);

        Set<Integer> integerSet = new HashSet<>();

        integerSet.add(10);
        integerSet.add(5);
        integerSet.add(50);
        integerSet.add(45);

        System.out.println(integerSet);

        HashSet<Student> studentHashSet = new HashSet<Student>();

        System.out.println("studentHashSet.add(new Student(12)) = " + studentHashSet.add(new Student(12)));
        System.out.println("studentHashSet.add(new Student(51)) = " + studentHashSet.add(new Student(51)));

        Student s1 = new Student(48);

        System.out.println("studentHashSet.add(s1) = " + studentHashSet.add(s1));
        System.out.println("studentHashSet.add(new Student(51)) = " + studentHashSet.add(new Student(51)));

        System.out.println(studentHashSet);

        System.out.println("integerSet.contains(51) = " + integerSet.contains(51));
        System.out.println("set.contains(\"ramesh\") = " + set.contains("ramesh"));
        System.out.println("studentHashSet.contains(new Student(51)) = " + studentHashSet.contains(new Student(51)));

        Iterator<Integer> iterator = integerSet.iterator();
        while (iterator.hasNext()){
            int num = iterator.next();
            System.out.println(num);
        }
    }
}
