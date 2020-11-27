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
	
}
