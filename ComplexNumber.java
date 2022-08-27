package HW2;
import java.util.Scanner;

public class ComplexNumber {
    private double realPart;
    private double imaginaryPart;

    public ComplexNumber(double realPart, double imaginaryPart) {
       this.realPart = realPart;
       this.imaginaryPart = imaginaryPart;
    }

    public ComplexNumber() {
        this.realPart = 0;
        this.imaginaryPart = 0;
    }

    public double getRealPart() {
        return realPart;
    }

    public double getImaginaryPart() {
        return imaginaryPart;
    }

    public void setRealPart(double realPart) {
        this.realPart = realPart;
    }

    public void setImaginaryPart(double imaginaryPart) {
        this.imaginaryPart = imaginaryPart;
    }

    public ComplexNumber add(ComplexNumber C) {
        return new ComplexNumber(this.realPart + C.getRealPart(), this.imaginaryPart + C.getImaginaryPart());
    }

    public ComplexNumber subtract(ComplexNumber C) {
        return new ComplexNumber(this.realPart - C.getRealPart(), this.imaginaryPart - C.getImaginaryPart());
    }

    public ComplexNumber multiply(ComplexNumber C) {
        double newRealPart = (this.realPart * (C.getRealPart())) - (C.getImaginaryPart() * (this.imaginaryPart)); 
        double newImaginaryPart = (this.realPart * (C.getImaginaryPart())) + (C.getRealPart() * (this.imaginaryPart));
        return new ComplexNumber(newRealPart, newImaginaryPart);
    }

    public ComplexNumber divide(ComplexNumber C) {
       double denominator = (C.getRealPart() * C.getRealPart()) + (C.getImaginaryPart() * C.getRealPart());
       double newRealPart = (this.realPart * (C.getRealPart())) + (this.imaginaryPart * (C.getImaginaryPart()));
       double newImaginaryPart = (this.imaginaryPart * (C.getImaginaryPart())) - (this.realPart * (C.getImaginaryPart()));
       return new ComplexNumber(newRealPart / denominator, newImaginaryPart / denominator);
    }

    public double norm() {
        return Math.sqrt(Math.sqrt(this.realPart) + Math.sqrt(this.imaginaryPart));
    }

    public double cAbs() {
        return (Math.sqrt(this.realPart * this.realPart + this.imaginaryPart * this.imaginaryPart));
    }

    public String toString() {
       return ("The real part is: " + this.realPart + "The imaginary part is: " + this.imaginaryPart);
    }

    public boolean equals(ComplexNumber C) {
        return (this.getRealPart() == C.getRealPart() && this.imaginaryPart == C.getImaginaryPart());
    }



}
