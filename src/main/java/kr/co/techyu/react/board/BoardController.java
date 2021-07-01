package kr.co.techyu.react.board;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import kr.co.techyu.model.Board;
import lombok.extern.slf4j.Slf4j;

/* 2021-07-01 이응규
 * 게시판 조회
 * 
 * */
@RestController
@Slf4j // 이걸 해야 log.info(..) 가 가능, 디버깅 용도
public class BoardController {
	private static final Logger logger = LoggerFactory.getLogger(BoardController.class);
    @Autowired
    private BoardSevice boardService;

	@GetMapping("/react/board/getBoardList")
	public List<Board> getBoardList() {
		
		List<Board> boardList = boardService.list(null);
		
		//return "hello spring boot";
		return boardList;
	}

}
