package model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;


public class desert_model implements wadahOrder_model {
    String nama;
    int harga;

    public String getNama() {
        return nama;
    }

    public int getHarga() {
        return harga;
    }
    public DefaultListModel listdesert(){
        DefaultListModel temp = new DefaultListModel();
        try{
            Statement statement = (Statement)connect.GetConnection().createStatement();
            ResultSet res = statement.executeQuery("select nama_desert from desert");
            while (res.next()){
                String nm = res.getString(1);
                temp.addElement(nm);
            }
            return temp;
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Tidak terhubung dengan server");
        }
        return null;
    }

    @Override
    public String warnaWadah() {
        return "warna merah";
    }
}

