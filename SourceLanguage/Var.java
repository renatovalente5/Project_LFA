import java.util.*;

public class Var{

    private String type;
    private double val;
    private String NumDenum;

    public Var (String type, double val){
        this.type = type;
        this.val = val;
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

}