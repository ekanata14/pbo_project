/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nilaisekolah;
import java.sql.Connection;
import java.sql.DriverManager;
/**
 *
 * @author dreamerdream
 */
public class KoneksiDB {
    public Connection connect() {
        Connection con = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://127.0.0.1/pbo_dbsekolah", "root", "");
           //ganti nama DB yang sesuai
        } catch(Exception e) {
            System.out.print("ERROR KONEKSI KE DATABASE:\n" + e + "\n\n");
        }
            return con;
        }
}
 
