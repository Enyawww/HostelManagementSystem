/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Code;

/**
 *
 * @author waiho
 */
public class UsernameValidation {
    public static boolean validateUsername(String username) {
        // Regular expression pattern for username validation
        String pattern = "^[a-zA-Z0-9_]+$";

        return username.matches(pattern);
    }
    
}
