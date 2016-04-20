/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Finance;

import java.awt.CardLayout;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.*;
/**
 *
 * @author Yeejkoob Thao
 */
public class FinanceView extends javax.swing.JPanel {

    /**
     * Creates new form FinanceView
     */
    private JPanel allPanelContainer;
    public FinanceView(JPanel panel) {
        allPanelContainer = panel;
        initComponents();
        
    }
    
    public JComboBox getFinanceYearComboBox() {
        return this.financeYear;
    }
    
    public JTable getFinanceTable() {
        return this.financeTable;
    }

    public void goToHomeView() {
        CardLayout cardLayout = (CardLayout) allPanelContainer.getLayout();
        cardLayout.show(allPanelContainer, "Home View");
    }
    
    void addHomeButtonListener(ActionListener listenForHomeButton) {
        homeButton.addActionListener(listenForHomeButton);
    }
    
    void displayErrorMessage(String errorMessage) {
        
        JOptionPane.showMessageDialog(this, errorMessage);
        
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        homeButton = new javax.swing.JButton();
        titleLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        financeTable = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        userDefinedRevenueLabel = new javax.swing.JLabel();
        userDefinedExpensesLabel = new javax.swing.JLabel();
        yearlyProfitLabel = new javax.swing.JLabel();
        userDefinedRevenueField = new javax.swing.JTextField();
        userDefinedExpensesField = new javax.swing.JTextField();
        yearlyProfitField = new javax.swing.JTextField();
        financeYear = new javax.swing.JComboBox<>();

        jPanel1.setLayout(new java.awt.GridBagLayout());

        homeButton.setText("Home");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 53;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(25, 15, 16, 0);
        jPanel1.add(homeButton, gridBagConstraints);

        titleLabel.setText("Finance Management");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(16, 313, 0, 426);
        jPanel1.add(titleLabel, gridBagConstraints);

        financeTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(financeTable);

        jPanel2.setLayout(new java.awt.GridBagLayout());

        userDefinedRevenueLabel.setText("User Defined Revenue:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(19, 48, 0, 0);
        jPanel2.add(userDefinedRevenueLabel, gridBagConstraints);

        userDefinedExpensesLabel.setText("User Defined Expenses: ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(12, 48, 0, 0);
        jPanel2.add(userDefinedExpensesLabel, gridBagConstraints);

        yearlyProfitLabel.setText("Yearly Profit:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(12, 48, 0, 0);
        jPanel2.add(yearlyProfitLabel, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 122;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(16, 84, 0, 598);
        jPanel2.add(userDefinedRevenueField, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 122;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(9, 84, 0, 598);
        jPanel2.add(userDefinedExpensesField, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 122;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(9, 84, 22, 598);
        jPanel2.add(yearlyProfitField, gridBagConstraints);

        financeYear.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(financeYear, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(financeYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable financeTable;
    private javax.swing.JComboBox<String> financeYear;
    private javax.swing.JButton homeButton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JTextField userDefinedExpensesField;
    private javax.swing.JLabel userDefinedExpensesLabel;
    private javax.swing.JTextField userDefinedRevenueField;
    private javax.swing.JLabel userDefinedRevenueLabel;
    private javax.swing.JTextField yearlyProfitField;
    private javax.swing.JLabel yearlyProfitLabel;
    // End of variables declaration//GEN-END:variables
}