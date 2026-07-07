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
		String bo = "";
		String pa = "";
		String va = "";
		String retornoJava = this.retorno;

		int pSize = this.params.size();
		for(int i = 0; i < pSize; i++){
			ParamFormalFun p = this.params.get(i);
			if(i == pSize - 1){
				pa = pa + p.GERA_JAVA();
			}else {pa = pa + p.GERA_JAVA() + ", ";}
		}
		for(VarDecl v : this.vars){
			va = va + "\n\t\t"+ v.GERA_JAVA();
		}
		for(Comando b : this.body){
			bo = bo + "\n\t\t"+ b.GERA_JAVA();
		}


      	if (retornoJava.equals("f32"))  retornoJava = "float";
      	if (retornoJava.equals("bool")) retornoJava = "boolean";

		return "public static " + retornoJava + " "+ this.nome + "(" + pa + "){" + va + bo + "\n\t}";
	}
   
}
