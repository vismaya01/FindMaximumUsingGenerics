import java.util.Scanner;

public class FindMaximum {
	public Integer findMax(Integer first, Integer second, Integer thrid) {
		Integer max = first;
		if(second.compareTo(max) > 0)
			max = second;
		if (thrid.compareTo(max) > 0)
			max = thrid;
		return max;
	}
	
	public Float findMax(Float first, Float second, Float third) {
		Float max = first;
		if (second.compareTo(max) > 0)
			max = second;
		if (third.compareTo(max) > 0)
			max = third;
		return max;
	}
	
	public String findMax(String first, String second, String third) {
		String max = first;
		if (second.compareTo(max) > 0)
			max = second;
		if (third.compareTo(max) > 0)
			max = third;
		return max;
	}
	
	
	
}
