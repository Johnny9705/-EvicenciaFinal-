package CodigoFuente;

//*Autores y Matriculas: Jesús Rogelio Montoya Gonzales(190090087) , Alinuhi Tirado Lizarraga(190090063), Johnny Villa Castro(200100085).
//*Universidad Politécnica ddel Valle del Évora
//*Grupo: SC 5-1
//*Materia: Fundamentos de Programación orientada a objetos
//*Docente: MC. Juan Jaime Fuentes Uriarte
//*Fecha:08 de Abril del 2022


import java.util.ArrayList;
import java.util.Scanner;




public class Ejecutable {
	
	

	private static final int IDenvio = 0;
	public static ArrayList<Cliente> ListaCliente= new ArrayList<Cliente>();
	public static ArrayList<Envio> ListaEnvio = new ArrayList<Envio>();

	public static void main(String[] args) {
		Scanner TecladoE = new Scanner(System.in);
	
		
		boolean respuestaC=false;

		
		Inicio();
	}
	
	public static void Inicio()
	{
		Scanner sc=new Scanner(System.in);
		int X;
		System.out.println("Bienvenido");
		
		
		
		//Se generó  un ciclo para poder controlar los objetos  y los datos que se registren
	do 
	{
		//Se agregan las opciones que se desean que aparescan en el menú
		System.out.println("Sistemas de envio a sus ordenes, que desea hacer?.");
		System.out.println("1) Registrarte                                    ");
		System.out.println("2) Envio.                                        ");
		System.out.println("3) Salir                                          ");
		X=sc.nextInt();
		switch(X) 
		{
		
		//Se crean los  case de cada opción
		case 1:
			Registro();
			break;
		case 2:
			Envio();
			break;
		case 3:
			System.out.println("Ponganos 10 o que XD.");
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
		System.out.println("Proporcione el apellido paterno: ");
		String ApePaterno=sc.nextLine();
		C.setApePaterno(ApePaterno);
		System.out.println("Proporcione el apellido materno: ");
		String ApeMaterno=sc.nextLine();
		C.setApeMaterno(ApeMaterno);
		System.out.println("Numero Telefonico: ");
		String  NumeroTelefonico=sc.nextLine();
		C.setNumeroTelefonico(NumeroTelefonico);
		System.out.println("Correo: ");
		String Correo=sc.nextLine();
		C.setCorreo(Correo);
		System.out.println("Direccion: ");
		String Direccion=sc.nextLine();
		C.setDireccion(Direccion);
		
		 ListaCliente.add(C);
		System.out.println("Seleccione el tipo de transporte de entrega: ");
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
		Scanner TecladoT=new Scanner(System.in);
		System.out.println("Placas: ");
		String PlacasT=TecladoT.nextLine();
		T.setPlacas(PlacasT);
		System.out.println("Numero de serie: ");
		String NumST=TecladoT.nextLine();
		T.setNumSerie(NumST);
		System.out.println("Precio: ");
		String PrecioT=TecladoT.nextLine();
		T.setCostoEnvi(PrecioT);
	}
	public static void Aereo() {
		Aereo1 A=new Aereo1();
		Scanner TecladoA=new Scanner(System.in);
		System.out.println("Placas: ");
		String PlacasA=TecladoA.nextLine();
		A.setPlacas(PlacasA);
		System.out.println("Numero de serie: ");
		String NumSA=TecladoA.nextLine();
		A.setNumSerie(NumSA);
		System.out.println("Precio: ");
		String PrecioA=TecladoA.nextLine();
		A.setCostoEnvio(PrecioA);
	}
	public static void Maritimo() {
		Maritimo M=new Maritimo();
		Scanner TecladoM=new Scanner(System.in);
		System.out.println("Placas: ");
		String PlacasM=TecladoM.nextLine();
		M.setPlacas(PlacasM);
		System.out.println("Numero de serie: ");
		String NumSM=TecladoM.nextLine();
		M.setNumSerie(NumSM);
		System.out.println("Precio: ");
		String PrecioM=TecladoM.nextLine();
		M.setCostoEnvio(PrecioM);
	}
	public static void Envio() {
		System.out.println("Se captura envio ");
		Envio TecladoE=new Envio();
		 System.out.println("Catura el ID de cliente a enviar");
		int ID = TecladoE.nextInt();
		 boolean respuestaC = ValidaCliente(ID,ListaCliente);
		 
		 if(respuestaC==true) {
			 Envio E = new Envio();
			
			E.setIDenvio(IDenvio);
            ListaEnvio.add(E);
		 }
		Terrestre TecladoT=new Terrestre();
		Aereo1 TecladoA=new Aereo1();
		Maritimo TecladoM=new Maritimo();
		System.out.println("Terrestres: ");
		System.out.println(TecladoT.getPlacas());
		System.out.println(TecladoT.getNumSerie());
		System.out.println("Aereo:      ");
		System.out.println(TecladoA.getPlacas());
		System.out.println(TecladoA.getNumSerie());
		System.out.println("Maritimo:      ");
		System.out.println(TecladoM.getNumSerie());
		System.out.println(TecladoM.getNumSerie());
		
		
		 
	}
	public static boolean ValidaCliente (int ID,ArrayList<Cliente> ListaCliente ) {
		boolean Resultado=false;
		for(int x=0;x<ListaCliente.size();x++) {
			if (ListaCliente.get(x).getID()==ID) {
				Resultado=true;
			}
		}	
		return Resultado;
		
	
	
		
		
	}
	
	
		
	}
