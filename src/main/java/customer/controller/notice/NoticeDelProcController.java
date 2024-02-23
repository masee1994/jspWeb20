package customer.controller.notice;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import customer.controller.Controller;
import customer.dao.NoticeDao;

public class NoticeDelProcController implements Controller {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		System.out.println("NoticeRegDelController");
		
		String seq=request.getParameter("c");

		NoticeDao dao=new NoticeDao();
		int delcnt=dao.delete(seq);

		if(delcnt>0)
			response.sendRedirect("notice.jsp");
		else
			System.out.println("삭제오류");

	}
}
