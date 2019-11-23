package com.service.restaurantsservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.service.restaurantsservice.entity.Worker;
import com.service.restaurantsservice.repositories.WorkerRepository;

@Service
public class WorkerService {
	@Autowired
    private	WorkerRepository workerrep; 
	public void SaveWorker(Worker worker) 
	{
		workerrep.save(worker);
	}
	public Worker getWorker(long id) 
	{
	return workerrep.getOne(id);
	)
		
	}

}
