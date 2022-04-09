package CodigoFuente;
import java.sql.*;
//El objeto Terrestre hereda todas las propiedades del Objeto padre que es Transporte, esto sucede al utilizar el comando (extends)

public class Terrestre extends Transporte{
	
	//Se declaran las variables asignando su tipo de dato
	String CostoEnvi;
	Time TiempoEntrega;
	String NumSerie;
	
	
	//Se utiliza el método get para mostrar el valor de un atributo
    //El método set es utilizado para modificar los valores que esos atributos tienen 

	
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
	public int getNumS() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
}
