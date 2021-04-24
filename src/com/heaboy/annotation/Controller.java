package com.heaboy.annotation;

import javax.xml.ws.RequestWrapper;
import java.lang.annotation.*;

/**
 * heaboy 的controller声明
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @ interface Controller {
}
