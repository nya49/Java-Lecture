package basic03;

public class EaglesDTO {

	private int backNO;
	private String name;
	private String pos;
	private String hs;
	private String t;
	private String hit;
	private String years;
	private int annualIncome;
	
	
	public EaglesDTO(int backNO, String name, String pos, String hs, String t, String hit, String years, int annualIncome) {
		this.backNO = backNO;
		this.name = name;
		this.pos = pos;
		this.hs = hs;
		this.t = t;
		this.hit = hit;
		this.years = years;
		this.annualIncome = annualIncome;
	}
	
	public EaglesDTO() {}

	public int getBackNO() {
		return backNO;
	}

	public String getName() {
		return name;
	}

	public String getPos() {
		return pos;
	}

	public String getHs() {
		return hs;
	}

	public String getT() {
		return t;
	}

	public String getHit() {
		return hit;
	}

	public String getYears() {
		return years;
	}

	public int getAnnualIncome() {
		return annualIncome;
	}

	public void setBackNO(int backNO) {
		this.backNO = backNO;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPos(String pos) {
		this.pos = pos;
	}

	public void setHs(String hs) {
		this.hs = hs;
	}

	public void setT(String t) {
		this.t = t;
	}

	public void setHit(String hit) {
		this.hit = hit;
	}

	public void setYears(String years) {
		this.years = years;
	}

	public void setAnnualIncome(int annualIncome) {
		this.annualIncome = annualIncome;
	}

	@Override
	public String toString() {
		return "EaglesDTO [backNO=" + backNO + ", name=" + name + ", pos=" + pos + ", hs=" + hs + ", t=" + t + ", hit="
				+ hit + ", years=" + years + ", annualIncome=" + annualIncome + "]";
	}
	
	
}
