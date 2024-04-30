public class Employee {
    private String nameEmployee;
    private String surNameEmployee;
    private String lastNameEmployee;
    private int departmentEmployee;
    private float salaryEmployee;
    private int idEmployee;
    private static int idCounter = 0; // Счечик для выдачи id сотруднику

    public Employee(String surNameEmployee, String nameEmployee, String lastNameEmployee, int departmentEmployee, float salaryEmployee) {
        this.surNameEmployee = surNameEmployee;
        this.nameEmployee = nameEmployee;
        this.lastNameEmployee = lastNameEmployee;
        this.departmentEmployee = departmentEmployee;
        this.salaryEmployee = salaryEmployee;
        this.idEmployee = idCounter;
        idCounter++;
    }



}
