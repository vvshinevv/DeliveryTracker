package com.hackday.deliveryTracker.service.impl;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Service;

import com.hackday.deliveryTracker.service.DeliveryTrackerService;

@Service("deliveryTrackerService")
public class DeliveryTrackerServiceImpl extends SqlSessionDaoSupport implements DeliveryTrackerService {

	@Override
	public List<Map<String, Object>> getAllUserList() {
		return getSqlSession().selectList("deliveryTracker.selectAllUser");
	}

}
