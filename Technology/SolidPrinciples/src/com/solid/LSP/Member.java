package com.solid.LSP;

abstract  class Member implements IDatabase,IBooking{


}
interface  IBooking{
	 void makeBooking();
}
interface  IDatabase{
	 void addToDatabase();
}
class LifeTimeMember extends Member{

	@Override
	public void addToDatabase() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void makeBooking() {
		// TODO Auto-generated method stub
		
	}


	
}
class Enquiry implements IDatabase{

	@Override
	public void addToDatabase() {
		// TODO Auto-generated method stub
		
	}

	
	
}
