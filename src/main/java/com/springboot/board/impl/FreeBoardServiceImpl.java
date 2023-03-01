package com.springboot.board.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.springboot.board.model.FreeBoard;
import com.springboot.board.repository.FreeBoardRepository;

@Service("freeBoardService")
public class FreeBoardServiceImpl implements FreeBoardService {
   
   @Autowired
   private FreeBoardRepository dao;
   
   public void insert(FreeBoard freeBoard) {
      dao.save(freeBoard);
   }
   
   public void update(FreeBoard freeBoard) {
      FreeBoard currFreeBoard = (FreeBoard) dao.findAll();
      currFreeBoard.setBno(freeBoard.getBno());
      currFreeBoard.setContent(freeBoard.getContent());
      currFreeBoard.setWriter(freeBoard.getWriter());
      currFreeBoard.setRegdate(freeBoard.getRegdate());
      dao.save(currFreeBoard);
      FreeBoard currFreeBoard1 = dao.findTopByOrderByBnoDesc();
      currFreeBoard1.setBno(freeBoard.getBno());
      currFreeBoard1.setContent(freeBoard.getContent());
      currFreeBoard1.setWriter(freeBoard.getWriter());
      currFreeBoard1.setRegdate(freeBoard.getRegdate());
      dao.save(currFreeBoard1);
   }
   
   public void delete(FreeBoard freeBoard) {
      dao.delete(freeBoard);
   }
   
   public FreeBoard view() {
      return dao.findTopByOrderByBnoDesc();
   }

}