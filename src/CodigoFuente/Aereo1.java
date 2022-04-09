package CodigoFuente;
//El objeto Aereo1 hereda todas las propiedades del Objeto padre que es Transporte, esto sucede al utilizar el comando (extends)

public class Aereo1 extends Transporte{
	String CostoEnvio;
	String VelocidadEntrega;
	String NumSerie;
	//Se utiliza el método get para mostrar el valor de un atributo
			//El método set es utilizado para modificar los valores que esos atributos tienen 

	public String getCostoEnvio() {
		return CostoEnvio;
	}
	public void setCostoEnvio(String costoEnvio) {
		CostoEnvio = costoEnvio;
	}
	public String getVelocidadEntrega() {
		return VelocidadEntrega;
	}
	public void setVelocidadEntrega(String velocidadEntrega) {
		VelocidadEntrega = velocidadEntrega;
	}
	public String getNumSerie() {
		return NumSerie;
	}
	public void setNumSerie(String numSerie) {
		NumSerie = numSerie;
	}
	public int NS() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	

}
