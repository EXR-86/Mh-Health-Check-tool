package com.mhcure.javatools.healthcheck.processor.step.impl;

import com.mhcure.javatools.healthcheck.processor.step.SystemHealthChecker;

public class PortConnectivityHealthChecker implements SystemHealthChecker {

    @Override
    public void performHealthCheck() {

    }

    @Override
    public int getSortOrder() {
        return 0;
    }

    @Override
    public boolean skipProcessing() {
        return false;
    }
}
