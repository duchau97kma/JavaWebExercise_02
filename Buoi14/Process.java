/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buoi14;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

/**
 *
 * @author Winter
 */
public class Process {

    DBconnect dBconnect = new DBconnect();

    public void ex1() throws SQLException {
        Connection conn = dBconnect.getConnection();

        PreparedStatement ps = conn.prepareStatement("select sothe, ten, khoa from DOCGIA order by khoa asc");
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            System.out.println(rs.getString("sothe"));
            System.out.println(rs.getString("ten"));
            System.out.println(rs.getString("khoa"));
            System.out.println("=====");
        }
    }

    public void ex2(String name, String date) throws SQLException {
        Connection conn = dBconnect.getConnection();
        String sql = "select dg.ten from PHIEUMUON as pm\n"
                + "join DOCGIA as dg on pm.sothe = dg.sothe\n"
                + "join SACH as s on pm.masach = s.masach\n"
                + "where s.ten = ? and pm.ngaymuon = STR_TO_DATE(? , '%d/%m/%Y')";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, name);
        ps.setString(2, date);
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            System.out.println(rs.getString(1));

        }

    }

    public void ex3() throws SQLException {
        Connection conn = dBconnect.getConnection();

        PreparedStatement ps = conn.prepareStatement("select dg.ten, pm.sothe, s.ten from PHIEUMUON as pm\n"
                + "join DOCGIA as dg on pm.sothe = dg.sothe\n"
                + "join SACH as s on pm.masach = s.masach\n"
                + "where pm.ngaymuon between STR_TO_DATE('01/01/2018', '%d/%m/%Y') and STR_TO_DATE('31/01/2018', '%d/%m/%Y')");
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            System.out.println(rs.getString("dg.ten"));
            System.out.println(rs.getString("sothe"));
            System.out.println(rs.getString("s.ten"));
            System.out.println("=====");
        }
    }

    public void ex4() throws SQLException {
        Connection conn = dBconnect.getConnection();
        PreparedStatement ps = conn.prepareStatement("select s.ten from SACH as s\n"
                + "where s.masach not in (select distinct masach from PHIEUMUON)");
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            System.out.println(rs.getString("s.ten"));
        }
    }

    public void ex5(String name) throws SQLException {
        Connection conn = dBconnect.getConnection();

        PreparedStatement ps = conn.prepareStatement("select count(*) as 'So lan' from PHIEUMUON as pm\n"
                + "join DOCGIA as dg on pm.sothe = dg.sothe\n"
                + "join SACH as s on pm.masach = s.masach\n"
                + "where dg.ten = ?");
        
         ps.setString(1, name);
         ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            System.out.println(rs.getString("So lan"));
            
        }
    }

    
}
