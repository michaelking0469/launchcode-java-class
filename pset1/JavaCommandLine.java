import java.io.Console;

public class JavaCommandLine {
	public static void main (String[] args){
		System.out.println("Hello I an a computer!!!");
		
		Console c = System.console();
		String name = c.readLine("What is your name ?? ");
		System.out.println("Hello " + name);
	}
}