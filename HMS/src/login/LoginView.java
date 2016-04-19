/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login;

/**
 *
 * @author Yeejkoob Thao
 */
import java.awt.CardLayout;
import java.awt.event.ActionListener;
import javax.swing.*;
import home.*;
import usermanagementview.UserController;
public class LoginView extends javax.swing.JPanel {

    /**
     * Creates new form LoginViewPanel
     */
    private JPanel allPanelContainer;
    private HomeView associatedHomeView;
    private HomeController associatedHomeController;
    private UserController associatedUserController;
    public LoginView(JPanel panelContainer, HomeView homeView, HomeController homeController, UserController userController) {
        this.allPanelContainer = panelContainer;
        this.associatedHomeView = homeView;
        this.associatedHomeController = homeController;
        this.associatedUserController = userController;
        initComponents();
    }

    public HomeView getAssociatedHomeView() {
        return this.associatedHomeView;
    }
    
    public HomeController getAssociatedHomeController() {
        return this.associatedHomeController;
    }
    
    public UserController getAssociatedUserController() {
        return this.associatedUserController;
    }
    
    public String getInputUsername() {
    
        return usernameField.getText();
        
    }
    
    public String getInputPassword() {
    
        return String.valueOf(passwordField.getPassword());
            
    }
    
    void addLoginButtonListener(ActionListener listenForLogin) {
        loginButton.addActionListener(listenForLogin);
    }
    
    void displayErrorMessage(String errorMessage) {
        JOptionPane.showMessageDialog(this, errorMessage);
    }
    
    public void goToHomeView() {
        CardLayout cardLayout = (CardLayout) allPanelContainer.getLayout();
        cardLayout.show(allPanelContainer, "Home View");
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
        instructionsLabel = new javax.swing.JLabel();
        title = new javax.swing.JLabel();
        usernameField = new javax.swing.JTextField();
        userNameLabel = new javax.swing.JLabel();
        passwordLabel = new javax.swing.JLabel();
        passwordField = new javax.swing.JPasswordField();
        loginButton = new javax.swing.JButton();

        setLayout(new java.awt.GridBagLayout());

        instructionsLabel.setText("Please enter your username and password");

        title.setText("Hotel Managment System");

        userNameLabel.setText("Username");

        passwordLabel.setText("Password");

        loginButton.setText("Login");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(109, 109, 109)
                .addComponent(title))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(instructionsLabel))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(userNameLabel)
                .addGap(56, 56, 56)
                .addComponent(usernameField, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(passwordLabel)
                .addGap(60, 60, 60)
                .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(158, 158, 158)
                .addComponent(loginButton))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(title)
                .addGap(9, 9, 9)
                .addComponent(instructionsLabel)
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(userNameLabel))
                    .addComponent(usernameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(passwordLabel))
                    .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addComponent(loginButton))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        add(jPanel1, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel instructionsLabel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton loginButton;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JLabel title;
    private javax.swing.JLabel userNameLabel;
    private javax.swing.JTextField usernameField;
    // End of variables declaration//GEN-END:variables
}
