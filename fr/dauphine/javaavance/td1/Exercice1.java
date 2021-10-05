package fr.dauphine.javaavance.td1;

public class Exercice1 {
	private int foo;
	//6-	If we select the class name the  we press Alt+Shift+R then we have the option to refactor the class name ( rename)
	
	//5-	If I press Ctrl + space inside a class, it will open a box of choices : I can upload the class constructor , get methods clone(), equals(), finalize(), get the signature of other method like a private method, private static method, public method… But if I type set then ctrl + space the system can auto-generate for me the method setFoo()
	public void setFoo(int foo) {
		this.foo = foo;
	}
	
	//	3-	If I type toStr then Ctrl + space it will auto-generate the method toString()
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
	
	//4-	If I type main then Ctrl + space it will auto-generate the main method of the class.
	public static void main(String[] args) {
		//2-	If I type sysout and press Ctrl + space this will complete automatically System.out.println()
		System.out.println();
	}
}
