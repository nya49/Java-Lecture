package sec02;

public class DmbCellPhoneExample {

	public static void main(String[] args) {
		
		//DmbCellPhone 객체 생성
		DmbCellPhone dmbcellphone = new DmbCellPhone("자바폰", "검정", 10);

		//CellPhone으로 부터 상속받은 필드
		System.out.println("모델 : " + dmbcellphone.model);
		System.out.println("색상 : " + dmbcellphone.color);
		
		//DmbCellPhone의 필드
		System.out.println("채널 : " + dmbcellphone.channel);
		
		//CellPhone으로 부터 상속받은 메소드 호출
		dmbcellphone.powerOn();
		dmbcellphone.bell();
		dmbcellphone.sendVoice("여보세요.");
		dmbcellphone.receiveVoice("안녕하세요! 저는 홍길동인데요");
		dmbcellphone.sendVoice("아~ 예 반갑습니다.");
		dmbcellphone.hangUp();
		
		//DmbCellPhone의 메소드 호출
		dmbcellphone.turnOnDmb();
		dmbcellphone.changeChannelDmb(12);
		dmbcellphone.turnOffDmb();
	}

}
