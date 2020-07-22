package OBJET_ORIENTED_PROGRAMMING.Encapsulation;

class EmployeeCount {
    //Instance variable
    private int nbrEmployee = 0;

    //setter
    public void setNbrEmployee(int nbrEmployee) {
        this.nbrEmployee = nbrEmployee;
    }

    //getter
    public double getNbrEmployee() {
        return nbrEmployee;
    }
}

public class Encapsulation_01 {
    public static void main(String[] args) {
        EmployeeCount obj = new EmployeeCount();
        obj.setNbrEmployee(3004);
        System.out.println("No of Employees: "+(int)obj.getNbrEmployee());

    }
}
