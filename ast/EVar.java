package ast;


public class EVar extends Exp{
	public String var;
	
	
	public EVar(String var)
	{
	  this.var = var;
	  
	} 

public String GERA_JAVA(){
	return this.var;
}
}
