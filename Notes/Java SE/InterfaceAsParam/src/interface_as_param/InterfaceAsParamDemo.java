package interface_as_param;
interface EatFood{
	public abstract void eat();
}
class Chinese implements EatFood{
	@Override
	public void eat(){
		System.out.println("中国人习惯用筷子吃饭");
	}
}
class American implements EatFood{
	@Override
	public void eat(){
		System.out.println("美国人习惯用刀叉吃饭");
	}
}
class EatMethod{
	public void lookEatFood(EatFood ef){
		ef.eat();
	}
}
public class InterfaceAsParamDemo {
	public static void main(String[] args){
		EatMethod em=new EatMethod();
		Chinese chinese=new Chinese();
		American american=new American();
		em.lookEatFood(chinese);
		em.lookEatFood(american);
	}
}
