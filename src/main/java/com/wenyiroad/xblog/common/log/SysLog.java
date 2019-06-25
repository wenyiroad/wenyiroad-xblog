package com.wenyiroad.xblog.common.log;

import java.lang.annotation.*;

/**
 * @Auther: Mojito
 * @Date: 2019/6/25 22:07
 * @Description:
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface SysLog {
    String value() default "";
}
