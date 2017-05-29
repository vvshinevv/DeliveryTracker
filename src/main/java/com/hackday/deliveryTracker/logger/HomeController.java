package com.hackday.deliveryTracker.logger;

import java.util.Locale;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.hackday.deliveryTracker.service.DeliveryTrackerService;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@Resource(name="deliveryTrackerService")
	private DeliveryTrackerService deliveryTrackerService;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.debug("홍돌이");
		//List<Map<String, Object>> allUsersList = deliveryTrackerService.getAllUserList();
		//model.addAttribute("allUsersList", allUsersList);
		//logger.info(allUsersList.toString());
		return "home";
	}
	
}
