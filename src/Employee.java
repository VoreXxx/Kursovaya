public class Employee {
    private static int Counter = 0;
    private final String surname;
    private final String name;
    private final String patronymic;
    public int department;
    public double salary;
    private final int id;
// Constructor
    public Employee(String surname, String name, String patronymic, int department, double salary) {
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.department = department;
        this.salary = salary;
        this.id = ++Counter;
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
    @Override
    public String toString() {
        return "ID: " + id + " Ф.И.О: " + surname + " " + name + " " + patronymic + " Отдел: " + department + " Зарплата: " + salary;
    }
}
