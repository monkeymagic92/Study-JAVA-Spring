package com.study.test.board;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.study.test.board.model.BoardPARAM;
import com.study.test.board.model.BoardVO;

@Service
public class BoardService {

	@Autowired
	private BoardMapper mapper;
	
	// list
	public List<BoardVO> selBoard() {
		return mapper.selBoard();
	}
	
	// ins
	public int insBoard(BoardPARAM param) {
		return mapper.insBoard(param);
	}
	
	// upd
	public int updBoard(BoardPARAM param) {
		return mapper.updBoard(param);
	}
	
	// del
	public int delBoard(BoardPARAM param) {
		return mapper.delBoard(param);
	}
	
	// detail
	public BoardVO detailBoard(BoardPARAM param) {
		return mapper.detailBoard(param);
	}
	
}
