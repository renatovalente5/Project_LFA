import java.util.*;

public class Var{

    private String type;
    private double val;
    private String NumDenum;

    public Var (String type, double val){
        this.type = type;
        this.val = val;
        this.NumDenum = ListTipo.getTipo(type).units();
    }

    public Var (String type, double val, String NumDenum){
        this.type = type;
        this.val = val;
        this.NumDenum = NumDenum;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getVal() {
        return val;
    }

    public void setVal(double val) {
        this.val = val;
    }

    public void setNumDen(String NumDenum){
        this.NumDenum = NumDenum;
    }

    public String getNumDen(){
        return this.NumDenum;
    }

    @Override
    public String toString() {
        return this.val + this.type;
    }

}