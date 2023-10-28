public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[10];
        employees[0] = new Employee("Короткова", "Снежана", "Сергеевна", 1, 30000);
        employees[1] = new Employee("Даниленко", "Станислав", "Романович", 1, 55000);
        employees[2] = new Employee("Викулов", "Евгений", "Андреевич", 2, 40000);
        employees[3] = new Employee("Жусанова", "Асель", "Куанышевна", 2, 60000);
        employees[4] = new Employee("Савченко", "Андрей", "Дмитриевич", 5, 15000);
        employees[5] = new Employee("Жунусова", "Алия", "Олжабаевна", 4, 33500);
        employees[6] = new Employee("Сметанников", "Александр", "Владимирович", 3, 100000);
        employees[7] = new Employee("Валынкина", "Наталья", "Сергеевна", 3, 99999);
        employees[8] = new Employee("Косинова", "Ирина", "Леонидовна", 3, 20500);
        employees[9] = new Employee("Саргазина", "Сайран", "Салихановна", 4, 40000);
        //Список всех сотрудников со всеми имеющимися по ним данными
        printAllEmployees(employees);
        //Сумма затрат на зарплаты в месяц
        double totalExpenses = calculateTotalSalaryExpenses(employees);
        System.out.println("Сумма затрат на зарплаты в месяц: " + totalExpenses);
        //Находит сотрудника с минимальной зарплатой
        Employee minSalaryEmployee = findEmployeeWithMinSalary(employees);
        System.out.println("Сотрудник с минимальной зарплатой: " + minSalaryEmployee);
        //Находит сотрудника с максимальной зарплатой
        Employee maxSalaryEmployee = findEmployeeWithMaxSalary(employees);
        System.out.println("Сотрудник с максимальной зарплатой: " + maxSalaryEmployee);
        //Вычисляет среднее значение зарплат
        double averageSalary = calculateAverageSalary(employees);
        System.out.println("Средняя зарплата: " + averageSalary);
        //Выводит Ф.И.О. всех сотрудников
        printAllEmployeeNames(employees);
    }

    public static void printAllEmployees(Employee[] employees) {
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println(employee.toString());
            }
        }
    }

    public static double calculateTotalSalaryExpenses(Employee[] employees) {
        double totalExpenses = 0;

        for (Employee employee : employees) {
            if (employee != null) {
                totalExpenses += employee.getSalary();
            }
        }

        return totalExpenses;
    }

    public static Employee findEmployeeWithMinSalary(Employee[] employees) {
        Employee minSalaryEmployee = null;

        for (Employee employee : employees) {
            if (employee != null) {
                if (minSalaryEmployee == null || employee.getSalary() < minSalaryEmployee.getSalary()) {
                    minSalaryEmployee = employee;
                }
            }
        }

        return minSalaryEmployee;
    }

    public static Employee findEmployeeWithMaxSalary(Employee[] employees) {
        Employee maxSalaryEmployee = null;

        for (Employee employee : employees) {
            if (employee != null) {
                if (maxSalaryEmployee == null || employee.getSalary() > maxSalaryEmployee.getSalary()) {
                    maxSalaryEmployee = employee;
                }
            }
        }

        return maxSalaryEmployee;
    }

    public static double calculateAverageSalary(Employee[] employees) {
        double totalSalary = 0;
        int numEmployees = 0;

        for (Employee employee : employees) {
            if (employee != null) {
                totalSalary += employee.getSalary();
                numEmployees++;
            }
        }
        return totalSalary / numEmployees;
    }

    public static void printAllEmployeeNames(Employee[] employees) {
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println(employee.getSurname() + " " + employee.getName() + " " + employee.getPatronymic());
            }
        }
    }
}