package com.example.core.practice27;

import java.lang.reflect.Method;
import java.util.Arrays;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AspectApp {


	// ===== PointCut =====

//	@Pointcut("execution(* com.example.core..*.*(..))") // sb.mvc 패키지와 그 하위 패키지의 모든 메서드에 적용
//	public void pointcutAll() {
//	}

	@Pointcut("execution(* com.example.core.practice27..*.*(..))") // sb.mvc.cp43_aop.ep02_aop.sp03_spring_aop
																				// 패키지와 그 하위 패키지의 모든 메서드에 적용
	public void pointcutAop() {
	}

	// ===== Advice =====
	// - Advice 메서드 이름은 자유롭게 작성
	// - 애너테이션(ex : @Before)이 핵심

	// 1. Before
	// - 대상 메서드 실행 전 호출
	@Before("pointcutAop()") 
	public void beforeAdvice() {
		Log.printTime();
		System.out.println(" beforeAdvice()");
	}

//	// 2. AfterReturning
//	// - 대상 메서드 실행 종료 후 호출
	@AfterReturning("pointcutAop()")
	public void afterReturningAdvice() {
		Log.printTime();
		System.out.println(" afterReturningAdvice()");
	}

//	// 3. AfterThrowing
//	// - 대상 메서드에서 예외 발생 시 호출
	@AfterThrowing("pointcutAop()")
	public void afterThrowingAdvice() {
		Log.printTime();
		System.out.println(" afterThrowingAdvice()");
	}

//	// 4. After
//	// - 대상 메서드 실행 후 호출(예외 발생 되더라도 실행 됨)
	@After("pointcutAop()") 
	public void afterAdvice() {
		Log.printTime();
		System.out.println(" afterAdvice()");
	}

	// 5. Around
	// - 대상 메서드 실행 전후 호출
	// - 예외 발생 되더라도 실행 됨.
	// - ProceedingJoinPoint는 @Around에서만 사용
	@Around("pointcutAop()")
	public Object aroundAdvice(ProceedingJoinPoint pjp) throws Throwable {
		Log.printTime();
		System.out.println(" aroundAdvice() :: START");

		// ProceedingJoinPoint 정보
		System.out.println("aroundAdvice() :: 클래스=" + pjp.getTarget().getClass().getSimpleName());
		MethodSignature methodSignature = (MethodSignature) pjp.getSignature();
		Method method = methodSignature.getMethod();
		System.out.println("aroundAdvice() :: 메서드=" + method.getName() + "()");

		Object returnObj = pjp.proceed();

		Log.printTime();
		System.out.println(" aroundAdvice() :: END");
		return returnObj;
	}

}
