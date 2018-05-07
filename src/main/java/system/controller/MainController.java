package system.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMethod;
import system.model.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import system.service.MainService;
import java.util.List;

@Controller
//@RequestMapping("/items")
public class MainController {

    @Autowired
    private MainService mainService;

//    @RequestMapping(value = "/list", method = RequestMethod.GET)
//    public @ResponseBody List<Item> getAllItems(){
//        return mainService.getAllItems();
//    }

//    @RequestMapping(value = "/new", method = RequestMethod.POST)
//    public @ResponseBody void newItem(@ModelAttribute("newItem") Item item){
//
//    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String getAllItems(Model model){
        model.addAttribute("item", new Item(4,"234"));
        model.addAttribute("listItems", mainService.getAllItems());

        return "items";
    }

}
