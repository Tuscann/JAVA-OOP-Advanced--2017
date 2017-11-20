package _01_Interfaces_EXEC._10_MooD_3;

import org.omg.CORBA.INTERNAL;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] inputArgs = scan.nextLine().split(" \\| ");
        String name = inputArgs[0];
        String characterType = inputArgs[1];
        Double specialPoints = Double.parseDouble(inputArgs[2]);
        int level = Integer.parseInt(inputArgs[3]);

        if (characterType.equals("Demon")) {
            GameObject newDemon = new Demon(name, specialPoints, level);

            System.out.println("\"" + newDemon.getName() + "\" | \"" + newDemon.generateHashPassword() + "\" -> " + characterType);
            System.out.println(specialPoints * level);
        } else if (characterType.equals("Archangel")) {
            GameObject newArchangel = new Archangel(name, specialPoints, level);

            System.out.println("\"" + newArchangel.getName() + "\" | \"" + newArchangel.generateHashPassword() + "\" -> " + characterType);
            System.out.println( Integer.parseInt(inputArgs[2]) * level);
        }


    }

}
