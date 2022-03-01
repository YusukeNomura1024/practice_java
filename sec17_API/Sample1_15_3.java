import java.util.List;//utilのArrayListクラスを使うときは、utilのListクラスも一緒にインポートしないといけない
import java.util.ArrayList;

class Sample1_15_3{
	public static void main (String[] args) {
		
		//APIの活用（ArrayList）
		
		List<String> dogsNameList = new ArrayList<String>();
		
		dogsNameList.add("タロウ");   //インデックス0で要素が生成される
		dogsNameList.add("グレース"); //インデックス1で要素が生成される
		dogsNameList.add("モコ");     //インデックス2で要素が生成される
		dogsNameList.add("チョコ");   //インデックス3で要素が生成される
		
		System.out.println("▼「dogsNameList.remove(1)」実行前");
		for( int i = 0 ; i < dogsNameList.size() ; i++ ){
			System.out.println( dogsNameList.get(i) );
		}
		
		dogsNameList.remove(1);
		
		System.out.println("▼「dogsNameList.remove(1)」実行後");
		for( int i = 0 ; i < dogsNameList.size() ; i++ ){
			System.out.println( dogsNameList.get(i) );
		}
		
	}
}

//　isEmpty()はリストに要素がない場合はtrueを返す

//参照型しか扱えないので、プリミティブではないクラスを指定する
//Boolean ＜　boolean
//Character < char
//Byte < byte
//Short < short
//Integer < int
//Long < long
//Float < float
//Double < double
//それぞれの参照用のクラスの参照先にプリミティクラスがあると思っておこう
