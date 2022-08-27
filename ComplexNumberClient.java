package HW2;
import java.util.Scanner;

public class ComplexNumberClient {

class Main {
public static void main(String[] args) {
Scanner scanner = null;
try {
scanner = new Scanner(System.in);

ComplexNumber complexNumber1 = new ComplexNumber();
ComplexNumber complexNumber2 = new ComplexNumber();

int choice = 0;

System.out.println("1) Add 2 complex numbers\n"
+ "2) Subtract 2 complex numbers\n"
+ "3) Multiply 2 complex numbers\n"
+ "4) Divide 2 complex numbers\n"
+ "5) Absolute value of a complex number\n"
+ "6) Compare 2 complex numbers\n" + "0) EXIT");

System.out.print("Please enter your option:");
choice = scanner.nextInt();

while (choice != 0) {
switch (choice) {
case 1:
    System.out.print("Enter complex number (real imaginary):");

    complexNumber1.setRealPart(scanner.nextDouble());
    complexNumber1.setImaginaryPart(scanner.nextDouble());

    System.out.print("Enter complex number (real imaginary):");

    complexNumber2.setRealPart(scanner.nextDouble());
    complexNumber2.setImaginaryPart(scanner.nextDouble());

    System.out.println("First complex number is:"

    + complexNumber1);

    System.out.println("Second complex number is:"

    + complexNumber2);

    System.out.println("Result :" + complexNumber1 + " + "

    + complexNumber2 + " = "
    + complexNumber1.add(complexNumber2));

break;

case 2:

    System.out.print("Enter complex number (real imaginary):");

    complexNumber1.setRealPart(scanner.nextDouble());
    complexNumber1.setImaginaryPart(scanner.nextDouble());

    System.out.print("Enter complex number (real imaginary):");

    complexNumber2.setRealPart(scanner.nextDouble());
    complexNumber2.setImaginaryPart(scanner.nextDouble());

    System.out.println("First complex number is:"

    + complexNumber1);

    System.out.println("Second complex number is:"

    + complexNumber2);

    System.out.println("Result :" + complexNumber1 + " - "

    + complexNumber2 + " = "
    + complexNumber1.subtract(complexNumber2));

break;

case 3:

    System.out.print("Enter complex number (real imaginary):");

    complexNumber1.setRealPart(scanner.nextDouble());
    complexNumber1.setImaginaryPart(scanner.nextDouble());

    System.out.print("Enter complex number (real imaginary):");

    complexNumber2.setRealPart(scanner.nextDouble());
    complexNumber2.setImaginaryPart(scanner.nextDouble());

    System.out.println("First complex number is:"

    + complexNumber1);

    System.out.println("Second complex number is:"

    + complexNumber2);

    System.out.println("Result :" + complexNumber1 + " * "

    + complexNumber2 + " = "
    + complexNumber1.multiply(complexNumber2));

break;

case 4:

    System.out.print("Enter complex number (real imaginary):");

    complexNumber1.setRealPart(scanner.nextDouble());
    complexNumber1.setImaginaryPart(scanner.nextDouble());

    System.out.print("Enter complex number (real imaginary):");

    complexNumber2.setRealPart(scanner.nextDouble());
    complexNumber2.setImaginaryPart(scanner.nextDouble());

    System.out.println("First complex number is:"

    + complexNumber1);

    System.out.println("Second complex number is:"

    + complexNumber2);

    System.out.println("Result :" + complexNumber1 + " / "

    + complexNumber2 + " = "
    + complexNumber1.divide(complexNumber2));

break;

case 5:

    System.out.print("Enter complex number (real imaginary):");

    complexNumber1.setRealPart(scanner.nextDouble());
    complexNumber1.setImaginaryPart(scanner.nextDouble());

    System.out.println("First complex number is:"

    + complexNumber1);

    System.out.println("Result : |" + complexNumber1 + " | "

    + complexNumber1.cAbs());

break;

case 6:

    System.out.print("Enter complex number (real imaginary):");

    complexNumber1.setRealPart(scanner.nextDouble());
    complexNumber1.setImaginaryPart(scanner.nextDouble());

    System.out.print("Enter complex number (real imaginary):");

    complexNumber2.setRealPart(scanner.nextDouble());
    complexNumber2.setImaginaryPart(scanner.nextDouble());

    System.out.println("First complex number is:"

    + complexNumber1);

    System.out.println("Second complex number is:"

    + complexNumber2);

if (complexNumber1.equals(complexNumber2)) {

    System.out.println("The complex numbers are equal.");

}

else {

    System.out.println("The complex numbers are NOT equal.");

    }

break;

default:

    System.out .println("Your options for Complex arithmetic are:");

break;

    }

    System.out.println("1) Add 2 complex numbers\n"

    + "2) Subtract 2 complex numbers\n"

    + "3) Multiply 2 complex numbers\n"

    + "4) Divide 2 complex numbers\n"

    + "5) Absolute value of a complex number\n"

    + "6) Compare 2 complex numbers\n" + "0) EXIT");

    System.out.print("Please enter your option:");
    choice = scanner.nextInt();
    }
    }
    catch (Exception e) {           
    }
    }
    }
}
