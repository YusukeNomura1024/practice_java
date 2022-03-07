import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Date;
import java.sql.Time;
import java.util.ArrayList;
import java.util.List;

public class CalcWorkingMonthlyMoney {

	public static void main(String[] args) {
		//  WorkingResult.csvのパス ※「C:\WorkSpace」直下に配置していない場合は適宜変更してください。
		final String WORKING_RESULT_FILE_PATH = "C:\\Users\\yusuk\\Desktop\\back up\\plactice_java\\sec19_システム作成\\WorkingResult.csv";
		// コンマを区切りとして設定をする
		final String COMMA = ","; 

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

		List<String> workingResults = new ArrayList<String>(); //ファイルから読み込んだデータの格納用

		//  WorkingResult.csvを読み込む
		try {
			// WorkingResult.csvの読み込み準備
			File workingResultFile = new File(WORKING_RESULT_FILE_PATH);
			BufferedReader br = new BufferedReader(new FileReader(workingResultFile));

			// WorkingResult.csvを1行ずつ読み込んでArrayListに格納する
			String recode = br.readLine();
			while (recode != null) { //readLineの特性上最後の空白行はnullとなる
				workingResults.add(recode);
				recode = br.readLine();
			}
			br.close();
		} catch (IOException e) {
			System.out.println(e);
		}

		int monthlyMoney = 0;
		// ArrayListから1行ずつ取り出して日付/出勤時間/退勤時間に振り分け
		for (int i = 0; i < workingResults.size() ; i++) {
			String workingRecode    = workingResults.get(i);      // 1行ずつ文字列を取り出す
			String[] forSplitRecode = workingRecode.split(COMMA); // splitメソッドを用いてカンマ区切りで文字列を分解＆配列にそれぞれ格納
			Date workingDate = Date.valueOf(forSplitRecode[0]); // 出勤日
			Time startTime   = Time.valueOf(forSplitRecode[1]); // 出勤時間
			Time finishTime  = Time.valueOf(forSplitRecode[2]); // 退勤時間

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
			System.out.println("-----------" + workingDate + "-----------");
			System.out.println(
				"定時内労働時間" + workingHour + "時間" + workingMin + "分 " +
				"休憩時間は" + restMin + "分 " +
				"残業時間は" + workingHourOverTime + "時間" + workingMinOverTime + "分"
			);
			System.out.println(
				"定時労働分の給料" + todayWorkingWage + "円 " +
				"残業分の給料" + todayWorkingOverTimeWage + "円"
			);

			monthlyMoney = monthlyMoney + todayWorkingWage + todayWorkingOverTimeWage;
		}
		System.out.println("-----------給料日-----------");
		System.out.println("今月の給料は" + monthlyMoney + "円です。");


		// // バイトの開始時間と終了時間をコマンドライン引数から受け取る
		// Time startTime  = Time.valueOf(args[0]);
		// Time finishTime = Time.valueOf(args[1]);


	}
}
