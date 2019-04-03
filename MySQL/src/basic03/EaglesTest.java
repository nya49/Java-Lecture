package basic03;

import java.util.List;

public class EaglesTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EaglesDAO eDao = new EaglesDAO();
		
		/*
		EaglesDTO player = eDao.selectOne(1);
		player.setAnnualIncome(150000);
		eDao.updatePlayer(player);
		System.out.println(player.toString());
		
		
		eDao.insertPlayer(new EaglesDTO(6, "하주석", "내야수", "신일고", "우", "좌", "940225", 15000));
			
		
		eDao.deletePlayer(6);
		
		List<EaglesDTO> playerList = eDao.selectAll();
		for(EaglesDTO playe : playerList)
			System.out.println(playe.toString());
		  	
		
		List<EaglesDTO> playerList = eDao.selectPlayers();
		System.out.println("연봉 3억원 이상 선수 명단");
		for(EaglesDTO playe : playerList)
			System.out.println(playe.toString());
		*/
		
		String poss[] = {"투수", "포수", "내야수", "외야수"};
		for(String pos : poss) {
			List<EaglesDTO> playerList = eDao.selectPlayerByPos(pos);
			System.out.println("포지션이 " + pos + "인 선수명단");
			for(EaglesDTO playe : playerList)
				System.out.println(playe.toString());
			System.out.println();
		}
		
		List<EaglesDTO> playerList = eDao.selectPlayersByannualIncome(20000);
		System.out.println("연봉 2억원 이상 선수 명단");
		for(EaglesDTO playe : playerList)
			System.out.println(playe.toString());
		
		eDao.close();
	}

}
