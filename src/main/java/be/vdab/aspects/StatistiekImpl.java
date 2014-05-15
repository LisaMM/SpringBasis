package be.vdab.aspects;

import java.util.*;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;

@Aspect
public class StatistiekImpl implements Statistiek {
	private Map<String, Integer> statistiek = new TreeMap<>();
	
	@After("be.vdab.aspects.PointcutExpressions.servicePointcut()")
	public void pasStatistiekenAan(JoinPoint joinPoint) {
		String sleutel = joinPoint.getTarget().getClass().getName()
			+ "." + joinPoint.getSignature().getName();
		Integer aantalOproepen = statistiek.get(sleutel);
		if (aantalOproepen == null) {
			statistiek.put(sleutel, 1);
		} else {
			statistiek.put(sleutel, aantalOproepen + 1);
		}
	}
	
	@Override
	public Map<String, Integer> getStatistiek() {
		return Collections.unmodifiableMap(statistiek);
	}

}
