package emergency.service;



import emergency.entity.HelpPlace;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: gii guide
 * Date: 28/4/2557
 * Time: 16:27 น.
 * To change this template use File | Settings | File Templates.
 */
public interface HelpPlaceService {

    public List<HelpPlace> getHelpPlaces();
    public HelpPlace getHelpPlaceById(Integer id);
    public void updateHelpPlace(HelpPlace helpPlace);
    public void deleteHelpPlace(HelpPlace helpPlace);
    public HelpPlace findById(Integer id);

}
