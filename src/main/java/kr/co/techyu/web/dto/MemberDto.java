package kr.co.techyu.web.dto;

public class MemberDto {
    private String uuid              ;
    private String email             ;
    private String password          ;
    private String username          ;
    private String nickname          ;
    private String phone             ;
    private String emailCert         ;
    private String registerDatetime  ;
    private String lastloginDatetime ;
    private String lastloginIp       ;
    private String isAdmin           ;
    private String adminmemo         ;
    private String createDatetime    ;
    private String createUser        ;
    private String updateDatetime    ;
    private String updateUser        ;
    private String loginChk        ;
    private String emailChk        ;
    private String title			;
    private String contents			;
    private String boardCode		;
    private String userId			;
    private String hits				;

    
	public String getLoginChk() {
		return loginChk;
	}
	public void setLoginChk(String loginChk) {
		this.loginChk = loginChk;
	}
	public String getEmailChk() {
		return emailChk;
	}
	public void setEmailChk(String emailChk) {
		this.emailChk = emailChk;
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
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContents() {
		return contents;
	}
	public void setContents(String contents) {
		this.contents = contents;
	}
	public String getBoardCode() {
		return boardCode;
	}
	public void setBoardCode(String boardCode) {
		this.boardCode = boardCode;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getHits() {
		return hits;
	}
	public void setHits(String hits) {
		this.hits = hits;
	}
	
}
