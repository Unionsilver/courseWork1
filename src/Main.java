import java.util.Arrays;

public class Main {
    private static final Employee[] employee = new Employee[10];

    public static void main(String[] args) {

        System.out.println("___________________Курсовая___________________");


        Employee employee1 = new Employee("Одинцов Осип Евгеньевич", 1, 10000);
        Employee employee2 = new Employee("Денисов Артем Мэлсович", 2, 20000);
        Employee employee3 = new Employee("Большаков Герасим Гордеевич", 3, 30000);
        Employee employee4 = new Employee("Калинин Оскар Геннадьевич", 4, 40000);
        Employee employee5 = new Employee("Коновалов Виталий Лукьевич", 5, 50000);
        Employee employee6 = new Employee("Никитин Флор Георгьевич", 4, 60000);
        Employee employee7 = new Employee("Кабанов Александр Андреевич", 3, 70000);
        Employee employee8 = new Employee("Семёнов Григорий Филиппович", 2, 80000);
        Employee employee9 = new Employee("Егоров Аверкий Георгьевич", 1, 90000);
        Employee employee10 = new Employee("Филатов Исаак Германович", 1, 100000);

        employee[0] = employee1;
        employee[1] = employee2;
        employee[2] = employee3;
        employee[3] = employee4;
        employee[4] = employee5;
        employee[5] = employee6;
        employee[6] = employee7;
        employee[7] = employee8;
        employee[8] = employee9;
        employee[9] = employee10;
        allInfo();
        spendSalary();
        minSalary();
        fullName();


        System.out.println("___________________Билет № 5 задача___________________");


        getArray();
        evenNumbers();
        returnAList();

    }

    public static void allInfo() {
        for (int i = 0; i < employee.length; i++) {
            System.out.println(employee[i].toString());
        }
    }

    public static void spendSalary() {
        float num = 0.0f;
        float monthDays = 30.0f;
        float month = 0f;
        for (int i = 0; i < employee.length; i++) {
            num += employee[i].getSalary();
            month = num / monthDays;
        }
        System.out.println("Сумма завтрат в месяц - " + num);
        System.out.println("средняя значение зарплаты в месяц " + month);
    }

    public static void minSalary() {
        double min = Integer.MAX_VALUE;
        double max = Integer.MIN_VALUE;
        for (int i = 0; i < employee.length; i++) {
            if (employee[i].getSalary() < min) {
                min = employee[i].getSalary();
            } else if (employee[i].getSalary() > max) {
                max = employee[i].getSalary();
            }
        }
        System.out.println("Сотрудник с минимальной зарплатой " + min);
        System.out.println("Сотрудник с максимальной зарплатой " + max);
    }

    public static void fullName() {
        for (int i = 0; i < employee.length; i++) {
            System.out.println(employee[i].getFullName());
        }
    }







    public static void getArray() {
        int[] arr =  {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i = 0; i < arr.length; i++) {
            System.out.print(i + " ");
        }
        System.out.println("Первое задание!");

    }

    public static void evenNumbers() {
        int[] arr =  {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int num = 1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                arr[i] += num;
            }
            System.out.print(arr[i] + " ");
        }
        System.out.println("Второе задание!");

    }

    public static void returnAList() {
        int[] arr =  {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int j = 2; j < 6; j++) {
            System.out.print(j + " ");
        }
        System.out.println("Третье задание!");

    }
}



