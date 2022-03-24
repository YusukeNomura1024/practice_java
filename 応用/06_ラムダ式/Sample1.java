public class Sample1 {
    public static void main (String[] args){
        Greeting goodbye = (String word) -> {
            System.out.println(word);
            return word;
        };
        Greeting goodbye2 = (word) -> { //ラムダ式の引数の型は省略できる
            System.out.println(word);
            return word;
        };
        Greeting goodbye3 = (word) -> word;
         //ラムダ式の｛｝とreturnは省略できる。処理が1行の場合に限る
            
        Greeting goodbye4 = word -> word;
        //括弧 () は引数が1つの場合、型とともに省略

        goodbye.hello("こんばんわ");
        goodbye2.hello("こんばんわ2");
        System.out.println(goodbye3.hello("こんばんわ3"));
        System.out.println(goodbye4.hello("こんばんわ4"));
    }
}