package foodapp.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import foodapp.dao.MenuDao;
import foodapp.dto.Menu;

@WebServlet("/order")
public class SaveOrderController extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int id = Integer.parseInt(req.getParameter("id"));
		
		MenuDao dao = new MenuDao();
		Menu menu = dao.getMenuById(id);
		
		if (menu!=null) {
			req.setAttribute("menu", menu);
			RequestDispatcher dispatcher = req.getRequestDispatcher("order.jsp");
			dispatcher.forward(req, resp);
		}
	}
}
