package utils;

import src.*;

public class ValidationUtil {
    
    public static boolean isAdmin(String role) {
        return role == "ADMIN"; 
    }

    public static boolean isValidEmail(String email) {
        return email.contains("@");
    }
}
