/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package bai01;

/**
 *
 * @author FPT
 */
public class Cong_Tru_Nhan_Chia2 extends javax.swing.JFrame {
    String operandl = "";
    String operator = "";
    
    boolean isEqualsPress = false;
    
    /**
     * Creates new form Cong_Tru_Nhan_Chia2
     */
    public Cong_Tru_Nhan_Chia2() {
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

<<<<<<< HEAD
        jSeparator1 = new javax.swing.JSeparator();
        jButton1 = new javax.swing.JButton();
=======
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        txtResult = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        BTNnumber1 = new javax.swing.JButton();
        BTNnumber2 = new javax.swing.JButton();
        BTNnumber3 = new javax.swing.JButton();
        BTNdivide = new javax.swing.JButton();
        BTNsquareroot = new javax.swing.JButton();
        BTNnumber4 = new javax.swing.JButton();
        BTNnumber5 = new javax.swing.JButton();
        BTNnumber6 = new javax.swing.JButton();
        BTNmultiply = new javax.swing.JButton();
        BTNpercentage = new javax.swing.JButton();
        BTNnumber7 = new javax.swing.JButton();
        BTNnumber8 = new javax.swing.JButton();
        BTNnumber9 = new javax.swing.JButton();
        BTNadd = new javax.swing.JButton();
        BTNfraction = new javax.swing.JButton();
        BTNplus = new javax.swing.JButton();
        BTNnumber0 = new javax.swing.JButton();
        BTNclear = new javax.swing.JButton();
        BTNsubtract = new javax.swing.JButton();
        BTNequals = new javax.swing.JButton();
>>>>>>> 3b131e4029b09cef9bd48fce223efb9bc601426f

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Calculator");

        txtResult.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtResult.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtResult.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtResult, javax.swing.GroupLayout.DEFAULT_SIZE, 378, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtResult, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jPanel2.setLayout(new java.awt.GridLayout(4, 5, 5, 5));

        BTNnumber1.setText("1");
        BTNnumber1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNnumber1ActionPerformed(evt);
            }
        });
        jPanel2.add(BTNnumber1);

        BTNnumber2.setText("2");
        BTNnumber2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNnumber4ActionPerformed(evt);
            }
        });
        jPanel2.add(BTNnumber2);

        BTNnumber3.setText("3");
        BTNnumber3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNnumber4ActionPerformed(evt);
            }
        });
        jPanel2.add(BTNnumber3);

        BTNdivide.setText("/");
        BTNdivide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNaddActionPerformed(evt);
            }
        });
        jPanel2.add(BTNdivide);

        BTNsquareroot.setText("sqrt");
        BTNsquareroot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNfractionActionPerformed(evt);
            }
        });
        jPanel2.add(BTNsquareroot);

        BTNnumber4.setText("4");
        BTNnumber4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNnumber4ActionPerformed(evt);
            }
        });
        jPanel2.add(BTNnumber4);

        BTNnumber5.setText("5");
        BTNnumber5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNnumber4ActionPerformed(evt);
            }
        });
        jPanel2.add(BTNnumber5);

        BTNnumber6.setText("6");
        BTNnumber6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNnumber4ActionPerformed(evt);
            }
        });
        jPanel2.add(BTNnumber6);

        BTNmultiply.setText("*");
        BTNmultiply.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNaddActionPerformed(evt);
            }
        });
        jPanel2.add(BTNmultiply);

        BTNpercentage.setText("%");
        BTNpercentage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNfractionActionPerformed(evt);
            }
        });
        jPanel2.add(BTNpercentage);

        BTNnumber7.setText("7");
        BTNnumber7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNnumber4ActionPerformed(evt);
            }
        });
        jPanel2.add(BTNnumber7);

        BTNnumber8.setText("8");
        BTNnumber8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNnumber4ActionPerformed(evt);
            }
        });
        jPanel2.add(BTNnumber8);

        BTNnumber9.setText("9");
        BTNnumber9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNnumber4ActionPerformed(evt);
            }
        });
        jPanel2.add(BTNnumber9);

        BTNadd.setText("+");
        BTNadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNaddActionPerformed(evt);
            }
        });
        jPanel2.add(BTNadd);

        BTNfraction.setText("1/x");
        BTNfraction.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNfractionActionPerformed(evt);
            }
        });
        jPanel2.add(BTNfraction);

        BTNplus.setText("+/-");
        BTNplus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNplusActionPerformed(evt);
            }
        });
        jPanel2.add(BTNplus);

        BTNnumber0.setText("0");
        BTNnumber0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNnumber4ActionPerformed(evt);
            }
        });
        jPanel2.add(BTNnumber0);

        BTNclear.setBackground(new java.awt.Color(255, 0, 51));
        BTNclear.setText("C");
        BTNclear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNclearActionPerformed(evt);
            }
        });
        jPanel2.add(BTNclear);

        BTNsubtract.setText("-");
        BTNsubtract.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNaddActionPerformed(evt);
            }
        });
        jPanel2.add(BTNsubtract);

        BTNequals.setBackground(new java.awt.Color(255, 255, 0));
        BTNequals.setText("=");
        BTNequals.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNequalsActionPerformed(evt);
            }
        });
        jPanel2.add(BTNequals);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 213, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BTNnumber1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNnumber1ActionPerformed
         if(isEqualsPress){
            isEqualsPress = false;
            txtResult.setText("");
        }   
        
        String cmd = evt.getActionCommand();
            txtResult.setText(txtResult.getText() + cmd);
    }//GEN-LAST:event_BTNnumber1ActionPerformed

    private void BTNnumber4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNnumber4ActionPerformed
         if(isEqualsPress){
            isEqualsPress = false;
            txtResult.setText("");
        }
        
        String cmd = evt.getActionCommand();
            txtResult.setText(txtResult.getText() + cmd); // TODO add your handling code here:
    }//GEN-LAST:event_BTNnumber4ActionPerformed

    private void BTNplusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNplusActionPerformed
       
        
        try {
            double value = Double.parseDouble( txtResult.getText());
            value = - value;
            txtResult.setText("" + value );
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_BTNplusActionPerformed

    private void BTNaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNaddActionPerformed
       String cmd = evt.getActionCommand();
       
       operator = cmd ;
       operandl = txtResult.getText();
       
       txtResult.setText("");
       
    }//GEN-LAST:event_BTNaddActionPerformed

    private void BTNequalsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNequalsActionPerformed
        if(txtResult.getText().equals("") || operandl.equals("")){
            return;
        }
        try {
            double oprand1 = Double.parseDouble(operandl);
            double oprand2 = Double.parseDouble(txtResult.getText());
            double result = 0;
            if(operator.equals("+")){
                result = oprand1 + oprand2;
            }else if(operator.equals("-")){
                result = oprand1 - oprand2;
            }else if(operator.equals("*")){
                result = oprand1 * oprand2;
            }else if(operator.equals("/")){
                result = oprand1 / oprand2;
            }
            txtResult.setText("" + result);
            isEqualsPress = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_BTNequalsActionPerformed

    private void BTNclearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNclearActionPerformed
        txtResult.setText("");
        operandl = "";
        operator = "";
        isEqualsPress = false; 
    }//GEN-LAST:event_BTNclearActionPerformed

    private void BTNfractionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNfractionActionPerformed
        if (txtResult.getText().equals("")){
            return;
        }
        String cmd = evt.getActionCommand();
        try {
            double value = Double.parseDouble(txtResult.getText());
            
            if (cmd.equals("sqrt")){
                value = Math.sqrt(value);
            }else if (cmd.equals("%")){
                value = value * 100; 
            }if (cmd.equals("1/x")){
                value = 1 / value; 
            }
            txtResult.setText("" + value);
            isEqualsPress = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_BTNfractionActionPerformed

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
            java.util.logging.Logger.getLogger(Cong_Tru_Nhan_Chia2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cong_Tru_Nhan_Chia2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cong_Tru_Nhan_Chia2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cong_Tru_Nhan_Chia2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cong_Tru_Nhan_Chia2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
<<<<<<< HEAD
    private javax.swing.JButton jButton1;
    private javax.swing.JSeparator jSeparator1;
=======
    private javax.swing.JButton BTNadd;
    private javax.swing.JButton BTNclear;
    private javax.swing.JButton BTNdivide;
    private javax.swing.JButton BTNequals;
    private javax.swing.JButton BTNfraction;
    private javax.swing.JButton BTNmultiply;
    private javax.swing.JButton BTNnumber0;
    private javax.swing.JButton BTNnumber1;
    private javax.swing.JButton BTNnumber2;
    private javax.swing.JButton BTNnumber3;
    private javax.swing.JButton BTNnumber4;
    private javax.swing.JButton BTNnumber5;
    private javax.swing.JButton BTNnumber6;
    private javax.swing.JButton BTNnumber7;
    private javax.swing.JButton BTNnumber8;
    private javax.swing.JButton BTNnumber9;
    private javax.swing.JButton BTNpercentage;
    private javax.swing.JButton BTNplus;
    private javax.swing.JButton BTNsquareroot;
    private javax.swing.JButton BTNsubtract;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txtResult;
>>>>>>> 3b131e4029b09cef9bd48fce223efb9bc601426f
    // End of variables declaration//GEN-END:variables
}
