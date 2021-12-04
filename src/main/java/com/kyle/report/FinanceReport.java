package com.kyle.report;

import java.util.function.Consumer;

public class FinanceReport implements Reports {
    @Override
    public void load() {
        System.out.println("Load FinanceReport.");
    }

    @Override
    public void print() {
        System.out.println("Print FinanceReport.");
    }

}
