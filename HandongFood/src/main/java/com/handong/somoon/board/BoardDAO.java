package com.handong.somoon.board;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.handong.somoon.board.BoardVO;

@Repository
public class BoardDAO {
	@Autowired
	SqlSession sqlSession;

	public int insertBoard(BoardVO vo) {
		int result = sqlSession.insert("Board.insertBoard", vo);
		return result;
	}

	public int updateBoard(BoardVO vo) {
		int result = sqlSession.update("Board.updateBoard", vo);
		return result;
	}
	public int updateReview(BoardVO vo) {
		int result = sqlSession.update("Board.updateReview", vo);
		return result;
	}

	public int deleteBoard(int seq) {
		int result = sqlSession.delete("Board.deleteBoard", seq);
		return result;
	}
	public int deleteReview(int seq) {
		int result = sqlSession.delete("Board.deleteReview", seq);
		return result;
	}

	public BoardVO getBoard(int seq) {
		BoardVO result = sqlSession.selectOne("Board.getBoard", seq);
		return result;
	}

	public List<BoardVO> getBoardList() {
		List<BoardVO> result = sqlSession.selectList("Board.getBoardList");
		return result;
	}
	
	public List<BoardVO> getReviewList() {
		List<BoardVO> result = sqlSession.selectList("Board.getReviewList");
		return result;
	}
	
}
