package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.OrderEntity;
import com.example.demo.Repository.OrderRepo;

@Service
public class OrderService {

	@Autowired
	OrderRepo or;
	
	public List<OrderEntity> showinfo()
	{
		return or.findAll();
	}
	
	public List<OrderEntity> postinfo(List<OrderEntity> oe)
	{
		return or.saveAll(oe);
	}
	public void deletebyid(int id)
	{
		or.deleteById(id);
	}
}
