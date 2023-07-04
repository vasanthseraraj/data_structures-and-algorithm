import java.util.Arrays;

public class DynamicArray {
	private int[] arr;
	int size;
	int capacity;
	final static int initialCapacity = 4;

	DynamicArray() {
		size = 0;
		arr = new int[initialCapacity];
		capacity = initialCapacity;
	}

	public void add(int value) {
		if (size == capacity) {
			increaseCapacityOfTheArray();
		}
		arr[size++] = value;
		System.out.println("Value added");
	}

	private void increaseCapacityOfTheArray() {
		capacity *= 2;
		arr = Arrays.copyOf(arr, capacity);

	}

	public void display() {
		System.out.println("Elements in the List : ");
		for (int i = 0; i < size; i++) {
			System.out.print(arr[i] + " ");
		}

	}

	public void insertAtposition(int value, int position) {
		if (size == capacity) {
			increaseCapacityOfTheArray();
			System.out.println("Array Capacity Increased...");
		}
		for (int i = size - 1; i >= position; i--) {
			arr[i + 1] = arr[i];
		}
		arr[position] = value;
		size++;
		System.out.println("Value added at pos:" + position);

	}

	public void delete(int position) {
		for (int i = position + 1; i < size; i++) {
			arr[i - 1] = arr[i];
		}
		size--;
		if (capacity > initialCapacity && capacity == 3 * size) {

			shrinkArray();
		}
		System.out.println("Value deleted at pos:" + position);

	}

	private void shrinkArray() {
		capacity /= 2;
		arr = Arrays.copyOf(arr, capacity);

	}

	public int get(int position) {
		return arr[position];
	}

	public int size() {
		return size;
	}

	public void update(int position, int value) {
		int previousVal = arr[position];
		arr[position] = value;
		System.out.println("Value updated from " + previousVal + " to " + value + " at pos: " + position);
	}
}
