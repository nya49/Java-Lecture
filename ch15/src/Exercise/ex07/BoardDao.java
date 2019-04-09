package Exercise.ex07;

import java.util.List;
import java.util.Vector;

public class BoardDao {


	public List<Board> getBoardList() {
		List<Board> list = new Vector<Board>();
		list.add(new Board("제목1", "내용1"));
		list.add(new Board("제목2", "내용2"));
		list.add(new Board("제목3", "내용3"));
		return list;
	}
	
	
}
