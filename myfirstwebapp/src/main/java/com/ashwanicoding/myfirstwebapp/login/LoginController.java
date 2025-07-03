package com.ashwanicoding.myfirstwebapp.login;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

@Controller
@SessionAttributes("username")
public class LoginController {

    private Logger logger = LoggerFactory.getLogger(getClass());

    private AuthenticationService authenticationService;

    public LoginController(AuthenticationService authenticationService) {
        super();
        this.authenticationService = authenticationService;
    }

    @RequestMapping("login-html")
    public String goToLogin(@RequestParam String name, Model model) {
        logger.info("This is just the info by {}", name);
        logger.debug("This is just the debug by {}", name);
        model.addAttribute("name", name);
        return "loginHtml";
    }

    @RequestMapping(value = "login", method = RequestMethod.GET)
    public String login() {
        return "login";
    }

    @RequestMapping(value = "login", method = RequestMethod.POST)
    public String welcome(@RequestParam String username, @RequestParam String password, ModelMap model) {
        if(authenticationService.isUserAuthenticate(username,password)){
            model.put("username", username);
            model.put("password", password);
            model.put("errorMessage","");
            return "welcome";
        }
        model.put("errorMessage","Invalid credentials! try again");
        return "login";
    }

}
