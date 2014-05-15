package be.vdab.aspects;

import org.aspectj.lang.annotation.*;

@Aspect
public class PointcutExpressions {
	@Pointcut("execution(* be.vdab.services.*.*(..))")
	public void servicePointcut() {}
	
	@Pointcut("execution(* be.vdab.dao.*.*(..))")
	public void daoPointcut() {}
}
