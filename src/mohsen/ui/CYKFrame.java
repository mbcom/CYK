/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mohsen.ui;

import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Set;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;
import mohsen.CYK;
import mohsen.Grammar;
import mohsen.Result;

/**
 *
 * @author MB
 */
public class CYKFrame extends javax.swing.JFrame {

    /**
     * Creates new form CYKFrame
     */
    public CYKFrame() {
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

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtTerminals = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtNonTerminals = new javax.swing.JTextField();
        btnGo = new javax.swing.JButton();
        pnlRules = new javax.swing.JPanel();
        cboFrom = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        cboToVar1 = new javax.swing.JComboBox();
        cboToVar2 = new javax.swing.JComboBox();
        cboToTerminal = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        btnAdd = new javax.swing.JToggleButton();
        jLabel4 = new javax.swing.JLabel();
        cboStart = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstGrammar = new javax.swing.JList();
        jPanel1 = new javax.swing.JPanel();
        txtWord = new javax.swing.JTextField();
        btnCheck = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblResult = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Required"));

        jLabel1.setText("Terminals :");

        txtTerminals.setToolTipText("Enter a String as terminals(each character is a terminal)");
        txtTerminals.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTerminalsKeyReleased(evt);
            }
        });

        jLabel2.setText("Non-terminals :");

        txtNonTerminals.setToolTipText("Enter a String as non-terminals (each character is a non-terminal)");
        txtNonTerminals.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNonTerminalsKeyReleased(evt);
            }
        });

        btnGo.setText("Go");
        btnGo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnGo)
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtTerminals, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNonTerminals))
                        .addContainerGap())))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTerminals, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtNonTerminals, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnGo)
                .addGap(16, 16, 16))
        );

        pnlRules.setBorder(javax.swing.BorderFactory.createTitledBorder("Rules"));
        pnlRules.setEnabled(false);

        cboFrom.setToolTipText("Variable ");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("→");

        cboToVar1.setToolTipText("Non-Terminal");
        cboToVar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboToVar1ActionPerformed(evt);
            }
        });

        cboToVar2.setToolTipText("Non-Terminal");
        cboToVar2.setEnabled(false);

        cboToTerminal.setToolTipText("Terminal");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("or");

        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        jLabel4.setText("Start Non-Terminal :");

        cboStart.setToolTipText("");

        lstGrammar.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        lstGrammar.setToolTipText("");
        lstGrammar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                lstGrammarKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(lstGrammar);

        javax.swing.GroupLayout pnlRulesLayout = new javax.swing.GroupLayout(pnlRules);
        pnlRules.setLayout(pnlRulesLayout);
        pnlRulesLayout.setHorizontalGroup(
            pnlRulesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlRulesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlRulesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 276, Short.MAX_VALUE)
                    .addGroup(pnlRulesLayout.createSequentialGroup()
                        .addComponent(cboFrom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cboToVar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cboToVar2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cboToTerminal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAdd))
                    .addGroup(pnlRulesLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cboStart, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnlRulesLayout.setVerticalGroup(
            pnlRulesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlRulesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlRulesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cboStart, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlRulesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlRulesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cboToVar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cboToVar2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5)
                        .addComponent(cboToTerminal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnAdd))
                    .addComponent(jLabel3)
                    .addComponent(cboFrom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Word to check"));
        jPanel1.setEnabled(false);

        btnCheck.setText("Check");
        btnCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCheckActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtWord)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCheck)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtWord, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCheck))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        tblResult.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(tblResult);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlRules, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 466, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlRules, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jScrollPane2)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnGoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGoActionPerformed
        pnlRules.setEnabled(true);
        jPanel1.setEnabled(true);
        char[] vars = txtNonTerminals.getText().toCharArray();
        Character[] cVars = new Character[vars.length];
        for(int i = 0 ; i < vars.length ; i++){
            cVars[i] = vars[i];
        }
        cboStart.setModel(new DefaultComboBoxModel(cVars));
        cboFrom.setModel(new DefaultComboBoxModel(cVars));
        cboToVar2.setModel(new DefaultComboBoxModel(cVars));
        
        cVars = new Character[vars.length + 1];
        cVars[0] = '-';
        for (int i = 0 ; i < vars.length ; i++){
            cVars[i+1] = vars[i];
        }
        cboToVar1.setModel(new DefaultComboBoxModel(cVars));
        
        char[] terms = txtTerminals.getText().toCharArray();
        Character[] cTerms = new Character[terms.length + 1];
        cTerms[0] = '-';
        for(int i = 0 ; i < terms.length ; i++){
            cTerms[i+1] = terms[i];
        }
        
        cboToTerminal.setModel(new DefaultComboBoxModel(cTerms));
        
        lstGrammar.setModel(new DefaultListModel());
        
    }//GEN-LAST:event_btnGoActionPerformed

    private void cboToVar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboToVar1ActionPerformed
        Character selected = (Character) cboToVar1.getSelectedItem();
        if(selected.equals('-')){
            cboToVar2.setEnabled(false);
        }else
            cboToVar2.setEnabled(true);
    }//GEN-LAST:event_cboToVar1ActionPerformed

    private void txtTerminalsKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTerminalsKeyReleased
        txtTerminals.setText(txtTerminals.getText().toLowerCase());
    }//GEN-LAST:event_txtTerminalsKeyReleased

    private void txtNonTerminalsKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNonTerminalsKeyReleased
        txtNonTerminals.setText(txtNonTerminals.getText().toUpperCase());
    }//GEN-LAST:event_txtNonTerminalsKeyReleased

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        Character from,toVar1,toVar2,toTerm;
        from = (Character) cboFrom.getSelectedItem();
        toVar1 = (Character) cboToVar1.getSelectedItem();
        toVar2 = (Character) cboToVar2.getSelectedItem();
        toTerm = (Character) cboToTerminal.getSelectedItem();
        if (toVar1.equals(toTerm) && toVar1.equals('-'))
            return;
        String rule = from + "->";
        if(!toVar1.equals('-')){
            rule += toVar1 + "" + toVar2;
            if(!toTerm.equals('-'))
                rule += "|";
        }
        if(!toTerm.equals('-')){
            rule += toTerm;
        }
        
        DefaultListModel model = (DefaultListModel) lstGrammar.getModel();
        model.addElement(rule);
    }//GEN-LAST:event_btnAddActionPerformed

    private void lstGrammarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lstGrammarKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_DELETE) {
            int index = lstGrammar.getSelectedIndex();
            if(index != -1)
                ((DefaultListModel)lstGrammar.getModel()).remove(index);
        }
    }//GEN-LAST:event_lstGrammarKeyReleased

    private void btnCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCheckActionPerformed
        String word = txtWord.getText();
        if(word==null || word.equals(""))
            return;
        DefaultListModel model = (DefaultListModel)lstGrammar.getModel();
        ArrayList<String> rules = new ArrayList<String>();
        for(int i = 0;i<model.size();i++){
            rules.add((String) model.get(i));
        }
        
        Grammar grammar = new Grammar((Character) cboStart.getSelectedItem() + "");
        for(String rule: rules)
            grammar.addProduct(rule);
        
        CYK cyk = new CYK(grammar);
        Result result = cyk.canGenerate(word);
        
        
        Set<String>[][] matrix = result.getMatrix();
        String[][] arr = new String[word.length()][word.length()];
        
        int ii = 0 , jj = 0;
        for(jj = 0 ; jj < word.length() ; jj ++)
            arr[ii][jj] = setToString(matrix[jj][jj]);
        
        ii=1;
        for (int step = 1; step < word.length(); step++) {
            int i = 0;
            jj = 0;
            for (int j = step; j < word.length(); j++) {
                for (int k = i; k < j; k++) {
                    arr[ii][jj] = setToString(matrix[i][j]);
                }
                i++;
                jj++;
            }
            ii++;
        }
        
        String[][] arr2 = new String[word.length()][word.length()];
        ii = 0;
        for(int i = word.length() - 1;i >= 0 ; i--){
            for(int j = 0 ; j < word.length() ; j++)
                arr2[ii][j] = arr[i][j];
            ii++;
        }
        String[] titles = new String[word.length()];
        for(int i = 0 ; i < word.length() ; i++){
            titles[i] = String.format("%02d", i + 1);
        }
        DefaultTableModel tblModel = new DefaultTableModel(arr2,titles);
        tblResult.setModel(tblModel);
        JOptionPane.showMessageDialog(this, result.getStatus() ? "Your String can be generate by this grammar :)" : "Your String cannot be generate by this grammar :(");
        
    }//GEN-LAST:event_btnCheckActionPerformed

    private String setToString(Set<String> set){
        String result = "{ ";
        for(String s : set){
            result += s + " ";
        }
        if(set.size() == 0)
            result += "Ø ";
        //result = result.substring(0, result.length() - 2);
        result += "}";
        return result;
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
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CYKFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CYKFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CYKFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CYKFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CYKFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btnAdd;
    private javax.swing.JButton btnCheck;
    private javax.swing.JButton btnGo;
    private javax.swing.JComboBox cboFrom;
    private javax.swing.JComboBox cboStart;
    private javax.swing.JComboBox cboToTerminal;
    private javax.swing.JComboBox cboToVar1;
    private javax.swing.JComboBox cboToVar2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList lstGrammar;
    private javax.swing.JPanel pnlRules;
    private javax.swing.JTable tblResult;
    private javax.swing.JTextField txtNonTerminals;
    private javax.swing.JTextField txtTerminals;
    private javax.swing.JTextField txtWord;
    // End of variables declaration//GEN-END:variables
}
