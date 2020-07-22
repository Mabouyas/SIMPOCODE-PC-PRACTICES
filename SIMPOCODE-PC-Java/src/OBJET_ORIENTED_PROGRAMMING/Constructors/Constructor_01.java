package OBJET_ORIENTED_PROGRAMMING.Constructors;

public class Constructor_01
{
    //Instance variables
    int age;
    String name;

    //Default constructor
    Constructor_01() { this.age = 30;this.name = "SIMPOCODE"; }

    //Parameterized constructor
    Constructor_01(int age, String name) {this.age = age;this.name = name;}


    public static void main(String[] args) {
        //Creating objects
        Constructor_01 obj1 = new Constructor_01();
        Constructor_01 obj2 = new Constructor_01(26,"MJ");


        System.out.println(obj1.age +" "+ obj1.name);
        System.out.println(obj2.age +" "+ obj2.name);
            }
        }


