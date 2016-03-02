package com.baanyan.common.logz;

import com.baanyan.common.log.ControllerLog;
import com.baanyan.common.log.SystemLog;
import com.baanyan.common.log.SystemLogService;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.beans.factory.annotation.Autowired;

import java.lang.reflect.Method;

/**
 * Created by steve on 3/2/16.
 */
@Aspect
public class LogAspect {
    @Pointcut("execution(* com.baanyan.*.controller.*Controller.*(..))")
    public void pointCutMethod(){
        System.out.println("aop init");
    }

    @Autowired
    SystemLogService systemLogService;

    @Around("pointCutMethod()")
    public Object doLog(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("qie dian yi jing zhao dao le ");
        MethodSignature signature = (MethodSignature) pjp.getSignature();
        Method method = signature.getMethod();
        ControllerLog logA =  method.getAnnotation(ControllerLog.class);


        if(method!=null && logA!=null){
            String description= logA.description();
            String name = method.getName();
            SystemLog log = new SystemLog();
            log.setExeOperation(description + name);

//            log.setExeOperation(name);
            System.out.println("kai shi ji lu ri zhi  ");
            systemLogService.save(log);
        }

        System.out.println("qie dian ji xu yun xing ");
        return pjp.proceed();
    }



}
