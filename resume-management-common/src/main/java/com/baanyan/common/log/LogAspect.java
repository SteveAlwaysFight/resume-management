package com.baanyan.common.log;

/**
 * Created by steve on 3/2/16.
 */
import java.lang.reflect.Method;
import java.sql.Timestamp;
import java.util.Date;


import com.baanyan.common.model.User;
import com.baanyan.common.util.ContextUtil;
import org.apache.commons.lang.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.beans.factory.annotation.Autowired;


public class LogAspect {

    @Autowired
    private SystemLogService systemLogService;

    private Log logger = LogFactory.getLog(LogAspect.class);

    public Object doSystemLog(ProceedingJoinPoint point) throws Throwable {

        MethodSignature signature = (MethodSignature) point.getSignature();
        Method method = signature.getMethod();
        if(method!=null && method.isAnnotationPresent(ControllerLog.class)){
            ControllerLog controllerLog = method.getAnnotation(ControllerLog.class);
            String description = controllerLog.description();
            SystemLog systemLog = new SystemLog();
            systemLog.setCreateTime(new Timestamp(new Date().getTime()));
            systemLog.setUserName("user name");
            systemLog.setUserId("iamid");
            systemLog.setExeOperation(description);
            systemLogService.save(systemLog);
        }
        return point.proceed();
    }

}
