package CodigoFuente;
import java.sql.*;
public class Maritimo extends Transporte{
	String CostoEnvio;
	Time TiempoDeEntrega;
	
	
	public String getCostoEnvio() {
		return CostoEnvio;
	}
	public void setCostoEnvio(String costoEnvio) {
		CostoEnvio = costoEnvio;
	}
	public Time getTiempoDeEntrega() {
		return TiempoDeEntrega;
	}
	public void setTiempoDeEntrega(Time tiempoDeEntrega) {
		TiempoDeEntrega = tiempoDeEntrega;
	}
	
	

}
