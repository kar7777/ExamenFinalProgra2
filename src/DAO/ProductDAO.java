/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Logic.Product;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;

/**
 *
 * @author karla
 */
public class ProductDAO {
     public boolean insert(Product s) throws Exception {

        try (Connection con = ConnectionDB.connection()) {
            String sql = "insert into product (id, name, type, price) values (?,?,?,?)";
            PreparedStatement smt = con.prepareStatement(sql);
            smt.setInt   (1, s.getId());
            smt.setString(2, s.getName());
            smt.setString(3, s.getType());
             smt.setInt(1, s.getPrice());
           
            return smt.executeUpdate() > 0;
        } catch (Exception ex) {
            throw ex;
        }
     }

    /**
     *
     * @param s
     * @return
     */
    
    public boolean isProductExist(Product s) {
        int count = 0;
        boolean isExist = false;
        try (Connection con = ConnectionDB.connection()) {
            String sql = "select count(*) from Product where id = ? ";
            PreparedStatement smt = con.prepareStatement(sql);
            smt.setInt(1, s.getId());
            ResultSet rs = smt.executeQuery();

            while (rs.next()) {
                count = rs.getInt(1);
                if (count == 1) {
                    isExist = true;
                }
            }

            sql = "select id_cd from Product where id = ? ";
            smt = con.prepareStatement(sql);
            smt.setInt(1, s.getId());
            rs = smt.executeQuery();

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return isExist;
    }

  
    public LinkedList<Product> charge(LinkedList<Product> product) {
        try (Connection con = ConnectionDB.connection()) {
            String sql = "select * from Product order by id";
            PreparedStatement smt = con.prepareStatement(sql);
            ResultSet rs = smt.executeQuery();
            while (rs.next()) {
            Product p= new Product(); 
               
                
                p.setId(rs.getInt("id"));
                p.setPrice(rs.getInt("price"));
                p.setName(rs.getString("name"));
                p.setType(rs.getString("Type"));
                

            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return product;
    }

//     @param pro Product to modify
//     @return
//     @throws Exception
    public boolean modify(Product pro) throws Exception {
        try (Connection con = ConnectionDB.connection()) {
            String sql = " update customer set id=?, name=?, type=?,price=?, ";
            
            PreparedStatement smt = con.prepareStatement(sql);

            smt.setInt(1, pro.getId());
            smt.setString(2, pro.getName());
            smt.setInt(3, pro.getPrice());
            smt.setString(4, pro.getType());

            return smt.executeUpdate() > 0;
        } catch (Exception ex) {
            throw ex;
        }

    }


//      @param pro Product 
//      @throws Exception
    public void delete(Product pro) throws Exception {
        try (Connection con = ConnectionDB.connection()) {
            String sql = "delete from Product  where id=?";
            PreparedStatement smt = con.prepareStatement(sql);
            smt.setInt(1, pro.getId());
            smt.executeUpdate();
        } catch (SQLException ex) {
            throw ex;
        }
    }

    public boolean isUserExist(Product stu) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
