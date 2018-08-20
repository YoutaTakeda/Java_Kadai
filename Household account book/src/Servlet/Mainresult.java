package Servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.HabDAO;
import DTO.Hab;

/**
 * Servlet implementation class Mainresult
 */
@WebServlet("/result")
public class Mainresult extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public Mainresult() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String view=null;

		try{
			String day = (request.getParameter("day"));
			String expenses = (request.getParameter("expenses"));
			String memo = (request.getParameter("memo"));
			int payment = Integer.parseInt(request.getParameter("payment"));
			int withdrawal = Integer.parseInt(request.getParameter("withdrawal"));

			Hab result = HabDAO.Insert(day,expenses,memo,payment,withdrawal);
			request.setAttribute("Insert", result);

			view = "/WEB-INF/view/result.jsp";
		}catch(NumberFormatException e) {
			view = "/WEB-INF/view/Registration.jsp";
		}finally{
		RequestDispatcher dispatcher = request.getRequestDispatcher(view);
		dispatcher.forward(request, response);
		// String day, String expenses, String memo, int payment, int withdrawal
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
