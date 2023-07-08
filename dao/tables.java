package dao;

import javax.swing.JOptionPane;

public class tables {
    public static void main(String[] args) {
        try {
            String userTable = "CREATE TABLE user ("
                + "id INT AUTO_INCREMENT PRIMARY KEY,"
                + "name VARCHAR(200),"
                + "email VARCHAR(200),"
                + "mobile VARCHAR(10),"
                + "address VARCHAR(50),"
                + "password VARCHAR(50),"
                + "status varchar(20),"
                + "UNIQUE (email)"
                + ")";
            String adminDetails = "insert into user(name ,email,mobile,address,password ,status) values ('Admin','admin@gmail.com','9814025010','Nepal','admin@123','true')";
            
            DbOperations.setDataOrDelete(userTable, "User table created successfully");
            DbOperations.setDataOrDelete(adminDetails, "AdminDetails added successfully");
   
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
}
