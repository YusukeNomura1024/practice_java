class Sample1_06_4 {
	public static void main (String[] args) {
		
		//論理演算子の活用
		
		int numberX = 8 ;
		int numberY = 4 ;
		int numberZ = 5 ;
		
		//『 && 』 両辺がtrueの時true
		boolean logicalValue1 = numberX != numberY && numberY > numberZ ;
		//上記の場合　logigalValue = true && falseとなるのでfalseとなる
		System.out.println("logicalValue1：" + logicalValue1);
		
		//『 || 』どちらかがtureであればtrueになる、左辺がtrueであれば、右辺は見に行かない
		boolean logicalValue2 = numberX != numberY || numberY > numberZ ;
		System.out.println("logicalValue2：" + logicalValue2);
		
		//『 ^ 』　左辺と右辺が違っていれば、true
		boolean logicalValue3 = numberX != numberY ^ numberY > numberZ ;
		System.out.println("logicalValue3：" + logicalValue3);
		
		// 反転 boolean型の前に！を付けるとtrueとfalseが反転する
		boolean logicalValue4 = !logicalValue3 ;
		System.out.println("logicalValue4：" + logicalValue4);
		
	}
}
