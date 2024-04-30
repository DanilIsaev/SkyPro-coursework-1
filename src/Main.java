public class Main {
    // Заполнение списка сотрудников
    public static void fillingListEmployees(Employee[] Employee, String[] surnameEmployee, String[] nameEmployee, String[] lastnameEmployee, int[] departmentEmployee, float[] salaryEmployee) {
        for (int i = 0; i < Employee.length; i++) {
            Employee[i] = new Employee(surnameEmployee[i], nameEmployee[i], lastnameEmployee[i], departmentEmployee[i], salaryEmployee[i]);
        }
    }
    public static void displayingListEmployees(Employee[] Employee) {
        for (int i = 0; i < Employee.length; i++) {
            System.out.println(Employee[i].toString());
        }
    }
    public static void main(String[] args) {
        String[] nameEmployee = {"Ульяна", "Михаил", "Платон", "Надежда", "Эмилия", "Георгий", "Дмитрий", "Александра", "Валерия", "Максим"};
        String[] surnameEmployee = {"Моисеева", "Белоусов", "Крылов", "Мартынова", "Наумова", "Наумов", "Сидоров", "Золотова", "Макарова", "Фомин"};
        String[] lastnameEmployee = {"Савельевна", "Максимович", "Григорьевич", "Львовна", "Дмитриевна", "Григорьевич", "Максимович", "Данииловна", "Богдановна", "Евгеньевич"};
        int[] departmentEmployee = {4, 4, 1, 1, 1, 5, 2, 1, 3, 3};
        float[] salaryEmployee = {81829f, 143553f, 81263f, 41372f, 83888f, 37498f, 146755f, 26775f, 115737f, 132367f};
        Employee[] Employee = new Employee[10];

        fillingListEmployees(Employee, surnameEmployee, nameEmployee, lastnameEmployee, departmentEmployee, salaryEmployee);
        displayingListEmployees(Employee);
    }
}