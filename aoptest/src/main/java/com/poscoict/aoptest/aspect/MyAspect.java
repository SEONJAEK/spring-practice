package com.poscoict.aoptest.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

//aop를 설정하는 클래스다 알려주는것 @Aspect
@Aspect
@Component
public class MyAspect {
	@Before("execution(public com.poscoict.aoptest.vo.ProductVo com.poscoict.aoptest.service ProductService.find(String))")
	public void beforeAdvice() {
		System.out.println("---Before Advice");
	}
	
	//*:모든 리턴타입
	//*..*:class path 패키지 이름 생략
	@After("execution(* *..*.ProductService.find(..))")
	public void afterAdvice() {
		System.out.println("---After Advice---");
	}
	
	//execution(* *..*.*.*(..)): 모든 메서드에 대해서 
	@AfterReturning("execution(* *..ProductService.*.*(..))")
	public void afterReturningAdvice() {
		System.out.println("---After Returning Advice---");
	}

	//execution(* *..*.*.*(..)): 모든 메서드에 대해서 
	@AfterThrowing(value="execution(* *..*.*.*(..))", throwing="ex")
	public void afterThrowingAdvice(Throwable ex) {
		System.out.println("---After Throwing Advice "+ ex+ "---");
	}
	
	@Around("execution(* *..ProductService.*.*(..))")
	public Object aroundAdvice(ProceedingJoinPoint pjp) throws Throwable {
		/*before*/
		System.out.println("---Around(Before) Advice---");
		//....본체코드 실행
		
		
		/**
		 * PointCut method 실행
		 */
		//파라미터변경
		Object[] params = {"Camera"};
		//PointCut method 실행
		Object result = pjp.proceed();
		
		
		/*after*/
		System.out.println("---Around(After) Advice---");
		
		return result;
	}
	
}
