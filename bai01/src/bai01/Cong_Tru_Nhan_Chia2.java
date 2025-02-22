package bai01;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Cong_Tru_Nhan_Chia2 extends javax.swing.JFrame {

    String operandl = "";
    String operator = "";

    boolean isEqualsPress = false;

    public Cong_Tru_Nhan_Chia2() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
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
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Calculator");

        txtResult.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtResult.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtResult.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtResult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtResultActionPerformed(evt);
            }
        });

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
        BTNclear.setForeground(new java.awt.Color(255, 255, 255));
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

        BTNequals.setBackground(new java.awt.Color(255, 204, 0));
        BTNequals.setForeground(new java.awt.Color(255, 255, 255));
        BTNequals.setText("=");
        BTNequals.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNequalsActionPerformed(evt);
            }
        });
        jPanel2.add(BTNequals);

        jButton1.setBackground(new java.awt.Color(242, 242, 242));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setText("< Trở lại");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(20, 20, 20))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BTNnumber1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNnumber1ActionPerformed
        if (isEqualsPress) {
            isEqualsPress = false;
            txtResult.setText("");
        }

        String cmd = evt.getActionCommand();
        txtResult.setText(txtResult.getText() + cmd);
        
    }//GEN-LAST:event_BTNnumber1ActionPerformed

    private void BTNnumber4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNnumber4ActionPerformed
        if (isEqualsPress) {
            isEqualsPress = false;
            txtResult.setText("");
        }

        String cmd = evt.getActionCommand();
        txtResult.setText(txtResult.getText() + cmd); 
    }//GEN-LAST:event_BTNnumber4ActionPerformed

    private void BTNplusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNplusActionPerformed

        try {
            double value = Double.parseDouble(txtResult.getText());
            value = -value;
            txtResult.setText("" + value);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_BTNplusActionPerformed

    private void BTNaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNaddActionPerformed
        String cmd = evt.getActionCommand();

        operator = cmd;
        operandl = txtResult.getText();

        txtResult.setText("");

    }//GEN-LAST:event_BTNaddActionPerformed

    private void BTNequalsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNequalsActionPerformed
        if (txtResult.getText().equals("") || operandl.equals("")) {
            return;
        }
        try {
            double oprand1 = Double.parseDouble(operandl);
            double oprand2 = Double.parseDouble(txtResult.getText());
            double result = 0;
            if (operator.equals("+")) {
                result = oprand1 + oprand2;
            } else if (operator.equals("-")) {
                result = oprand1 - oprand2;
            } else if (operator.equals("*")) {
                result = oprand1 * oprand2;
            } else if (operator.equals("/")) {
                result = oprand1 / oprand2;
            }
            txtResult.setText("" + result);
            isEqualsPress = true;
            writeResultToFile(result);
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
        if (txtResult.getText().equals("")) {
            return;
        }
        String cmd = evt.getActionCommand();
        try {
            double value = Double.parseDouble(txtResult.getText());

            if (cmd.equals("sqrt")) {
                value = Math.sqrt(value);
            } else if (cmd.equals("%")) {
                value = value * 100;
            }
            if (cmd.equals("1/x")) {
                value = 1 / value;
            }
            txtResult.setText("" + value);
            isEqualsPress = true;
            writeResultToFile(value);
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_BTNfractionActionPerformed

    private void txtResultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtResultActionPerformed
        
    }//GEN-LAST:event_txtResultActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // Open the Home
        new Home().setVisible(true);
        // Close the current window
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed
    
    private void writeResultToFile(double result) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("ket_qua.txt", true))) { // Append mode
            writer.write("Result: " + result + "\n");
            writer.newLine(); // Add a new line after each result
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cong_Tru_Nhan_Chia2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
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
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField txtResult;
    // End of variables declaration//GEN-END:variables
}
