package OBJET_ORIENTED_PROGRAMMING.CustomClass_01;

public class Website {
    //Instance variables
    String WebName;
    int WebAge;

    //Constructor
    Website(String name, int age)
      {this.WebName = name;this.WebAge = age; }


    public static void main(String[] args) {
        //Creating objects referencing the class
        Website obj1 = new Website("Amazon",18);
        Website obj2 = new Website("google",6);

        //Accessing object data through reference
        System.out.println(obj1.WebName +" "+ obj1.WebAge);
        System.out.println(obj2.WebName +" "+ obj2.WebAge);

    }


}
