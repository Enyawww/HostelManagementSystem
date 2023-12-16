/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Code;

import java.util.regex.Pattern;

/**
 *
 * @author waiho
 */
public class StudentIDValidation {
    private static final String STUDENT_ID_PATTERN = "tp\\d{6}";

    public static boolean isValidStudentId(String studentId) {
        return Pattern.matches(STUDENT_ID_PATTERN, studentId);
    }
    
}
