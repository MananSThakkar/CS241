package QueueArray;


public class QueueArrayTester {

	public static void main(String[] args) {
		QueueArray<String> QA1 = new QueueArray<String>(6);
		
		QA1.enqueue(" There ");
		QA1.enqueue(" is ");
		QA1.enqueue(" a ");
		QA1.enqueue(" spoon. ");
		
		System.out.println(QA1);
		
		for(int i = 0; i < 3; i++) {
			
			QA1.dequeue();
			System.out.println(QA1);
		}

	}

}
