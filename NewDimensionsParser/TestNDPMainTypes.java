import java.util.*;


public class TestNDPMainTypes {
	public static void main(String[] args) throws Exception {
	
		String filename = "DimensionsTableE2.txt";
		
		DimensionsParserMain.fillup(filename);                //para lançares o interpretador das dimensoes, todo o codigo dele tem de estar compilado, depois comilas este e é só executar este 
		
		Tipo t1;
		
		t1 = ListTipo.getTipo("Distance");
		
		String nomedot1 = t1.name();
		String unidadesdot1 = t1.units();
		
		System.out.println("\n Na nova main");
		System.out.println("\n Informações do t1");
		System.out.println(nomedot1);
		System.out.println(unidadesdot1);
		
		Tipo t2;
		
		t2 = ListTipo.getTipo("Area");
		
		String nomedot2 = t2.name();
		String unidadesdot2 = t2.units();
		
		System.out.println("\n Na nova main");
		System.out.println("\n Informações do t2");
		System.out.println(nomedot2);
		System.out.println(unidadesdot2);
		
		System.out.println("\n Na nova main");
		System.out.println("\n Teste das unidades");
		
		Tipo t3;
		
		t3 = ListTipo.getTipoByUnit("m -s");
		String nomedot3 = t3.name();
		String unidadesdot3 = t3.units();
		
		
		
		System.out.println(nomedot3);
		System.out.println(unidadesdot3);
		
		
		
		
		
	}
}
