/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BO;

import DAO.ProductDAO;
import Logic.Product;



/**
 *
 * @author karla
 */
public class ProductBO {

     public boolean register(Product p) throws Exception {
        if (p.getId() <= 0) {
            throw new Exception("Required ID");
        }
        if (p.getPrice() <= 0) {
            throw new Exception("Required Price");
        }
        if (p.getName().isEmpty()) {
            throw new Exception("Required Name");
        }
        if (p.getType().isEmpty()) {
            throw new Exception("Type Required" );
        } else {
        }
     


        ProductDAO pdao = new ProductDAO();
        if (p.getId() > 0) {
            return pdao.modify(p);
        } else {
            return pdao.insert(p);
        }
    }

//    Check if the Product exists
    public boolean userLogin(Product pro) {
        ProductDAO pdao = new ProductDAO();
        return pdao.isUserExist(pro);
    }

    /**
     * 
     *
     * @param pro
     * @throws Exception
     */
    public void remove(Product pro) throws Exception {
        if (pro.getId() <= 0) {
            throw new Exception("Please select the product to remove: ");
        }
        ProductDAO cdao = new ProductDAO();
        cdao.delete(pro);
    }

}
