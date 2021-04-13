package cakeinfo.controller;

import java.io.File;
import java.io.IOException;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import cakeinfo.model.service.CakeInfoService;
import cakeinfo.model.vo.CakeInfo;

/**
 * Servlet implementation class CakeInfoEnrollServlet
 */
@WebServlet("/cakeInfo/enroll")
public class CakeInfoEnrollServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CakeInfoEnrollServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession(); // shopId 사용 위해 세션을 가져온다. 
		String shopId = (String)session.getAttribute("shopId");
		
		// upload 폴더에 실제 파일을 저장하는 작업
		String uploadFilePath = request.getServletContext().getRealPath("upload"); // 사진파일 저장 폴더 지정
		String encType = "UTF-8"; // 한글인식
		int uploadFileSizeLimit = 5*1024*1024; // 파일사이즈 지정
//		MultipartRequest multi = new MultipartRequest(request, uploadFilePath, uploadFileSizeLimit, encType, new DefaultFileRenamePolicy());
//		MultipartRequest multi = null;;
		
		// upload 폴더에 저장한 파일에 대한 정보를 DB 에 저장하는 작업
//		File uploadFile = multi.getFile("upFile"); 
//		String fileName = multi.getFilesystemName("upFile");
//		String filePath = uploadFile.getPath();
//		long fileSize = uploadFile.length();
		
		
		// 내가 원하는 형식으로 바꿔주는 클래스, 타입을 맞춰주기 위해 사용, 오늘의 밀리세컨드까지의 정보를 가져오는 클래스
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss.SSS"); // 날짜 데이터를 내가 원하는 형태로 바꿀 수 있다.
		Timestamp uploadTime = Timestamp.valueOf(formatter.format(Calendar.getInstance().getTimeInMillis()));
		
		CakeInfo cakeInfo = new CakeInfo(); // 입력받은 케이크 정보 값 담기
		
		int result = new CakeInfoService().registerCakeInfo(cakeInfo);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
