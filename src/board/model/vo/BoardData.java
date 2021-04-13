package board.model.vo;

import java.util.ArrayList;

public class BoardData {

	


//
		private static ArrayList<Board> boardList;
		private static String pageNavi;
		
		public BoardData() {}

		public static ArrayList<Board> getBoardList() {
			return boardList;
		}

		public void setBoardList(ArrayList<Board> boardList) {
			this.boardList = boardList;
		}

	public static String getPageNavi() {
			return pageNavi;
}

	public void setPageNavi(String pageNavi) {
			//this.pageNavi = pageNavi;
		}
		
	}



