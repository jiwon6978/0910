package Ch20;

@CustomAnnotation(value="정지원",number=20,isOpen=true) //속성을 포함하고 있기 때문에 값을 넣거나 만들 때 default설정해놓기
class Simple{

	Simple(){
		//커스텀어노테이션 ref에 담아서 속성들(default값) 확인하기
		CustomAnnotation ref =this.getClass().getAnnotation(CustomAnnotation.class);
		System.out.println(ref.value());
		System.out.println(ref.number());
		System.out.println(ref.isOpen());
	
	
	
	}
	
	

}
public class Main {

	public static void main(String[] args) {
	Simple ob = new Simple();
	System.out.println(ob);

	}

}
