package tfipday13.day13;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Controller
public class controller {
    public Logger logger=LoggerFactory.getLogger(controller.class);
    @GetMapping("/gotoform")
    public String GetToTheForm(Model modelObject){
        users NewUser=new users();
        modelObject.addAttribute("nameofuser", NewUser);
        logger.info("going to form page");
        return "form";
    }
    @PostMapping("/contacts")
    public String afterSubmission(@ModelAttribute users NewUser, Model modelObjectPostMapping)
    { 
        logger.info("from form :" + NewUser.getName());
        logger.info("password :" + NewUser.getemailAdd());
        logger.info("number :"+NewUser.getphoneNum());
        return "aftersubmission";
    }
    
}
