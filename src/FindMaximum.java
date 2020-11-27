
public class FindMaximum<T extends Comparable<T>> {
	T first;
	T second;
	T thrid;
	
	public FindMaximum(T first, T second, T third) {
		this.first = first;
		this.second = second;
		this.thrid = third;
	}
	
	public T findMax() {
		return FindMaximum.findMax(this.first, this.second, this.thrid);
	}
	
	public static <E extends Comparable<E>> E findMax(E first, E second, E thrid) {
		E max = first;
		if(second.compareTo(max) > 0)
			max = second;
		if (thrid.compareTo(max) > 0)
			max = thrid;
		return max;
	}	
}
