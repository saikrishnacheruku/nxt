/*
 *
 * You can use the following import statements
 * 
 * import javax.persistence.*;
 * 
 */

// Write your code here

package com.example.nxttrendz2.model;

import javax.persistence.*;

@Entity
@Table(name = "product")
public class Product {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;


    @Column(name = "name")
    private String name;


    @Column(name = "description")
    private String description;
    @Column(name = "price")
    private Double price;//updated


    @ManyToOne
    @JoinColumn(name = "categoryid") //updated
    private Category category;


    // Constructor
    public Product(int id, String name, String description, double price, Category category) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.category = category;
    }


    public Product() {


    }


    // Getters and Setters
    public int getId() {
        return id;
    }


    public void setId(int id) {
        this.id = id;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public String getDescription() {
        return description;
    }


    public void setDescription(String description) {
        this.description = description;
    }


    public Double getPrice() {//updated
        return price;
    }


    public void setPrice(Double price) {//updated
        this.price = price;
    }


    public Category getCategory() {
        return category;
    }


    public void setCategory(Category category) {
        this.category = category;
    }
}
