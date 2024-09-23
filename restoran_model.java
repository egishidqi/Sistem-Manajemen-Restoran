package model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class restoran_model {
    public order_model order;
    public employee_model emp;
    public customer_model cust;

    public restoran_model() {
        this.order = new order_model();
        this.emp = new employee_model();
        this.cust = new customer_model();
    }
    public ResultSet getAll_employee() throws SQLException{
        Statement statement =(Statement)connect.GetConnection().createStatement();
        ResultSet result = statement.executeQuery("SELECT * FROM pegawai");
        return result;
    }
    public ResultSet getAll_customer() throws SQLException{
        Statement statement =(Statement)connect.GetConnection().createStatement();
        ResultSet result = statement.executeQuery("SELECT * FROM customer");
        return result;
    }
}
