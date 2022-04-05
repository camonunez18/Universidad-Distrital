
public class Main {

	public static void main(String[] args) {        
        double high = Double.parseDouble(args[1])/100;
        double ratio = Double.parseDouble(args[0])/2;
        
        double depth = (Math.pow(ratio, 2)-Math.pow(high, 2))/(2*high);
        double depthRounded = Math.round(depth*10.0)/10.0;
        if (depthRounded > 0)
        	System.out.println(depthRounded);
	}

}
