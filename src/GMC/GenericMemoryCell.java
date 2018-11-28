package GMC;

public class GenericMemoryCell<AnyType extends Comparable<? super AnyType>>{
    
    private AnyType storedValue;
    
    public AnyType read(){
        return storedValue;
    }
    
    public void write(AnyType x){
        storedValue = x;
    }
       
    public int compareTo(GenericMemoryCell<AnyType> obj){
        return this.read().compareTo(obj.read());
    }
}
