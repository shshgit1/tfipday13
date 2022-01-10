package tfipday13.day13;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Controller
public class controller {
    File fileD;
    public Logger logger=LoggerFactory.getLogger(controller.class);
    @GetMapping("/gotoform")
    public String GetToTheForm(Model modelObject){
        fileD=Day13Application.fileDir;
        System.out.println(fileD);
        users NewUser=new users();
        modelObject.addAttribute("nameofuser", NewUser);
        logger.info("inside getmapping method");
        return "form";
    }//end gotoform method
    @PostMapping("/contact")
    public String afterSubmission(@ModelAttribute users userObjectinPostMap, Model modelObjectPostMapping) throws IOException
    { 
        logger.info("inside the postmapping method");
        userObjectinPostMap.setfiledirectory(fileD);
        logger.info("newfile is "+userObjectinPostMap.getfiledirectory());
        FileWriter fw=new FileWriter(userObjectinPostMap.randomer());
        fw.write("name : "+userObjectinPostMap.getname()+"\n");
        fw.write("email : "+userObjectinPostMap.getemailAdd()+"\n");
        fw.write("phone num : "+userObjectinPostMap.getphoneNum()+"\n");
        fw.close();
        return "aftersubmission";
    }//end aftersubmission method
    
}//end class
