/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AddNewUser;

/**
 *
 * @author Yeejkoob Thao
 */
import java.awt.event.ActionListener;
import javax.swing.*;
import usermanagementview.*;

public class AddNewUserView extends javax.swing.JFrame {

    private UserView associatedUserView;
    private UserModel associatedUserModel;
    private UserController associatedUserController;

    /**
     * Creates new form AddNewUserForm
     */
    public AddNewUserView(UserView currentUserView,
            UserModel currentUserModel,
            UserController currentUserController) {
        associatedUserView = currentUserView;
        associatedUserModel = currentUserModel;
        associatedUserController = currentUserController;
        initComponents();
    }

    public UserView getAssociatedUserView() {

        return associatedUserView;

    }

    public UserModel getAssociatedUserModel() {

        return associatedUserModel;

    }

    public UserController getAssociatedUserController() {

        return associatedUserController;

    }

    public JLabel getInvalidUsernameLabel() {

        return invalidUsernameLabel;

    }

    public JLabel getInvalidPasswordLabel() {

        return invalidPasswordLabel;

    }

    public JLabel getInvalidRetypePasswordLabel() {

        return invalidRetypePassword;

    }

    public String getUsernameField() {

        return usernameField.getText();

    }

    public String getPasswordField() {

        return String.valueOf(passwordField.getPassword());
    }

    public String getRetypePasswordField() {

        return String.valueOf(retypePasswordField.getPassword());

    }

    public ButtonGroup getUserLevelButtonGroup() {

        return buttonGroup1;

    }
    
    public JRadioButton getReceptionistChoice () {
        return receptionistChoice;
    }
    
    public JRadioButton getManagerChoice () {
        return managerChoice;
    }
    
    public JRadioButton getOwnerChoice () {
        return ownerChoice;
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        title = new javax.swing.JLabel();
        usernameLabel = new javax.swing.JLabel();
        usernameField = new javax.swing.JTextField();
        passwordField = new javax.swing.JPasswordField();
        retypePasswordField = new javax.swing.JPasswordField();
        passwordLabel = new javax.swing.JLabel();
        retypePasswordLabel = new javax.swing.JLabel();
        receptionistChoice = new javax.swing.JRadioButton();
        userLevelInstructions = new javax.swing.JLabel();
        managerChoice = new javax.swing.JRadioButton();
        ownerChoice = new javax.swing.JRadioButton();
        submitButton = new javax.swing.JButton();
        invalidUsernameLabel = new javax.swing.JLabel();
        invalidPasswordLabel = new javax.swing.JLabel();
        invalidRetypePassword = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Add A New HMS User");

        title.setText("Please type in a unique username and password");

        usernameLabel.setText("Username:");

        passwordLabel.setText("Password:");

        retypePasswordLabel.setText("Re-type Password: ");

        buttonGroup1.add(receptionistChoice);
        receptionistChoice.setText("Receptionist");

        userLevelInstructions.setText("Select User Level:");

        buttonGroup1.add(managerChoice);
        managerChoice.setText("Manager");

        buttonGroup1.add(ownerChoice);
        ownerChoice.setText("Owner");

        submitButton.setText("Submit");
        submitButton.setToolTipText("");
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButtonActionPerformed(evt);
            }
        });

        invalidUsernameLabel.setText("Invalid Username");

        invalidPasswordLabel.setText("Invalid Password");

        invalidRetypePassword.setText("Wrong Password");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(usernameLabel)
                            .addComponent(passwordLabel)
                            .addComponent(retypePasswordLabel)
                            .addComponent(userLevelInstructions))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(submitButton)
                            .addComponent(receptionistChoice)
                            .addComponent(managerChoice)
                            .addComponent(ownerChoice)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(passwordField)
                                    .addComponent(usernameField)
                                    .addComponent(retypePasswordField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(invalidUsernameLabel)
                                    .addComponent(invalidPasswordLabel)
                                    .addComponent(invalidRetypePassword)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(title)))
                .addContainerGap(64, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(title)
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(usernameLabel)
                    .addComponent(usernameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(invalidUsernameLabel))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passwordLabel)
                    .addComponent(invalidPasswordLabel))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(retypePasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(retypePasswordLabel)
                    .addComponent(invalidRetypePassword))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(userLevelInstructions)
                    .addComponent(receptionistChoice))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(managerChoice)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ownerChoice)
                .addGap(39, 39, 39)
                .addComponent(submitButton)
                .addContainerGap(54, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_submitButtonActionPerformed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(AddNewUserView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(AddNewUserView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(AddNewUserView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(AddNewUserView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new AddNewUserView().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel invalidPasswordLabel;
    private javax.swing.JLabel invalidRetypePassword;
    private javax.swing.JLabel invalidUsernameLabel;
    private javax.swing.JRadioButton managerChoice;
    private javax.swing.JRadioButton ownerChoice;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JRadioButton receptionistChoice;
    private javax.swing.JPasswordField retypePasswordField;
    private javax.swing.JLabel retypePasswordLabel;
    private javax.swing.JButton submitButton;
    private javax.swing.JLabel title;
    private javax.swing.JLabel userLevelInstructions;
    private javax.swing.JTextField usernameField;
    private javax.swing.JLabel usernameLabel;
    // End of variables declaration//GEN-END:variables
}
