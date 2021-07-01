package kr.co.techyu.service;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

import kr.co.techyu.dto.MemberDto;
import kr.co.techyu.model.User;

public interface TechyuService {
    public List<User> memberList(HashMap<String, Object> paramMap);
    public int updateUser(Map<String, String> paramMap);
    public int updateNoticeBoard(MemberDto vo);
}