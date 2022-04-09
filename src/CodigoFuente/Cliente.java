package CodigoFuente;

//*Autores y Matriculas: Jesús Rogelio Montoya Gonzales(190090087) , Alinuhi Tirado Lizarraga(190090063), Johnny Villa Castro(200100085).
//*Universidad Politécnica ddel Valle del Évora
//*Grupo: SC 5-1
//*Materia: Fundamentos de Programación orientada a objetos
//*Docente: MC. Juan Jaime Fuentes Uriarte
//*Fecha:08 de Abril del 2022




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
