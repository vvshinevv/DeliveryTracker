package com.hackday.deliveryTracker.service;

import java.util.List;
import java.util.Map;

import com.hackday.deliveryTracker.vo.DeliveryTrackerVo;

public interface DeliveryTrackerService {	
	public List<DeliveryTrackerVo> getAllDeliveryTracker(Map<String, Object> map);
}
