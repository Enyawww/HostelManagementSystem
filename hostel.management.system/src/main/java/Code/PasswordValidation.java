/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Code;

/**
 *
 * @author waiho
 */
public class PasswordValidation {
     public static boolean validatePassword(String password) {
        // Password requirements:
        // At least 8 characters long
        // Contains at least one uppercase letter
        // Contains at least one lowercase letter
        // Contains at least one digit
        // Contains at least one special character
        String pattern = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,}$";

        return password.matches(pattern);
    }
    
}
