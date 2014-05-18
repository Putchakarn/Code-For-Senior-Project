package emergency.dao;


import emergency.entity.HelpPlace;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by gii guide on 28/4/2557.
 */
@Repository
public class HelpPlaceDAOImpl implements HelpPlaceDAO{

    @Autowired
    SessionFactory sessionFactory;

    @Override
    public List<HelpPlace> getHelpPlaces() {
        List helpPlaces = sessionFactory.getCurrentSession().createQuery("from HelpPlace").list();
        return helpPlaces;
    }

    @Override
    public HelpPlace getHelpPlaceById(Integer id) {
        return (HelpPlace) sessionFactory.getCurrentSession().get(HelpPlace.class,id);
    }

    @Override
    public void updateHelpPlace(HelpPlace helpPlace) {
        sessionFactory.getCurrentSession().saveOrUpdate(helpPlace);
    }

    @Override
    public void deleteHelpPlace(HelpPlace helpPlace) {
        sessionFactory.getCurrentSession().delete(helpPlace);
    }

    @Override
    public HelpPlace findById(Integer id) {
        return (HelpPlace) sessionFactory.getCurrentSession().get(HelpPlace.class,id);
    }
}


