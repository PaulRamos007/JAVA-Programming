package assignment5;

import cputils.FileUtilsExceptionsThrown;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class Assignment5MainForm extends javax.swing.JFrame {

    List<String> badLines;
    String filename = "badrecords.txt";

    public Assignment5MainForm() {
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

        jLabel1 = new javax.swing.JLabel();
        btnLoad = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtOutput = new javax.swing.JTextArea();
        txtInputFile = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("A5 - Exceptions");

        jLabel1.setText("File:");

        btnLoad.setText("Load");
        btnLoad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoadActionPerformed(evt);
            }
        });

        txtOutput.setColumns(20);
        txtOutput.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        txtOutput.setRows(5);
        jScrollPane1.setViewportView(txtOutput);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 370, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(txtInputFile, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnLoad)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(btnLoad)
                    .addComponent(txtInputFile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 421, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoadActionPerformed

        try {
            List<String> data = null;
            String fileName = txtInputFile.getText();
            data = FileUtilsExceptionsThrown.readIntoList(fileName);

            txtOutput.append(createWeatherHistory(data).format() + "\n");

            badLines.add(System.err.toString());
            FileUtilsExceptionsThrown.writeListToFile(badLines, filename);

        } catch (Exception fnf) {
            JOptionPane.showMessageDialog(this, fnf.getMessage(), "File Not Found", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnLoadActionPerformed

    private WeatherHistory createWeatherHistory(List<String> data) {
        WeatherHistory res = null;

        Location loc = new Location(data.get(0), data.get(1), data.get(2));
        List<DailyTemperature> dailyTemp = new ArrayList<>();
        for (int i = 3; i < data.size(); i++) {
            try {
                String line = data.get(i);
                String[] pieces = line.split(",");
                SimpleDate sd = new SimpleDate(
                        Integer.parseInt(pieces[0]),
                        Integer.parseInt(pieces[1]),
                        Integer.parseInt(pieces[2]));
                DailyTemperature dt = new DailyTemperature(
                        sd,
                        Integer.parseInt(pieces[3]),
                        Integer.parseInt(pieces[4]));
                dailyTemp.add(dt);

            } catch (NumberFormatException ex) {
                System.err.format("LINE: " + (i + 1) + " | SOURCE: " + data.get(i) + "| ERROR: " + ex + "\n");
            } catch (ArrayIndexOutOfBoundsException ex) {
                System.err.format("LINE: " + (i + 1) + " | SOURCE: " + data.get(i) + "| ERROR: " + ex + "\n");
            } catch (SimpleDateException ex) {
                System.err.format("LINE: " + (i + 1) + " | SOURCE: " + data.get(i) + "| ERROR: " + ex + "\n");
            } catch (TemperatureException ex) {
                System.err.format("LINE: " + (i + 1) + " | SOURCE: " + data.get(i) + "| ERROR: " + ex + "\n");
            }
        }
        res = new WeatherHistory(loc, dailyTemp);

        return res;
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
            java.util.logging.Logger.getLogger(Assignment5MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Assignment5MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Assignment5MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Assignment5MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Assignment5MainForm().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLoad;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtInputFile;
    private javax.swing.JTextArea txtOutput;
    // End of variables declaration//GEN-END:variables

} // end class Assugnment5MainForm