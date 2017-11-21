package ua.nure.kn156.hondak.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ua.nure.kn156.hondak.User;
import ua.nure.kn156.hondak.db.DaoFactory;
import ua.nure.kn156.hondak.db.DatabaseException;

public class AddServlet extends EditServlet {

	/* (non-Javadoc)
	 * @see ua.nure.kn156.hondak.web.EditServlet#showPage(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
	 */
	@Override
	protected void showPage(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		req.getRequestDispatcher("/add.jsp").forward(req, resp);
	}

	/* (non-Javadoc)
	 * @see ua.nure.kn156.hondak.web.EditServlet#processUser(ua.nure.kn156.hondak.User)
	 */
	@Override
	protected void processUser(User user) throws DatabaseException {
		DaoFactory.getInstance().getUserDao().create(user);
	}

}
