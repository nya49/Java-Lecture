package Exam02.ex17;

public class EgDTO {
	private int back_no;
	private String name;
	private String pos;
	private String h_school;
	private String t;
	private String hit;
	private String yeras;
	private int annual_income;
	
	public EgDTO() {
	}
	
	public EgDTO(int back_no, String name, String pos, String h_school, String t, String hit, String yeras,
			int annual_income) {
		this.back_no = back_no;
		this.name = name;
		this.pos = pos;
		this.h_school = h_school;
		this.t = t;
		this.hit = hit;
		this.yeras = yeras;
		this.annual_income = annual_income;
	}

	public int getBack_no() {
		return back_no;
	}

	public void setBack_no(int back_no) {
		this.back_no = back_no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPos() {
		return pos;
	}

	public void setPos(String pos) {
		this.pos = pos;
	}

	public String getH_school() {
		return h_school;
	}

	public void setH_school(String h_school) {
		this.h_school = h_school;
	}

	public String getT() {
		return t;
	}

	public void setT(String t) {
		this.t = t;
	}

	public String getHit() {
		return hit;
	}

	public void setHit(String hit) {
		this.hit = hit;
	}

	public String getYeras() {
		return yeras;
	}

	public void setYeras(String yeras) {
		this.yeras = yeras;
	}

	public int getAnnual_income() {
		return annual_income;
	}

	public void setAnnual_income(int annual_income) {
		this.annual_income = annual_income;
	}

	@Override
	public String toString() {
		return "[back_no=" + back_no + ", name=" + name + ", pos=" + pos + ", h_school=" + h_school + ", t=" + t
				+ ", hit=" + hit + ", yeras=" + yeras + ", annual_income=" + annual_income + "]";
	}
	
	
}
