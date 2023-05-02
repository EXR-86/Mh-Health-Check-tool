package com.mhcure.javatools.healthcheck.processor;

import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:application.yml")
public class SystemHealthCheckProcessor {


}
