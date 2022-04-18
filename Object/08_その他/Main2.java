public class Main2 {
    static public void main(String[] args){
        
        try{
            TestClass test = new TestClass();
            test.split("");
        }catch(TestException e){
            System.out.println("からです");   
        }
    }
}
