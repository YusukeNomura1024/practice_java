/*-< 演習：Ex1_15_1 >---------------------------------
BigDecimalの扱いについてAPIドキュメントなどで調べながら
以下の結果が表示されるプログラムを作ってみましょう！
----------------------------------------------------*/
import java.math.RoundingMode;
import java.math.BigDecimal;

class Ex1_15_1{
	public static void main (String[] args) {
		
		//(1) 0.2 * 83 - 10.6
		BigDecimal a = new BigDecimal("0.2");
		BigDecimal b = new BigDecimal("83");
		BigDecimal c = new BigDecimal("-10.6");
		BigDecimal answer = (a.multiply(b)).add(c);
		System.out.println(answer);
		
		
		
		
		
		
		//(2) 0.2 * 83 - 10.6 / 3　※小数第4位までで表示（小数第5位以下は四捨五入）
		//<補足>
		// BigDecimalによる割り算は丸めの指定が必要です！
		// XXX ÷ YYYをして小数第2位で表示（小数第3位以下は切り捨て）
		// XXX.divide(YYY, 2, RoundingMode.DOWN);
		
		BigDecimal d = new BigDecimal("3");
		BigDecimal answer2 = a.multiply(b).add(c.divide(d, 4, RoundingMode.HALF_UP));
		System.out.println(a.multiply(b));
		System.out.println(c.divide(d, 4, RoundingMode.HALF_UP));
		System.out.println(answer2);
		
		
		
		
		
		
	}
}
