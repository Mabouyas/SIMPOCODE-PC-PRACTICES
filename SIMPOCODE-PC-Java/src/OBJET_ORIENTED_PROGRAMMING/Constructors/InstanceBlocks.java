package OBJET_ORIENTED_PROGRAMMING.Constructors;
/*
Instance initialization block of a class is associated with its instance/object creation
and it is automatically called when you call the constructor of its class for creating an object.

 */

public class InstanceBlocks {

   /*  int a;

    {
         a = 10;
        System.out.println("Instance Blocks");
        System.out.println("An object is created");
    }

    public static void main(String[] args) {

        InstanceBlocks inst1 = new InstanceBlocks();
        System.out.println(inst1.a);

    }

    */
   static int a;  //1 copy
    int b; // 2, each object has its own copy of instance variable

    static String name = "John";
    String id = "123";

    public static void main(String[] args) {
        InstanceBlocks obj1 = new InstanceBlocks();
        a = 20;
        obj1.b = 10;

        InstanceBlocks obj2 = new InstanceBlocks();
        a = 30;
        obj2.b = 40;

        System.out.println(a);  // 30
        System.out.println( a );  // 30

        System.out.println(obj1.b); // 10
        System.out.println( obj2.b ); // 40

        System.out.println("==========================================");

        System.out.println(name);
        // System.out.println( id );  // static only accept static,

    }


}
