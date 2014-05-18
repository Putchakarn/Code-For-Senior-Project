package emergency.dao;



import emergency.entity.HelpPlace;

import java.util.List;

/**
 * Created by gii guide on 28/4/2557.
 */
public interface HelpPlaceDAO {

    public List<HelpPlace> getHelpPlaces();
    public HelpPlace getHelpPlaceById(Integer id);
    public void updateHelpPlace(HelpPlace helpPlace);
    public void deleteHelpPlace(HelpPlace helpPlace);
    public HelpPlace findById(Integer id);


}
