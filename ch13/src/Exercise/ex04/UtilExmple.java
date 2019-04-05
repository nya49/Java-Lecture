package Exercise.ex04;

public class UtilExmple {

	public static void main(String[] args) {
		Pair<String, Integer> pair = new Pair<>("홍길동", 35);
		Integer age = Util.getValue(pair, "홍길동");
		System.out.println(age);
		
		ChildPair<String, Integer> chlidpair = new ChildPair<>("홍삼원", 20);
		Integer chlidAge = Util.getValue(chlidpair, "홍삼순");
		System.out.println(chlidAge);
		
		/*OtherPair<String, Integer> otherpair = new OtherPair<>("홍삼원", 20);
		//OtherPair는 Pair를 상속하지 않으므로 예외가 발생해야 합니다.
		Int otherdAge = Util.getValue(chlidpair, "홍삼원");
		System.out.println(otherdAge);*/
	}

}
