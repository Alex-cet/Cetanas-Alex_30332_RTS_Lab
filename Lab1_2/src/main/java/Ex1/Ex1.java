package Ex1;

import java.util.Scanner;

class ComplexNumber {
    public int real, imaginary;

    public ComplexNumber(int real, int imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public static void addComplexNumbers(ComplexNumber n1, ComplexNumber n2) {
        int real = n1.real + n2.real;
        int imag = n1.imaginary + n2.imaginary;
        System.out.println(real + "+" + imag + "i");
    }

    public static void substractComplexNumbers(ComplexNumber n1, ComplexNumber n2) {
        int real = n1.real - n2.real;
        int imag = n1.imaginary - n2.imaginary;
        System.out.println(real + "+" + imag + "i");
    }

    public static void multiplyComplexNumbers(ComplexNumber n1, ComplexNumber n2) {
        int real = n1.real * n2.real - n1.imaginary * n2.imaginary;
        int imag = n1.real * n2.imaginary + n1.imaginary * n2.real;
        System.out.println(real + "+" + imag + "i");
    }
}

public class Ex1 {
    public static void main(String[] args) {
        System.out.println("Choose from the following operations: \n1.Add\n2.Substract\n3.Multiply");
        Scanner sc = new Scanner(System.in);

        int option = sc.nextInt();
        System.out.println("Enter the first complex number: ");
        ComplexNumber firstNumber = new ComplexNumber(sc.nextInt(), sc.nextInt());
        System.out.println("Enter the second complex number: ");
        ComplexNumber secondNumber = new ComplexNumber(sc.nextInt(), sc.nextInt());


        switch(option) {
            case 1:
                ComplexNumber.addComplexNumbers(firstNumber, secondNumber);
                break;
            case 2:
                ComplexNumber.substractComplexNumbers(firstNumber, secondNumber);
                break;
            case 3:
                ComplexNumber.multiplyComplexNumbers(firstNumber, secondNumber);
                break;
            default:
                System.out.println("Option is not valid!");
        }
    }
}