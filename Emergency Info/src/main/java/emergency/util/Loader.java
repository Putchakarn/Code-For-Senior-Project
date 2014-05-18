package emergency.util;


import emergency.entity.Category;
import emergency.entity.HelpPlace;
import emergency.entity.Province;
import emergency.service.HelpPlaceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: gii guide
 * Date: 1/5/2557
 * Time: 14:45 น.
 * To change this template use File | Settings | File Templates.
 */
@Component
public class Loader  implements ApplicationListener<ContextRefreshedEvent> {

    @Autowired
    HelpPlaceService helpPlaceService;

    //@Autowired
   // UserDAO userDAO;
    boolean isLoad = false;

    @Override
    @Transactional
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        //To change body of implemented methods use File | Settings | File Templates.
        if (!isLoad){

            Category c1 = new Category("Hospital");
            Category c2 = new Category("Police Station");
            Category c3 = new Category("Highway Police Station");
            Category c4 = new Category("Garage");

            Province p1 = new Province("Chiang Mai");
            Province p2 = new Province("Chiang Rai");
            Province p3 = new Province("Lampang");

            HelpPlace h1 = new HelpPlace("bvbvbvbvMaharaj Nakorn Chiang Mai Hospital","110 Suthep Rd","Mueang Chiang Mai","50200",p1,"053-947700",18.789602 ,98.974209,c1);
            HelpPlace h2 = new HelpPlace("Lanna Hospital","Chang Phuak","Mueang Chiang Mai","50300",p1,"053-999758",18.812723, 98.991151,c1);
            HelpPlace h3 = new HelpPlace("Lampang Hospital","Tambon Phrabat","Amphoe Mueang Lampang","52000",p3,"054-237400",18.285378, 99.506305,c1);
            HelpPlace h4 = new HelpPlace("Chiang Rai Police Station","Rattanakeat Road", "Mueang Chiang Rai","57000",p2,"053-603100",19.912221,99.832526,c2);
            HelpPlace h5 = new HelpPlace("Ruangchai Yon Garage","Outer Ring Road","Saraphi District","50000",p1,"053-242999",18.750651, 99.055108,c4);


            helpPlaceService.updateHelpPlace(h1);
            helpPlaceService.updateHelpPlace(h2);
            helpPlaceService.updateHelpPlace(h3);
            helpPlaceService.updateHelpPlace(h4);
            helpPlaceService.updateHelpPlace(h5);

            List<HelpPlace> helpPlaceHospital = new ArrayList<HelpPlace>() ;
            helpPlaceHospital.add(h1);
            helpPlaceHospital.add(h2);
            helpPlaceHospital.add(h3);
            helpPlaceHospital.add(h5);


            c1.setHelpPlaces(helpPlaceHospital);


//            List<HelpPlace>   helpPlaces = new ArrayList<HelpPlace>();
//            helpPlaces.add(h1);
//            helpPlaces.add(h2);
//            helpPlaces.add(h3);
//
//            List<HelpPlace>   helpPlaces2 = new ArrayList<HelpPlace>();
//            helpPlaces2.add(h4);
//
//            List<HelpPlace>   helpPlaces3 = new ArrayList<HelpPlace>();
//            helpPlaces3.add(h5);





            isLoad = true;





        }
    }
}

