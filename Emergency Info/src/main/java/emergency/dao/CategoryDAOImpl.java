package emergency.dao;

import emergency.entity.Category;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by gii guide on 28/4/2557.
 */
@Repository
public class CategoryDAOImpl implements CategoryDAO {

    @Autowired
    private SessionFactory sessionFactory;


    @Override
    public Category getCategoryByName(String name) {
        Category category = (Category)sessionFactory.getCurrentSession().createQuery("from Category c where c.name = '" + name +"'").uniqueResult();
        return category;    }

    @Override
    public List<Category> getCategories() {
       // List categories = sessionFactory.getCurrentSession().createQuery("from Category").list();
        return  sessionFactory.getCurrentSession().createQuery("from Category").list();
    }
}
