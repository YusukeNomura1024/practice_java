//基本的には一つのファイルに一つのクラスを定義する
//複数書いたとしても、コンパイル時にクラスごとに分かれてしまうので
//管理がややこしくなる。クラス名とファイル名は一致させておく方が管理がしやすい

//クラスの中にメソッドが複数はいっている

class Sample1_14_1 {
	
	public static void main(String[] args) {
		
		//メソッドのしくみ
		
		int print = sum( 2 , 3, 4 ) ;
		
		System.out.println("print：" + print);
		
	}
	
	static int sum( int num1 , int num2, int num3 ) {
		
		int calcResult = num1 + num2 + num3 ;
		
		return calcResult ;
		
	}
	
}