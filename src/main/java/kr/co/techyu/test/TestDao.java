package kr.co.techyu.test;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;

@Mapper // 이렇게 해주면 TestDao의 구현체를 마이바티스가 대신 구현해준다.
public interface TestDao {
	public int memberSave(MemberModel dto);
	public List<MemberModel> memberList(HashMap<String, Object> paramMap);
	
}
