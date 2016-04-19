/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AddNewEmployee;

/**
 * 
 * @author Yeejkoob Thao
 */
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import staff.*;

public class AddNewEmployeeView extends javax.swing.JFrame {

    private StaffView associatedStaffView;
    private StaffModel associatedStaffModel;
    private StaffController associatedStaffController;
    
    /**
     * Creates new form AddNewEmployeeView
     */
    public AddNewEmployeeView(
                              StaffView currentStaffView,
                              StaffModel currentStaffModel,
                              StaffController currentStaffController) {
        associatedStaffView = currentStaffView;
        associatedStaffModel = currentStaffModel;
        associatedStaffController = currentStaffController;
        initComponents();
    }
    
    public StaffView getAssociatedStaffView() {

        return associatedStaffView;

    }

    public StaffModel getAssociatedStaffModel() {

        return associatedStaffModel;

    }

    public StaffController getAssociatedStaffController() {

        return associatedStaffController;

    }
    
    public String getInputEmployeeFirstName() {
        return firstNameField.getText();
    }
    
    public String getInputEmployeeLastName() {
        return lastNameField.getText();
    }
    
    public String getInputEmployeeStatus() {
        return employeeStatusField.getSelectedItem().toString();
    }
    
    public String getInputEmployeeHoursWorked() {
        //return Double.valueOf(hoursWorkedField.getText());
        return hoursWorkedField.getText();
    }
    
    public String getInputEmployeeHourlyWage() {
        //return Double.valueOf(hourlyWageField.getText());
        return hourlyWageField.getText();
    }
    
    public String getInputEmployeeTotalPay() {
        //return Double.valueOf(totalPayField.getText());
        return totalPayField.getText();
    }
    
    void addSubmitButtonListener(ActionListener listenForSubmit) {
        submitButton.addActionListener(listenForSubmit);
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

        descriptionLabel = new javax.swing.JLabel();
        firstNameLabel = new javax.swing.JLabel();
        firstNameField = new javax.swing.JTextField();
        lastNameLabel = new javax.swing.JLabel();
        lastNameField = new javax.swing.JTextField();
        employeeStatusLabel = new javax.swing.JLabel();
        employeeStatusField = new javax.swing.JComboBox<>();
        hoursWorkedLabel = new javax.swing.JLabel();
        hourslyWageLabel = new javax.swing.JLabel();
        totalPayLabel = new javax.swing.JLabel();
        totalPayField = new javax.swing.JTextField();
        hourlyWageField = new javax.swing.JTextField();
        hoursWorkedField = new javax.swing.JTextField();
        submitButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Add A New Employee");
        setResizable(false);

        descriptionLabel.setText("Please fill out the information below to create a new employee");

        firstNameLabel.setText("First name:");

        lastNameLabel.setText("Last Name:");

        employeeStatusLabel.setText("Employee Status:");

        employeeStatusField.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Overtime", "Vacation", "Clocked In", "AWOL", "Clocked Out" }));

        hoursWorkedLabel.setText("Hours Worked:");

        hourslyWageLabel.setText("Hourly Wage:");

        totalPayLabel.setText("Total Pay: $");

        totalPayField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalPayFieldActionPerformed(evt);
            }
        });

        submitButton.setText("Submit");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(102, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(descriptionLabel)
                        .addGap(81, 81, 81))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(employeeStatusLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(firstNameLabel)
                                            .addComponent(lastNameLabel)
                                            .addComponent(hoursWorkedLabel)
                                            .addComponent(hourslyWageLabel))
                                        .addGap(16, 16, 16)))
                                .addGap(39, 39, 39)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(firstNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(employeeStatusField, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lastNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(hoursWorkedField)
                                    .addComponent(hourlyWageField)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(totalPayLabel)
                                .addGap(76, 76, 76)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(submitButton)
                                    .addComponent(totalPayField))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(descriptionLabel)
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(firstNameLabel)
                    .addComponent(firstNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lastNameLabel)
                    .addComponent(lastNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(employeeStatusLabel)
                    .addComponent(employeeStatusField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hoursWorkedLabel)
                    .addComponent(hoursWorkedField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hourslyWageLabel)
                    .addComponent(hourlyWageField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(totalPayLabel)
                    .addComponent(totalPayField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 98, Short.MAX_VALUE)
                .addComponent(submitButton)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void totalPayFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalPayFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_totalPayFieldActionPerformed

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
            java.util.logging.Logger.getLogger(AddNewEmployeeView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddNewEmployeeView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddNewEmployeeView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddNewEmployeeView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new AddNewEmployeeView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel descriptionLabel;
    private javax.swing.JComboBox<String> employeeStatusField;
    private javax.swing.JLabel employeeStatusLabel;
    private javax.swing.JTextField firstNameField;
    private javax.swing.JLabel firstNameLabel;
    private javax.swing.JTextField hourlyWageField;
    private javax.swing.JTextField hoursWorkedField;
    private javax.swing.JLabel hoursWorkedLabel;
    private javax.swing.JLabel hourslyWageLabel;
    private javax.swing.JTextField lastNameField;
    private javax.swing.JLabel lastNameLabel;
    private javax.swing.JButton submitButton;
    private javax.swing.JTextField totalPayField;
    private javax.swing.JLabel totalPayLabel;
    // End of variables declaration//GEN-END:variables
}
