package primeiroServlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class OlamundoServlet
 */
@WebServlet("/OlamundoServlet")
public class OlamundoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public OlamundoServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// passo 1: estabelecer o tipo de conte�do
		response.setContentType("text/html");
		
		// passo 2: pegar o printwriter
		PrintWriter out = response.getWriter();
		
		// passo 3: gerar o conte�do HTML
		out.println("<html><body>");
		
		out.println("<h2> Lucio ala Mundo</h2>");
		
		out.println("<hr>");
		
		out.println("A hora no servidor �: " + new java.util.Date());
		
		out.println("</html></body>");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
