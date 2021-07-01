package kr.co.techyu.dto;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import kr.co.techyu.model.User;

@Mapper // 이렇게 해주면 TestDao의 구현체를 마이바티스가 대신 구현해준다.
public interface TechyuDao {
	public int memberSave(User dto);
	public List<User> memberList(HashMap<String, Object> paramMap);

	public int updateUser(Map<String,String> dto);
	public int updateNoticeBoard(MemberDto vo);
}
