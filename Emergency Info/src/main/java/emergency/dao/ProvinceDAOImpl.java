package emergency.dao;


import emergency.entity.Province;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * Created by gii guide on 28/4/2557.
 */
@Repository
public class ProvinceDAOImpl implements ProvinceDAO {

    @Autowired
    SessionFactory sessionFactory;


    @Override
    public Province getProvinceByName(String name) {
        Province province = (Province)sessionFactory.getCurrentSession().createQuery("from Province p where p.name = '" + name +"'").uniqueResult();
        return province;
    }
}
