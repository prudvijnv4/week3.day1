package Abstraction;

public class Automation extends MultipleLanguage implements Language, TestTool{

	public void Selenium() {
		System.out.println("Iam learnig Selenium");
		
	}

	public void Java() {
		System.out.println("Iam also learning java");
		
	}

	@Override
	public void ruby() {
		System.out.println("Iam not learning ruby");
		
	}
	
	public static void main(String[] args) {
		Automation jj = new Automation();
		jj.Java();
		jj.Selenium();
		jj.python();
		jj.ruby();
		System.out.println(jj);
	}

}
