
public class FindMaximum {
	public <E extends Comparable<E>> E findMax(E first, E second, E thrid) {
		E max = first;
		if(second.compareTo(max) > 0)
			max = second;
		if (thrid.compareTo(max) > 0)
			max = thrid;
		return max;
	}	
}
