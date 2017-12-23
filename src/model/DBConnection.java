/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;

/**
 *
 * @author Admin
 */
public class DBConnection {

    private Connection conn = null;
    private ResultSet rs = null;
     

    public DBConnection() {
        this("jdbc:sqlserver://localhost:1433;databaseName=QuanLyBanHang2", "sa", "123");
    }

    public DBConnection(String URL, String userName, String password) {
        try {
            //get driver
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            //connection
            conn = DriverManager.getConnection(URL, userName, password);
            System.out.println("connected");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public Connection getConnection() {
        return this.conn;
    }

    public ResultSet getData(String sql) {
        try {
            Statement state = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
                    ResultSet.CONCUR_UPDATABLE);
            ResultSet rs = state.executeQuery(sql);
            return rs;
        } catch (SQLException ex) {
            Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public void ExcuteQueryUpdateDB(String sql) {

        try {
            Statement stmt = conn.createStatement();
            stmt.executeUpdate(sql);
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }

    public DefaultComboBoxModel getCombobox(String sql, String colum1, String colum2, JComboBox cbb) {
        DefaultComboBoxModel cbbmodel = new DefaultComboBoxModel();
        Statement st;
        try {
            st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                int id = rs.getInt(colum1);
                String name = rs.getString(colum2);
                cbbmodel.addElement(new DisplayObject(id, name));
                cbb.setModel(cbbmodel);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        return cbbmodel;
    }

    public void SetSelectedCombobox(String cbbselected, JComboBox cbb) {
         for (int i = 0; i < cbb.getItemCount(); i++) {
            Object obj = cbb.getItemAt(i);
            if (obj != null) {
               DisplayObject m = (DisplayObject) obj;
                if (cbbselected.trim().equals(m.getName())) {
                    cbb.setSelectedItem(m);
                }
            }
        }

    }

}
