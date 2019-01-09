package ua.dp.ttCompetition;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RedirectController {

    @RequestMapping(value = "/")
    public String toMainPage(){
        return "redirect:/users";
    }
}
