package be.vdab.aspects;

import org.aspectj.lang.*;
import org.aspectj.lang.annotation.*;

@Aspect
class Auditing {
	@Before("execution(* be.vdab.services.*.*(..))")
	public void schrijfInAuditTable(JoinPoint joinPoint) {
		System.out.println("Record toevoegen aan auditing table");
		Signature signature = joinPoint.getSignature();
		System.out.println(signature.getName());
		System.out.println(signature.getDeclaringTypeName());
		System.out.println(signature.toLongString());
		System.out.println(joinPoint.getTarget().getClass().getName());
		for (Object object : joinPoint.getArgs()) {
			System.out.println(object);
		}
	}
}
