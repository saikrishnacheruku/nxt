/*
 *
 * You can use the following import statements
 * 
 * import org.springframework.beans.factory.annotation.Autowired;
 * import org.springframework.web.bind.annotation.*;
 * import java.util.ArrayList;
 * 
 */

// Write your code here

package com.example.nxttrendz2.controller;

import com.example.nxttrendz2.model.*;
//import com.example.nxttrendz2.repository.*;
import com.example.nxttrendz2.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
public class CategoryController {

    @Autowired
    private CategoryJpaService categoryJpaService;

    @GetMapping("/categories")
    public List<Category> getCategorysList() {
        return categoryJpaService.getCategorysList();
    }

    @GetMapping("/categories/{categoryId}")
    public Category getCategoryById(@PathVariable("categoryId") int categoryId) {
        return categoryJpaService.getCategoryById(categoryId);
    }

    @PostMapping("/categories")
    public Category addCategory(@RequestBody Category category) {
        return categoryJpaService.addCategory(category);
    }

    @PutMapping("/categories/{categoryId}")
    public Category updateCategory(@PathVariable("categoryId") int categoryId, @RequestBody Category category) {
        return categoryJpaService.updateCategory(categoryId, category);
    }

    @DeleteMapping("/categories/{categoryId}")
    public void deleteCategory(@PathVariable("categoryId") int categoryId) {
        categoryJpaService.deleteCategory(categoryId);
    }

}