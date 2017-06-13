package com.hackday.deliveryTracker;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.hackday.deliveryTracker.service.DeliveryTrackerService;
import com.hackday.deliveryTracker.vo.DeliveryTrackerVo;

@Controller
public class DeliveryTrackerController {
	private static final Logger logger = LoggerFactory.getLogger(DeliveryTrackerController.class);
	
	@Resource(name="deliveryTrackerService")
	private DeliveryTrackerService deliveryTrackerService;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(@RequestParam Map<String, Object> map, Model model) {
		logger.info("====[DeliveryTrackerController.class]====");
		map.put("invoiceNumber", "698039088573"); map.put("deliveryCompany", "CJ대한통운");
		List<DeliveryTrackerVo> deliveryTrackerList = deliveryTrackerService.getAllDeliveryTracker(map);
		model.addAttribute("deliveryTrackerList", deliveryTrackerList);
		logger.info(deliveryTrackerList.get(0).getDeliveryCompany());
		return "home";
	}
}