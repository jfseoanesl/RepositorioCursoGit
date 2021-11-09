public class Persona{
	private String cc, nombre, apellido;
	
	
	public Persona(){
		this("123","Jairo", "Seoanes");
	}
	
	public Persona(String cc, String nombre, String apellido){
		this.cc = cc;
		this.nombre = nombre;
		this.apellido = apellido;
		
	}
	
	public String toString(){
		return "Persona ( "+this.cc+", "+this.nombre+", " + this.apellido+")";
	}
	
	
	
}