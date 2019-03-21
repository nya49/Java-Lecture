package sec11;

public class Earth {
	
	static final double EARTH_RADIUS = 6400;				// 상수이름은 무조건 대문자로, 다른 단어가 결합되면 _로 연결
	static final double EARTH_SURFACE_AREA;
	
	static {
		EARTH_SURFACE_AREA = 4 * Math.PI * EARTH_RADIUS * EARTH_RADIUS;
	}
}
