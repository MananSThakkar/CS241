package Alist;
public class AListTester 
{
	public static void main(String[] args) 
	{
		AList<Integer> lst = new AList<>();
		
		lst.append(1);
		System.out.println(lst.currPos());
		
		lst.moveToPos(1);
		lst.insert(2);
		lst.append(3);
		System.out.println(lst);
		
		System.out.println(lst.getValue());
		
		System.out.println(lst.length());
		
		lst.moveToStart();
		System.out.println(lst.currPos());
		
		lst.moveToEnd();
		System.out.println(lst.currPos());
		
		lst.next();
		System.out.println(lst.currPos());
		
		lst.prev();
		System.out.println(lst.currPos());
		
		lst.remove();
		System.out.println(lst);
		
		lst.clear();
		System.out.println(lst);
		
		System.out.println(lst.length());
		
		lst.append(6);
		System.out.println(lst);
		
			
	}

}