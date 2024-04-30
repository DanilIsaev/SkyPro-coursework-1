public class Main {
    // Заполнение списка сотрудников
    public static void fillingListEmployees(Employee[] Employee, String[] surnameEmployee, String[] nameEmployee, String[] lastnameEmployee, int[] departmentEmployee, float[] salaryEmployee) {
        for (int i = 0; i < Employee.length; i++) {
            Employee[i] = new Employee(surnameEmployee[i], nameEmployee[i], lastnameEmployee[i], departmentEmployee[i], salaryEmployee[i]);
        }
    }

    //Вывод списка сотрудников
    public static void displayingListEmployees(Employee[] Employee) {
        for (int i = 0; i < Employee.length; i++) {
            System.out.println(Employee[i].toString());
        }
    }

    //  Сумму затрат на ЗП в месяц
    public static float summMonthlyExpenses(Employee[] Employee) {
        float amountCosts = 0;
        for (int i = 0; i < Employee.length; i++) {
            amountCosts += Employee[i].getSalaryEmployee();
        }
        return amountCosts;
    }

    // Сотрудник с минимальной ЗП
    public static String minimumWageEmployee(Employee[] Employee) {
        String minimumWageEmployee_Name = null;
        float minimumWageEmployee_Salary = 1_000_000f;
        for (int i = 0; i < Employee.length; i++) {
            if (minimumWageEmployee_Salary > Employee[i].getSalaryEmployee()) {
                minimumWageEmployee_Salary = Employee[i].getSalaryEmployee();
                minimumWageEmployee_Name = Employee[i].toString();
            }
        }
        return minimumWageEmployee_Name;
    }

    // Сотрудник с максимальной ЗП
    public static String maximumWageEmployee(Employee[] Employee) {
        String maximumWageEmployee_Name = null;
        float maximumWageEmployee_Salary = 0f;
        for (int i = 0; i < Employee.length; i++) {
            if (maximumWageEmployee_Salary < Employee[i].getSalaryEmployee()) {
                maximumWageEmployee_Salary = Employee[i].getSalaryEmployee();
                maximumWageEmployee_Name = Employee[i].toString();
            }
        }
        return maximumWageEmployee_Name;
    }

    public static float averageSalaryEmployees(Employee[] Employee) {
        float averageSalaryEmployees;
        averageSalaryEmployees = summMonthlyExpenses(Employee) / Employee.length;
        return averageSalaryEmployees;
    }

    public static void main(String[] args) {
        String[] nameEmployee = {"Ульяна", "Михаил", "Платон", "Надежда", "Эмилия", "Георгий", "Дмитрий", "Александра", "Валерия", "Максим"};
        String[] surnameEmployee = {"Моисеева", "Белоусов", "Крылов", "Мартынова", "Наумова", "Наумов", "Сидоров", "Золотова", "Макарова", "Фомин"};
        String[] lastnameEmployee = {"Савельевна", "Максимович", "Григорьевич", "Львовна", "Дмитриевна", "Григорьевич", "Максимович", "Данииловна", "Богдановна", "Евгеньевич"};
        int[] departmentEmployee = {4, 4, 1, 1, 1, 5, 2, 1, 3, 3};
        float[] salaryEmployee = {81829f, 143553f, 81263f, 41372f, 83888f, 37498f, 146755f, 26775f, 115737f, 132367f};
        Employee[] employeeList = new Employee[10];

        fillingListEmployees(employeeList, surnameEmployee, nameEmployee, lastnameEmployee, departmentEmployee, salaryEmployee);
        displayingListEmployees(employeeList);
        System.out.println("Сумма затрат на ЗП за месяц: " + summMonthlyExpenses(employeeList));
        System.out.println("Сотрудник с минимальной ЗП: " + minimumWageEmployee(employeeList));
        System.out.println("Сотрудник с максимальной ЗП: " + maximumWageEmployee(employeeList));
        System.out.println("Среднее значение ЗП: " + averageSalaryEmployees(employeeList));

        for (int i = 0; i < employeeList.length; i++) {
            System.out.println(employeeList[i].getLastnameEmployee() + " " + employeeList[i].getNameEmployee() + " " + employeeList[i].getLastnameEmployee());
        }

    }
}