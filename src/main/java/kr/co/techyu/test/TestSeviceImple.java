package kr.co.techyu.test;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestSeviceImple implements TestSevice{
	@Autowired
	TestDao testDao;
	
	@Override
    public List<MemberModel> memberList( HashMap<String, Object> paramMap ) {
		
		System.out.println("==== memberList ====");
		List<MemberModel> dtoList = testDao.memberList(paramMap);	    
		 
        return dtoList;
    }

}