package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

//import dao.insert;
import vo.regvo;

/**
 * Servlet implementation class contro_insert
 */
@WebServlet("/contro_insert")
public class contro_insert extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public contro_insert() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		String fn=request.getParameter("fn");
		String ln=request.getParameter("ln");
		String un=request.getParameter("un");
		String pwd=request.getParameter("pwd");
		String add=request.getParameter("add");
		String city=request.getParameter("city");
		
		HttpSession hs=request.getSession();
		
		regvo rv = new regvo();
		rv.setFname(fn);
		rv.setLname(ln);
		rv.setUname(un);
		rv.setPwd(pwd);
		rv.setAdd(add);
		rv.setCity(city);
		//rv.setHobby(hobby);

		//insert rd = new insert();
		//rd.insert(rv);
		response.sendRedirect("search.jsp");
	}

}
