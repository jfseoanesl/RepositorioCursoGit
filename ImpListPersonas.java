import java.util.*;

public class ImpListPersonas implements ILista{
	
	private List<Persona> lista;
	
	public ImpListPersonas(){
			this.lista = new ArrayList();
	}
	
	
	@Override
	public boolean registrar(Persona p){
		this.lista.add(p);
	}
	
	public List<Persona> leer(){
		return this.lista;
	}
	
	
}