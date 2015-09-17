package p.edu.cibertec.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;





import p.edu.cibertec.bean.UsuarioBean;
import p.edu.cibertec.service.UsuarioService;
import p.edu.cibertec.serviceimpl.UsuarioServiceImpl;

/**
 * Servlet implementation class UsuarioController
 */
@WebServlet("/UsuarioController")
public class UsuarioController extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	
	
	private UsuarioService service;
      

	
    public void setService(UsuarioService service) {
		this.service = service;
	}


	/**
     * @see HttpServlet#HttpServlet()
     */
    public UsuarioController() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	//	List<UsuarioBean> lista = usuarioserimp.consultarUsuario();
		
		
		//asignar memoria
		this.setService(new UsuarioServiceImpl());
		
		
		List<UsuarioBean> lista = service.consultarUsuario();
		
		request.setAttribute("lista", lista);
		
		request.getRequestDispatcher("principal.jsp").forward(request, response);
	}

	
	


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
