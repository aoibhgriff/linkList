package linkList;

public class testListI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ListReferenceBased list = new ListReferenceBased();
		System.out.println("Is the Linked List empty?: " + list.isEmpty());
		
		System.out.println("The size of the list is: " + list.size());
		
		Object one = 5;
		Object two = 9;
		
		list.add(1, one);
		list.add(2, two);
	
		System.out.println("The object at index 1 is : " + list.get(1));
	}

}
