package com.study.test.board;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.study.test.board.model.BoardPARAM;
import com.study.test.board.model.BoardVO;

@Mapper
public interface BoardMapper {

	List<BoardVO> selBoard();
	
	BoardVO detailBoard(BoardPARAM param);
	
	int insBoard(BoardPARAM param);
	
	int updBoard(BoardPARAM param);
	
	int delBoard(BoardPARAM param);
	
}
