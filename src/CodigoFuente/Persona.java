package CodigoFuente;

import java.util.Date;
public class Persona {
	String Nomb;
	String ApeMaterno;
	String ApePaterno;
	int Edad;
	String Sexo;
	static Date fechaNaci;
	double Altura;
	String Sangre;
	double Salario;
	static int CodigoPost;
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
	public int getEdad() {
		return Edad;
	}
	public void setEdad(int edad) {
		Edad = edad;
	}
	public String getSexo() {
		return Sexo;
	}
	public void setSexo(String sexo) {
		Sexo = sexo;
	}
	public static Date getFechaNaci() {
		return fechaNaci;
	}
	public static void setFechaNaci(Date fechaNaci) {
		Persona.fechaNaci = fechaNaci;
	}
	public double getAltura() {
		return Altura;
	}
	public void setAltura(double altura) {
		Altura = altura;
	}
	public String getSangre() {
		return Sangre;
	}
	public void setSangre(String sangre) {
		Sangre = sangre;
	}
	public double getSalario() {
		return Salario;
	}
	public void setSalario(double salario) {
		Salario = salario;
	}
	public static int getCodigoPost() {
		return CodigoPost;
	}
	public static void setCodigoPost(int codigoPost) {
		CodigoPost = codigoPost;
	}
	
	
}
