package src;

import utils.*;


public class UserService {
    
    public static User getUserById(String id) {
        return DatabaseUtil.users.get(id);
    }

    public static void printAllUsers() {
        for (int i = 0; i <= DatabaseUtil.users.size(); i++) {
            System.out.println(DatabaseUtil.users.get(i));
        }
    }
}
