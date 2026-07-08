package ast;
import java.util.ArrayList;


public class CChamadaFun extends Comando{
	public int linha;
	public String fun;
	public ArrayList<Exp> args;
	
	public CChamadaFun(int linha,String fun, ArrayList<Exp> args)
	{
	  this.linha = linha;
	  this.fun = fun;
	  this.args = args;
	} 

	public String GERA_JAVA(){
		String argum = "";
    	for(int i = 0; i < args.size(); i++){
        	argum = argum + args.get(i).GERA_JAVA();
        	if(i < args.size() - 1) 
				argum = argum + ", ";
		}
		return fun + "(" + argum + ");";
	}

}