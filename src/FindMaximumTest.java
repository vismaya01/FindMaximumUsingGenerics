import static org.junit.Assert.*;

import org.junit.Test;

import org.junit.Assert;

public class FindMaximumTest {

	@Test
	public void givenMaxNumberAtFirstPostion_ReturnMaximumValue() {
		FindMaximum findMax = new FindMaximum();
		Integer result = findMax.findMax(9, 3, 5);
		Assert.assertEquals(9, result, 0);
	}
	
	@Test
	public void givenMaxNumberAtSeondPostion_ReturnMaximumValue() {
		FindMaximum findMax = new FindMaximum();
		Integer result = findMax.findMax(3, 9, 5);
		Assert.assertEquals(9, result, 0);
	}
	
	@Test
	public void givenMaxNumberAtThirdPostion_ReturnMaximumValue() {
		FindMaximum findMax = new FindMaximum();
		Integer result = findMax.findMax(5, 3, 9);
		Assert.assertEquals(9, result, 0);
	}
	
	@Test
	public void givenFloatMaxNumberAtFirstPostion_ReturnMaximumValue() {
		FindMaximum findMax = new FindMaximum();
		Float result = findMax.findMax(9.0f, 3.0f, 5.0f);
		System.out.println(result);
		Assert.assertEquals(9.0, result, 0.0f);
	}
	
	@Test
	public void givenFloatMaxNumberAtSeondPostion_ReturnMaximumValue() {
		FindMaximum findMax = new FindMaximum();
		float result = findMax.findMax(3.0f, 9.0f, 5.0f);
		Assert.assertEquals(9.0, result, 0.0f);
	}
	
	@Test
	public void givenFloatMaxNumberAtThirdPostion_ReturnMaximumValue() {
		FindMaximum findMax = new FindMaximum();
		Float result = findMax.findMax(5.0f, 3.0f, 9.0f);
		Assert.assertEquals(9.0, result, 0.0f);
	}
}
