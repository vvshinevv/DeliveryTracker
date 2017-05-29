package com.hackday.deliveryTracker.service.impl;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.hackday.deliveryTracker.service.DeliveryTrackerService;
import com.hackday.deliveryTracker.vo.DeliveryTrackerVo;

@Service("deliveryTrackerService")
public class DeliveryTrackerServiceImpl extends SqlSessionDaoSupport implements DeliveryTrackerService {
	private static final Logger logger = LoggerFactory.getLogger(DeliveryTrackerServiceImpl.class);

	@Override
	public List<DeliveryTrackerVo> getAllDeliveryTracker(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return getSqlSession().selectList("deliveryTracker.getAllDeliveryTracker", map);
	}
	
}
