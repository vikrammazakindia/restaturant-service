package com.service.restaurantsservice.repositories;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.service.restaurantsservice.entity.Worker;


@Repository
public interface WorkerRepository extends JpaRepository<Worker,Long>{

	@Query("select d from worker d where id= :id")
	@Transactional
	public List<Worker> getList(@Param("id")long id);
}
