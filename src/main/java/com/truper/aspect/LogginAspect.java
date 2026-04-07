package com.truper.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Component
@Aspect
@Slf4j
public class LogginAspect {

	@Around("execution(* com.truper.controller.*.*(..) )")
	public Object executeTimeLoggin(ProceedingJoinPoint joinPoint) throws Throwable {
		var startExecute= System.currentTimeMillis();
		var obj= joinPoint.proceed();
		var endExecute= System.currentTimeMillis();
		log.info("{} execute in {} ms",joinPoint.getSignature(),endExecute-startExecute);
		return obj;
	}
}
