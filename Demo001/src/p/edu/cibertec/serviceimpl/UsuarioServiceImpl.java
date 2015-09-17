package p.edu.cibertec.serviceimpl;

import java.util.ArrayList;
import java.util.List;

import p.edu.cibertec.bean.UsuarioBean;
import p.edu.cibertec.service.UsuarioService;

public class UsuarioServiceImpl implements UsuarioService{
	
	
	public List<UsuarioBean> consultarUsuario(){
		
		List<UsuarioBean> listausuario= new ArrayList<UsuarioBean>();
		
		for(int i= 0 ;i<200;i++){
			UsuarioBean usu= new UsuarioBean();
			usu.setNombres("nombre"+i);
			usu.setApellidos("apellidos"+ i);
			usu.setEdad(30 + i);
			
			listausuario.add(usu);
			
		}
		return listausuario;
	}

}
