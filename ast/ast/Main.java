package ast;

import java.util.ArrayList;

public class Main{

	public ArrayList<VarDecl> vars;
	public ArrayList<Comando> coms;
	
	public Main(ArrayList<VarDecl> vars,ArrayList<Comando> coms)
	{
		this.vars = vars;
		this.coms = coms;
	}
	public String GERA_JAVA(){
		String decl = "";
		String cms  = "";
	
		for (VarDecl v : this.vars){
			decl = decl + v.GERA_JAVA() + "\n";
		}
		for (Comando c : this.coms){
			cms = cms + c.GERA_JAVA() + "\n";
		}
		return "public static void main(){\n" + decl + cms + "}";
	}
}
