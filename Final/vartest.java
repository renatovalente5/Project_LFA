public class vartest {
	
	public static void main (String[] args) {
		String s1 = "d b -c d a a c c";  
        String s2 = "a b c d d d d d";  
        
        System.out.println("mult :" + Counts.multNumDem(s1,s2));
        System.out.println("div  :" + Counts.divNumDem(s1, s2));

        System.out.println("inv  :" + Counts.divNumDem(s1, s1));
	}
	
}