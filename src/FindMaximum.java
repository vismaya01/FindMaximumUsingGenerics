
public class FindMaximum<T extends Comparable<T>> {
	T[] valueArray;
	
	public FindMaximum(T... value) {
		T[] array = (T[]) new Comparable[value.length];
		int i = 0;
		for (T val : value) {
			array[i] = val;
			i++;
		}
		this.valueArray = array;
	}
	
	public T findMax() {
		return FindMaximum.findMax(valueArray);
	}
	
	public static <E extends Comparable<E>> E findMax(E[] array) {
		E max = array[0];
		for(int i = 1; i < array.length ; i++) {
			if(array[i].compareTo(max) > 0)
				max = array[i];
		}
		printMax(max);
		return max;
	}
	
	private static <T> void printMax(T maximumNumbers) {
		System.out.println("Maximum Value:" + maximumNumbers);

	}
}
