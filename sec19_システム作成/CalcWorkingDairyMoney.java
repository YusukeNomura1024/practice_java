import java.sql.Time;

public class CalcWorkingDairyMoney {

	public static void main(String[] args) {

		// 計算用の数値を定数で用意
		final long ONE_HOUR_BY_MILLI_SEC = 1000 * 60 * 60; // 1時間のミリ秒換算
		final long ONE_MIN_BY_MILLI_SEC  = 1000 * 60;      // 1分のミリ秒換算
		final int  ONE_HOUR_BY_MIN       = 60;   					 // 1時間の分換算
		final int  HOURLY_WAGE					 = 900;            // 時給
		int  minuteWage					 = HOURLY_WAGE / 60;            // 1分当たりの給料
		final Long BORDER_REST1			 		 = 21600000L;			//休憩発生ライン１
		final Long BORDER_REST_TIME1 		 = 2700000L;			//休憩時間１
		final Long BORDER_REST2			 		 = 28800000L;			//休憩発生ライン2
		final Long BORDER_REST_TIME2 		 = 3600000L;			//休憩時間2
		final Long BORDER_OVERTIME			 = 28800000L;			//残業ライン
		final double  RATE_OVERTIME			 = 1.25;            // 残業倍率


		// バイトの開始時間と終了時間をコマンドライン引数から受け取る
		Time startTime  = Time.valueOf(args[0]);
		Time finishTime = Time.valueOf(args[1]);

		// getTimeメソッドを使って労働時間をミリ秒（0.001秒単位）で取得する
		// ※getTime()メソッドの戻り値はlong型であることに注意
		long workingTime = finishTime.getTime() - startTime.getTime();

		Long restTime = 0L;
		if(workingTime > BORDER_REST2){
			restTime = BORDER_REST_TIME2;
		} else if(workingTime > BORDER_REST1){
			restTime = BORDER_REST_TIME1;
		}
		int restMin = (int)(restTime / ONE_MIN_BY_MILLI_SEC);
		Long overWorkingTime = 0L;
		workingTime -= restTime;
		if(workingTime > BORDER_OVERTIME){
			overWorkingTime = workingTime - BORDER_OVERTIME;
			workingTime = BORDER_OVERTIME;
		}
		
		// ミリ秒で取得した労働時間を○時間△分の形式に直す
		int workingHour = (int)( workingTime / ONE_HOUR_BY_MILLI_SEC );                      // 時間に換算
		int workingMin  = (int)( ( workingTime / ONE_MIN_BY_MILLI_SEC ) % ONE_HOUR_BY_MIN ); // 分に換算
		int todayWorkingWage = (int)(workingHour * HOURLY_WAGE + workingMin * HOURLY_WAGE / 60);

		int workingHourOverTime = (int)( overWorkingTime / ONE_HOUR_BY_MILLI_SEC );
		int workingMinOverTime  = (int)( ( overWorkingTime / ONE_MIN_BY_MILLI_SEC ) % ONE_HOUR_BY_MIN ); // 分に換算
		int todayWorkingOverTimeWage = (int)(workingHourOverTime * HOURLY_WAGE * RATE_OVERTIME + workingMinOverTime * HOURLY_WAGE * RATE_OVERTIME / 60);


		// 出力
		System.out.println("本日の定時内労働時間は" + workingHour + "時間" + workingMin + "分です。");
		System.out.println("休憩時間は" + restMin + "分です。");

		System.out.println("本日の残業時間は" + workingHourOverTime + "時間" + workingMinOverTime + "分です。");
		System.out.println("定時労働分の給料は" + todayWorkingWage + "円です。");
		System.out.println("残業分の給料は" + todayWorkingOverTimeWage + "円です。");

	}
}
