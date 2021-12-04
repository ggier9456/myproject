package com.kyle.report;

import java.util.ArrayList;
import java.util.List;

public class Tester {
    public static void main(String[] args) {
        Reports health  = new HealthReport();
        Reports finance = new FinanceReport();
        List<Reports> report = new ArrayList<>();
        report.add(health);
        report.add(finance);
        for(Reports reports1 :report){
            reports1.load();
            reports1.print();
        }

    }
}
