package com.axing.springcloud.service;

import com.axing.springcloud.entities.Dept;

import java.util.List;

public interface DeptService
{
	public boolean add(Dept dept);

	public Dept get(Long id);

	public List<Dept> list();
}
