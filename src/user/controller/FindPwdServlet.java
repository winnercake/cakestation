package user.controller;

import java.io.IOException;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FindPwdServlet
 */
@WebServlet("/member/findPwd")
public class FindPwdServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FindPwdServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    
    public static void sendEmail(String email, String subject, String text) {
    	String host = "smtp.gmail.com";
    	String user = "xxxxx@gmail.com";
    	String sender = "ccccc@gmail.com";
    	String password = "zzzzzzzzzz";
    	
    	// SMTP ���� ���� ����(ssl ����x)
    	Properties props = new Properties();
    	props.put("mail.smtp.starttls.enable", "true");
    	props.put("mail.smtp.host", host);
    	props.put("mail.smtp.prot", 587);
    	props.put("mail.smtp.auth", "true");
    	
    	// ����
    	Session session = Session.getDefaultInstance(props, new javax.mail.Authenticator() {
    		protected PasswordAuthentication getPasswordAuthentication() {
    			return new PasswordAuthentication(user, password);
    		}
    	});
    	
    	try {
    		MimeMessage message = new MimeMessage(session);
    		// �޴� ��� ����
			message.setFrom(new InternetAddress(sender));
			message.addRecipient(Message.RecipientType.TO, new InternetAddress(email));
			// ���� ����
			message.setSubject(subject);
			// ���� ����
			message.setText(text);
			// send the message
			Transport.send(message);
		} catch (MessagingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userId = request.getParameter("userId");
		String email = request.getParameter("email-id") + "@" + request.getParameter("email-domain");
		
		String subject = "[Cake Station] ��й�ȣ �缳�� ���������Դϴ�.";
		String text = "�ӽ� ��й�ȣ�� 0123456789 �Դϴ�."; // �ӽ� ��й�ȣ ���� �ٽ� �˾ƺ��� ���� ����
		//doGet(request, response);
		sendEmail(email, subject, text);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
