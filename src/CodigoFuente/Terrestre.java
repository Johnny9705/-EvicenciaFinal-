package CodigoFuente;
import java.sql.*;

//*Autores y Matriculas: Jesús Rogelio Montoya Gonzales(190090087) , Alinuhi Tirado Lizarraga(190090063), Johnny Villa Castro(200100085).
//*Universidad Politécnica ddel Valle del Évora
//*Grupo: SC 5-1
//*Materia: Fundamentos de Programación orientada a objetos
//*Docente: MC. Juan Jaime Fuentes Uriarte
//*Fecha:08 de Abril del 2022
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
