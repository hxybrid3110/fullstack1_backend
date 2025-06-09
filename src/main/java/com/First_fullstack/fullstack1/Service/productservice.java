package com.First_fullstack.fullstack1.Service;


import com.First_fullstack.fullstack1.Model.Product;
import com.First_fullstack.fullstack1.Repository.productrepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Service
public class productservice {

    @Autowired
    productrepo pr;

    public List<Product> getproducts(){
        return pr.findAll();
    }

    public Product getproductbyid(int id){
        return pr.findById(id)
                .orElseThrow(() -> new RuntimeException("Product not found with id: " + id));
    }
    public void addproduct(Product product , MultipartFile image){
        try {
        product.setImagename(image.getOriginalFilename());
        product.setImagetype(image.getContentType());
        product.setImagedata(image.getBytes());
        }catch (IOException e){
            System.out.println("here brooooooooo");;
            e.printStackTrace();
        }
        pr.save(product);
    }

    public byte[] getimagedata(int id){
        Product product = pr.findById(id).get();
        return product.getImagedata();
    }
}
