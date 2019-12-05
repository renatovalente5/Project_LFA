public class Counts {
	
	public static Var add(Var v1, Var v2){
		Var ans = new Var(v1.getType(), v1.getVal() + v2.getVal(), v1.getNumDen());
		return ans;
    }

    public static Var sub(Var v1, Var v2){
		Var ans = new Var(v1.getType(), v1.getVal() - v2.getVal(), v1.getNumDen());
		return ans;
    }
    
    public static Var mult(Var v1, Var v2){
        Var ans = new Var(v1.getType(), v1.getVal() * v2.getVal());
        
        ans.setNumDen(multNumDem(v1.getNumDen(), v2.getNumDen()));

		return ans;
    }

    public static Var div(Var v1, Var v2){
        Var ans = new Var(v1.getType(), v1.getVal() / v2.getVal());
        
        ans.setNumDen(divNumDem(v1.getNumDen(), v2.getNumDen()));

		return ans;
    }

    public static String multNumDem(String frac1, String frac2){
        if (frac1.equals("int") || frac2.equals("int") || frac1.equals("Double") || frac2.equals("Double")) {
            return (frac1.equals("int")) ? frac2 : frac1;
        }
        
        String frac = "";
        String[] exp1 = frac1.split(" "), exp2 = frac2.split(" ");

        String f = "", f2 = "";
        for (int i=0; i < exp1.length; i++) {
            f = exp1[i];
            for (int j=0; j < exp2.length; j++) {
                f2 = exp2[j];
                if (f.charAt(0) == '-') {
                    if (f.substring(1).equals(f2)) {
                        exp2[j] = null;
                        exp1[i] = null;
                        break;
                    } 
                }
            }
        }

        frac = fullStringWithArray(frac, exp1);
        frac = fullStringWithArray(frac, exp2);

        return sortNumDem(frac);
    }


    public static String divNumDem(String frac1, String frac2){
        if (frac1.equals("int") || frac2.equals("int") || frac1.equals("Double") || frac2.equals("Double")) {
            return (frac1.equals("int")) ? frac2 : frac1;
        }
        
        String frac = "";
        String[] exp1 = frac1.split(" "), exp2 = frac2.split(" ");

        String f = "", f2 = "";
        for (int i=0; i < exp1.length; i++) {
            f = exp1[i];
            for (int j=0; j < exp2.length; j++) {
                f2 = exp2[j];
                if (f.equals(f2)) {
                    exp2[j] = null;
                    exp1[i] = null;
                    break;
                }
            }
        }

        for (int i = 0; i < exp2.length; i++) {
            
            if (exp2[i]!=null) {
                if (exp2[i].charAt(0)=='-') {
                    exp2[i] = exp2[i].substring(1);
                }else{
                    exp2[i] = "-" + exp2[i];
                }
            }

            
        }

        frac = fullStringWithArray(frac, exp1);
        frac = fullStringWithArray(frac, exp2);

        return sortNumDem(frac);
    }

    public static void printArray(String[] arr){
        for (String var : arr) {
            System.out.println(var);
        }

        System.out.println("\n");
    }

    public static String sortNumDem(String s) {
        String[] list = s.split(" ");
        boolean change = false;
        String output = "", temp = "";
        do {
           change = false;
           for (int i = 0; i < list.length-1; i++) {
               
            if (list[i+1].compareTo(list[i]) < 0) {
                   temp = list[i];
                   list[i] = list[i+1];
                   list[i+1] = temp; 
                   change = true;
               }
           }
        } while (change);
        
        return fullStringWithArray(output, list);
    }

    public static String fullStringWithArray(String s, String[]arr) {
        for (String var : arr) {
            if (var != null) {
                s += var + " ";
            } 
        }

        return s;
    }


}