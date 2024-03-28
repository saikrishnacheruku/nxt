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

public interface CategoryRepository {

    List<Category> getCategorysList();

    Category getCategoryById(int categoryId);

    Category addCategory(Category category);

    Category updateCategory(int categoryId, Category category);

    void deleteCategory(int categoryId);

}