package com.example.bank.bridge;

public class PdfRenderer implements ReportRenderer {
    @Override public void renderHeader(String title){ System.out.println("[PDF HEADER] " + title); }
    @Override public void renderLine(String line){ System.out.println("[PDF] " + line); }
    @Override public void renderFooter(){ System.out.println("[PDF FOOTER]"); }
}
