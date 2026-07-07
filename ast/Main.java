package ast;
import java.util.ArrayList;

public class Main{

	public ArrayList<VarDecl> vars;
	public ArrayList<Comando> coms;
	public Boolean hasRead;
	
	public Main(ArrayList<VarDecl> vars,ArrayList<Comando> coms)
	{
		this.vars = vars;
		this.coms = coms;
		this.hasRead = false;
	}
	public String GERA_JAVA(){
		String decl = "";
		String cms  = "";
		
	
		for (VarDecl v : this.vars){
			decl = decl + v.GERA_JAVA() + "\n\t\t";
		}
		int cSize = this.coms.size();
		for(int i = 0; i < cSize; i++){
			Comando c = this.coms.get(i);
			if (c instanceof CReadInput){
				this.hasRead = true;
			}
			if(i == cSize - 1){
				cms = cms + c.GERA_JAVA();
			}else {cms = cms + c.GERA_JAVA() + "\n\t\t";}
		}
		String returnText = this.hasRead ? "Scanner scanner = new Scanner(System.in);\n\t\t" : "";
		String returnText2 = this.hasRead ? "\n\t\tscanner.close();" : "";
		return "public static void main(String[] args){\n\t\t" + returnText + decl + cms + returnText2+ "\n\t}";
	}
}
