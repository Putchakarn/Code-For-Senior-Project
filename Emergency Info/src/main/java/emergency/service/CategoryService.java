package emergency.service;


import emergency.entity.Category;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: gii guide
 * Date: 28/4/2557
 * Time: 16:31 น.
 * To change this template use File | Settings | File Templates.
 */
public interface CategoryService {

    public Category getCategoryByName(String name);
    public List<Category> getCategories();

}
