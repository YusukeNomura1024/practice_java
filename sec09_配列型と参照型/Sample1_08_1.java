class Sample1_08_1 {
	public static void main (String[] args) {
		
		//�z��̊��p
		
		char[] singou = new char[3] ;
		singou[0] = '��' ;
		singou[1] = '��' ;
		singou[2] = '��' ;
		
		char[] singou2 = new char[]{'a','k','o'};
		System.out.println("�v�f�̎Q�ƁF" + singou2[1] );

		//����ɏȗ�
		String[] singou3 = {"����", "��", "����"};
		System.out.println("�v�f�̎Q�ƁF" + singou3[1] );

		char x = singou[1] ;
		System.out.println("�v�f�̎Q�ƁF" + x );
		
		int count = singou.length ;
		System.out.println("�v�f���F" + count );
		
	}
}
