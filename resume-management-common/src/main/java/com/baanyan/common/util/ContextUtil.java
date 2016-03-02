package com.baanyan.common.util;

import com.baanyan.common.model.User;
import org.apache.commons.logging.LogFactory;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.apache.commons.logging.Log;

/**
 * Created by steve on 3/2/16.
 */
public class ContextUtil {
    static Log logger = LogFactory.getLog(ContextUtil.class);

    public static User getCurrentUser(){
        SecurityContext securityContext = SecurityContextHolder.getContext();
        if (securityContext != null) {
            Authentication auth = securityContext.getAuthentication();
            if (auth != null) {
                Object principal = auth.getPrincipal();
                if (principal instanceof User) {
                    return (User) principal;
                }
            } else {
                logger.warn("WARN: securityContext cannot be lookuped using SecurityContextHolder.");
            }
        }
        return null;
    }
}
