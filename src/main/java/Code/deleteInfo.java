/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Code;

import GUI.ManageApplication;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author waiho
 */
public class deleteInfo {
     public deleteInfo(String input) {
             boolean applicationFound = false;
             try {
                 List<String> updatedLines = new ArrayList<>(); // Store updated lines

                 try (BufferedReader reader = new BufferedReader(new FileReader("AvailableRoom.txt"))) {
                     String line;
                     while ((line = reader.readLine()) != null) {
                         String[] parts = line.split(">");
                         String rn = parts[0];

                         if (!input.equals(rn)) {
                             // Add the line to updatedLines if it doesn't match the input
                             updatedLines.add(line);
                         } else {
                             applicationFound = true;
                         }
                     }
                 }

                 if (!applicationFound) {
                     JOptionPane.showMessageDialog(null, "Room number not found.");
                 } else {
                     try (BufferedWriter writer = new BufferedWriter(new FileWriter("TempFile.txt"))) {
                         for (String updatedLine : updatedLines) {
                             writer.write(updatedLine);
                             writer.newLine();
                         }
                     } catch (IOException e) {
                         JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
                     }

                     // Close the input and output file streams
                    File originalFile = new File("AvailableRoom.txt");
                    originalFile.delete(); // Delete the original file

                    File tempFile = new File("TempFile.txt");
                    File renamedFile = new File("AvailableRoom.txt");

                    // Rename the temporary file
                    try {
                        Files.move(tempFile.toPath(), renamedFile.toPath());
                        JOptionPane.showMessageDialog(null, "Room deleted.");
                    } catch (IOException e) {
                        JOptionPane.showMessageDialog(null, "Error: Failed to update the file.");
                    }
                }
             } catch (IOException ex) {
                 Logger.getLogger(ManageApplication.class.getName()).log(Level.SEVERE, null, ex);
             }



                 }
    
}
