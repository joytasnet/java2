public class IceCreamApp{
	public static void main(String[] args){
		IceCream ic1 = new IceCream("ピノ",160);
		ic1.showInfo();
		IceCream ic2 = new IceCream("スーパーカップ");
		ic2.showInfo();
	}
}
class IceCream{
	String name;
	int price;
	public IceCream(String name,int price){
		this.name=name;
		this.price=price;
	}
	public IceCream(String name){
		this(name,120);
		/*
		this.name=name;
		this.price=120;
		*/
	}
	public void showInfo(){
		System.out.printf("%s(%d円)%n",this.name,this.price);
	}

}
