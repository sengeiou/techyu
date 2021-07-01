package kr.co.techyu.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.techyu.dto.MemberDto;
import kr.co.techyu.dto.TechyuDao;
import kr.co.techyu.model.User;

@Service
public class TechyuServiceImple implements TechyuService{
	
	@Autowired
	TechyuDao techyuDao;
	
	@Override
    public List<User> memberList( HashMap<String, Object> paramMap ) {
		
		System.out.println("==== memberList ====");
		List<User> dtoList = techyuDao.memberList(paramMap);	    
		 
        return dtoList;
    }

	@Override
	public int updateUser(Map<String, String> paramMap) {

		return techyuDao.updateUser(paramMap);
	}

	@Override
	public int updateNoticeBoard(MemberDto vo) {
		return techyuDao.updateNoticeBoard(vo);	
	}

}