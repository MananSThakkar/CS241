package MidtermHashSetADT;

public class TestObject {
    private String value;
    public TestObject(String s){
        value = s;
    }
    public String getValue(){
        return value;
    }
    public void setValue(String s){
        value = s;
    }
    public String toString(){
        return value;
    }
    public boolean equals(Object o){
        if(o == null)
            return false;
        TestObject t = (TestObject) o;
        return (value.equals(t.getValue()));
    }
}