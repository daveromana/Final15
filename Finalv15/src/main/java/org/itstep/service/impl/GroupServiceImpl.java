package org.itstep.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.itstep.dao.GroupDao;
import org.itstep.dao.pojo.Group;
import org.itstep.service.GroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GroupServiceImpl implements GroupService{
	
	@Autowired
	GroupDao groupDao;
	
	@Override
	public Group createAndUpdate(Group group) {
		// TODO Auto-generated method stub
		return groupDao.saveAndFlush(group);
	}

	@Override
	public Group getOne(long id) {
		// TODO Auto-generated method stub
		return groupDao.getOne(id);
	}

	@Override
	public List<Group> findAllByCourse(int course) {
		// TODO Auto-generated method stub
		return groupDao.findAllByCourse(course);
	}

	@Override
	public void delete(long id) {
		groupDao.delete(id);
		
	}
	
	@Override
	public boolean isUnic(Group group) {
		ArrayList<Group> groups = (ArrayList<Group>) groupDao.findAllByCourse(group.getCourse());
		
		for(Group groupDB : groups) {
			if(groupDB.getName().equals((group.getName())))
					return false;
		}
		return true;
	}
}
