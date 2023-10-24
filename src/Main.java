public class Main {
    public static void main(String[] args) {
        Employee[] arr = new Employee[10];
        arr[0] = new Employee("Короткова", "Снежана", "Сергеевна", 1, 30000);
        arr[1] = new Employee("Даниленко", "Станислав", "Романович", 1, 55000);
        arr[2] = new Employee("Викулов", "Евгений", "Андреевич", 2, 40000);
        arr[3] = new Employee("Жусанова", "Асель", "Куанышевна", 2, 60000);
        arr[4] = new Employee("Савченко", "Андрей", "Дмитриевич", 5, 15000);
        arr[5] = new Employee("Жунусова", "Алия", "Олжабаевна", 4, 33500);
        arr[6] = new Employee("Сметанников", "Александр", "Владимирович", 3, 100000);
        arr[7] = new Employee("Валынкина", "Наталья", "Сергеевна", 3, 99999);
        arr[8] = new Employee("Косинова", "Ирина", "Леонидовна", 3, 20500);
        arr[9] = new Employee("Саргазина", "Сайран", "Салихановна", 4, 40000);
        for (int i = 0; i < 10; i++) {
            System.out.println(arr[i]);
        }

    }
    public static void calculateSum(int[] Employee) {
        int sum = 0;
        for (int i : Employee) {
            sum += i;
        }
        System.out.println("Сумма затрат на зарплаты: " + sum);
    }
}