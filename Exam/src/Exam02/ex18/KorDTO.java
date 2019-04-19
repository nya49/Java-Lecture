package Exam02.ex18;

public class KorDTO {
	private int id;
	private String name;
	private String countrycode;
	private String disrtict;
	private long population;
	
	public KorDTO(int id, String name, String countrycode, String disrtict, long population) {
		this.id = id;
		this.name = name;
		this.countrycode = countrycode;
		this.disrtict = disrtict;
		this.population = population;
	}

	public KorDTO() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCountrycode() {
		return countrycode;
	}

	public void setCountrycode(String countrycode) {
		this.countrycode = countrycode;
	}

	public String getDisrtict() {
		return disrtict;
	}

	public void setDisrtict(String disrtict) {
		this.disrtict = disrtict;
	}

	public long getPopulation() {
		return population;
	}

	public void setPopulation(long population) {
		this.population = population;
	}

	@Override
	public String toString() {
		return "[id=" + id + ", name=" + name + ", countrycode=" + countrycode + ", disrtict=" + disrtict
				+ ", population=" + population + "]";
	}
	
	
	
}
