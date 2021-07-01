package kr.co.techyu.react.board;

import java.util.HashMap;
import java.util.List;

import kr.co.techyu.model.Board;

public interface BoardSevice {
	public List<Board> list(HashMap<String, Object> paramMap);
}
