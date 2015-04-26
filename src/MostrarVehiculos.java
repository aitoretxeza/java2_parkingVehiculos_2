

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.zubiri.parking.Coche;

/**
 * Servlet implementation class MostrarVehiculos
 */
@WebServlet("/MostrarVehiculos")
public class MostrarVehiculos extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MostrarVehiculos() {
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
		//Vehiculo vehiculo = new Vehiculo();
		
		//String matricula = request.getParameter("matricula");
		//ParkingVehiculos.findVehiculo(matricula);
		out.println("<html>");
		out.println("<head><title></title></head>");
		out.println("<body>");
		//out.println(ParkingVehiculos.mostrarParking());
		out.print(Coche.formatted());
		//ParkingVehiculos.mostrarParking();
		out.println("<br/><a href='index.html'><input type='button' value='Volver'></a>");
		out.println("</body></html>");
	}

}
