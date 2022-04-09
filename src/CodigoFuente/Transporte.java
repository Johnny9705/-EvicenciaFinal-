package CodigoFuente;

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
