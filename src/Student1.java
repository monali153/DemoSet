import java.util.Objects;

public class Student1 {

    private int rollNo;
    private String name;
    private double totalMarks;


    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getTotalMarks() {
        return totalMarks;
    }

    public void setTotalMarks(double totalMarks) {
        this.totalMarks = totalMarks;
    }

    public Student1(int rollNo, String name, double totalMarks) {
        this.rollNo = rollNo;
        this.name = name;
        this.totalMarks = totalMarks;
    }

    public Student1(){

    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNo=" + rollNo +
                ", name='" + name + '\'' +
                ", totalMarks=" + totalMarks +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student1 student = (Student1) o;
        return rollNo == student.rollNo && Double.compare(student.totalMarks, totalMarks) == 0 && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rollNo, name, totalMarks);
    }
}
