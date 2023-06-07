public class SuperHero extends Hero{
	boolean flying;
	public SuperHero(){
		super();
		System.out.println("SuperHeroクラスのコンストラクタ");
	}
	public void fly(){
		this.flying = true;
		System.out.println("飛び上がった!");
	}
	public void land(){
		this.flying = false;
		System.out.println("着地した!");
	}
	/*
	 * 親クラスで定義されているメソッドを再定義することをOverrideという。この際@Overrideアノテーションをつけおくとよい*/
	@Override
	public void run(){
		System.out.println(this.name+"は撤退した！");
	}
	@Override
	public void attack(Matango m){
		super.attack(m);
		if(this.flying){
			super.attack(m);
		}
	}
}
