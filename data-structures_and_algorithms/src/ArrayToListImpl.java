import java.util.Scanner;

public class ArrayToListImpl {

	public static void main(String[] args) {
		int value, position;
		try (Scanner sc = new Scanner(System.in)) {
			DynamicArray list = new DynamicArray();
			while (true) {
				System.out.println("\nChoose the Option Given below:");
				System.out.println("1. Insert an Element");
				System.out.println("2. Display the List");
				System.out.println("3. Insert an Element in a particular position");
				System.out.println("4. Delete an Element");
				System.out.println("5. Update an Element");
				System.out.println("6. Get an Element");
				System.out.println("7. Size of the List");
				System.out.println("8. Exit");
				int option = sc.nextInt();

				switch (option) {

				case 1:
					System.out.println("Enter the value to be Inserted");
					value = sc.nextInt();
					list.add(value);
					break;
				case 2:
					list.display();
					break;
				case 3:
					System.out.println("Enter the Value to be Inserted");
					value = sc.nextInt();
					System.out.println("Enter the position of the value");
					position = sc.nextInt();
					list.insertAtposition(value, position);
					break;
				case 4:
					System.out.println("Enter the position to be deleted");
					position = sc.nextInt();
					list.delete(position);
					break;

				case 5:
					System.out.println("Enter the position to be updated");
					position = sc.nextInt();
					System.out.println("Enter the value to be updated");
					value = sc.nextInt();
					list.update(position, value);
					break;
				case 6:
					System.out.println("Enter the position to be fetched");
					position = sc.nextInt();
					System.out.println("Value="+list.get(position));
					break;
				case 7:
					System.out.println("Size=" + list.size());
					break;
				case 8:
					System.out.println("Program Closed!!! Thanks...");
					System.exit(0);

				default:
					System.out.println("Invalid Option");

				}
			}
		}

	}
}
