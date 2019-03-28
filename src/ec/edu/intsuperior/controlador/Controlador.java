
package ec.edu.intsuperior.controlador;

import ec.edu.intsuperior.vista.Administrador;
import ec.edu.intsuperior.vista.Docente;
import ec.edu.intsuperior.vista.Estudiante;
import ec.edu.intsuperior.vista.Login;

/**
 *
 * @author PC-IVAN
 */
public class Controlador {
    
     private Login login = new Login(this);
     private Administrador Administrador = new Administrador(this);
     private Docente Docente = new Docente(this);
     private Estudiante estudiante = new Estudiante(this);
     
     public void getLogin (){
         login.setVisible(true);
         
}
public void getAdministrador (){
    Administrador.setVisible(true);
}
public void getDocente (){
    Docente.setVisible(true);
}
public void getEstudiante (){
    estudiante.setVisible(true);
}
}

