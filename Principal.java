
public class Principal{
	
	public static void main(String args[]){
		
		msgBienvenida();
		msgBievenida("Gracias por aprender Git");		
	}
	
	public static void msgBienvenida(){
		msgBienvenida("Bienvenido a Git");
	}
	
	public static void msgBienvenida(String msg){
		System.out.println(msg);
	}
	
	
}