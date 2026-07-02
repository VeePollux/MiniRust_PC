package ast;

public class VarDecl{
   public String type;
   public String var;
   
   public VarDecl(String type,String var){
   	this.type = type;
   	this.var = var;
   }

public String GERA_JAVA() {
	String tipoJava = this.type;
	if (tipoJava.equals("f32"))  tipoJava = "float";
	if (tipoJava.equals("bool")) tipoJava = "boolean";

	return (tipoJava + " " + this.var + ";");
   }
}
