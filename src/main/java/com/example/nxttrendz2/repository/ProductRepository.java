/*
 *
 * You can use the following import statements
 * 
 * import java.util.ArrayList;
 * 
 */

// Write your code here

/*
 *
 * You can use the following import statements
 * 
 * import java.util.ArrayList;
 * 
 */

// Write your code here

package com.example.nxttrendz2.repository;

import com.example.nxttrendz2.model.*;

import java.util.*;

public interface ProductRepository {

    List<Product> getProducts();

    Product getProductById(int productId);

    Product addProduct(Product product);

    Product updateProduct(int productId, Product product);

    void deleteProduct(int productId);

    Category getProductCategory(int productId);

}