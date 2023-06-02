import java.util.*;
public class SubjectApp{
	public static void main(String[] args){
		//スキャナーインスタンス作成
		Scanner sc = new Scanner(System.in);
		System.out.print("何科目ありますか>>");
		int n = sc.nextInt();
		//Subject配列作成
		Subject[] data = new Subject[n];
		//科目数分回るループ
		for(int i=0;i<data.length;i++){
			System.out.printf("%d科目の名前>>",i+1);
			String name = sc.next();
			System.out.printf("%d科目の点数>>",i+1);
			int score = sc.nextInt();
			//Subjectインスタンス作成
			Subject s = new Subject(name,score);
			//インスタンスを配列に格納
			data[i] = s;
		}
		//拡張forでそれぞれのインスタンスにアクセス
		for(Subject s : data){
			//グラフを描画するインスタンスメソッドの実行
			s.showGraph();
		}
	}
}
