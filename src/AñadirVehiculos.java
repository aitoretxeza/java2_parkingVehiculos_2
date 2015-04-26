

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.zubiri.parking.Coche;

/**
 * Servlet implementation class AñadirVehiculos
 */
@WebServlet("/AñadirVehiculos")
public class AñadirVehiculos extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AñadirVehiculos() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		
		int numRuedas = Integer.parseInt(request.getParameter("numRuedas"));
		boolean motor = Boolean.parseBoolean(request.getParameter("motor"));
		String marca = request.getParameter("marca");
		String matricula = request.getParameter("matricula");
		boolean automatico = Boolean.parseBoolean(request.getParameter("automatico"));
		int cosumo100km = Integer.parseInt(request.getParameter("cosumo100km"));	
		Coche cocheObjeto = new Coche(numRuedas,motor,marca,automatico,cosumo100km, matricula);
		
		out.println("<html>");
		out.println("<head><title></title></head>");
		out.println("<body>");
		out.print(cocheObjeto.formatted());
		out.println("<br/><a href='index.html'><input type='button' value='Home'></a>");
		out.println("</body></html>");
	}

}
