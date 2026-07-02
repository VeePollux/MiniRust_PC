package ast;


public class EFloat extends Exp{
	public float value;
	
	
	public EFloat(float value)
	{
	  this.value = value;
	  
	} 

	public String GERA_JAVA() {
       return String.valueOf(this.value) + "f";
    }

}
