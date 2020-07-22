package OBJET_ORIENTED_PROGRAMMING.Constructors;

public class Students {
    String schoolName = "Cybertek";
    String studentName;
    int groupNumber;
    String batch;

    //Constructor
    public Students(String schoolName, String studentName, int groupNumber, String batch) {
        this.schoolName = schoolName;
        this.studentName = studentName;
        this.groupNumber = groupNumber;
        this.batch = batch;
    }

    public String printData() {
        return schoolName+studentName+groupNumber+batch;
    }

}
