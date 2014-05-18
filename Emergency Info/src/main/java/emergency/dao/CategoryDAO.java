package emergency.dao;


import emergency.entity.Category;

import java.util.List;

/**
 * Created by gii guide on 28/4/2557.
 */
public interface CategoryDAO {


    public Category getCategoryByName(String name);
    public List<Category> getCategories();

}
