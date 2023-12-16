/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Code;

/**
 *
 * @author waiho
 */
public class DateValidator {
    public static boolean validateDate(int day, int month, int year) {
        // Check if the year is valid
        if (year < 0) {
            return false;
        }
        
        // Check if the month is valid
        if (month < 1 || month > 12) {
            return false;
        }
        
        // Check if the day is valid
        int maxDay = getMaxDayOfMonth(month, year);
        if (day < 1 || day > maxDay) {
            return false;
        }
        
        // Date is valid
        return true;
    }
    
    private static int getMaxDayOfMonth(int month, int year) {
        if(month == 2) {
            if (isLeapYear(year)) {
                return 29;
            } else {
                return 28;
            }
        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
            return 30;
        } else {
            return 31;
        }
    }
    
    private static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

}


