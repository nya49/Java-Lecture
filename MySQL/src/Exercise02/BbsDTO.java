package Exercise02;

public class BbsDTO {

	private int id;
	private int memberid;
	private String title;
	private String date;
	private String content;
	
	
	public BbsDTO(int memberId, String title, String content) { }
	
	public BbsDTO() { }
	
	public BbsDTO(int id, int memberid, String title, String date, String content) {
		
		this.id = id;
		this.memberid = memberid;
		this.title = title;
		this.date = date;
		this.content = content;
	}
	

	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}

	public int getMemberid() {
		return memberid;
	}

	public void setMemberid(int memberid) {
		this.memberid = memberid;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	@Override
	public String toString() {
		return "BbsDTO [id=" + id + ", memberid=" + memberid + ", title=" + title + ", date=" + date.substring(0, 16) + ", content="
				+ content + "]";
	}

	
}
