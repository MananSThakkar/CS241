package DLL;

public class DLListTester {

	public static void main(String[] args) {
	
		/*DLLNode<String> myList = new DLLNode<String>();
		System.out.println(myList);*/
		
		DLList<String> myList = new DLList<String>();
		
		myList.add("Kelley");
		System.out.println(myList);
		
		myList.add("Ford");
		myList.add("Kim");
		myList.add("Max");
		myList.add("Luke");
		System.out.println(myList);
		
		myList.remove("Kim");
		System.out.println(myList);
		
		

	}

}
