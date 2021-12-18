package com.handong.somoon.board;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.handong.somoon.board.BoardVO;
import com.handong.somoon.board.BoardDAO;

@Service
public class BoardServiceImpl implements BoardService {

	@Autowired
	BoardDAO boardDAO;
	
	@Override
	public int insertBoard(BoardVO vo) {
		return boardDAO.insertBoard(vo);
	}
	
	@Override
	public int deleteBoard(int seq) {
		return boardDAO.deleteBoard(seq);
	}
	
	@Override	
	public int updateBoard(BoardVO vo){
		return boardDAO.updateBoard(vo);
	}
	
	@Override
	public BoardVO getBoard(int seq){
		return boardDAO.getBoard(seq);
	}
	
	@Override
	public List<BoardVO> getBoardList(){
		return boardDAO.getBoardList();
	}

	@Override
	public int updateReview(BoardVO vo) {
		return boardDAO.updateReview(vo);

	}

	@Override
	public int deleteReview(int seq) {
		return boardDAO.deleteReview(seq);
	}

	@Override
	public List<BoardVO> getReviewList() {
		return boardDAO.getReviewList();
	}

}
