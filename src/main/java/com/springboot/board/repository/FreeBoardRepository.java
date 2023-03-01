package com.springboot.board.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.board.model.FreeBoard;



@Repository
public interface FreeBoardRepository extends JpaRepository<FreeBoard, Integer>{
	
	FreeBoard findTopByOrderByBnoDesc();
	
	
//	List<FreeBoard> findAll();
	
	FreeBoard save(List<FreeBoard> currFreeBoard);
	
	void delete(FreeBoard freeBoard);
	
}
