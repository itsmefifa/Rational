class Rational { 
    long numerator,denominator; 

    class Illegal extends Exception { 
        String reason; 
        Illegal (String reason) { 
            this.reason = reason; 
        } 
    } 

    Rational() {
        this.numerator = 0;
        this.denominator = 1;
    }

    Rational(long numerator, long denominator) throws Illegal { 
        this.numerator = numerator;
        this.denominator =denominator;
        simplestForm();
    } 

    // find the reduce form 
    private void simplestForm() { 
        long computeGCD; 
        computeGCD = GCD(Math.abs(numerator), denominator); 
        numerator /= computeGCD; 
        denominator /= computeGCD; 
    } 

    // find the greatest common denominator 
    private long GCD(long a, long b) { 
        if (a%b ==0) return b; 
        else return GCD(b,a%b); 
    }

    /***
     * Compute an addition of the current rational number to another given rational number
     * @param x the rational number to be added to the current rational number
     */
    public void add(Rational x) { 
        numerator = (numerator * x.denominator) + (x.numerator * denominator);
        denominator = (denominator * x.denominator); 
        simplestForm(); 
    }

    /***
     * Compute a subtraction of the current rational number to another given rational number
     * @param x the rational number to be subtracted from the current rational number
     */
    public void subtract(Rational x) {
        // to be completed
        numerator = (numerator * x.denominator) - (x.numerator * denominator);
        denominator = (denominator * x.denominator);
        simplestForm(); // Simplify the result
    }

    /***
     * Compute a multiplication of the current rational number to another given rational number
     * @param x the rational number to be multiplied to the current rational number
     */
    public void multiply(Rational x) { 
        numerator *= x.numerator;
        denominator *= x.denominator;
        simplestForm(); // Simplify the result
    }

    /***
     * Compute a division of the current rational number to another given rational number
     * @param x the rational number to be divided by the current rational number
     */
    public void divide(Rational x) {
        numerator *= x.denominator;
        denominator *= x.numerator;
        // Simplify the result
        simplestForm();
    }

    /***
     * Check if the given rational number equals to the current rational number
     * @param x the rational number to be compared to the current rational number
     * @return true if the given rational number equals to the current, false otherwise
     */
    public boolean equals(Object x) {
        if (!(x instanceof Rational)) {
            return false;
        }
        Rational other = (Rational) x;

        // Multiply the numerators and denominators to check for equality in different representations
        return (this.numerator * other.denominator) == (other.numerator * this.denominator);
    }
    /***
     * Compare the current rational number to the current rational number
     * @param x the rational number to be compared to the current rational number
     * @return -1 if the current rational number is less than the given number, 0 if they're equal, 1 if the current
     * rational number is larger than the given number
     */
    public long compareTo(Object x) {
        if (!(x instanceof Rational)) {
            throw new IllegalArgumentException("Can only compare with another Rational.");
        }
        Rational other = (Rational) x;
        long difference = this.numerator * other.denominator - other.numerator * this.denominator;
        return Long.signum(difference);
    }

    /***
     * Give the formatted string of the rational number
     * @return the string representation of the rational number. For example, "1/2", "3/4".
     */
    public String toString() {
            return this.numerator + "/" + this.denominator;
    }

    public static void main(String[] args) {
        System.out.println("This is Rational class.");
    }
}