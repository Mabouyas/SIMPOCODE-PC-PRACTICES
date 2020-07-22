package OBJET_ORIENTED_PROGRAMMING.Constructors;

/*
     1. Create a class called Employee
            instance variables:
                    name, id, ssn, jobTitle, salary, gender
            actions:
                    setEmployeeInfo(): can initialize all the instance variables
                    toString(): can return the info of the employee as string
     */

public class Employee {
    String name,jobTitle;
    long id;
    long ssn;
    char gender;
    double salary;

    public void setInfo(String name, long id, long ssn, String jobTitle, double salary,char gender) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.id = id;
        this.ssn = ssn;
        this.gender = gender;
        this.salary = salary;
    }

    public String printData() {
        return "Name: " +name+"Id: "+id+"Ssn: "+ssn+"Job Title: "+jobTitle+"Gender: "+gender+"Salary: "+salary;
    }
}
