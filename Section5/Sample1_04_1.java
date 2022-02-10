/*-< Sample1_04_1 >----------------------------------------
定価1000円の商品の税込価格を計算して表示するプログラムです。
消費税は8％で計算しています。
---------------------------------------------------------*/
class Sample1_04_1 {
	public static void main (String[] args) {
		
		int    listPrice   = 1000 ;             
		
		final double ZEIRITU =  1.08 ;             

		
		double siharai = listPrice * ZEIRITU ;  
		
		System.out.println(siharai) ;       
		
	}
}
