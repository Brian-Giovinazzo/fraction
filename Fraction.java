/**
 * Code Template Authors: Dr. Stephen Roehrig
 *                        and David G. Cooper
 * Submission Author: 	  Brian Giovinazzo
 * Date: 				  09/30/2022
 * Purpose: An object for holding and adding fractions
 */
public class Fraction {
    private int numerator;
    private int denominator;
    
    public Fraction(int n, int d) {
        int gcd = gcd(n, d);
        this.numerator = n / gcd;
        this.denominator = d / gcd;
        if ((this.numerator >= 0) && (this.denominator < 0)) {
        	this.numerator *= -1;
        	this.denominator *= -1;
        }
        
    }
    // greatest common divisor:
    public static int gcd(int a, int b) { 
        if (b == 0) {
            return (a);
        } else {
            return (gcd(b, a % b));
        }
    }

    public String toString() {
        return String.valueOf(this.numerator) + "/" + String.valueOf(this.denominator);
    }

    public String toDecimal() {
        double numNum = (double) this.numerator;
        double denDen = (double) this.denominator;
    	double decimal = numNum / denDen;
        return String.valueOf(decimal);
    }

    public Fraction add(Fraction f) {
        int numer = (this.numerator * f.denominator) + (f.numerator * this.denominator);
        int denom = this.denominator * f.denominator;
        Fraction added = new Fraction(numer, denom);
        return added;
    }
}
