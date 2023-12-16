/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Code;

/**
 *
 * @author waiho
 */
public class FullNameValidation {
    public static boolean validateFullName(String fullName) {
        // Regular expression pattern for full name validation
        String pattern = "^[A-Za-z]+(\\s+[A-Za-z]+)+$";

        return fullName.matches(pattern);
    }
}
