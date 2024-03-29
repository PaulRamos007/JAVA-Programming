package shapes;

import cputils.FileUtils;

public class ShapesExerciseMainForm extends javax.swing.JFrame {

    public ShapesExerciseMainForm() {
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

        btnDemo = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtOutput = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        txtFileName = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Shapes Exercise - Part 1");

        btnDemo.setText("Load and Display");
        btnDemo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDemoActionPerformed(evt);
            }
        });

        txtOutput.setColumns(20);
        txtOutput.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        txtOutput.setRows(5);
        jScrollPane1.setViewportView(txtOutput);

        jLabel1.setText("File:");

        txtFileName.setText("shapes.csv");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 706, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(txtFileName, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnDemo)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtFileName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDemo))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 327, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void btnDemoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDemoActionPerformed

    String fileName = txtFileName.getText();
    String[] lines = FileUtils.readIntoArray(fileName);
    Shape[] shapes = new Shape[lines.length];
    for (int i = 0; i < lines.length; i++) {
        Shape sh = null;
        String line = lines[i];
        String[] pieces = line.split(",");
        String shType = pieces[0];
        String colour = pieces[1];
        if (shType.equalsIgnoreCase("circle")) {
            double radius = Double.parseDouble(pieces[2]);
            sh = new Circle(colour, radius);
        } else if (shType.equalsIgnoreCase("rectangle")) {
            double length = Double.parseDouble(pieces[2]);
            double width = Double.parseDouble(pieces[3]);
            sh = new Rectangle(colour, length, width);
        } else if (shType.equalsIgnoreCase("triangle")) {
            double base = Double.parseDouble(pieces[2]);
            double height = Double.parseDouble(pieces[3]);
            sh = new Triangle(colour, base, height);
        }
        shapes[i] = sh;
    }

    displayShapes(shapes);


}//GEN-LAST:event_btnDemoActionPerformed

    private void displayShapes(Shape[] items) {
        for (Shape s : items) {
            String temp = s.format();
            txtOutput.append(temp + "\n"); // polymorphism
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ShapesExerciseMainForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDemo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtFileName;
    private javax.swing.JTextArea txtOutput;
    // End of variables declaration//GEN-END:variables

}
