package ast;
import java.util.ArrayList;

public class CIf extends Comando{
	public int linha;
	public Exp exp;
	public ArrayList<Comando> bloco;
	
	public CIf(int linha,Exp exp, ArrayList<Comando> bloco)
	{
	  this.linha = linha;
	  this.exp = exp;
	  this.bloco = bloco;
	} 


	public String GERA_JAVA(){
		String blo = "";
		for(Comando b : this.bloco){
			blo = blo + "\n\t\t\t"+ b.GERA_JAVA();
		}
		return "if(" + exp.GERA_JAVA() + "){" + blo + "\n\t\t}"; 
	}
	
}
