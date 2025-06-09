package com.First_fullstack.fullstack1.Controller;


import com.First_fullstack.fullstack1.Model.Product;
import com.First_fullstack.fullstack1.Service.productservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

}
