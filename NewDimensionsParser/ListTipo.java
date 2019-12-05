import java.util.*;
import java.util.LinkedList;


public class ListTipo {
	
	private static LinkedList<Tipo> lista =  new LinkedList<Tipo>();
	
	//funçao para adicionar tipos à lista
	public static void addTipo(Tipo sample) {
	
		lista.add(sample);
		
	}
	
	//funçao que verifica se o tipo existe ou nao, retorna true se existir false se nao existir
	public static boolean containsTipo(String name) {
		
		Tipo[] tipos = lista.toArray(new Tipo[lista.size()]); 
		
		boolean result = false;
		Tipo samplecase;
		int i;
		String tiponome;
		
		for (i = 0; i < tipos.length; i++){
			
			samplecase = tipos[i];
			tiponome = samplecase.name();
			
			if(name.equals(tiponome))
			result = true;
		
		}
		
		return result;
	
	}
	
	//funçao que retorna o tipo para se poder verificar as suas potencias
	public static Tipo getTipo(String name){
		
		Tipo[] tipos = lista.toArray(new Tipo[lista.size()]); 
		Tipo samplecase = null;
		int i;
		String tiponome;
		
		for (i = 0; i < tipos.length; i++) {
			
			samplecase = tipos[i];
			tiponome = samplecase.name();
			
			if(name.equals(tiponome))
			break;
		
		}
		
		return samplecase;
	
	}
	
	//funçao que retorna o tipo cujas unidades são iguais ao argumento de entrada da funçao
	public static Tipo getTipoByUnit(String units) {
		
		Tipo[] tipos = lista.toArray(new Tipo[lista.size()]); 
		Tipo samplecase = null;
		int i;
		String tipounidade;
		
		for (i = 0; i < tipos.length; i++) {
			
			samplecase = tipos[i];
			tipounidade = samplecase.units();
			
			if(units.equals(tipounidade))
			break;
		
		}
		
		return samplecase;
	}

}
