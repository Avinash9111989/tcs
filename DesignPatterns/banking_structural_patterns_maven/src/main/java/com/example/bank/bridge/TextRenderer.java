package com.example.bank.bridge;

public class TextRenderer implements ReportRenderer {
    @Override public void renderHeader(String title){ System.out.println("-- " + title + " --"); }
    @Override public void renderLine(String line){ System.out.println(line); }
    @Override public void renderFooter(){ System.out.println("---- end ----"); }
}
