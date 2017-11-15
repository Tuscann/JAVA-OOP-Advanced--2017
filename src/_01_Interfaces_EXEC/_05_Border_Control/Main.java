package _01_Interfaces_EXEC._05_Border_Control;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Identificatable> citizens = new ArrayList<>();
        Scanner scan = new Scanner(System.in);

        while (true) {
            String[] currentArgs = scan.nextLine().split("\\s+");

            if ("End".equals(currentArgs[0])) {
                break;
            } else if (currentArgs.length == 2) {
                Citizen citizen = new Citizen(currentArgs[0], currentArgs[1]);
                citizens.add(citizen);
            } else if (currentArgs.length == 3) {
                Robot robot = new Robot(currentArgs[0], currentArgs[1], currentArgs[2]);
                citizens.add(robot);
            }
        }
        String lastDigitsOfId = scan.nextLine();
        for (Identificatable citizen : citizens) {
            if (citizen.getID().endsWith(lastDigitsOfId)) {
                System.out.println(citizen.getID());
            }
        }

    }
}
