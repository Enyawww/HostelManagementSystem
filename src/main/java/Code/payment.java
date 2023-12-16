/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Code;

import GUI.Payment;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author waiho
 */
public class payment {
    public payment(int choice) {
        String[] options = {"Pay", "back"};
        String input = JOptionPane.showInputDialog(null, "Enter Application ID to pay");
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
                            applicationFound = true;
                            break;
                        }
                    }
                    
                    if (applicationFound==false) {
                        JOptionPane.showMessageDialog(null, "Pending payment not found.");
                    } else {
                        choice = JOptionPane.showOptionDialog(null, "Pay or Cancel : ", "Manage", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, options, options[0]);
                                     
                    }
                } catch (IOException ex) {
                    Logger.getLogger(payment.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
    }
}
