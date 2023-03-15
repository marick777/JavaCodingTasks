package week9;

import java.util.ArrayList;

public class RemoveAhmed {

    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();
        names.add("Ahmed");
        names.add("John");
        names.add("Eric");
        names.add("Ahmed");
        names.add("Jason");
        names.add("Bob");
        names.add("Ahmed");
        names.add("Caron");

        System.out.println("Old Names List = " + names);


        names.removeIf(name -> name.equalsIgnoreCase("Ahmed"));

        System.out.println("New Names List = " + names);

    }

}

