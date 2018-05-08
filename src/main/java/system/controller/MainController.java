package system.controller;

import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import system.model.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import system.service.MainService;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
//@RequestMapping("/items")
public class MainController {

    @Autowired
    private MainService mainService;


    //  TEST
            @RequestMapping(value = "/insertTest", method = RequestMethod.GET)
            public String listBooks(){

                Item item = new Item("Test");
                mainService.insert(item);

                return "redirect:/";
            }

            @RequestMapping(value = "/getItemsByNameTest", method = RequestMethod.GET)
            public String getItemsByName(){

                List<Item> items = mainService.getItemsByName("Test");

                return "redirect:/";

            }

            @RequestMapping(value = "/getAllItems", method = RequestMethod.GET)
            public String getAllItems(){

                List<Item> items = mainService.getAllItems();

                return "redirect:/";

            }
    // ~TEST

    @RequestMapping(value = "/addNew", method = RequestMethod.POST)
    public String addNew(HttpServletRequest request){

        String name = request.getParameter("name");
        Item item = new Item(name);
        mainService.insert(item);

        return "redirect:/";

    }

/*    @RequestMapping(value = "/", method = RequestMethod.POST)
    public ModelAndView find(HttpServletRequest request){

        String name = request.getParameter("name");
        Item item = new Item(name);

        List<Item> items = mainService.getItemsByName(name);

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject(items);

        return modelAndView;

    }*/


/*    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView getAll(){
        List<Item> items = mainService.getAllItems();
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject(items);
        return modelAndView;
    }*/


/*    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String listBooks(Model model){

        model.addAttribute("item", new Item(""));
        model.addAttribute("listItems", this.mainService.getAllItems());

        return "/";
    }*/

/*    @RequestMapping(value = "/", method = RequestMethod.POST)
    public String insert(@ModelAttribute("item") Item item){

        mainService.insert(item);

        return "/";
    }*/

}
