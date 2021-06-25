package kr.co.techyu.test;


import java.util.HashMap;
import java.util.List;

public interface TestSevice {
    public List<MemberModel> memberList(HashMap<String, Object> paramMap);
}