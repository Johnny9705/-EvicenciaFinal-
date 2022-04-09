package CodigoFuente;
//El objeto Cliente hereda todas las propiedades del Objeto padre que es Persona, esto sucede al utilizar el comando (extends)
public class Cliente extends Persona{
	//Se declara el tipo de dato del ID del cliente
	int ID;
	
	
	//Se utiliza el método get para mostrar el valor de un atributo
		//El método set es utilizado para modificar los valores que esos atributos tienen 

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}
	
	
}
