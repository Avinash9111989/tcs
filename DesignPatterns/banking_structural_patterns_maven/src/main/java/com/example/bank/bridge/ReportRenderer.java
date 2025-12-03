package com.example.bank.bridge;

public interface ReportRenderer {
    void renderHeader(String title);
    void renderLine(String line);
    void renderFooter();
}
