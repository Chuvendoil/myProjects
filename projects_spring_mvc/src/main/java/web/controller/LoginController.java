package web.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import web.domain.User;
import web.service.UserService;
import web.service.UserServiceImpl;

import java.util.List;

/**
 * Created by Chuvychin on 21.03.2015.
 */
@Controller
public class LoginController {
    public static final Logger log = Logger.getLogger(HelloController.class);

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/auth.html", method = RequestMethod.GET)
    public String login(@RequestParam String login, @RequestParam String password, Model model){
        if (userService.findByNameAndPass(login,password).size() >=1){
            return "forward:/users.html";
        }else {
            return "index";
        }


    }

////    @RequestMapping (value = "/userlist.html", method = RequestMethod.GET)
////     public String allUsers(Model model){
////        List<User> list = userService.getAll();
//////        model.addAttribute("list",list);
//////        System.out.println(list);
////
////        return "userlist";
//    }
    @RequestMapping (value = "/userlist", method = RequestMethod.GET)
    public @ResponseBody List<User> allUsersList(Model model) {
        List<User> list = userService.getAll();

//        System.out.println(list);

        return list;
    }
}
