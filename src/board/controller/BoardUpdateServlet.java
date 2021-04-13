package board.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import board.model.service.BoardService;
import board.model.vo.Board;


/**
 * Servlet implementation class BoardUpdateServlet
 */
@WebServlet("/board/modify")
public class BoardUpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BoardUpdateServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int cs_No = Integer.parseInt(request.getParameter("cs_No"));
		Board board = new BoardService().printOne(cs_No);
		if(board != null) {
			request.setAttribute("board", board);
			request.getRequestDispatcher("/WEB-INF/views/board/boardModify.jsp").forward(request, response);
		}else {
			request.getRequestDispatcher("/WEB-INF/views/board/boardError.html").forward(request, response);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8"); 
		String Cs_Title = request.getParameter("Cs_Title"); 
		String Cs_Contents = request.getParameter("Cs_Contents");
		int cs_No = Integer.parseInt(request.getParameter("cs_No"));
		Board board = new Board();
//		board.setCs_Title(Cs_Title);
//		board.setCs_Contents(Cs_Contents);
//		board.setCs_No(cs_No);
		int result = new BoardService().modifyBoard(board);
		if(result > 0) {
			response.sendRedirect("/board/list");
		}else {
			request.getRequestDispatcher("/WEB-INF/views/board/boardError.html").forward(request, response);
		}
	}

}
