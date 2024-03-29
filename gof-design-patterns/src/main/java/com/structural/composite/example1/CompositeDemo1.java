package com.structural.composite.example1;

public class CompositeDemo1 {

	public static void main(String[] args) {
		Menu mainMenu = new Menu("Main", "/main");
		
		MenuItem saftyMenuItem = new MenuItem("Safety", "/safty");
		mainMenu.add(saftyMenuItem);
		
		Menu claimsSubMenu = new Menu("Claims", "/claims");
		mainMenu.add(claimsSubMenu);
		
		MenuItem personalClaimsMenu = 
				new MenuItem("Personal Claim", "/personalClaims");
		claimsSubMenu.add(personalClaimsMenu);
		
		System.out.println(mainMenu.toString());
	}
}
