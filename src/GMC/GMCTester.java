package GMC;

public class GMCTester {

    public static void main(String[] args) {
        
        //AnyType = String
        GenericMemoryCell<String> gmc1 = new GenericMemoryCell<>();
        
        //AnyType = Integer
        GenericMemoryCell<Integer> gmc2 = new GenericMemoryCell<>();
        
        //AnyType = Cat (Object, see Cat.java)
        GenericMemoryCell<Cat> gmc3 = new GenericMemoryCell<>();
        
        //test gmc1
        gmc1.write("String data in gmc1");
        System.out.println(gmc1.read());
        
        //test gmc2
        gmc2.write(200);
        System.out.println(gmc2.read());
        
        //test gmc3 
        Cat c1 = new Cat();
        c1.setAge(3);
        c1.setColor("Blue");
        c1.setName("Tom");
        
        gmc3.write(c1);
        System.out.println(gmc3.read());
        
        //test gmc3 and gmc4 togeter
        Cat c2 = new Cat();
        c2.setAge(2);
        c2.setColor("White");
        c2.setName("Zoe");
        
        System.out.println("compareTo c1 and c2");
        System.out.println(c1.compareTo(c2));
        
    }
}
