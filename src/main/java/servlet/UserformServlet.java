package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.UserDao;

@WebServlet(name="userform",
urlPatterns={"/userform"})
public class UserformServlet extends HttpServlet {
	
	@Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
		
            
        PrintWriter p = new PrintWriter(resp.getOutputStream());
        p.print("<html>\n" + 
        		"	<body>\n" + 
        		"	<FORM name=\"userform\" Method=\"POST\" Action=\"/users\">\n" + 
        		"	Veuillez entrez le nom du nouvel utilisateur ! <BR>\n" + 
        		"	Name :         <INPUT type=\"text\" size=\"20\" name=\"name\"><BR>\n" + 
        		"	        <INPUT type=submit value=Send>\n" + 
        		"	</FORM>\n" + 
        		"	</body>\n" + 
        		"	</html>");
        p.flush();
        
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        // TODO Auto-generated method stub
        super.doPost(req, resp);
    }   
	
	

}
