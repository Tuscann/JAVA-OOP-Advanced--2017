package _01_Interfaces_EXEC._06_Birthday_Celebrations;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Identificatable> citizens = new ArrayList<>();

        while (true) {
            String[] currentArgs = scan.nextLine().split("\\s+");
            if ("End".equals(currentArgs[0])) {
                break;
            } else if (currentArgs[0].equals("Pet")) {
                Pet pet = new Pet(currentArgs[1], currentArgs[2]);
                citizens.add(pet);
            } else if (currentArgs[0].equals("Citizen")) {
                Citizen citizen = new Citizen(currentArgs[1], currentArgs[2], currentArgs[3], currentArgs[4]);
                citizens.add(citizen);
            }
        }
        String SearchedYear = scan.nextLine();
        for (Identificatable citizen : citizens) {
            if (citizen.getBirthDate().endsWith(SearchedYear)) {
                System.out.println(citizen.getBirthDate());
            }
        }
    }
}
