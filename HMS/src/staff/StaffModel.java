package staff;

/**
 *
 * @author Yeejkoob Thao
 */
import java.sql.*;
import java.util.*;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class StaffModel {

    private Connection dbConnection;
    private Statement stmt;
    private String SQL;
    private ResultSet rs;

    // UserModel Constructor
    public StaffModel() {

        // Establish a connection to the database.
        dbConnection = null;
        stmt = null;
        try {

            dbConnection = DriverManager.getConnection("jdbc:sqlite:hotelData.db");

            stmt = dbConnection.createStatement(ResultSet.TYPE_FORWARD_ONLY,
                    ResultSet.CONCUR_READ_ONLY);
            SQL = "CREATE TABLE IF NOT EXISTS EMPLOYEES"
                    + "(EMPLOYEEID INTEGER PRIMARY KEY    AUTOINCREMENT,"
                    + " FIRSTNAME TEXT ,"
                    + " LASTNAME TEXT,"
                    //+ " JOB_DESCRIPTION,"
                    + " STATUS TEXT,"
                    + " HOURS_WORKED TEXT,"
                    + " HOURLY_WAGE TEXT,"
                    + " TOTAL_PAY TEXT)";

            stmt.executeUpdate(SQL);
            ////////////////////////////////////////////////////////////////////
            // Create a table to hold Employee Byte Arrays that came from Employee
            // Objects
            SQL = "CREATE TABLE IF NOT EXISTS EMPLOYEE_BYTE_ARRAYS"
                    + "(EMPLOYEEID INTEGER PRIMARY KEY NOT NULL,"
                    + " FIRSTNAME TEXT ,"
                    + " LASTNAME TEXT,"
                    + " BYTE_ARRAY BLOB)";

            stmt.executeUpdate(SQL);
            ////////////////////////////////////////////////////////////////////
            System.out.println("Successfully connected to the database.");
        } catch (SQLException err) {

            System.out.println(err.getMessage());

        }
    } // End of the UserModel Constructor

    public ResultSet getAllEmployees() {

        try {

            SQL = "SELECT * FROM EMPLOYEES;";
            rs = stmt.executeQuery(SQL);
            return rs;

        } catch (SQLException err) {

            System.out.println(err.getMessage());
            return null;

        }

    } // End of getAllUsers method

    public void addNewEmployee(
            String newEmployeeFirstName,
            String newEmployeeLastName,
            String newEmployeeJobDescription,
            String newEmployeeStatus,
            double newEmployeeHoursWorked,
            double newEmployeeHourlyWage,
            double newEmployeeTotalPay) {

        try {
            // Attempt to autoincrement ID field by not mentioning the ID field.
            SQL = "INSERT INTO EMPLOYEES ("
                    + "FIRSTNAME, "
                    + "LASTNAME, "
                    + "JOB_DESCRIPTION,"
                    + "STATUS,"
                    + "HOURS_WORKED,"
                    + "HOURLY_WAGE,"
                    + "TOTAL_PAY)"
                    + "VALUES ('" + newEmployeeFirstName
                    + "', '" + newEmployeeLastName + "', '"
                    + "', '" + newEmployeeJobDescription + "', "
                    //+ newEmployeeStatus + "',"
                    + newEmployeeHoursWorked + ", "
                    + newEmployeeHourlyWage + ", "
                    + newEmployeeTotalPay + ");";
            stmt.executeUpdate(SQL);
            
            
        } catch (SQLException err) {
            System.out.println(err.getMessage());
        }

    } // End of addNewUser method

    public boolean deleteEmployee(int idOfEmployeeToDelete) {

        try {
            SQL = "DELETE from EMPLOYEES where EMPLOYEEID = " + idOfEmployeeToDelete;
            stmt.executeUpdate(SQL);
            return true;
        } catch (SQLException err) {
            // Find a way to print out the error or not.
            return false;
        }

    } // End of the deleteEmployee method
    
    public boolean deleteEmployeeByteArray(int idOfEmployeeToDelete) {
        try {
            SQL = "DELETE from EMPLOYEE_BYTE_ARRAYS where EMPLOYEEID = " + idOfEmployeeToDelete;
            stmt.executeUpdate(SQL);
            return true;
        } catch (SQLException err) {
            // Find a way to print out the error or not.
            return false;
        }
    }

    public void updateEmployeeValue(String columnName, int employeeId, Object value, int row, int column) {
        
        try {
            if (column != 0) {
                stmt.executeUpdate("UPDATE EMPLOYEES SET " + columnName
                        + " = '" + value + "' WHERE EMPLOYEEID = " + employeeId);
            }
        } catch (Exception err) {
            System.out.println(err.getMessage());
        }
    } // End of the updateUserValue method

} // End of the UserModel Class
