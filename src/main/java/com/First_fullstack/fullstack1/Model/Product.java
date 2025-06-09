package com.First_fullstack.fullstack1.Model;


import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.Date;

@Entity
@Table(name = "product")
public class Product {


    @Id
    @Column(name = "id")
    private int id;
    private String name;
    private String description;
    private String brand;
    private int price;
    private boolean available;
    private int quantity;
    private String category;
    private LocalDate releaseDate;

    public Product() {}
    public Product(int id,String name, String description, String brand, int price, boolean available, int quantity, String category, LocalDate releaseDate) {
        this.name = name;
        this.description = description;
        this.brand = brand;
        this.price = price;
        this.available = available;
        this.quantity = quantity;
        this.category = category;
        this.releaseDate = releaseDate;
        this.id = id;

    }


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

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


}
