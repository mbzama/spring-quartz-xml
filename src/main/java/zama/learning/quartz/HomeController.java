package zama.learning.quartz;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {
	private static final Logger log = LoggerFactory.getLogger(HomeController.class.getName());
	
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index(ModelMap model){
    	log.info("index(): {}", model);
        model.addAttribute("message", "Spring MVC XML Config Example");
        return "index";
    }
    
    @RequestMapping(value = "/quartz", method = RequestMethod.GET)
    public String quartz(ModelMap model){
    	log.info("quartz(): {}", model);
    	new ClassPathXmlApplicationContext("quartz-config.xml");
    	
        model.addAttribute("message", "Initilized Quartz...");
        return "index";
    }

}
