public class Employee {
    private String name;
    private double salary;

     Employee() {
        name="Ali AL_Saeedi ";
        salary=500;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    public double setPercentage(){
         salary +=salary*1;
         return salary;
    }
}

