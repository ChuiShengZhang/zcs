package interface_as_param;
interface EatFood{
	public abstract void eat();
}
class Chinese implements EatFood{
	@Override
	public void eat(){
		System.out.println("�й���ϰ���ÿ��ӳԷ�");
	}
}
class American implements EatFood{
	@Override
	public void eat(){
		System.out.println("������ϰ���õ���Է�");
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
