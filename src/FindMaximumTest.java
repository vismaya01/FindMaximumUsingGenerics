import static org.junit.Assert.*;

import org.junit.Test;

import org.junit.Assert;

public class FindMaximumTest {

	@Test
	public void givenMaxNumberAtFirstPostion_ReturnMaximumValue() {
		FindMaximum findMax = new FindMaximum();
		Integer result = findMax.findMax(9, 3, 5);
		Assert.assertSame(9, result);
	}
	
	@Test
	public void givenMaxNumberAtSeondPostion_ReturnMaximumValue() {
		FindMaximum findMax = new FindMaximum();
		Integer result = findMax.findMax(3, 9, 5);
		Assert.assertSame(9, result);
	}
	
	@Test
	public void givenMaxNumberAtThirdPostion_ReturnMaximumValue() {
		FindMaximum findMax = new FindMaximum();
		Integer result = findMax.findMax(5, 3, 9);
		Assert.assertSame(9, result);
	}
}
