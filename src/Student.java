import java.util.Objects;

public class Student {

    private int rollNo;


    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }



    public Student(int rollNo){
        this.rollNo = rollNo;
    }

    public Student(){

    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNo=" + rollNo +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return rollNo == student.rollNo;
    }

    @Override
    public int hashCode() {
        return Objects.hash(rollNo);
    }
}
