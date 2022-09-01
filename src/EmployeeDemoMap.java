import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class EmployeeDemoMap {

    public static void main(String[] args) {

        EmployeeDemoMap employeeDemoMap = new EmployeeDemoMap();

        Map<Integer, Employee> map = employeeDemoMap.addEmployee();
        employeeDemoMap.display(map);
        String department = "Account";
        System.out.println();
        employeeDemoMap.displayByDept(map, department);

    }

    public Map<Integer, Employee> addEmployee() {

        Map<Integer, Employee> map = new HashMap<>();

        map.put(1, new Employee("vaibhav", 12, "Teaching"));
        map.put(2, new Employee("Ramesh", 13, "Account"));
        map.put(35, new Employee("Suresh", 301, "Finance"));

        return map;
    }

    public void display(Map<Integer, Employee> employeeMap) {

        //return set of Map.Entry
        Set<Map.Entry<Integer, Employee>> entrySet = employeeMap.entrySet();
        for (Map.Entry<Integer, Employee> entry : entrySet) {
            System.out.println(entry.getValue());
        }
    }

    public void displayByDept(Map<Integer, Employee> employeeMap, String department) {

        Set<Map.Entry<Integer, Employee>> entrySet = employeeMap.entrySet();

        for (Map.Entry<Integer, Employee> entry : entrySet) {
            // entry -- a single entry from map
            //getValue -- value of entry(Employee object)
            if (entry.getValue().getDepartment().equals(department)) {
                System.out.println(entry.getValue());
            }
        }
    }


}
