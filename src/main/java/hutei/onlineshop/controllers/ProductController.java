package hutei.onlineshop.controllers;

import hutei.onlineshop.dto.Product;
import hutei.onlineshop.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;

@RestController
@RequestMapping("/product")
@CrossOrigin
public class ProductController {
    @Autowired
    private ProductService productService;

    @PostMapping("/add") //якщо відправляєм щось на бекенд
    public Product addProduct(@RequestBody Product product){

        return new Product(productService.addProduct(product));

    }

    @GetMapping("/get/{id}")
    public Product getProduct( @PathVariable String id){
        return new Product(productService.getProduct(Integer.parseInt(id)));
    }





}