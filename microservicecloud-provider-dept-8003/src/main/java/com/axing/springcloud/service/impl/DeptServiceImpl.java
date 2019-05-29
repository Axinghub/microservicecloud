package com.axing.springcloud.service.impl;

import java.util.List;

import com.axing.springcloud.dao.DeptDao;
import com.axing.springcloud.entities.Dept;
import com.axing.springcloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class DeptServiceImpl implements DeptService
{
	@Autowired
	private DeptDao dao;
	
	@Override
	public boolean add(Dept dept)
	{
		return dao.addDept(dept);
	}

	@Override
	public Dept get(Long id)
	{
		return dao.findById(id);
	}

	@Override
	public List<Dept> list()
	{
		return dao.findAll();
	}

}
