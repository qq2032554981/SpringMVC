package com.heaboy.annotation;

import java.lang.annotation.*;

/**
 * @author heaboy
 *
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE,ElementType.METHOD})
public @interface RequestMapping {
    /**
     *
     * @return
     */
    String value() default "";
}
