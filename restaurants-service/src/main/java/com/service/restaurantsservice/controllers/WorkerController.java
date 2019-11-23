package com.service.restaurantsservice.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.service.restaurantsservice.entity.Worker;
import com.service.restaurantsservice.service.WorkerService;



@RestController
@RequestMapping("/worker")
public class WorkerController{
	
	@Autowired
	private WorkerService workerservice;
	
	@PostMapping("/save")
	public void saveWorker(@RequestBody Worker worker)
	{
	workerservice.SaveWorker(worker);
	System.out.println("Worker Added Successfully");
	}

	@GetMapping("/{id}")
		public Worker getWorker(@PathVariable("id") long id)
		{
		return workerservice.getWorker(id);
	  }
}
