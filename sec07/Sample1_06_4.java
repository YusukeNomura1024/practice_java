class Sample1_06_4 {
	public static void main (String[] args) {
		
		//�_�����Z�q�̊��p
		
		int numberX = 8 ;
		int numberY = 4 ;
		int numberZ = 5 ;
		
		//�w && �x ���ӂ�true�̎�true
		boolean logicalValue1 = numberX != numberY && numberY > numberZ ;
		//��L�̏ꍇ�@logigalValue = true && false�ƂȂ�̂�false�ƂȂ�
		System.out.println("logicalValue1�F" + logicalValue1);
		
		//�w || �x�ǂ��炩��ture�ł����true�ɂȂ�A���ӂ�true�ł���΁A�E�ӂ͌��ɍs���Ȃ�
		boolean logicalValue2 = numberX != numberY || numberY > numberZ ;
		System.out.println("logicalValue2�F" + logicalValue2);
		
		//�w ^ �x�@���ӂƉE�ӂ�����Ă���΁Atrue
		boolean logicalValue3 = numberX != numberY ^ numberY > numberZ ;
		System.out.println("logicalValue3�F" + logicalValue3);
		
		// ���] boolean�^�̑O�ɁI��t�����true��false�����]����
		boolean logicalValue4 = !logicalValue3 ;
		System.out.println("logicalValue4�F" + logicalValue4);
		
	}
}
