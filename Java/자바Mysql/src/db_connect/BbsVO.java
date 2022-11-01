package db_connect;

public class BbsVO {
	//나중에 알아서 가방에 값을 넣었다 꺼냈다가를 자동으로 해준다.
	private int no;
	private String title;
	private String content;
	private String writer;
	
	public int getId() {
		return no;
	}
	public void setId(int id) {
		this.no = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	
	@Override
	public String toString() {
		return "BBSVO [id=" + no + ", title=" + title + ", content=" + content + ", writer=" + writer + "]";
	}

	
}
