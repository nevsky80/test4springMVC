package system.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import system.model.Item;
import system.service.MainService;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class MainController {

    @Autowired
    private MainService mainService;

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String addNew(HttpServletRequest request) {

        String name = request.getParameter("name");
        Item item = new Item(name);
        mainService.insert(item);

        return "redirect:/";

    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public ModelAndView find(HttpServletRequest request) {

        String name = request.getParameter("name");
        List<Item> list;
        if (name.isEmpty()) {
            list = mainService.getAllItems();
        } else {
            list = mainService.getItemsByName(name);
        }
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("items");
        modelAndView.addObject("listJSP", list);

        return modelAndView;

    }


    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView items() {

        List<Item> list = mainService.getAllItems();
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("items");
        modelAndView.addObject("listJSP", list);

        return modelAndView;

    }


}
