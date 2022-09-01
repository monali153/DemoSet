import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetDemo {

    public static void main(String[] args) {

        HashSetDemo hashSetDemo = new HashSetDemo();

        Set<Student1> student1s = hashSetDemo.createSet();
        hashSetDemo.display(student1s);
        boolean result = hashSetDemo.removeByRollNo(student1s, 12);
        if(result) {
            System.out.println("Student Deleted");
        }else {
            System.out.println("Student not found");
        }

        hashSetDemo.display(student1s);


    }

    public Set<Student1> createSet(){
        Set<Student1> student1s = new HashSet<>();

        student1s.add(new Student1(12,"Vaibhav",100));
        student1s.add(new Student1(20,"Ramesh",80));
        student1s.add(new Student1(25, "Suresh", 70));

        return student1s;
    }

    public void display(Set<Student1> student1Set){
        Iterator<Student1> iterator = student1Set.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

    public boolean removeByRollNo(Set<Student1> student1s, int rollNo){
        boolean response = false;
        Iterator<Student1> iterator = student1s.iterator();
        while (iterator.hasNext()){
            if(iterator.next().getRollNo() == rollNo){
                iterator.remove();
                response = true;
                break;
            }
        }
        return response;
    }

}
