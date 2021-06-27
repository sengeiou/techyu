package kr.co.techyu.service;


import java.util.HashMap;
import java.util.List;

import kr.co.techyu.model.User;

public interface TechyuService {
    public List<User> memberList(HashMap<String, Object> paramMap);
}