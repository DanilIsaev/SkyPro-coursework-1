public class Employee {
    private String nameEmployee;
    private String surnameEmployee;
    private String lastnameEmployee;
    private int departmentEmployee;
    private float salaryEmployee;
    private final int idEmployee;
    private static int idCounter = 0; // Счечик для выдачи id сотруднику

    public Employee(String surnameEmployee, String nameEmployee, String lastnameEmployee, int departmentEmployee, float salaryEmployee) {
        this.surnameEmployee = surnameEmployee;
        this.nameEmployee = nameEmployee;
        this.lastnameEmployee = lastnameEmployee;
        if (departmentEmployee < 0 || departmentEmployee > 6) {
            throw new IllegalArgumentException("Данного отдела не существует");
        }
        this.departmentEmployee = departmentEmployee;
        if (salaryEmployee < 0) {
            throw new IllegalArgumentException("Зарплата не может быть отрицательной");
        }
        this.salaryEmployee = salaryEmployee;
        this.idEmployee = idCounter;
        idCounter++;
    }

    public String getNameEmployee() {
        return this.nameEmployee;
    }

    public String getSurnameEmployee() {
        return this.surnameEmployee;
    }

    public String getLastnameEmployee() {
        return this.lastnameEmployee;
    }

    public int getDepartmentEmployee() {
        return this.departmentEmployee;
    }

    public float getSalaryEmployee() {
        return this.salaryEmployee;
    }

    public int getIdEmployee() {
        return this.idEmployee;
    }

    public void setSalaryEmployee(float newSalaryEmployee) {
        if (newSalaryEmployee < 0) {
            throw new IllegalArgumentException("Зарплата не может быть отрицательной");
        }
        this.salaryEmployee = newSalaryEmployee;
    }

    public void setDepartmentEmployee(int newDepartmentEmployee) {
        if (newDepartmentEmployee < 0 || newDepartmentEmployee > 6) {
            throw new IllegalArgumentException("Данного отдела не существует");
        }
        this.departmentEmployee = newDepartmentEmployee;
    }


    public boolean equals(Object other) {
        if (this.getClass() != other.getClass()) {
            return false;
        }
        Employee comparisonEmployee = (Employee) other;
        return idEmployee == comparisonEmployee.idEmployee; // return [свойство с типом строки].equals(comparisonEmployee.[свойство с типом строки или get]);
    }

    public int hashCode() {
        return java.util.Objects.hash(idEmployee);
    }

    @Override
    public String toString() {
        return idEmployee + " " + surnameEmployee + " " + nameEmployee + " " + lastnameEmployee + " " + departmentEmployee + " " + salaryEmployee;
    }
}
