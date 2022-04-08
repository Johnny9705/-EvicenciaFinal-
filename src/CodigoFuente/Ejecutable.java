package CodigoFuente;
import java.util.ArrayList;
import java.util.Scanner;


public class Ejecutable {
	
	public static ArrayList<Cliente> ListaCliente= new ArrayList<Cliente>();
	public static ArrayList<Terrestre> ListaTerrestre = new ArrayList<Terrestre>();
	public static ArrayList<Aereo1> ListaAereo1 = new ArrayList<Aereo1>();
	public static ArrayList<Maritimo> ListaMaritimo = new ArrayList<Maritimo>();
	public static ArrayList<Entregas> ListaEntregas = new ArrayList<Entregas>();

	public static void main(String[] args) {
		Inicio();
	}
	
	public static void Inicio()
	{
		Scanner sc=new Scanner(System.in);
		int X;
		System.out.println("Bienvenido");
	do 
	{
		System.out.println("Sistemas de envio a sus ordenes, que desea hacer?.");
		System.out.println("1) Registrarte                                    ");
		System.out.println("2) Envios.                                        ");
		System.out.println("3) Salir                                          ");
		X=sc.nextInt();
		switch(X) 
		{
		case 1:
			Registro();
			break;
		case 2:
			Envios();
			break;
		case 3:
			System.out.println("Pongame 10 o que.");
			break;
		default:
			System.out.println("OPCION INVALIDA.");
		}
	
	}while(X!=3);
	}
	public static void Registro() 
	{
		Scanner sc=new Scanner(System.in);
		Cliente C=new Cliente();
		System.out.println("Proporcione un nombre: ");
		String Nombre=sc.nextLine();
		C.setNomb(Nombre);
		System.out.println("Numero Telefonico: ");
		String  NT=sc.nextLine();
		System.out.println("Correo: ");
		String Correo=sc.nextLine();
		System.out.println("Direccion: ");
		String Direccion=sc.nextLine();
		System.out.println("Seleccione el tipo de envio: ");
		System.out.println("1) Terrestre");
		System.out.println("2) Aereo");
		System.out.println("3) Maritimo");
		System.out.println("4) Salir");
		int X=sc.nextInt();
		switch(X) 
		{
		case 1:
			Terrestre();
			break;
		case 2:
			Aereo();
			break;
		case 3:
			Maritimo();
			break;
		default:
			System.out.println("mire bien :)))");
		case 4:
			break;
		}
	}
	public static void Terrestre() {
		Terrestre T=new Terrestre();
		Scanner sc=new Scanner(System.in);
		System.out.println("Numero de serie: ");
		String X=sc.nextLine();
		T.setNumSerie(X);
		System.out.println("Precio: ");
		String Precio=sc.nextLine();
		T.setCostoEnvi(Precio);
	}
	public static void Aereo() {
		Aereo1 A=new Aereo1();
		Scanner sc=new Scanner(System.in);
		System.out.println("Numero de serie: ");
		String X=sc.nextLine();
		A.setNumSerie(X);
		System.out.println("Precio: ");
		String Precio=sc.nextLine();
		A.setCostoEnvio(Precio);
	}
	public static void Maritimo() {
		Maritimo M=new Maritimo();
		Scanner sc=new Scanner(System.in);
		System.out.println("Precio: ");
		String Precio=sc.nextLine();
		M.setCostoEnvio(Precio);
	}
	public static void Envios() {
		Terrestre T=new Terrestre();
		Aereo1 A=new Aereo1();
		Maritimo M=new Maritimo();
		System.out.println("Terrestres: ");
		System.out.println(T.getNumSerie());
		System.out.println("Aereo:      ");
		System.out.println(A.getNumSerie());
	}
	public static boolean ValidaCliente (int IDCliente,ArrayList<Cliente> ListaCliente ) {
		boolean Resultado=false;
		for(int x=0;x<ListaCliente.size();x++) {
			if (ListaCliente.get(x).getID()==IDCliente) {
				Resultado=true;
			}
		}	
		return Resultado;
		
	}
}
