package GenericSLL;

public class GSLLTester 
{
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) 
	{
		
		
		LinkedList sl1 = new LinkedList();		

			sl1.addNode(new Cat("sam", 5 ,"black"));
			System.out.println(sl1);
			
			sl1.addNode(new Cat("tom", 2 ,"brown"));	
			System.out.println(sl1);
			
			sl1.removeNode();
			System.out.println(sl1);
			
			sl1.addNode(new Cat("jack", 4 ,"blackish_grey"));	
			System.out.println(sl1);
			
			sl1.addNode(new Cat("coco", 3 ,"white"));	
			System.out.println(sl1);
		
			sl1.removeNode();
			System.out.println(sl1);
		
			sl1.clear();
			System.out.println(sl1);
	}

}
