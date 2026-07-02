package ast;

import java.util.ArrayList;

public class Fun{
	public String nome;
	public ArrayList<ParamFormalFun> params;
	public String retorno;
	public ArrayList<VarDecl> vars;
	public ArrayList<Comando> body;
	
	public Fun(String nome,ArrayList<ParamFormalFun> params, String retorno,ArrayList<VarDecl> vars,ArrayList<Comando> body)
	{
		this.nome = nome;
		this.params = params;
		this.retorno = retorno;
		this.vars = vars;
		this.body = body;
	}

public String GERA_JAVA(){
	String nome;
	String params = "";
	String retorno;
	String vars = "";
	String body = "";

	for(var in vars){
		var +
	}

   
}

}
