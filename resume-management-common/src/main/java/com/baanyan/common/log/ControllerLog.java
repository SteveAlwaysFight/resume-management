package com.baanyan.common.log;

/**
 * Created by steve on 3/2/16.
 */
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
public @interface ControllerLog {
    /**
     * description of the controller method
     * @return
     */
    String description() default "no description";
}
