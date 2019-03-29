package lv.tsi.webshop;

import lv.tsi.webshop.model.ProductCategory;

import javax.persistence.*;

public class Product {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    long id;
    String name;
    String description;
    float price;
    String pictureUrl;
    @Enumerated(EnumType.STRING)
    ProductCategory productCatedory;

    public Product(){
        
    }
    public Long getId(){
        return id;
    }

}
