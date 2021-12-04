package com.kyle.report;

public class HealthReport implements Reports {
    @Override
    public void load() {
        System.out.println("Load HealthReport.");
    }

    @Override
    public void print() {
        System.out.println("Print HealthReport");
    }
}
