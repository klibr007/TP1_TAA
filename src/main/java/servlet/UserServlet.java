package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.UserDao;
import fr.istic.m2.TP1_TAA.User;


@WebServlet(name="allUsers",
urlPatterns={"/users"})
public class UserServlet extends HttpServlet{
	
	@Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
		UserDao userDao = new UserDao();
		List<User> users = userDao.findAll();
        resp.setContentType("text/html");
        //PrintWriter p = new PrintWriter(resp.getOutputStream());
        PrintWriter out = resp.getWriter();
        if(users.size() == 0 || users.equals(null)) {
        	out.print("<HTML>\n<BODY>\n" +
                    "<H1>Recapitulatif des informations relatives aux utilisateurs</H1>\n" +
                    "<p>Il n'y a pas d'utilisateur<p>\n"+                
            "</BODY></HTML>");
            out.flush();
        }
        else {
        	out.print("<HTML>\n<BODY>\n" +
                    "<H1>Recapitulatif des informations relatives aux utilisateurs</H1>\n" +
                    "<UL>\n");
        	for(User u : users) {
        		out.print(           
                " <LI>Nom: "
                        + u.getName() + "\n");
            }
        	out.print("<p>Fin !<p>\n"+"</UL>\n" +                
                    "</BODY></HTML>");
        	out.flush();
        }
        
        
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
    	UserDao userDao = new UserDao();
    	String pname = req.getParameter("name");
    	if(pname != null) {
    		User u1 = new User();
        	u1.setName(pname);
        	userDao.save(u1);
        	this.doGet(req, resp);
    	}
    	else {
    		this.doGet(req, resp);
    	}
    }

}
