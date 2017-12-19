package controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.all_operation;
import vo.regvo;

/**
 * Servlet implementation class all_contro_op
 */
@WebServlet("/all_contro_op")
public class all_contro_op extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public all_contro_op() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	String flag=request.getParameter("flag");
	System.out.println(flag);
	if(flag.equals("verify"))
		{
			//Tested OK till here...
			verify(response, request);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		String flag=request.getParameter("flag");
		if(flag.equals("insert"))
		{
		insert(response, request);
		}
		else if(flag.equals("cpwd"))
		{
			cpwd(request, response);
		}
		else if(flag.equals("search"))
		{
			search(response, request);
		}
	}
	public void insert(HttpServletResponse response,HttpServletRequest request) throws IOException
	{
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
		all_operation rd = new all_operation();
		rd.insert(rv);
		response.sendRedirect("login.jsp");
	}
	public void verify(HttpServletResponse response,HttpServletRequest request) throws IOException
	{
		List ls = new ArrayList();
		///String un=request.getParameter("uname");
		//String pwd=request.getParameter("pwd");
		regvo rv = new regvo();
		all_operation se = new all_operation();
		rv.setUname(request.getParameter("uname"));
		rv.setFname(request.getParameter("fname"));
		rv.setPwd(request.getParameter("pwd"));
	//	rv.setUname(un);
	//	rv.setPwd(pwd);
		ls= se.loginsearch(rv);
		//rv=(regvo)ls.get(0); 
		HttpSession session = request.getSession();
		session.setAttribute("ls", ls);
		//session.setAttribute("fname", rv.getFname());
		System.out.println(ls.size());
		if(ls.isEmpty())
		{
			
			response.sendRedirect("login.jsp");
		}
		else
		{
			response.sendRedirect("welcome.jsp");
		}	
	}

	public void cpwd(HttpServletRequest request,HttpServletResponse response) throws IOException
	{
		
		regvo rv = new regvo();
		all_operation se = new all_operation();
		String opwd=request.getParameter("oldpwd");
		String npwd=request.getParameter("npwd");
		String cpwd=request.getParameter("cpwd");
		
		HttpSession session = request.getSession();
		String s=(String) session.getAttribute("pwd");
		int i=(Integer)session.getAttribute("id");
		
		if(opwd.equals(s))
		{
			if(npwd.equals(cpwd))
			{
				rv.setId(i);
				rv.setNpwd(npwd);
				se.pwdchang(rv);
				System.out.println("pwd changed..");
			}
			else
			{
				System.out.println("plese enter correct password or conformpwd");
			}
			
		}
		else
		{
			System.out.println("plese enter correct pwd");
		}
		response.sendRedirect("search.jsp");
		
	}
	public void search(HttpServletResponse response,HttpServletRequest request) throws IOException
	{
		List list = new ArrayList();
		regvo rv = new regvo();
		all_operation se = new all_operation();
		list = se.searchdb();
		HttpSession session = request.getSession();	
		session.setAttribute("list", list);
		
		response.sendRedirect("display.jsp");

	}

}
