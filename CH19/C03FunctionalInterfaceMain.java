package CH19;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class C03FunctionalInterfaceMain {
	
	
	//01
	public static Function<Integer , Integer> func1 =x->x*x;
	//02
	public static Function<Integer , Integer> func2 =x->x+x;
	//03
	public static Function<List<Integer> , Integer> func3 =x->{return x.stream().reduce(0,(sum,el)->sum+el);};
		
//		x.stream().reduce(누전변수초기값,(누전변수,요소변수)->{return 누전연산;});
	
	//04
	public static Function<List<Object>,Integer> func4 = (li)->
	{
		//List의 각 요소 중 Integer만 filter
		//필터링된 Integer의 재구성 (map)
		//누적합 (reduce)
		return li.stream()
		.filter((el)->{return el instanceof Integer;})//Object ->Integer 다운캐스팅처리
		.map(el->{return (Integer)el;})
		.reduce(0,(sum,el)->{return sum+el;});
	};
	//05
	public static Function<List<Object>,List<String>> func5=(li)->{
		return li.stream()
		.filter((el)->{return el instanceof String;})
		.map((el)->{return "-"+(String)el+"-";})
		.collect(Collectors.toList());
	}; 
	
	//06 함수연산된 값을 인자로 받아 연속 연산하기
	public static Function<Integer,Integer> func6 = func1.andThen(func2);
	
	//07 func2실행 후 func3실행
	public static Function<List<Integer>,Integer> func7 = func3.andThen(func2).andThen(func1);
	
	//08
	public static Function<Integer,Function<Integer,Integer>>func8 = (x)->{
		//
		System.out.println("func8 x :" +x);
		return (n)->{
			//
			System.out.println("func8 n :"+n);
			return n+x;}; 
	};
	//09
	public static Function<Integer,Function<Integer,Integer>>func9=x->(y)-> x+y;
	
	

	public static void main(String[] args) {
	
		//01
		System.out.println(func1.apply(10));
		//02
		System.out.println(func2.apply(10));
		//03
		System.out.println(func3.apply(Arrays.asList(10,20,30)));
		//04
		System.out.println(func4.apply(Arrays.asList("홍",1,3,4,true)));
		//05
		System.out.println(func5.apply(Arrays.asList("10",55,7,"HELLO",true)));
		//06
		System.out.println(func6.apply(10));
		//07
		System.out.println(func3.apply(Arrays.asList(10,20,30)));
		//08
		System.out.println(func8.apply(10).apply(20));
		//09
		System.out.println(func8.apply(10).apply(20));
	}

}
