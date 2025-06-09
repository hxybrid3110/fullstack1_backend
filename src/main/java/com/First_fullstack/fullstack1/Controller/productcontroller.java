package com.First_fullstack.fullstack1.Controller;


import com.First_fullstack.fullstack1.Model.Product;
import com.First_fullstack.fullstack1.Service.productservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/products")
public class productcontroller {

@Autowired
productservice ps;

    @GetMapping
    public List<Product> getproducts(){
        return ps.getproducts();
    }


    @GetMapping(path = "/{id}")
    public Product getproductbyid(@PathVariable int id){
        return ps.getproductbyid(id);
    }

    @PostMapping
    public void addproduct( @RequestPart("product") Product product,
                            @RequestPart("imageFile") MultipartFile imageFile){
        ps.addproduct(product,imageFile);
    }

    @GetMapping(path = "/{id}/image")
    public ResponseEntity<byte[]> getimagedata(@PathVariable int id) {
        Product product = ps.getproductbyid(id); // or however you're fetching

        return ResponseEntity.ok()
                .contentType(MediaType.parseMediaType(product.getImagetype()))
                .body(product.getImagedata());
    }


}
