package be.vdab.aspects;

import org.aspectj.lang.*;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;

@Aspect
@Order(1)
public class Performance {
	@Around("be.vdab.aspects.PointcutExpressions.servicePointcut()")
	public Object getUitvoeringsTijd(ProceedingJoinPoint joinPoint) 
	throws Throwable {
		long voor = System.nanoTime();
		System.out.printf("timer voor join point:%d\n", voor);
		Object returnValue = null;
		try {
			return returnValue = joinPoint.proceed();
		} finally {
			long na = System.nanoTime();
			System.out.printf("timer na join point:%d\n", na);
			Signature signature = joinPoint.getSignature();
			System.out.printf("%s duurde %d nanosecs.\n", signature.toShortString(),
			na - voor);
			System.out.printf("Return waarde:%s\n", returnValue);
		}
	}
}
