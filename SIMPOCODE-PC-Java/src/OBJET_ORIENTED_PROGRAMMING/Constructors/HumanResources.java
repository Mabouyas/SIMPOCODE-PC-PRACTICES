package OBJET_ORIENTED_PROGRAMMING.Constructors;
/*
    2. create a class called HumanResources
            declare 5 variables of Employee as static
            use static block to:
                        1. initialize those static variables
                        2. set all the info of the Employees
     */

public class HumanResources {
    static Employee empl1 = new Employee();
    static Employee empl2 = new Employee();
    static Employee empl3 = new Employee();
    static Employee empl4 = new Employee();
    static Employee empl5 = new Employee();

    static {
        empl1.setInfo("Zuleyha",1254,45874641,"QA",110000,'F');
        empl2.setInfo("Kyle", 1123, 112345678, "SDET", 110000, 'M');
        empl3.setInfo("Marina", 1124, 111234567, "Product Manager", 170000, 'F');
        empl4.setInfo("Adeline", 1125, 111123456, "Scrum Master", 80000, 'F');
        empl5.setInfo("Jazi", 1126, 111112345, "Business Analyst", 70000, 'F');
    }


}

