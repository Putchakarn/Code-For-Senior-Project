package emergency.controller;

import emergency.entity.HelpPlace;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import emergency.entity.Category;
import emergency.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: gii guide
 * Date: 30/4/2557
 * Time: 15:31 น.
 * To change this template use File | Settings | File Templates.
 */
@Controller
@RequestMapping("category")
public class CategoryController {
    @Autowired
    CategoryService categoryService;

    @RequestMapping(method = RequestMethod.GET)
    public String index(ModelMap model){
        return "index";
    }

    @RequestMapping(value = "name/{input}",method = RequestMethod.GET)
    public String helpPlacesByCategory(@PathVariable("input")String name , ModelMap model){
       Category category =  categoryService.getCategoryByName(name);
        model.addAttribute("category",category);
        return "index";
    }

    @RequestMapping("list")
    public String list(Model model){
        model.addAttribute("categories", categoryService.getCategories());
        return "categoryList";
    }

    @RequestMapping(value = "json", method = RequestMethod.GET)
    public @ResponseBody String listUsersJson(ModelMap model) throws JSONException {
        JSONArray categoryArray = new JSONArray();
        JSONArray categoryArray2 = new JSONArray();

        for (Category category : categoryService.getCategories()) {
            JSONObject categoryJSON = new JSONObject();
            categoryJSON.put("id",category.getId()) ;
            categoryJSON.put("name",category.getName()) ;

            for (HelpPlace helpPlace : category.getHelpPlaces())  {
                JSONObject categoryJSON2 = new JSONObject();
                categoryJSON2.put("idd",helpPlace.getId());
                categoryArray2.put(categoryJSON2);
                categoryJSON.put("help place",categoryArray2) ;

            }



            categoryArray.put(categoryJSON);
        }
        return categoryArray.toString();
    }
}
