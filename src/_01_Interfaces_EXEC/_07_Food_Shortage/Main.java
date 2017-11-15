package _01_Interfaces_EXEC._07_Food_Shortage;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Map<String, Buyer> buers = new HashMap<>();

        Integer n = Integer.parseInt(scan.nextLine());

        for (int i = 0; i < n; i++) {
            String[] current = scan.nextLine().split("\\s+");

            if (current.length == 4) {
                Citizen citizen = new Citizen(current[0], Integer.parseInt(current[1]), current[2], current[3]);
                buers.put(current[0], citizen);
            }
            if (current.length == 3) {
                Rebel rebel = new Rebel(current[0], Integer.parseInt(current[1]), current[2]);
                buers.put(current[0], rebel);
            }
        }
        int total = 0;

        while (true) {
            String currentName = scan.nextLine();
            if ("End".equals(currentName)) {
                break;
            }
            if (buers.containsKey(currentName)) {
                buers.get(currentName).buyFood();
            }
        }
        System.out.println(buers.values().stream().mapToInt(Buyer::getFood).sum());
    }
}
