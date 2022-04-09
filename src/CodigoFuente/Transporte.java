package CodigoFuente;
//*Autores y Matriculas: Jesús Rogelio Montoya Gonzales(190090087) , Alinuhi Tirado Lizarraga(190090063), Johnny Villa Castro(200100085).
//*Universidad Politécnica ddel Valle del Évora
//*Grupo: SC 5-1
//*Materia: Fundamentos de Programación orientada a objetos
//*Docente: MC. Juan Jaime Fuentes Uriarte
//*Fecha:08 de Abril del 2022
import java.util.*;
public class Transporte {
	String Placas;
	String envio;
	String entrega;
	Timer tiempo;
	String TipoTransporte;
	double CapDeCarga;
	String DireccionEnvio;
	
	
	public String getPlacas() {
		return Placas;
	}
	public void setPlacas(String placas) {
		Placas = placas;
	}
	public String getEnvio() {
		return envio;
	}
	public void setEnvio(String envio) {
		this.envio = envio;
	}
	public String getEntrega() {
		return entrega;
	}
	public void setEntrega(String entrega) {
		this.entrega = entrega;
	}
	public Timer getTiempo() {
		return tiempo;
	}
	public void setTiempo(Timer tiempo) {
		this.tiempo = tiempo;
	}
	public String getTipoTransporte() {
		return TipoTransporte;
	}
	public void setTipoTransporte(String tipoTransporte) {
		TipoTransporte = tipoTransporte;
	}
	public double getCapDeCarga() {
		return CapDeCarga;
	}
	public void setCapDeCarga(double capDeCarga) {
		CapDeCarga = capDeCarga;
	}
	public String getDireccionEnvio() {
		return DireccionEnvio;
	}
	public void setDireccionEnvio(String direccionEnvio) {
		DireccionEnvio = direccionEnvio;
	}
	
	
}
