/*
 *
 * You can use the following import statements
 * 
 * import org.springframework.beans.factory.annotation.Autowired;
 * import org.springframework.http.HttpStatus;
 * import org.springframework.stereotype.Service;
 * import org.springframework.web.server.ResponseStatusException;
 * import java.util.ArrayList;
 * import java.util.List;
 * 
 */

// Write your code here

/*
 *
 * You can use the following import statements
 * 
 * import org.springframework.beans.factory.annotation.Autowired;
 * import org.springframework.http.HttpStatus;
 * import org.springframework.stereotype.Service;
 * import org.springframework.web.server.ResponseStatusException;
 * import java.util.ArrayList;
 * import java.util.List;
 * 
 */

// Write your code here
package com.example.nxttrendz2.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.*;
import com.example.nxttrendz2.model.*;
import com.example.nxttrendz2.repository.*;

@Service
public class CategoryJpaService implements CategoryRepository {

  @Autowired
  private CategoryJpaRepository categoryJpaRepository;

  @Override
  public List<Category> getCategorysList() {

    List<Category> categorysList = categoryJpaRepository.findAll();

    return categorysList;

  }

  @Override

  public Category getCategoryById(int categoryId) {
    try {
      Category category = categoryJpaRepository.findById(categoryId).get();
      return category;
    } catch (Exception e) {
      throw new ResponseStatusException(HttpStatus.NOT_FOUND);
    }
  }

  @Override
  public Category addCategory(Category category) {
    return categoryJpaRepository.save(category);

  }

  @Override
  public Category updateCategory(int categoryId, Category category) {
    try {

      Category newCategory = categoryJpaRepository.findById(categoryId).get();

      if (category.getName() != null) {
        newCategory.setName(category.getName());
      }
      if (category.getDescription() != null) {
        newCategory.setDescription(category.getDescription());
      }

      categoryJpaRepository.save(newCategory);

      return newCategory;
    } catch (Exception e) {

      throw new ResponseStatusException(HttpStatus.NOT_FOUND);
    }
  }

  @Override
  public void deleteCategory(int categoryId) {
    try {
      categoryJpaRepository.deleteById(categoryId);
    } catch (Exception e) {
      throw new ResponseStatusException(HttpStatus.NOT_FOUND);
    }
    throw new ResponseStatusException(HttpStatus.NO_CONTENT);
  }

}
