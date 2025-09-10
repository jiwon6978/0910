package Ch20;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
//어노테이션 만들기

@Retention(RetentionPolicy.RUNTIME)//어노테이션의 유지기간(프로그램의 동작중인 상태에서만 실행)
//ElementType.TYPE : 클래스 , 인터페이스 , eum 등등 적용
//ElementType.METHOD : 메서드에 적용
//ElementType.FIELD : 멤버 변수에 적용
@Target({ElementType.TYPE,ElementType.METHOD}) //속성과 함수에도 적용될 수 있게끔 설정
public @interface CustomAnnotation {
	//함수만들기
	String value() default "HELLO";
	int number() default 100;
	boolean isOpen() default false;




}
