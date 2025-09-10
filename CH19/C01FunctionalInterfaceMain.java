package CH19;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//함수형 인터페이스
@FunctionalInterface
interface Func1{
	void say(String message);
}

@FunctionalInterface
interface Fun2{
	int sum(Integer ...args);
}


@FunctionalInterface
interface Func3{
	List<Integer> sum(Object ...args);
}



public class C01FunctionalInterfaceMain {

	public static void main(String[] args) {

		//01
		Func1 f1 = (message)->{System.out.println(message+"_!");};
		f1.say("Hello");
		
		Func1 f2 = System.out::println;
		f2.say("bye");
		
		
		//02
		Fun2 f20 = (arr)->{
			int sum=0;
			for(Integer n : arr) 
				sum+=n;
			return sum;
		};
		System.out.println(f20.sum(10,20,30,40,50,60));
		
		
		
		//03
		Func3 f30 = (arr)->{
			return Arrays.stream(arr)
//					.filter(obj->{return obj instanceof Integer; })
					.filter(obj -> obj instanceof Integer )
					.map(obj-> (Integer)obj)
					.collect(Collectors.toList());
		};
		System.out.println(f30.sum(10,20,30.5,"홍길동",true));
		
		
		
		}

}
