package ast;

public class VarDecl{
   public String type;
   public String var;
   
   public VarDecl(String type,String var){
   	this.type = type;
   	this.var = var;
   }

public String GERA_JAVA() {
      return (this.type + " " + this.var + ";");
   }
}
