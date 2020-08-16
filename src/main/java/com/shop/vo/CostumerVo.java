package com.shop.vo;

import com.shop.domain.Product;
import com.shop.domain.User;

public class CostumerVo {
    private Product product;
    private User user;

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "CostumerVo{" +
                "product=" + product +
                ", user=" + user +
                '}';
    }
}
