package hutei.onlineshop.controllers;

import hutei.onlineshop.dto.Category;
import hutei.onlineshop.services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/category")
@CrossOrigin
public class CategoryController {
    @Autowired
    private CategoryService categoryService;

    @PostMapping("/add")
    public Category addCategory(@RequestBody Category category){
        return new Category(categoryService.addCategory(category));
    }
}
