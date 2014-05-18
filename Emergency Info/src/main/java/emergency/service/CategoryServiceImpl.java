package emergency.service;


import emergency.dao.CategoryDAO;
import emergency.entity.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: gii guide
 * Date: 28/4/2557
 * Time: 16:34 น.
 * To change this template use File | Settings | File Templates.
 */
@Service
public class CategoryServiceImpl implements CategoryService {
    @Autowired
    CategoryDAO categoryDAO;


    @Override
    @Transactional
    public Category getCategoryByName(String name) {
        return categoryDAO.getCategoryByName(name);  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    @Transactional
    public List<Category> getCategories() {
        return categoryDAO.getCategories();  //To change body of implemented methods use File | Settings | File Templates.
    }
}