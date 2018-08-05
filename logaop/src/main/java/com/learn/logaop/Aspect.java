package com.learn.logaop;

import android.util.Log;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;

@org.aspectj.lang.annotation.Aspect
public class Aspect {


    @Pointcut("execution(@com.learn.logaop.LogAnnotation * *(..))")
    public void addLog() {

    }


    @Around("addLog()")
    public Object add(ProceedingJoinPoint joinPoint) throws Throwable {


        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        LogAnnotation logAnnotation = methodSignature.getMethod().getAnnotation(LogAnnotation.class);

        if (logAnnotation != null) {
            Log.d("Aspect", "123:" + 123);
        }

        return joinPoint.proceed();


    }


}
