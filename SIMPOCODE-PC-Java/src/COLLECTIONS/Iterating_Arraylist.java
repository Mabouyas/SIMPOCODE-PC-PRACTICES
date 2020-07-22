package COLLECTIONS;

import java.util.ArrayList;

public class Iterating_Arraylist {
    public static void main(String[] args) {
        ArrayList<String> aList = new ArrayList<String>();
        aList.add("Jean Chauvet");
        aList.add("Marie Andree");
        aList.add("Dhalia Chauvet");
        aList.add("Joel Ludeck");
        aList.add("Marie Michelle");

        //Iterating Arraylist
        for (String str : aList)
            System.out.println(str);


    }
}
