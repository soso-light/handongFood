package com.handong.somoon.board;

import java.util.List;

import com.handong.somoon.board.BoardVO;

public interface BoardService {
	public int insertBoard(BoardVO vo);
	public int deleteBoard(int seq);
	public int updateBoard(BoardVO vo);
	public int updateReview(BoardVO vo);
	public int deleteReview(int seq);
	public BoardVO getBoard(int seq);
	public List<BoardVO> getReviewList();
	public List<BoardVO> getBoardList();
}
