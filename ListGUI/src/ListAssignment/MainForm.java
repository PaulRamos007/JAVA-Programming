/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ListAssignment;

import cputils.FileUtils;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Collection;
import java.util.Set;

/**
 *
 * @author paula
 */
public class MainForm extends javax.swing.JFrame {

    /**
     * Creates new form MainForm
     */
    public MainForm() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblFile = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtFileName = new javax.swing.JTextPane();
        btnLoad = new javax.swing.JButton();
        btnRemove = new javax.swing.JButton();
        chkFaculty = new javax.swing.JCheckBox();
        chkGpa = new javax.swing.JCheckBox();
        btnDisplay = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtOutput = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblFile.setText("File");

        jScrollPane1.setViewportView(txtFileName);

        btnLoad.setText("Load Data");
        btnLoad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoadActionPerformed(evt);
            }
        });

        btnRemove.setText("Remove Duplicates");
        btnRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveActionPerformed(evt);
            }
        });

        chkFaculty.setText("Flag Invalid Faculty");

        chkGpa.setText("Flag Invalid GPA");

        btnDisplay.setText("Display");
        btnDisplay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDisplayActionPerformed(evt);
            }
        });

        txtOutput.setColumns(20);
        txtOutput.setRows(5);
        jScrollPane2.setViewportView(txtOutput);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2)
                        .addGap(22, 22, 22))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(chkFaculty, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(chkGpa, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblFile, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnLoad, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnRemove)))
                        .addContainerGap(53, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnLoad)
                        .addComponent(btnRemove))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFile))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkFaculty)
                    .addComponent(chkGpa)
                    .addComponent(btnDisplay))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoadActionPerformed
        // TODO add your handling code here:
        String[] data = null;
        String fileName = txtFileName.getText();

        //Get the data from csv file
        data = FileUtils.readIntoArray(fileName);

        //Object class into array
        Student[] students = new Student[data.length];
        for (int i = 0; i < data.length; i++) {
            String line = data[i];
            String[] pieces = line.split(",");
            int id = Integer.parseInt(pieces[0]);
            String program = pieces[1];
            double gpa = Double.parseDouble(pieces[2]);
            String f = "";
            String g = "";
            Student details = new Student(id, program, gpa, f, g);
            students[i] = details;
        }

        //Array to List
        for (Student s : students) {
            txtOutput.append(s.toString() + "\n");
        }

        txtOutput.append("\nNumber of Students: " + students.length);
    }//GEN-LAST:event_btnLoadActionPerformed

    private void btnRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveActionPerformed
        List<Student> studentList = new ArrayList<>();
        String file = "students.csv";
        String line = null;

        try {
            FileReader filereader = new FileReader(file);
            BufferedReader buffReader = new BufferedReader(filereader);

            while ((line = buffReader.readLine()) != null) {
                String[] pieces = line.split(",");
                int id = Integer.parseInt(pieces[0]);
                String program = pieces[1];
                double gpa = Double.parseDouble(pieces[2]);
                String f = "";
                String g = "";
                studentList.add(new Student(id, program, gpa, f, g));
            }
            buffReader.close();
        } catch (Exception e) {
        }
        Set<Student> set = new HashSet<>(studentList);
        List<Student> listNoDup = new ArrayList<>(set);

        for (int i = 0; i < listNoDup.size(); i++) {
            txtOutput.append(listNoDup.get(i) + "\n");
        }

        txtOutput.append("\nNumber of Students: " + listNoDup.size());
    }//GEN-LAST:event_btnRemoveActionPerformed

    private void btnDisplayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDisplayActionPerformed
        List<Student> studentList = new ArrayList<>();
        String[] arr = new String[]{"Business", "Engineering", "Health Science", "Information Technology"};

        if (chkFaculty.isSelected() && chkGpa.isSelected()) {
            txtOutput.setText("");

            String fileName = txtFileName.getText();
            String[] data = FileUtils.readIntoArray(fileName);
            Student[] students = new Student[data.length];
            for (int i = 0; i < data.length; i++) {
                String line = data[i];
                String[] pieces = line.split(",");
                int id = Integer.parseInt(pieces[0]);
                String program = pieces[1];
                double gpa = Double.parseDouble(pieces[2]);

                boolean check = Arrays.stream(arr).anyMatch(x -> x.equals(program));

                if ((!check) && (gpa < 0 || gpa > 4)) {
                    Student temp = new Student(id, program, gpa, "F", "G");
                    studentList.add(temp);
                } else if (!check) {
                    Student temp = new Student(id, program, gpa, "F", "");
                    studentList.add(temp);
                } else if (gpa < 0 || gpa > 4) {
                    Student temp = new Student(id, program, gpa, "", "G");
                    studentList.add(temp);
                } else {
                    Student temp = new Student(id, program, gpa, "", "");
                    studentList.add(temp);
                }
            }
        } else if (chkGpa.isSelected()) {
            txtOutput.setText("");

            String fileName = txtFileName.getText();
            String[] data = FileUtils.readIntoArray(fileName);
            Student[] students = new Student[data.length];
            for (int i = 0; i < data.length; i++) {
                String line = data[i];
                String[] pieces = line.split(",");
                int id = Integer.parseInt(pieces[0]);
                String program = pieces[1];
                double gpa = Double.parseDouble(pieces[2]);

                if (gpa < 0 || gpa > 4) {
                    Student temp = new Student(id, program, gpa, "", "G");
                    studentList.add(temp);
                } else {
                    Student temp = new Student(id, program, gpa, "", "");
                    studentList.add(temp);
                }
    }//GEN-LAST:event_btnDisplayActionPerformed
        } else if (chkFaculty.isSelected()) {
            txtOutput.setText("");

            String fileName = txtFileName.getText();
            String[] data = FileUtils.readIntoArray(fileName);
            Student[] students = new Student[data.length];
            for (int i = 0; i < data.length; i++) {
                String line = data[i];
                String[] pieces = line.split(",");
                int id = Integer.parseInt(pieces[0]);
                String program = pieces[1];
                double gpa = Double.parseDouble(pieces[2]);

                boolean check = Arrays.stream(arr).anyMatch(x -> x.equals(program));

                if (!check) {
                    Student temp = new Student(id, program, gpa, "F", "");
                    studentList.add(temp);
                } else {
                    Student temp = new Student(id, program, gpa, "", "");
                    studentList.add(temp);
                }
            }
        }
        for (Student s : studentList) {
            txtOutput.append(s.toString() + "\n");
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainForm.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainForm.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainForm.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainForm.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDisplay;
    private javax.swing.JButton btnLoad;
    private javax.swing.JButton btnRemove;
    private javax.swing.JCheckBox chkFaculty;
    private javax.swing.JCheckBox chkGpa;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblFile;
    private javax.swing.JTextPane txtFileName;
    private javax.swing.JTextArea txtOutput;
    // End of variables declaration//GEN-END:variables
}
