public class SlimeApp{
	public static void main(String[] args){
		Slime s1 = new Slime("スラキチ",25);
		s1.appear();
		Slime s2 = new Slime(20);
		s2.appear();
		System.out.printf("%d体のスライムが襲ってきた!%n",Slime.getCount());
	}
}
class Slime{
	static int count=0;
	String name;
	int hp;
	//コンストラクタ
	public Slime(String name,int hp){
		this.name=name;
		this.hp=hp;
		count++;
	}
	public Slime(int hp){
		this("スライム",hp);
	}
	//インスタンスメソッド
	public void appear(){
		System.out.printf("%s(%d)があらわれた!%n",this.name,this.hp);
	}
	//staticメソッド
	public static int getCount(){
		return count;
	}
}
