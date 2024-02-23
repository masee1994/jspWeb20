package customer.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import customer.controller.notice.NoticeDelProcController;
import customer.controller.notice.NoticeDetailController;
import customer.controller.notice.NoticeEditController;
import customer.controller.notice.NoticeProcController;
import customer.controller.notice.NoticeRegController;
import customer.controller.notice.NoticeRegProcController;

public class MyDispatcher extends HttpServlet {

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		// System.out.println("signnnnnn");

		String uri = request.getRequestURI();
		String conPath = request.getContextPath();
		String com = uri.substring(conPath.length());

		System.out.println("com:" + com);

//		NoticeDetailController controller1=new NoticeDetailController();
//		NoticeEditController controller2=new NoticeEditController();

		Controller controller = null;

		try {
			// 주소로 분기
			if (com.equals("/customer/noticeDetail.do")) {
				controller = new NoticeDetailController();
				// controller1.execute(request, response);
			} else if (com.equals("/customer/noticeEdit.do")) {
				controller = new NoticeEditController();
				// controller2.execute(request, response);
			} else if (com.equals("/customer/noticeEditProc.do")) {
				controller = new NoticeProcController();
				// controller2.execute(request, response);
			} else if (com.equals("/customer/noticeReg.do")) {
				controller = new NoticeRegController();
				// controller2.execute(request, response);
			} else if (com.equals("/customer/noticeRegProc.do")) {
				controller = new NoticeRegProcController();
				// controller2.execute(request, response);
			}else if (com.equals("/customer/noticeDelProc.do")) {
				controller = new NoticeDelProcController();
				// controller2.execute(request, response);
			}
			controller.execute(request, response);

		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
