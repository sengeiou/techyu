package kr.co.techyu.model;

import lombok.Data;

@Data
public class User {
    private String uuid;
    private String email;
    private String password;
    private String username;
    private String nickname;
    private String grade;
    private String phone;
    private String emailCert;
    private String registerDatetime;
    private String lastloginDatetime; 
    private String lastloginIp;
    private String isAdmin;
    private String adminmemo;    
    private String createDatetime;
    private String createUser;
    private String updateDatetime;
    private String updateUser;
    private String rnum;
    
    
	public User(String uuid, String email, String password, String username, String nickname, String grade,
			String phone, String emailCert, String registerDatetime, String lastloginDatetime, String lastloginIp,
			String isAdmin, String adminmemo, String createDatetime, String createUser, String updateDatetime,
			String updateUser, String rnum) {
		super();
		this.uuid = uuid;
		this.email = email;
		this.password = password;
		this.username = username;
		this.nickname = nickname;
		this.grade = grade;
		this.phone = phone;
		this.emailCert = emailCert;
		this.registerDatetime = registerDatetime;
		this.lastloginDatetime = lastloginDatetime;
		this.lastloginIp = lastloginIp;
		this.isAdmin = isAdmin;
		this.adminmemo = adminmemo;
		this.createDatetime = createDatetime;
		this.createUser = createUser;
		this.updateDatetime = updateDatetime;
		this.updateUser = updateUser;
		this.rnum = rnum;
	}
	public String getUuid() {
		return uuid;
	}
	public void setUuid(String uuid) {
		this.uuid = uuid;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmailCert() {
		return emailCert;
	}
	public void setEmailCert(String emailCert) {
		this.emailCert = emailCert;
	}
	public String getRegisterDatetime() {
		return registerDatetime;
	}
	public void setRegisterDatetime(String registerDatetime) {
		this.registerDatetime = registerDatetime;
	}
	public String getLastloginDatetime() {
		return lastloginDatetime;
	}
	public void setLastloginDatetime(String lastloginDatetime) {
		this.lastloginDatetime = lastloginDatetime;
	}
	public String getLastloginIp() {
		return lastloginIp;
	}
	public void setLastloginIp(String lastloginIp) {
		this.lastloginIp = lastloginIp;
	}
	public String getIsAdmin() {
		return isAdmin;
	}
	public void setIsAdmin(String isAdmin) {
		this.isAdmin = isAdmin;
	}
	public String getAdminmemo() {
		return adminmemo;
	}
	public void setAdminmemo(String adminmemo) {
		this.adminmemo = adminmemo;
	}
	public String getCreateDatetime() {
		return createDatetime;
	}
	public void setCreateDatetime(String createDatetime) {
		this.createDatetime = createDatetime;
	}
	public String getCreateUser() {
		return createUser;
	}
	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}
	public String getUpdateDatetime() {
		return updateDatetime;
	}
	public void setUpdateDatetime(String updateDatetime) {
		this.updateDatetime = updateDatetime;
	}
	public String getUpdateUser() {
		return updateUser;
	}
	public void setUpdateUser(String updateUser) {
		this.updateUser = updateUser;
	}
	public String getRnum() {
		return rnum;
	}
	public void setRnum(String rnum) {
		this.rnum = rnum;
	}
    
}
