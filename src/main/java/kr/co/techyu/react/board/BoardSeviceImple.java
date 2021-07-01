package kr.co.techyu.react.board;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;

import kr.co.techyu.model.Board;
import kr.co.techyu.test.TestDao;

public class BoardSeviceImple implements BoardSevice{

	@Autowired
	private SqlSession sqlSession;
	private String namespace = "com.playnote.test.TestSevice";
	
	@Autowired
	TestDao testDao;
	
	@Override
    public List<Board> list( HashMap<String, Object> paramMap ) {
		
		 String sqlId = ".listDao";
		 String sql = sqlSession.getConfiguration().getMappedStatement(namespace+sqlId).getBoundSql(paramMap).getSql();
		 System.out.println("==== ㄴㄴlist ====");
	     System.out.println(sql);
	        
		 List<Board> dto = sqlSession.selectList(namespace+sqlId, paramMap);
		 
        return dto;
    }
}
