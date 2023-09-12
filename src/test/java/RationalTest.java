import org.junit.Assert;
import org.junit.Test;

public class RationalTest {
    @Test
    public void testAdd() {
        Rational x = new Rational();
        x.numerator = 1;
        x.denominator = 2;
        Rational y = new Rational();
        y.numerator = 1;
        y.denominator = 4;
        x.add(y);
        Assert.assertEquals(3, x.numerator);
        Assert.assertEquals(4, x.denominator);
    }

    @Test
    public void testValidSubtraction() {
        // Test valid subtraction of two rational numbers
        Rational x = new Rational();
        x.numerator = 3;
        x.denominator = 2;
        Rational y = new Rational();
        y.numerator = 1;
        y.denominator = 4;
        x.subtract(y);
        Assert.assertEquals(5, x.numerator);
        Assert.assertEquals(4, x.denominator);
    }

    @Test
    public void testValidMultiplication() {
        // Test valid multiplication of two rational numbers
        Rational x = new Rational();
        x.numerator = 1;
        x.denominator = 3;
        Rational y = new Rational();
        y.numerator = 2;
        y.denominator = 5;
        x.multiply(y);
        Assert.assertEquals(2, x.numerator);
        Assert.assertEquals(15, x.denominator);
    }
    @Test
    public void testValidDivision() {
        // Test valid division of two rational numbers
        Rational x = new Rational();
        x.numerator = 2;
        x.denominator = 3;
        Rational y = new Rational();
        y.numerator = 4;
        y.denominator = 5;
        x.divide(y);
        Assert.assertEquals(5, x.numerator);
        Assert.assertEquals(6, x.denominator);
    }
@Test
public void testEquals() {
    Rational x = new Rational();
    x.numerator = 1;
    x.denominator = 2;
    Rational y = new Rational();
    y.numerator = 2;
    y.denominator = 4;
    Assert.assertTrue(x.equals(y));
}
    @Test
    public void testCompareToEqual() {
        Rational x = new Rational();
        x.numerator = 1;
        x.denominator = 2;
        Rational y = new Rational();
        y.numerator = 2;
        y.denominator = 4;
        Assert.assertEquals(0, x.compareTo(y));
    }
    @Test
    public void testCompareToLessThan() {
        Rational x = new Rational();
        x.numerator = 1;
        x.denominator = 3;
        Rational y = new Rational();
        y.numerator = 2;
        y.denominator = 4;
        Assert.assertEquals(-1, x.compareTo(y));
    }
    @Test
    public void testCompareToGreaterThan() {
        Rational x = new Rational();
        x.numerator = 2;
        x.denominator = 3;
        Rational y = new Rational();
        y.numerator = 1;
        y.denominator = 4;
        Assert.assertEquals(1, x.compareTo(y));
    }
    @Test
    public void testToString() {
        Rational x = new Rational();
        x.numerator = 1;
        x.denominator = 2;
        Assert.assertEquals("1/2", x.toString());
    }

}
