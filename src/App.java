public class App {
    public static void main(String[] args) {
        Employee[] employee = new Employee[10];
        employee[0] = new Employee("Вася Пупкин", 4, 66000);
        employee[1] = new Employee("Пися Камушкин", 3, 52000);
        employee[2] = new Employee("Чапаев Василий Иванович", 5, 66000);
        employee[5] = new Employee("Макс Отто фон Штирлиц", 1, 22000);
        employee[7] = new Employee("Максим Максимович Исаев", 1, 22000);
        employee[9] = new Employee("Александр Пистолетов", 2, 44444);

        printInfo(employee);
        System.out.println();
        System.out.println("Суммарная зарплата за месяц: " + calculateTotalSalary(employee));
        System.out.println();
        findMinSalary(employee);
        System.out.println();
        findMaxSalary(employee);
        System.out.println();
        System.out.println("Средняя зарплата: " + calculateAverageSalary(employee) + " рублей");
        System.out.println();
        printEmployeesNames(employee);

    }

    static void printInfo(Employee[] employees) {
        for (int i = 0; i < employees.length; i++){
            if (employees[i] != null) {
                System.out.println("ФИО: " + employees[i].getFullName() + "; Отдел: " + employees[i].getDepartment() +
                        "; id: " + employees[i].getId() + "; Зарплата: " + employees[i].getSalary());
            }

        }
    }

    static int calculateTotalSalary (Employee[] employees){
        int total = 0;
        for (int i = 0; i < employees.length; i++){
            if (employees[i] != null) {
                total+=employees[i].getSalary();
            }
        }
        return total;
    }

    static void findMinSalary (Employee[] employees){
        int min = 999999999;
        for (Employee e : employees) {
            if (e != null && e.getSalary() < min) {
                min = e.getSalary();
            }
        }
        System.out.println("Работники с минимальной зарплатой " + min + " рублей:");
        for (Employee e : employees){
            if (e != null && e.getSalary() == min){
                System.out.println(e.getFullName());
            }
        }
    }

    static void findMaxSalary (Employee[] employees){
        int max = 0;
        for (Employee e : employees) {
            if (e != null && e.getSalary() > max) {
                max = e.getSalary();
            }
        }
        System.out.println("Работники с максимальной зарплатой " + max + " рублей:");
        for (Employee e : employees){
            if (e != null && e.getSalary() == max){
                System.out.println(e.getFullName());
            }
        }
    }

    static int calculateAverageSalary (Employee[] employees){
        int numberEmployees = 0;
                for (Employee e : employees){
            if (e != null){
                numberEmployees++;
                }
        }
        return calculateTotalSalary(employees)/numberEmployees;

    }

    static void printEmployeesNames(Employee[] employees) {
        System.out.println("Имена сотрудников: ");
        for (Employee e : employees){
            if (e != null) {
                System.out.println(e.getFullName());
            }

        }
    }






}
