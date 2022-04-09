package CodigoFuente;


//*Autores y Matriculas: Jesús Rogelio Montoya Gonzales(190090087) , Alinuhi Tirado Lizarraga(190090063), Johnny Villa Castro(200100085).
//*Universidad Politécnica ddel Valle del Évora
//*Grupo: SC 5-1
//*Materia: Fundamentos de Programación orientada a objetos
//*Docente: MC. Juan Jaime Fuentes Uriarte
//*Fecha:08 de Abril del 2022

import java.util.Date;
public class Persona {
	//El objeto persona es un objeto padre
	
	//Se declara el tipo de dato a cada propiedad 
	String Nomb;
	String ApeMaterno;
	String ApePaterno;
	String NumeroTelefonico;
	String Correo;
	String Direccion;

	
	
	//Se utilizan los métodos get y set para obtener y devolver la información 
	public String getNomb() {
		return Nomb;
	}
	public void setNomb(String nombre) {
		Nomb = nombre;
	}
	public String getApeMaterno() {
		return ApeMaterno;
	}
	public void setApeMaterno(String apeMaterno) {
		ApeMaterno = apeMaterno;
	}
	public String getApePaterno() {
		return ApePaterno;
	}
	public void setApePaterno(String apePaterno) {
		ApePaterno = apePaterno;
	}
	
	public String getNumeroTelefonico() {
		return NumeroTelefonico;
	}
	public void setNumeroTelefonico(String numeroTelefonico) {
		NumeroTelefonico = numeroTelefonico;
	}
	
	public String getCorreo() {
		return Correo;
	}
	public void setCorreo(String correo) {
		Correo = correo;
	}
	
	public String getDireccion() {
		return Direccion;
	}
	public void setDireccion(String direccion) {
		Direccion = direccion;
	}
	
}
