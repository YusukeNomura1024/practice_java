

public class Example {
    public static void main(String[] args) {
        Outer outer = new Outer(); // クラスOuterをインスタンス化
        Outer.Inner inner = outer.new Inner();
    }
}
//Outerは外部クラスのため、Outer outer = new Outer()でインスタンスかができる
//しかし、InnerクラスはOuterクラスの内部クラスのため、Outerクラスの中でしか呼び出せない
//Outer.Inner innerによってinner変数を定義して、newはInnerクラスのメソッドのため、outerオブジェクトに対してnewを呼び出す必要がある
//importでOuterを呼び出していないので、Innerを定義するときは、Outer.Innerでどこの内部クラス化を記述する
//importで呼び出すためには、ファイル名.Outer.Innerという記述をすることで、Inner inner = outer.new Inner()と記述できる
