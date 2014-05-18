package emergency.controller;


import emergency.entity.HelpPlace;
import emergency.service.HelpPlaceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: gii guide
 * Date: 30/4/2557
 * Time: 15:29 น.
 * To change this template use File | Settings | File Templates.
 */
@Controller
@RequestMapping("helpPlace")
public class HelpPlaceController {

    @Autowired
    HelpPlaceService helpPlaceService;

    @RequestMapping(value = "helpPlaces",method = RequestMethod.GET)
    public String listHelpPlaces( ModelMap model){
        List<HelpPlace> helpPlaces = helpPlaceService.getHelpPlaces();
        model.addAttribute("helpPlaces",helpPlaces);
        return "Home_page";
    }

    @RequestMapping(value = "index",method = RequestMethod.GET)
    public String index(ModelMap model){
        return "index";
    }

    // find help place by id of help placess
    @RequestMapping(value = "id/{input}",method = RequestMethod.GET)
    public String getHelpPlaceById(@PathVariable("input")Integer id , ModelMap model){
        HelpPlace h = helpPlaceService.getHelpPlaceById(id);
        model.addAttribute("helpPlace",h);
        return "JSP page";
    }

    // add or update help place to data base
    @RequestMapping("addHelpPlace")
    public String addLecturer(@ModelAttribute HelpPlace helpPlace, BindingResult bindingResult,Model model){
        helpPlaceService.updateHelpPlace(helpPlace);
        return "redirect:/lecturer/list";
    }

    // get value by id , show on text box
    @RequestMapping(value = "update/{id}")
    public String updateLecturer(@PathVariable("id") Integer id, Model model){
        HelpPlace h = helpPlaceService.findById(id);
        model.addAttribute("helpPlace",h);
        return "lecturerRegist";
    }

    // Validate before add or update
    @RequestMapping(value = "addValidHelpPlace",method = RequestMethod.POST)
    public String addValidLecturer(@Valid HelpPlace helpPlace, BindingResult bindingResult,Model model){
        if (bindingResult.hasErrors()){
            return "lecturerRegist";
        }
        helpPlaceService.updateHelpPlace(helpPlace);
        return "redirect:/lecturer/list";
    }
}
