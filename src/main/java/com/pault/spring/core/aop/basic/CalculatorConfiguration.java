package com.pault.spring.core.aop.basic;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Component
@ComponentScan("com.pault.spring.core.aop.basic")
@EnableAspectJAutoProxy
public class CalculatorConfiguration {

}
