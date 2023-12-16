/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Code;

import GUI.ManageApplication;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author waiho
 */
import java.util.*;

public class manageApplication {
    public manageApplication() {
        String[] options = {"Accept", "Decline"};
        String input = JOptionPane.showInputDialog(null, "Enter Application ID to approve or decline:");
        if (input == null) {
            // Close the dialog or handle the event appropriately
            return;
        }
        if (!input.matches("\\d{5}")) {
                JOptionPane.showMessageDialog(null, "Please insert a valid Application ID.");                
            } else if(input.matches("\\d{5}")){
                
                try {
                    List<String> lines = new ArrayList<>();
                    try (BufferedReader reader = new BufferedReader(new FileReader("Application.txt"))) {
                        String line;
                        while ((line = reader.readLine()) != null) {
                            lines.add(line);
                        }
                    }
                    List<String> lines1 = new ArrayList<>();
                    try (BufferedReader reader = new BufferedReader(new FileReader("Application.txt"))) {
                        String line;
                        while ((line = reader.readLine()) != null) {
                            lines1.add(line);
                        }
                    }

                    boolean applicationFound = false;

                    for (int i = 0; i < lines.size(); i++) {
                        String line = lines1.get(i);
                        String[] parts = line.split(">");
                        String AID = parts[0];
                        String SID = parts[1];
                        String FullName = parts[2];
                        String Gender = parts[3];
                        String RoomType = parts[4];
                        String ArrivalDate = parts[5];
                        String CODate = parts[6];                        
                        String Status = parts[7];
                        String payment = parts[8];
                        String price = parts[9];

                        if (AID.equals(input) && Status.equals("Pending")) {
                            lines.set(i, AID + ">" + SID + ">" + FullName + ">" + Gender + ">" + RoomType + ">" + ArrivalDate + ">" + CODate + ">" + "Approved" + ">" + payment + ">" + price );
                            applicationFound = true;
                            break;
                        }
                    }
                    for (int i = 0; i < lines1.size(); i++) {
                        String line = lines1.get(i);
                        String[] parts = line.split(">");
                        String AID = parts[0];
                        String SID = parts[1];
                        String FullName = parts[2];
                        String Gender = parts[3];
                        String RoomType = parts[4];
                        String ArrivalDate = parts[5];
                        String CODate = parts[6];                        
                        String Status = parts[7];
                        String payment = parts[8];
                        String price = parts[9];

                        if (AID.equals(input) && Status.equals("Pending")) {
                            lines1.set(i, AID + ">" + SID + ">" + FullName + ">" + Gender + ">" + RoomType + ">" + ArrivalDate + ">" + CODate + ">" + "Declined" + ">" + payment + ">" + price );
                            applicationFound = true;
                            break;
                        }
                    }

                    if (applicationFound==false) {
                        JOptionPane.showMessageDialog(null, "Pending application not found.");
                    } else {
                        int choice = JOptionPane.showOptionDialog(null, "Accept or Decline: ", "Manage", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, options, options[0]);
             if (choice == 0) {
                        try (PrintWriter writer = new PrintWriter(new FileWriter("Application.txt"))) {
                            for (String line : lines) {
                                writer.println(line);
                            }
                            JOptionPane.showMessageDialog(null, "Changes made.");
                        } catch (IOException e) {
                            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
                        }
                    }
             else if(choice == 1){
                 try (PrintWriter writer = new PrintWriter(new FileWriter("Application.txt"))) {
                            for (String line : lines1) {
                                writer.println(line);
                            }
                            JOptionPane.showMessageDialog(null, "Changes made.");
                        } catch (IOException e) {
                            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
                        }                 
             }
                    }
                } catch (IOException ex) {
                    Logger.getLogger(ManageApplication.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
    }
}

       
   

