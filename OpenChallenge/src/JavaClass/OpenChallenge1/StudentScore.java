package JavaClass.OpenChallenge1;

public class StudentScore {
	String name;
	int math;
	int eng;
	int sci;
	double avg;
	
	
	public StudentScore(String name, int math, int eng, int sci) {
		this.name = name;
		this.math = math;
		this.eng = eng;
		this.sci = sci;
	}
	
	
	double average() {
		avg = (double)(math + eng + sci) / 3;
		//this.avg = avg;
		return avg;
	}


	@Override
	public String toString() {
		return "StudentScore [name=" + name + ", math=" + math + ", eng=" + eng + ", sci=" + sci + ", avg=" + String.format("%.2f", avg) + "]";
	}

	
}
