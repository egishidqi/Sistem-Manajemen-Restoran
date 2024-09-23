package model;

import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;
import javax.swing.DefaultListModel;

public abstract class menu_model {
    mainCourse_model mc;
    drinks_model dr;
    desert_model de;
    apetizer_model ap;
    public DefaultListModel list_mc;
    public DefaultListModel list_dr;
    public DefaultListModel list_de;
    public DefaultListModel list_ap;
    public String namaMenu;

    public menu_model() {
        mc = new mainCourse_model();
        dr = new drinks_model();
        de = new desert_model();
        ap = new apetizer_model();
    }
    
    public abstract void hapusMenu (int i, String nama) throws SQLException;

    public abstract void nambahMenu (int i, String nama, String harga) throws SQLException;

    public void infoMenu(){
        list_mc = mc.listmain();
        list_dr = dr.listdrink();
        list_de = de.listdesert();
        list_ap = ap.listapetizer();
    }

    public void setNamaMenu(String namaMenu) {
        this.namaMenu = namaMenu;
    }
    
}