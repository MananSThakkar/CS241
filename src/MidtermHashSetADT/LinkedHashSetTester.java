package MidtermHashSetADT;

public class LinkedHashSetTester {
    public static void main(String[] args) {
        System.out.println("Using String items");
        LinkedHashSet<String> lhs1 = new LinkedHashSet<>();
      
        lhs1.add("One");
        lhs1.add("One");
        lhs1.add("Two");
        lhs1.add("Three");
        lhs1.add("Two");
        lhs1.add("Four");
        lhs1.add("Five");
        lhs1.add("Six");
        lhs1.add("Three");
        System.out.println(lhs1.size());      
        System.out.println(lhs1);
        System.out.println("");
        
        System.out.println("Contain method test");
        System.out.println(lhs1.contains("one"));
        System.out.println("");
        
        System.out.println("isEmpty method test");
        lhs1.isEmpty();
        System.out.println(lhs1.isEmpty());  
        System.out.println("");
        
        System.out.println("Remove method test");
        lhs1.remove("Two");
        System.out.println(lhs1.size());      
        System.out.println(lhs1);
        System.out.println(""); 
        
        System.out.println("Remove everything one by one test");
        lhs1.remove("One");
        System.out.println(lhs1);
        System.out.println(lhs1.size());
        lhs1.remove("Three");
        System.out.println(lhs1);
        System.out.println(lhs1.size());
        lhs1.remove("Four");
        System.out.println(lhs1);
        System.out.println(lhs1.size());
        lhs1.remove("Five");
        System.out.println(lhs1);
        System.out.println(lhs1.size());
        lhs1.remove("Six");
        System.out.println(lhs1);
        System.out.println(lhs1.size());
        System.out.println("");
        
        System.out.println("Empty Set tester");
        lhs1.clear();
        System.out.println(lhs1.size());  
        System.out.println("");
        
        System.out.println("isEmpty method test");
        System.out.println(lhs1.isEmpty());
        System.out.println("");
        
        System.out.println("Using TestObject items String");
        LinkedHashSet<TestObject> lhs2 = new LinkedHashSet<>();
        TestObject p = new TestObject("Peter");
        TestObject q = new TestObject("Peter");
        TestObject r = new TestObject("Jack");
        TestObject t = new TestObject("Kelly");
        TestObject y = new TestObject("Frank");
        TestObject z = new TestObject("Jack");
        lhs2.add(p);
        lhs2.add(r);
        lhs2.add(q);
        lhs2.add(t);
        lhs2.add(y);
        lhs2.add(z);
        System.out.println(lhs2.size());
        System.out.println(lhs2);
        System.out.println("");   
        
        System.out.println("Remove method test using TestObject");
        lhs2.remove(y);
        lhs2.remove(p);
        System.out.println(lhs2.size());      
        System.out.println(lhs2);
        System.out.println("");
        
        System.out.println("Empty Set tester");
        lhs2.clear();
        System.out.println(lhs2.size());  
        System.out.println("");
        
        System.out.println("isEmpty method test");
        System.out.println(lhs2.isEmpty());
    }
}

     