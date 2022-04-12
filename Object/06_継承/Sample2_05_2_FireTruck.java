import sample.Sample2_05_2_Car;

class Sample2_05_2_FireTruck extends Sample2_05_2_Car {
	
	//---フィールド------------------------------------------------------
	//※なし
	
	//---コンストラクタ--------------------------------------------------
	//※なし
	
	//---メソッド--------------------------------------------------------
	
	//paintメソッド（色を塗る）※セットできる塗装色は「RED」のみ
	public void paint( String cl ){
		if( cl.equals( "RED" ) ){
			super.color = cl ;
		}
	}
	
	//オーバーライドをしている
	//オーバーライドの条件はスーパークラスの戻り値、引数と数が同じであること、アクセス制限が同じか緩いこと
	//acceleratorメソッド（現在の速度を1km/h上げる）※80km/h以上にはならないよう制御
	public void accelerator(){
		if( getSpeed() < 90 ){
			setSpeed(getSpeed() + 1);
		}
	}

	public void subbrake(){
		super.brake();
	}
	
}
