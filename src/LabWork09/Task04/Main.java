package LabWork09.Task04;

import java.util.*;


public class Main {


    private static void generateData(Map<User, Integer> out, int numUsers) {
        Random random = new Random();
        for (int i = 1; i <= numUsers; i++) {
            User currUser = new User();
            currUser.setName("name_" + i);
            int count = random.nextInt(1000);
            out.put(currUser, count);
        }
    }

    private static Integer getUserScores(Map<User, Integer> users, String name_in) {
        for (User user : users.keySet()) {
            if (user.getName().equals(name_in)) {
                return users.get(user);
            }
        }
        return null;
    }

    public static void main(String[] args) {

        Map<User, Integer> users = new HashMap<>();

        generateData(users, 17);

        //Iterator<User> iterator = users.keySet().iterator();
        //User uUser = null;
        //for (int i = 0; i < 17; i++) {
        //    if (iterator.hasNext()) {
        //        uUser = iterator.next();
        //        System.out.print(uUser.getName()+"\n");
        //    }
        //}

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your username: ");

        String sCurName = scanner.nextLine();
        Integer iCurScore = getUserScores(users, sCurName);

        if (iCurScore != null) {
            System.out.println("Uaer with name: " + sCurName + " have " + iCurScore + " scores.");
        } else {
            System.out.println("User with name \"" + sCurName + "\" not found.");
        }
    }
}
