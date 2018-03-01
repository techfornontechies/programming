/**
 * 
 * ExampleProgram2 from https://techfornontechies.com/programming-for-non-techies-variables/
 *
 */
public class ExampleProgram2 {

	public static void main(String[] args) {
		ExampleProgram2 example = new ExampleProgram2();

		byte ifThen = 1;
		short ifThenElse = 2;
		int forLoop = 3;
		long whileLoop = 4;
		double doWhileLoop = 5.0;
		int switchStatement = 6;
		boolean isDoLoop = true;
		
		if(isDoLoop) {
			System.out.println("ifThen");
			example.ifThen(ifThen);
	
			System.out.println("\nifThenElse");
			example.ifThenElse(ifThenElse);
	
			System.out.println("\nforLoop");
			example.forLoop(forLoop);
	
			System.out.println("\nwhileLoop");
			example.whileLoop(whileLoop);
	
			System.out.println("\ndoWhileLoop");
			example.doWhileLoop(doWhileLoop);
	
			System.out.println("\nswitchStatement");
			example.switchStatement(switchStatement);
		}
	}

	private void ifThen(int x) {
		if (x > 5) {
			System.out.println("greater than 5");
		}
	}

	private void ifThenElse(int x) {
		if (x > 5) {
			System.out.println("greater than 5");
		} else if (x > 10) {
			System.out.println("greater than 10");
		} else {
			System.out.println("5 or less");
		}
	}

	private void forLoop(int x) {
		for (int i = 0; i < x; i++) {
			System.out.println("forLoop: " + i);
		}
	}

	private void whileLoop(long x) {
		while (x < 10) {
			System.out.println("x = " + x);
			x++;
		}
	}

	private void doWhileLoop(double x) {
		do {
			System.out.println("x = " + x);
			x++;
		} while (x < 10);
	}

	private void switchStatement(int x) {
		switch (x) {
		case 1:
			System.out.println("one");
			break;
		case 2:
			System.out.println("two");
			break;
		case 3:
			System.out.println("three");
			break;
		case 4:
			System.out.println("four");
			break;
		case 5:
			System.out.println("five");
			break;
		case 6:
			System.out.println("six");
			break;
		case 7:
			System.out.println("seven");
			break;
		case 8:
			System.out.println("eight");
			break;
		case 9:
			System.out.println("nine");
			break;
		case 10:
			System.out.println("ten");
			break;
		default:
			System.out.println("error");
			break;
		}
	}
}
