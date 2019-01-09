package ua.dp.ttCompetition;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@RequestMapping("/users")
@Controller
public class UsersController {

    private final Logger logger = LoggerFactory.getLogger(UsersController.class);
    private UserService userService;

    @RequestMapping(method = RequestMethod.GET)
    public String users(Model uiModel){
        logger.info("Listing users");
        List<User> users = userService.findAll();
        uiModel.addAttribute("users", users);
        logger.info("No. of users: " + users.size());
        return "/users/users";
    }

    @Autowired
    public void setUserService(UserService userService){
        this.userService = userService;
    }
}
