package com.mhcure.javatools.healthcheck.processor.step;


public interface SystemHealthChecker {

    void performHealthCheck();
    int getSortOrder();
    boolean skipProcessing();

}
