package foodapp.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import foodapp.dao.MenuDao;
import foodapp.dto.Menu;

@WebServlet("/savemenu")
public class SaveMenuController extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name = req.getParameter("name");
		String description = req.getParameter("description");
		long price = Long.parseLong(req.getParameter("price"));
		String offer = req.getParameter("offer");

		Menu menu = new Menu();
		menu.setName(name);
		menu.setDescription(description);
		menu.setPrice(price);
		menu.setOffer(offer);

		MenuDao dao = new MenuDao();
		Menu menu2 = dao.saveMenu(menu);

		if (menu2 != null) {
			List<Menu> menus = dao.getAllMenus();
			req.setAttribute("menus", menus);
			RequestDispatcher dispatcher = req.getRequestDispatcher("Menu.jsp");
			dispatcher.forward(req, resp);
		}
	}
}
