import java.util.Objects;

public class Student2 {

    private int rollNo;
    private String name;
    private double cpi;

    public Student2(int rollNo, String name, double cpi) {
        this.rollNo = rollNo;
        this.name = name;
        this.cpi = cpi;
    }

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

    public double getCpi() {
        return cpi;
    }

    public void setCpi(double cpi) {
        this.cpi = cpi;
    }

    @Override
    public String toString() {
        return "Student2{" +
                "rollNo=" + rollNo +
                ", name='" + name + '\'' +
                ", cpi=" + cpi +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student2 student2 = (Student2) o;
        return rollNo == student2.rollNo && Double.compare(student2.cpi, cpi) == 0 && Objects.equals(name, student2.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rollNo, name, cpi);
    }
}

