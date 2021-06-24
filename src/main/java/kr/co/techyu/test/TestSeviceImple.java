package kr.co.techyu.test;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestSeviceImple implements TestSevice{
	private String namespace = "com.playnote.test.TestSevice";
	
	@Autowired
	private SqlSession sqlSession;
	
	@Override
    public List<MemberModel> list( HashMap<String, Object> paramMap ) {
		
		
		 String sqlId = ".listDao";
		 String sql = "";//sqlSession.getConfiguration().getMappedStatement(namespace+sqlId).getBoundSql(paramMap).getSql();
		 System.out.println("==== list ====");
	     System.out.println(sql);
	        
		 List<MemberModel> dto = null;//sqlSession.selectList(namespace+sqlId, paramMap);
		 
        return dto;
    }

	@Override
    public int memberSave(MemberModel dto) {
		System.out.println("==== memberSave ====");
	    int result = 0;
		 
       return result;
    }

}