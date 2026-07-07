package ast;
import java.util.ArrayList;

public class Prog{
    public Main main;
    public ArrayList<Fun> fun;
    public String nomeMain;
    public Prog(Main main, ArrayList<Fun> fun)
    {
        this.main = main;
        this.fun = fun;
        this.nomeMain = "";
    }

    public String GERA_JAVA(){
		String fu = "";
        String returnMain = "public class "+ this.nomeMain +"{ \n\t"+ main.GERA_JAVA();
        String returnText = this.main.hasRead ? "import java.util.Scanner;\n" : "";
		for(Fun f : this.fun){
			fu = fu + "\n\t"+ f.GERA_JAVA();
		}
		return returnText + returnMain + fu + "\n}";
	}

    public void setNomeMain(String nomeMain){
        this.nomeMain = nomeMain;
    }
}

