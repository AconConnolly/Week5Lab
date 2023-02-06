
package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;



public class LoginServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        getServletContext().getRequestDispatcher("/WEB-INF/login.jsp")
                .forward(request, response);
     //Log out the user
     //If the parameter "logout" exists, invalidate tyhe sessions and display message
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        User user = new User(username,password);
        
        if (username.equals(" ") || password.equals(" ")) {
            getServletContext().getRequestDispatcher("/WEB-INF/login.jsp")
                .forward(request, response);
        }
//        } else {
//            login(username, password);
//        }
        
        if (user != null) {
            HttpSession session = request.getSession();
            session.setAttribute("user",user);
        } else {
            request.setAttribute("error", "User is invalid");
        }
        request.getRequestDispatcher("/home.jsp").forward(request,response);
        
      
      //Process form from doGet
      //Validate that username and password are not empty
      //Pass username and password to the login() method from AccountService.
      //If login returns null -> redirect home
      //If invalid -> error message (keep fields filled and redirect home)
    
    }
//    public User login (String username, String password) {
//        
//        if (username != null || password != null) {
//             
//            return null;
//        } else {
//            return username;
//        }
//    }
//    
    
    

}

public class User {
    private String username;
    private String password;
    
    public User() {}

    public User(String username, String password) {

            this.username = username;
            this.password = password; 
        }
}
