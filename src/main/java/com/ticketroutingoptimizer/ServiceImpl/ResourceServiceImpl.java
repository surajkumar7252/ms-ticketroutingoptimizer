package com.ticketroutingoptimizer.ServiceImpl;

import org.springframework.stereotype.Service;

import com.ticketroutingoptimizer.Service.ResourceService;

@Service
public class ResourceServiceImpl implements ResourceService{

	@Override
	public String getAssignmentCompletionStatus() {
		return "Success";
	}
}
