package com.example.bank.bridge;

public class HTMLRenderer implements ReportRenderer{

	@Override
	public void renderHeader(String title) {
		// TODO Auto-generated method stub
		System.out.println("HTML Header");
	}

	@Override
	public void renderLine(String line) {
		// TODO Auto-generated method stub
		System.out.println("HTML body");
	}

	@Override
	public void renderFooter() {
		// TODO Auto-generated method stub
		System.out.println("HTML footer");
	}

}
