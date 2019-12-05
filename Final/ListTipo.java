import java.util.*;
import java.util.LinkedList;
import java.io.*;

public class ListTipo {
	
	private static LinkedList<Tipo> lista =  new LinkedList<Tipo>();
	
	public static void writeCSV() throws IOException {
		try {
			PrintWriter pw = new PrintWriter(new File("Files/Exec/listTipoCSV.csv"));
			StringBuilder sb = new StringBuilder();
			for(Tipo type : lista) {
				sb.append(type.name());
				sb.append(",");
				sb.append(type.units());
				sb.append('\n');
			}
			pw.write(sb.toString());
			pw.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	public static void readCSV(String path) throws IOException {
		try {
			File fin = new File(path);
			Scanner sci = new Scanner(fin);
			while(sci.hasNextLine()) {
				String line = sci.nextLine();
				String[] a_type = line.split(",");
				Tipo newType = new Tipo(a_type[0], a_type[1]);
				lista.add(newType);
			}
			sci.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
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
