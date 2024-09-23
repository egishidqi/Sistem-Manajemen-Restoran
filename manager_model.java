package model;

import java.sql.SQLException;
import java.sql.Statement;

public class manager_model extends employee_model{
    
    public void editData_peg(int i, String change, String nama) throws SQLException{
        Statement statement =(Statement)connect.GetConnection().createStatement();
        if (i == 1){
            statement.executeUpdate("UPDATE pegawai set nama_pegawai ='"+ change +"' where nama_pegawai ='"+ nama +"'");
        }else if (i == 2){
            statement.executeUpdate("UPDATE pegawai set id_pegawai ='"+ change +"' where nama_pegawai ='"+ nama +"'");
        }else if (i == 3){
            statement.executeUpdate("UPDATE pegawai set password ='"+ change +"' where nama_pegawai ='"+ nama +"'");
        }
    }
    public void hapusPegawai(String id) throws SQLException{
        Statement statement = (Statement)connect.GetConnection().createStatement();
        statement.executeUpdate("DELETE FROM pegawai WHERE id_pegawai = " + "'" + id + "';");
    }
}
