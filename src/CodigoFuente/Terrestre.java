package CodigoFuente;
import java.sql.*;

public class Terrestre extends Transporte{
	String CostoEnvi;
	Time TiempoEntrega;
	String NumSerie;
	
	
	public String getCostoEnvi() {
		return CostoEnvi;
	}
	public void setCostoEnvi(String costoEnvi) {
		CostoEnvi = costoEnvi;
	}
	public Time getTiempoEntrega() {
		return TiempoEntrega;
	}
	public void setTiempoEntrega(Time tiempoEntrega) {
		TiempoEntrega = tiempoEntrega;
	}
	public String getNumSerie() {
		return NumSerie;
	}
	public void setNumSerie(String numSerie) {
		NumSerie = numSerie;
	}
	
	
}
