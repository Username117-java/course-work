public class Employee {
    private static int idCount = 0;
    private String fullName;
    private int department;
    private int salary;
    private int id;

    public Employee(String fullName, int department, int salary){
        if (department >5 || department < 1){
            throw new IllegalArgumentException("Несуществующий отдел");
        }
        if (salary<0){
            throw new IllegalArgumentException("Зарплата не может быть отрицательной");
        }
        idCount++;
        this.id = idCount;
        this.fullName = fullName;
        this.department = department;
        this.salary = salary;

    }

    public String getFullName(){
        return fullName;
    }

    public int getDepartment() {
        return department;
    }

    public int getSalary() {
        return salary;
    }

    public int getId() {
        return id;
    }

    public void setFullName(String fullName){
        this.fullName = fullName;
    }

    public void setDepartment (int department){
        if (department >5 || department < 1){
            throw new IllegalArgumentException("Несуществующий отдел");
        }
        this.department = department;
    }

    public void setSalary (int salary){
        if (salary<0){
            throw new IllegalArgumentException("Зарплата не может быть отрицательной");
        }
        this.salary = salary;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (this.getClass() != other.getClass()) {
            return false;
        }
        return (this.fullName.equals(((Employee) other).fullName) && this.department == ((Employee) other).department
                && this.id == ((Employee) other).id && this.salary == ((Employee) other).salary);
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(fullName,department,salary,id);
    }



}
