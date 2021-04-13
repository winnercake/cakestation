package board.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import board.model.service.BoardService;
import board.model.vo.Board;




/**
 * Servlet implementation class BoardWriteServlet
 */
@WebServlet("/board/write")
public class BoardWriteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BoardWriteServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher view = request.getRequestDispatcher("/WEB-INF/views/board/boardWrite.html");
		view.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
request.setCharacterEncoding("UTF-8"); 
		
		String Cs_Title = request.getParameter("Cs_Title");
		String Cs_Contents = request.getParameter("Cs_Contents"); 
	
			Board board = new Board();
			board.setCsTitle(Cs_Title);
			board.setCsContents(Cs_Contents);
			
			int result = new BoardService().registerBoard(board);
			if(result > 0) {
				response.sendRedirect("/board/list"); 
			}else {
				RequestDispatcher view = request.getRequestDispatcher("/WEB-INF/views/board/boardError.html");
				view.forward(request, response);
			}
		
		
	}


	}


