package com.sp;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration//this will be our configuration class
@ComponentScan("com.sp")//it will scan all packages starting from "com.sp"
public class AppConfiguration {

}
