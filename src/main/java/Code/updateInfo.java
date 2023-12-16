/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Code;

import GUI.ManageApplication;


import java.io.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

/**
 *
 * @author waiho
 */
public class updateInfo {
public void updateInfo1(String sroomno,String rnum, String rtype, String g, String S, String O) {
    boolean applicationFound = false;
    try {
        List<String> updatedLines = new ArrayList<>(); // Store updated lines

        try (BufferedReader reader = new BufferedReader(new FileReader("AvailableRoom.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(">");
                String rn = parts[0];

                if (!sroomno.equals(rn)) {
                    // Add the line to updatedLines if it doesn't match the input
                    updatedLines.add(line);
                } else {
                    // Create a new line with the updated information and add it to updatedLines
                    String updatedLine = rnum + ">" + rtype + ">" + g + ">" + S + ">" + O;
                    updatedLines.add(updatedLine);
                    applicationFound = true;
                }
            }
        

        if (applicationFound != true) {
            
        } else {
            try (BufferedWriter writer = new BufferedWriter(new FileWriter("AvailableRoom.txt"))) {
                for (String updatedLine : updatedLines) {
                    writer.write(updatedLine);
                    writer.newLine();
                }
            } catch (IOException e) {
                JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
            }

            JOptionPane.showMessageDialog(null, "Room updated.");
        }
        }
    } catch (IOException ex) {
        Logger.getLogger(ManageApplication.class.getName()).log(Level.SEVERE, null, ex);
    }
}

    
}
