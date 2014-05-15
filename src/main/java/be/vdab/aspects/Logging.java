package be.vdab.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.*;

@Aspect
public class Logging {
	@AfterThrowing(pointcut = "be.vdab.aspects.PointcutExpressions.servicePointcut()",
			throwing = "ex")
	public void schrijFoutInLogBoek(JoinPoint joinPoint, Throwable ex) {
		System.out.println("Fout toevoegen aan logboek");
		Signature signature = joinPoint.getSignature();
		System.out.println(signature.getName());
		System.out.println(signature.getDeclaringTypeName());
		System.out.println(signature.toLongString());
		System.out.println(joinPoint.getTarget().getClass().getName());
		for (Object object : joinPoint.getArgs()) {
			System.out.println(object);
		}
		System.out.println(ex);
	}
}
