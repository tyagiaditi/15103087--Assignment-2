

	import java.util.*;
import javax.script.ScriptEngineManager;
import javax.script.ScriptEngine;
import javax.script.ScriptException;
	interface booleanExpression {
		 public boolean EvaluateExpression(String s);}


	public class BooleanCalculator implements booleanExpression{
		public boolean EvaluateExpression(String s)
		{
	try{
	        ScriptEngineManager mgr = new ScriptEngineManager();
		    ScriptEngine engine = mgr.getEngineByName("JavaScript");
		    System.out.println(engine.eval(s));
		    return true;
		}
	catch (ScriptException e) {
	                           System.out.println("Invalid Expression");
			                  }
	return true;
}
		
		public static void main(String[] args)
		{
			System.out.println("Enter expression in the format:true AND false");
		    String s1=new String();
			Scanner sc =new Scanner(System.in);
			String s=sc.nextLine();
			String[] st=s.split(" ");
			for(int i=0;i<st.length;i++)
			{if(st[i]=="(")
				s1+="(";
			else if(st[i].equals("true"))
				s1+="true";
			else if(st[i].equals("false"))
				s1+="false";
			else if(st[i].equals("AND"))
				s1+="&&";
			else if(st[i].equals("OR"))
				s1+="||";
			else if(st[i].equals(")"))
				s1+=")";
			}
		
			booleanExpression e=new BooleanCalculator();
			e.EvaluateExpression(s1);
		}

	}
