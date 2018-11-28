package HashSetList;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		
		int cap = 1000000;
		
		HashSetWNoCollisionDetection<Student> hswncd = 
				new HashSetWNoCollisionDetection<>(cap);
		
		HashSetWithCollisionDetection<Student> hswcd = 
				new HashSetWithCollisionDetection<>(cap);
		
		for(int i=0; i<cap; i++) {
			Student temp = randomStudentGenerator(cap);
			hswncd.add(temp);
			hswcd.add(temp);
		}
		
		System.out.println();
		System.out.println("HashSetWNoCollisionDetection");
		//hswncd.printList();
		System.out.println("Size: " + hswncd.getSize());
		
		System.out.println();
		System.out.println("HashSetWNoCollisionDetection");
		//hswcd.printList();
		System.out.println("Size: " + hswcd.getSize());

	}
	
	private static Student randomStudentGenerator(int capacity) {
		
		String[] firstNames = {"Manan","Edward","Anna","Lizhong","Keagan","Yongjie"};
		String[] lastNames = {"Smith", "Gervis", "Chen", "Elison"};
		String[] majors = {"CS", "PHY", "ART", "PSY"};
		Random id = new Random();
		String studentID = Integer.toString(id.nextInt(capacity));
		studentID = "U" + studentID;
		
		return new Student(firstNames[id.nextInt(6)], lastNames[id.nextInt(4)],
				studentID, majors[id.nextInt(4)]);
		
	}

}
