package shop.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import shop.model.service.ShopMemService;
import shop.model.vo.ShopMember;

/**
 * Servlet implementation class ShopMemInfoUpdateServlet
 */
@WebServlet("/shopy/updateShopInfo")
public class ShopInfoUpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ShopInfoUpdateServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		
		// 폴더에 사진 저장
		String uploadFilePath = request.getServletContext().getRealPath("upload");
		String encType = "UTF-8"; // 이름에 한글이 있을 수 있으므로
		int uploadFileSizeLimit = 0; // 파일 크기 제한
//		MultipartRequest multi = new MultipartRequest(request, uploadFilePath, uploadFileSizeLimit, encType, new DefaultFileRenamePolicy());
		
		// DB 에 사진 정보 저장
//		File uploadFile = multi.getFile("upFile"); // upFile 은 파일 버튼 네임 속성값으로 여러 정보가 있는 파일 객체를 가져올 수 있음. ( html 에서 보낸 파일 정보 )
//		String fileName = multi.getFilesystemName("upFile");
//		String filePath = uploadFile.getPath();
//		long fileSize = uploadFile.length();
		
		// 업체가 입력한 정보 저장
		ShopMember shopMember = new ShopMember();
		int result = new ShopMemService().modifyShop(shopMember);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
