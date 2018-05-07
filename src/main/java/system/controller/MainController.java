package system.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMethod;
import system.dao.ItemDao;
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


    @RequestMapping(value = "/insertTest", method = RequestMethod.GET)
    public String listBooks(){

        Item item = new Item("Test");
        mainService.insert(item);

        return "redirect:/";
    }


//    @RequestMapping(value = "/", method = RequestMethod.GET)
//    public String listBooks(Model model){
//
//        model.addAttribute("item", new Item(""));
//        model.addAttribute("listItems", this.mainService.getAllItems());
//
//        return "/";
//    }

//    @RequestMapping(value = "/", method = RequestMethod.POST)
//    public String insert(@ModelAttribute("item") Item item){
//
//        mainService.insert(item);
//
//        return "/";
//    }

}
