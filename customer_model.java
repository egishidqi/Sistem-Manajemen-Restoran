
package model;

import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;

public class customer_model {
    String nama;
    String nomor;
    String alamat;

    public void catetPelanggan(String nama, String nomor, String alamat) throws SQLException{
        Statement statement =(Statement)connect.GetConnection().createStatement();
        statement.executeUpdate("INSERT INTO customer (nama,nomor_telepon,alamat) VALUES ('" + nama + "','" + nomor + "','" + alamat + "')");
        setNama(nama);
        setNomor(nomor);
        setAlamat(alamat);
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public void setNomor(String nomor) {
        this.nomor = nomor;
    }
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
    
}
