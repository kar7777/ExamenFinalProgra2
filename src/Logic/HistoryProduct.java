/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic;

/**
 *
 * @author karla
 */
public class HistoryProduct {
    private String productAmount;
    private String productName;
    private String unitPrice;
    private String totalPrice;

    public HistoryProduct(String productAmount, String productName, String unitPrice, String totalPrice) {
        this.productAmount = productAmount;
        this.productName = productName;
        this.unitPrice = unitPrice;
        this.totalPrice = totalPrice;
    }

    public String getProductAmount() {
        return productAmount;
    }

    public void setProductAmount(String productAmount) {
        this.productAmount = productAmount;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(String unitPrice) {
        this.unitPrice = unitPrice;
    }

    public String getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(String totalPrice) {
        this.totalPrice = totalPrice;
    }

    }

