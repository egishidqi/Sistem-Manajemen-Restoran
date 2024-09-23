    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author ASUS
 */
public class mainCourse_model implements takeAway_model{
    String nama;
    int harga;

    public String getNama() {
        return nama;
    }
    
    public int getHarga() {
        return harga;
    }  
    public DefaultListModel listmain(){
        DefaultListModel temp = new DefaultListModel();
        try{
            Statement statement = (Statement)connect.GetConnection().createStatement();
            ResultSet res = statement.executeQuery("select nama_mainCourse from maincourse");
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
    public String CustomOrder() {
        return "extra pedas";
    }
}
