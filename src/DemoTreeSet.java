import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class DemoTreeSet {
    public static void main(String[] args) {

        TreeSet<Integer> integerSet = new TreeSet<>();

        integerSet.add(900);
        integerSet.add(500);
        integerSet.add(1500);

        System.out.println(integerSet);

        System.out.println("integerSet.first() = " + integerSet.first());
        System.out.println("integerSet.last() = " + integerSet.last());

        System.out.println("integerSet.pollFirst() = " + integerSet.pollFirst());
        System.out.println("integerSet.pollLast() = " + integerSet.pollLast());
        System.out.println(integerSet);
    }
}
