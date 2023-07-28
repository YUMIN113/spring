package com.example.hello.practice06;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

	public static void main(String[] args) {
		/*
		 # 이슈 
		 - 빈(bean)이 싱글턴인 관계로 빈(bean)의 필드가 예상과 다른 값을 갖을 수 있다.
		 */

		System.out.println("===== Container : Start =====");
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		System.out.println("\n===== Biz =====");

		Point point1 = context.getBean("point", Point.class);
		Point point2 = context.getBean("point", Point.class);
		Point point3 = context.getBean("point", Point.class);

		System.out.println("\n----- Reference -----");
		System.out.println("point1=" + point1);
		System.out.println("point2=" + point2);
		System.out.println("point3=" + point3);

		System.out.println("\n----- count -----");
		// 생성자가 1번만 호출된다.
		System.out.println("count1=" + point1.getCount()); // 1
		System.out.println("count2=" + point2.getCount()); // 1
		System.out.println("count3=" + point3.getCount()); // 1

		System.out.println("\n----- balance -----");
		point1.setBalance(5000);
		point2.setBalance(1000);
		point3.setBalance(300);

		// 값이 모두 같다.
		System.out.println("balance1=" + point1.getBalance()); 
		System.out.println("balance2=" + point2.getBalance());
		System.out.println("balance3=" + point3.getBalance());

		System.out.println("\n----- getRandom() -----");
		// 값이 모두 다르다.
		System.out.println("getRandom1=" + point1.getRandom());
		System.out.println("getRandom2=" + point2.getRandom());
		System.out.println("getRandom3=" + point3.getRandom());

		System.out.println("\n===== Container : End =====");
		context.close();
	}

}
