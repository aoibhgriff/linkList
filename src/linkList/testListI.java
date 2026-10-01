package linkList;

public class testListI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ListReferenceBased list = new ListReferenceBased();
		System.out.println("Is the Linked List empty?: " + list.isEmpty());
		
		System.out.println("The size of the list is: " + list.size());
		
		Object one = "one";
		Object two = "three";
		
		list.add(1, one);
		list.add(2, two);
		
		list.displaylist();
		System.out.println("The longest String is : " + list.listLongest());
	
		System.out.println("The object at index 1 is : " + list.get(1));
		
		list.remove(2);
		System.out.println("The size of the list is: " + list.size());
		
		list.removeAll();
		System.out.println("The size of the list is: " + list.size());
		
	}

}
