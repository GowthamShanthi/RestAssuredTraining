package com.ms.non_bdd;

public class MethodChainingExample {
	
	
	String place;
	String modeOfTravel;
	

	public String getPlace() {
		return place;
	}


	public   MethodChainingExample setPlace(String place) {
		this.place = place;
		
		return this;
	}


	public String getModeOfTravel() {
		return modeOfTravel;
	}


	public  MethodChainingExample setModeOfTravel(String modeOfTravel) {
		this.modeOfTravel = modeOfTravel;
		return this;
		
	}
	
	
	public  void whereAreYouGoing() {
		
		System.out.println(getPlace());
		
		System.out.println("Are you going in "+getModeOfTravel()+"??????????");
		
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		MethodChainingExample methodChainingExample = new MethodChainingExample();
		
		 methodChainingExample.setPlace("New Hersey").setModeOfTravel("Flight").whereAreYouGoing();
		
		
		
		

	}

}
