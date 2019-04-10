package JavaCodingT_0410.ex03;

import java.time.LocalDate;

public class Member implements Comparable<Member>{
	 int num;
	 String name;
	 String position;
	 LocalDate day;
	
	public Member(int num, String name, String position, LocalDate day) {
		this.num = num;
		this.name = name;
		this.position = position;
		this.day = day;
	}

	@Override
	public int compareTo(Member o) {
		Position pos = Position.valueOf(position);
		Position poss = Position.valueOf(o.position);
		
		if(pos.compareTo(poss) > 0)
			return 1;
		if(pos.compareTo(poss) < 0)
			return -1;
		
		if(day.isAfter(o.day)) {
			return 1;
		} else if(day.isBefore(o.day)){
			return -1;
		}
		return 0;
	}


	@Override
	public String toString() {
		return "Member [num=" + num + ", name=" + name + ", position=" + position + ", day=" + day + "]";
	}
	
}
