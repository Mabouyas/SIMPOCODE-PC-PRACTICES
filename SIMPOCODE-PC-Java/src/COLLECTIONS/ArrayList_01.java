package COLLECTIONS;

import java.util.ArrayList;

public class ArrayList_01 {
    public static void main(String[] args) {
        ArrayList<String> nameList = new ArrayList<String>();
        nameList.add("Jean");
        nameList.add("Marie");
        nameList.add("Dhalia");
        nameList.add("Joel");
        nameList.add("Marie Michelle");

        //Displaying elements
        System.out.println("nameList is = " + nameList);

        //Adding "Steve" at the fourth position
        nameList.add(3,"Steve");
        System.out.println("nameList is = " + nameList);
        
        //Changing an element position
        nameList.set(3,"jean");
        System.out.println("nameList = " + nameList);

        //Remove an element
        nameList.remove("Jean");
        nameList.remove(3);
        System.out.println(nameList);

    }
}
