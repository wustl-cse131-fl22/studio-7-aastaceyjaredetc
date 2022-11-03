package studio7;

public class Fraction {
	
	private int numerator;
	private int denominator;
	
	public Fraction(int initnumerator, int initdenominator)
    {
       numerator = initnumerator;
       denominator = initdenominator;
    }
	
	public String addFraction(Fraction A) {
		int commonDenominator = A.denominator * this.denominator;
		int commonNumerator = this.denominator * A.numerator + A.denominator * this.numerator;
		return commonNumerator + "/" + commonDenominator;
	}
	
	public String multiplyFraction(Fraction A) {
		int mDenominator = A.denominator * this.denominator;
		int mNumerator = A.numerator * this.numerator;
		return mNumerator + "/" + mDenominator;
	}
	
	public String reciprocal() {
		return denominator + "/" + numerator;
		
	}

	public String simplify() {
		int largestDivisor = 1;
		for (int x = 1; x <= numerator; x++ ) {
			if ((numerator % x == 0) && (denominator % x == 0)){
				largestDivisor = x;
			}
		
		}

		int simplifiedNumerator = numerator/largestDivisor;
		int simplifiedDenominator = denominator/largestDivisor;
		return simplifiedNumerator + "/" + simplifiedDenominator;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fraction f1 = new Fraction(3, 5);
		Fraction f2 = new Fraction (6, 12);
		System.out.println(f2.addFraction(f1));
		System.out.println(f2.multiplyFraction(f1));
		System.out.println(f1.reciprocal());
		System.out.println(f2.simplify());
	}
}
