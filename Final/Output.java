import java.util.*;
public class Output{
public static void main(String[] args) throws Exception {
Map<String, Var> symb = new HashMap<>();
ListTipo.readCSV("listTipoCSV.csv");symb.put("var1", new Var("Integer", 0));
symb.put("var2", new Var("Double", 0));
symb.put("var3", new Var("Integer", 0));
symb.get("var3").setVal(((new Var("Integer",3))).getVal());
symb.put("var4", new Var("Distance", 0, ListTipo.getTipo("Distance").units()));
symb.get("var4").setVal(((new Var("Integer",4))).getVal());
System.out.println(symb.get("var4"));
symb.put("var5", new Var("Double", 0));
symb.put("var6", new Var("Integer", 0));
symb.put("var6", new Var("Integer", 0));
symb.get("var1").setVal(((new Var("Integer",1))).getVal()); 
symb.get("var1").setNumDen(ListTipo.getTipo(symb.get("var1").getType()).units());
symb.get("var2").setVal(((new Var("Integer",2))).getVal()); 
symb.get("var2").setNumDen(ListTipo.getTipo(symb.get("var2").getType()).units());
symb.get("var5").setVal((symb.get("var2")).getVal()); 
symb.get("var5").setNumDen(ListTipo.getTipo(symb.get("var5").getType()).units());
symb.get("var6").setVal(((Counts.add(symb.get("var1"),(new Var("Integer",2))))).getVal()); 
symb.get("var6").setNumDen(ListTipo.getTipo(symb.get("var6").getType()).units());
symb.get("var3").setVal(((Counts.mult((Counts.mult(symb.get("var1"),symb.get("var2"))),symb.get("var3")))).getVal()); 
symb.get("var3").setNumDen(ListTipo.getTipo(symb.get("var3").getType()).units());
symb.get("var4").setVal(((Counts.mult(symb.get("var4"),(new Var("Integer",2))))).getVal()); 
symb.get("var4").setNumDen(ListTipo.getTipo(symb.get("var4").getType()).units());
System.out.println(symb.get("var4"));
System.out.println(symb.get("var1"));
System.out.println((new Var("Integer",2)));
System.out.println((Counts.add(symb.get("var1"),symb.get("var3"))));
System.out.println((Counts.div(symb.get("var5"),symb.get("var2"))));
System.out.println(symb.get("var6"));
System.out.println(symb.get("var6"));
System.out.println(symb.get("var4"));
}
}