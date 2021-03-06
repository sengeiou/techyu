package kr.co.techyu.model;
import java.util.Date;
import java.util.List;

public class Board {

    private String uuid;            
    private String boardCode;       
    private String userId; 
    private String userName; 
    private String email; 
    private String nickName; 
    private String subject;         
    private String contents;        
    private int    hits;            
    private Date   createDatetime;
    private int rnum;
    private int    totalCount;
    private List<String>    listUuid;
    
	public String getUuid() {
		return uuid;
	}
	public void setUuid(String uuid) {
		this.uuid = uuid;
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
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getContents() {
		return contents;
	}
	public void setContents(String contents) {
		this.contents = contents;
	}
	public int getHits() {
		return hits;
	}
	public void setHits(int hits) {
		this.hits = hits;
	}
	public Date getCreateDatetime() {
		return createDatetime;
	}
	public void setCreateDatetime(Date createDatetime) {
		this.createDatetime = createDatetime;
	}
	public int getRnum() {
		return rnum;
	}

	public void setRnum(int rnum) {
		this.rnum = rnum;
	}

	public int getTotalCount() {
		return totalCount;
	}

	public void setTotalcount(int totalCount) {
		this.totalCount = totalCount;
	}

	public List<String> getListUuid() {
		return listUuid;
	}

	public void setListUuid(List<String> listUuid) {
		this.listUuid = listUuid;
	}
}
