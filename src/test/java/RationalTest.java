import org.junit.Assert;
import org.junit.Test;

public class RationalTest {

    @Test
    public void testRational(){
        try{
            Rational r1 = new Rational(2, 4);
            Rational r2 = new Rational(1, 4);
            Assert.assertEquals(1, r1.numerator);
            Assert.assertEquals(2, r1.denominator);
            Assert.assertEquals(1, r2.numerator);
            Assert.assertEquals(4, r2.denominator);
        }catch(Rational.Illegal illegal){
            illegal.printStackTrace();
        }
    }

    @Test (expected = Rational.Illegal.class)
    public void testRationalFail() throws Rational.Illegal {
        Rational r1 = new Rational(2, 0);
    }

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
    }

    @Test
    public void testSubtract(){
        try{
            Rational r1 = new Rational(3, 4);
            Rational r2 = new Rational(1, 4);
            r1.subtract(r2);
            Assert.assertEquals(1, r1.numerator);
            Assert.assertEquals(2, r1.denominator);
        }catch(Rational.Illegal illegal){
            illegal.printStackTrace();
        }
    }

    @Test
    public void testMultiply(){
        try{
            Rational r1 = new Rational(3, 4);
            Rational r2 = new Rational(1, 4);
            r1.multiply(r2);
            Assert.assertEquals(3, r1.numerator);
            Assert.assertEquals(16, r1.denominator);
        }catch(Rational.Illegal illegal){
            illegal.printStackTrace();
        }
    }

    @Test
    public void testDivide(){
        try{
            Rational r1 = new Rational(3, 4);
            Rational r2 = new Rational(1, 4);
            r1.divide(r2);
            Assert.assertEquals(3, r1.numerator);
            Assert.assertEquals(1, r1.denominator);
        }catch(Rational.Illegal illegal){
            illegal.printStackTrace();
        }
    }

    @Test
    public void testEquals(){
        try{
            Rational r1 = new Rational(2, 4);
            Rational r2 = new Rational(1, 2);
            Assert.assertEquals(true, r1.equals(r2));
            Assert.assertEquals(true, r2.equals(r1));
        }catch(Rational.Illegal illegal){
            illegal.printStackTrace();
        }
    }

    @Test
    public void testShouldNotBeEqual(){
        try{
            Rational r1 = new Rational(2, 4);
            Rational r2 = new Rational(0, 2);
            Assert.assertEquals(false, r1.equals(r2));
            Assert.assertEquals(false, r2.equals(r1));
        }catch(Rational.Illegal illegal){
            illegal.printStackTrace();
        }
    }

    @Test
    public void testShouldNotBeEqualObject(){
        try{
            Rational r1 = new Rational(2, 4);
            String r2 = "Rational 2/4";
            Assert.assertEquals(false, r1.equals(r2));
            Assert.assertEquals(false, r2.equals(r1));
        }catch(Rational.Illegal illegal){
            illegal.printStackTrace();
        }
    }

    @Test
    public void testCompareToShouldBeEqual(){
        try{
            Rational r1 = new Rational(2, 4);
            Rational r2 = new Rational(1, 2);
            Assert.assertEquals(0, r1.compareTo(r2));
        }catch(Rational.Illegal illegal){
            illegal.printStackTrace();
        }
    }

    @Test
    public void testCompareToShouldBeMoreThan(){
        try{
            Rational r1 = new Rational(3, 4);
            Rational r2 = new Rational(1, 2);
            Assert.assertEquals(1, r1.compareTo(r2));
        }catch(Rational.Illegal illegal){
            illegal.printStackTrace();
        }
    }

    @Test
    public void testCompareToShouldBeLessThan(){
        try{
            Rational r1 = new Rational(2, 4);
            Rational r2 = new Rational(2, 2);
            Assert.assertEquals(-1, r1.compareTo(r2));
        }catch(Rational.Illegal illegal){
            illegal.printStackTrace();
        }
    }

    @Test (expected = Rational.Illegal.class)
    public void testCompareToShouldThrowError() throws Rational.Illegal{
        Rational r1 = new Rational(2, 4);
        r1.compareTo("test");
    }

    @Test
    public void testToString(){
        try{
            Rational r1 = new Rational(3, 4);
            Assert.assertEquals("3/4", r1.toString());
        }catch(Rational.Illegal illegal){
            illegal.printStackTrace();
        }
    }
}
