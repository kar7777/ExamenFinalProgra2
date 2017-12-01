/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic;


/**
 **

 ** @author Karla
 *
 */
public class History {

    private String userID;
    private int purchaseID;
    
    public History(String userID, int purchaseID) {
        this.userID = userID;
        this.purchaseID = purchaseID;
    }
   
    public String getUserID() {
        return userID;
    }
    //
    public void setUserID(String userID) {
        this.userID = userID;
    }
    //
    public int getPurchaseID() {
        return purchaseID;
    }
    //
    public void setPurchaseID(int purchaseID) {
        this.purchaseID = purchaseID;
    }

    public Object getItems() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   
    
}