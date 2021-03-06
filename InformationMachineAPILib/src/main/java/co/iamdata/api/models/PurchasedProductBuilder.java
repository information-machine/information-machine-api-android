/*
 * InformationMachineAPILib
 *
 * 
 */
package co.iamdata.api.models;

import java.util.*;

public class PurchasedProductBuilder {
    //the instance to build
    private PurchasedProduct purchasedProduct;

    /**
     * Default constructor to initialize the instance
     */
    public PurchasedProductBuilder() {
        purchasedProduct = new PurchasedProduct();
    }

    public PurchasedProductBuilder date(String date) {
        purchasedProduct.setDate(date);
        return this;
    }

    public PurchasedProductBuilder price(Double price) {
        purchasedProduct.setPrice(price);
        return this;
    }

    public PurchasedProductBuilder productId(Integer productId) {
        purchasedProduct.setProductId(productId);
        return this;
    }

    public PurchasedProductBuilder store(String store) {
        purchasedProduct.setStore(store);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public PurchasedProduct build() {
        return purchasedProduct;
    }
}