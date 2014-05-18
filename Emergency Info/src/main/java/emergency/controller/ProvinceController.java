package emergency.controller;

import emergency.entity.Province;
import emergency.service.ProvinceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created with IntelliJ IDEA.
 * User: gii guide
 * Date: 30/4/2557
 * Time: 15:30 น.
 * To change this template use File | Settings | File Templates.
 */
@Controller
@RequestMapping("province")
public class ProvinceController {

    @Autowired
    ProvinceService provinceService;

    @RequestMapping(value = "index",method = RequestMethod.GET)
    public String index(ModelMap model){
        return "index";
    }


    @RequestMapping(value = "province/{input}",method = RequestMethod.GET)
    public String helpPlacesByProvince(@PathVariable("input")String name , ModelMap model){
        Province province=  provinceService.getProvinceByName(name);
        model.addAttribute("helpPlaces",province);
        return "PageJSP";
    }
}
