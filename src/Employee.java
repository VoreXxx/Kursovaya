import java.util.concurrent.atomic.AtomicInteger;

public class Employee {
    private final String surname;
    private final String name;
    private final String patronymic;
    public int department;
    public double salary;
    private static int Counter;
    private final int id;
//    public static int id;
//    private static final AtomicInteger COUNTER = new AtomicInteger(1);
//    public void Counted() {
//        id = COUNTER.getAndIncrement();
//    }
// Constructor
    public Employee(String surname, String name, String patronymic, int department, int salary) {
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.department = department;
        this.salary = salary;
        id = ++Counter;
    }
// Getter's
    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public int getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }
    public int getId() {
        return id;
    }
// Setter's
    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
//    public static void arrAllEmployee(Employee[] arr) {
//        for (int i = 0; i < 10; i++) {
//            System.out.println(arr[i]);
//        }
//   }
    @Override
    public String toString() {
        return "ID: " + id + " Ф.И.О: " + surname + " " + name + " " + patronymic + " Отдел: " + department + " Зарплата: " + salary;
    }
}
