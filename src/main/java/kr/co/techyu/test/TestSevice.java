package kr.co.techyu.test;


import java.util.HashMap;
import java.util.List;

public interface TestSevice {
    public List<MemberModel> list(HashMap<String, Object> paramMap);
    public int memberSave(MemberModel dto);
}