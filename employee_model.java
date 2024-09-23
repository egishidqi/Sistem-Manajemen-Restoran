package model;

import model.connect;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class employee_model extends menu_model{
    String nama;
    String id;
    String pass;
    //getter
    public String getNama_pegawai_db (String id) throws SQLException{
        Statement statement =(Statement)connect.GetConnection().createStatement();
        ResultSet result = statement.executeQuery("select * from pegawai where " + "id_pegawai ='" + id + "'"); 
        return result.getString("nama_pegawai");
    }
    // method
    public void daftarAkun (String id, String password, String nama) throws SQLException{
        Statement statement =(Statement)connect.GetConnection().createStatement();
        statement.executeUpdate("INSERT INTO pegawai VALUES " + "('" + id + "','" + password + "','" + nama + "')");       
    }
    public ResultSet checkAkun (String id, String password) throws SQLException{
        try{
            System.out.println("try");
            Statement statement =(Statement)connect.GetConnection().createStatement();
            ResultSet result = statement.executeQuery("SELECT * FROM pegawai" + "WHERE id_pegawai = '"+ id +"' AND password = '"+ password +"'");
            return result;
        }
        catch (SQLException ex){
            JOptionPane.showMessageDialog(null, "Tidak terhubung dengan server");
            System.out.println("catch");
            return null;
        }     
    }
    @Override
    public void hapusMenu (int i, String nama) throws SQLException{
        Statement statement =(Statement)connect.GetConnection().createStatement();
        if (i == 1){
            statement.executeUpdate("DELETE FROM maincourse WHERE nama_mainCourse = " + "'" + nama + "';");
        }else if(i == 2){
            statement.executeUpdate("DELETE FROM desert WHERE nama_desert = " + "'" + nama + "';");
        }else if(i == 3){
            statement.executeUpdate("DELETE FROM apetizer WHERE nama_apetizer = " + "'" + nama + "';");
        }else if(i == 4){
            statement.executeUpdate("DELETE FROM drink WHERE nama_drink = " + "'" + nama + "';");
        }
    }
    @Override
    public void nambahMenu (int i, String nama, String harga) throws SQLException{
        Statement statement =(Statement)connect.GetConnection().createStatement();
        if (i == 1){
            statement.executeUpdate("INSERT INTO maincourse VALUES " + "('" + nama + "','" + harga + "')");
        }else if(i == 2){
            statement.executeUpdate("INSERT INTO drink VALUES " + "('" + nama + "','" + harga + "')");
        }else if(i == 3){
            statement.executeUpdate("INSERT INTO apetizer VALUES " + "('" + nama + "','" + harga + "')");
        }else if(i == 4){
            statement.executeUpdate("INSERT INTO desert VALUES " + "('" + nama + "','" + harga + "')");
        }
    }
    public void change_menuName(String name){
        super.setNamaMenu(namaMenu);
    }
}
