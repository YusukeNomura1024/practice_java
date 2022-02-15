//String型は実はプリミティブ型ではない、参照型である
//String型は文字列によって容量が全く異なるため、容量を確保するのではなく、
//参照によって、容量を確保していない？

//しかしよく多用するため、擬似プリミティブ型として扱われる
//String data = new String("データ");とすることで参照型の作成ができるが、
//イメージ的にはString型に文字列が入っているようだが
//実際はchar型が複数入っていることになっている。
//char型の配列と同じになる

//String型の比較は==では同じ文字列でもfalseになる。あくまでも参照型で、
//アドレスを示しているため、trueにはならない。
//String型を隠したい場合はString1.equals(String2)とする



class Sample1_09_1 {
	public static void main (String[] args) {
		
		//参照型に格納されているのは場所情報→表示したらどうなる？？
		
		int[][] rooms = {{101, 102, 103}, {201, 202, 203}, {301, 302, 303}} ;
		
		System.out.println("▼参照型の変数roomsに格納されている値");
		System.out.println("rooms：" + rooms );
		
		
		//String型変数同士で関係演算子を用いる際の注意
		//正式ではないString型の作成（擬似プリミティブ方式）
		String  name   = "モコ" ;
		
		boolean check1 = name == args[0] ;
		System.out.println("▼『==』を用いたString型の比較");
		//同じ文字列でも参照型であればfalseになる
		System.out.println("check1：" + check1 );
		
		boolean check2 = name.equals( args[0] ) ;
		System.out.println("▼『equals』を用いたString型の比較");
		System.out.println("check2：" + check2 );
		
		
		//【注意】疑似プリミティブとして生成されたString型変数は扱いがややこしい
		
		String  nameOfficial1 = new String("モコ") ;  //正式な作られ方をしたString型変数
		String  nameOfficial2 = new String("モコ") ;  //正式な作られ方をしたString型変数
		String  nameGizi1   = "モコ" ;                //疑似プリミティブな作られ方をしたString型変数
		String  nameGizi2   = "モコ" ;                //疑似プリミティブな作られ方をしたString型変数
		
		boolean check3 = nameOfficial1 == nameOfficial2 ;
		System.out.println("▼『==』を用いた比較（正式⇔正式）");
		System.out.println("check3：" + check3 );
		
		boolean check4 = nameGizi1 == nameOfficial1 ;
		System.out.println("▼『==』を用いた比較（疑似⇔正式）");
		System.out.println("check4：" + check4 );
		
		boolean check5 = nameGizi1 == nameGizi2 ;
		System.out.println("▼『==』を用いた比較（疑似⇔疑似）※注目！");
		System.out.println("check5：" + check5 );
		//おせっかいで擬似プリミティブとして作成された文字列同士は
		//＝＝で同じ文字列であればtrueにしてくれる
		//しかし、、、ややこしくなるので、文字列同士の比較は全て[.equals]を使いましょう
		
	}
}

//参照型を別の変数に代入した場合、アドレスが入ることになる
//文字列「もこ」がString1に代入された場合、[も、こ]のchar型の変数のアドレスが格納される
//String1をString2に代入した場合は、「も、こ」が代入されるのではなく、
//String1が参照している「も、こ」のchar型の変数のアドレスが格納される
//つまりショートカット的な扱いとなる。
//String１に対して破壊的なことをした場合は、参照先のchar型に影響を与える
//そして、String２に対して破壊的なことをした場合も、String1と同じchar型を参照しているため、
//String２に対して破壊的処理をした後に、String1を呼び出すと、String2に対して行われたことが反映されている
//参照型を代入された変数は、ショートカットであり、複製されたわけではない

//参照されなくなったアドレスのデータはガベージコレクションという機能で、
//自動で削除される