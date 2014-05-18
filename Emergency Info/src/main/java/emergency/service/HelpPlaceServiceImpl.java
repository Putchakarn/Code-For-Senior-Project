package emergency.service;


import emergency.dao.HelpPlaceDAO;
import emergency.entity.HelpPlace;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: gii guide
 * Date: 28/4/2557
 * Time: 16:29 น.
 * To change this template use File | Settings | File Templates.
 */
@Service
public class HelpPlaceServiceImpl implements HelpPlaceService {
    @Autowired
    HelpPlaceDAO helpPlaceDAO;


    @Override
    @Transactional
    public List<HelpPlace> getHelpPlaces() {
        return helpPlaceDAO.getHelpPlaces();  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    @Transactional
    public HelpPlace getHelpPlaceById(Integer id) {
        return helpPlaceDAO.getHelpPlaceById(id);  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    @Transactional
    public void updateHelpPlace(HelpPlace helpPlace) {
        helpPlaceDAO.updateHelpPlace(helpPlace);//To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    @Transactional
    public void deleteHelpPlace(HelpPlace helpPlace) {
        helpPlaceDAO.deleteHelpPlace(helpPlace);//To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    @Transactional
    public HelpPlace findById(Integer id){
       return helpPlaceDAO.findById(id);
    }
}
