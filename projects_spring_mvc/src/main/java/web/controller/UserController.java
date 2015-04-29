package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import web.domain.User;
import web.service.UserService;

import java.util.List;

/**
 * Created by Chuvychin on 21.03.2015.
 */

@Controller
public class UserController {

    @Autowired
    private UserService userService;


}
