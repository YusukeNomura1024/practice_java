public class TestClass {
    //自分で定義した例外クラスをthrowする
    public String[] split(String str) {
        if (str == ""){
            throw new TestException();
        }
        return str.split(",");
    }
}

class TestException extends RuntimeException {
    
}
