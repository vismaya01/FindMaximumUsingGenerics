import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.Assert;

public class FindMaximumTest {

	@Test
	public void givenMaxNumberAtFirstPostion_ReturnMaximumValue() {
		FindMaximum<Integer> findMax = new FindMaximum<Integer>(9, 3, 5);
		Integer result = findMax.findMax();
		Assert.assertEquals(9, result, 0);
	}
	
	@Test
	public void givenMaxNumberAtSeondPostion_ReturnMaximumValue() {
		FindMaximum<Integer> findMax = new FindMaximum<Integer>(3, 9, 5);
		Integer result = findMax.findMax();
		Assert.assertEquals(9, result, 0);
	}
	
	@Test
	public void givenMaxNumberAtThirdPostion_ReturnMaximumValue() {
		FindMaximum<Integer> findMax = new FindMaximum<Integer>(5, 3, 9);
		Integer result = findMax.findMax();
		Assert.assertEquals(9, result, 0);
	}
	
	@Test
	public void givenFloatMaxNumberAtFirstPostion_ReturnMaximumValue() {
		FindMaximum<Float> findMax = new FindMaximum<Float>(9.0f, 3.0f, 5.0f);
		Float result = findMax.findMax();
		System.out.println(result);
		Assert.assertEquals(9.0, result, 0.0f);
	}
	
	@Test
	public void givenFloatMaxNumberAtSeondPostion_ReturnMaximumValue() {
		FindMaximum<Float> findMax = new FindMaximum<Float>(3.0f, 9.0f, 5.0f);
		Float result = findMax.findMax();
		Assert.assertEquals(9.0, result, 0.0f);
	}
	
	@Test
	public void givenFloatMaxNumberAtThirdPostion_ReturnMaximumValue() {
		FindMaximum<Float> findMax = new FindMaximum<Float>(5.0f, 3.0f, 9.0f);
		Float result = findMax.findMax();
		Assert.assertEquals(9.0, result, 0.0f);
	}
	
	@Test
	public void givenStirngMaxNumberAtFirstPostion_ReturnMaximumValue() {
		FindMaximum<String> findMax = new FindMaximum<String>("Peach","Apple","Banana");
		String result = findMax.findMax();
		System.out.println(result);
		Assert.assertEquals("Peach", result);
	}
	
	@Test
	public void givenStringMaxNumberAtSeondPostion_ReturnMaximumValue() {
		FindMaximum<String> findMax = new FindMaximum<String>("Apple","Peach","Banana");
		String result = findMax.findMax();
		Assert.assertEquals("Peach", result);
	}
	
	@Test
	public void givenStringMaxNumberAtThirdPostion_ReturnMaximumValue() {
		FindMaximum<String> findMax = new FindMaximum<String>("Apple","Banana","Peach");
		String result = findMax.findMax();
		Assert.assertEquals("Peach", result);
	}
}
