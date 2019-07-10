
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Winter
 */
public class empModel {
    public void insert(employee emp) throws SQLException{
        DBconnect db = new DBconnect();
        Connection conn = db.getConnection();
        String sql = "INSERT INTO `employee`.`user` (`username`, `password`, `fullname`, `email`, `address`) "
                + "VALUES (?,?,?,?,?)";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, emp.getUsername());
        ps.setString(2, emp.getPassword());
        ps.setString(3, emp.getFullname());
        ps.setString(4, emp.getEmail());
        ps.setString(5, emp.getAddress());
        ps.executeUpdate();
    }

}
