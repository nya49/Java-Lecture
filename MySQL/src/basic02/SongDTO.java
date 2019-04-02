package basic02;

public class SongDTO {
	
	private int id;
	private String title;
	private String lyris;
	
	public SongDTO() {}
	
	public SongDTO(int id, String title, String lyris) {
		this.id = id;
		this.title = title;
		this.lyris = lyris;
	}
	
	public SongDTO(String title, String lyris) {
		this.title = title;
		this.lyris = lyris;
	}

	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getLyris() {
		return lyris;
	}
	
	public void setLyris(String lyris) {
		this.lyris = lyris;
	}

	@Override
	public String toString() {
		return "SongDTO [id=" + id + ", title=" + title + ", lyris=" + lyris + "]";
	}
	
	
}
