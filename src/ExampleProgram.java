/**
 * 
 * ExampleProgram from https://techfornontechies.com/programming-for-non-techies-control-structures/
 *
 */
public class ExampleProgram {
 
    public static void main(String[] args) {
        ExampleProgram example = new ExampleProgram();
 
        System.out.println("ifThen");
        example.ifThen(1);
 
        System.out.println("\nifThenElse");
        example.ifThenElse(2);
 
        System.out.println("\nforLoop");
        example.forLoop(3);
 
        System.out.println("\nwhileLoop");
        example.whileLoop(4);
 
        System.out.println("\ndoWhileLoop");
        example.doWhileLoop(5);
 
        System.out.println("\nswitchStatement");
        example.switchStatement(6);
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
 
    private void whileLoop(int x) {
        while (x < 10) {
            System.out.println("x = " + x);
            x++;
        }
    }
 
    private void doWhileLoop(int x) {
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
