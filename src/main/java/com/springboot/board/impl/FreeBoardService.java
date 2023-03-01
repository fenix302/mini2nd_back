package com.springboot.board.impl;

import java.util.List;
import com.springboot.board.model.FreeBoard;

public interface FreeBoardService {
   
   void insert(FreeBoard freeBoard);

   void update(FreeBoard freeBoard);

   void delete(FreeBoard freeBoard);

   FreeBoard view();
   
}