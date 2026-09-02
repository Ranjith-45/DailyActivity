
package com.ShopingCart;

public class Product {

    private String Pid;
    private String cartItem;
    private int pAmount;

    public Product(String Pid, String cartItem, int pAmount) {
        this.Pid = Pid;
        this.cartItem = cartItem;
        this.pAmount = pAmount;
    }

    public String getPid() {
        return Pid;
    }

    public String getCartItem() {
        return cartItem;
    }

    public int getPAmount() {
        return pAmount;
    }
}

