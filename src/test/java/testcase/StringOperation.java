package testcase;

public class StringOperation {
	
	
double signstripper(String x)
	
{
	String s11=x;  
	int s12=s11.indexOf("£");
	int s13=s12+1;
	String s14= s11.substring(s13);
	double result = Double.parseDouble(s14);
	//System.out.println(result);
	return result;
	

}
	
	
	
	
	
	
}
