package com.testng.features;

import org.testng.annotations.Test;

public class Grouping_Test {
	
	@Test(groups = "Music")
	private void spotify() {

		System.out.println("spotify");
	}

	@Test(groups = "Music")
	private void jiosaavn() {

		System.out.println("jiosaavn");
	}
	
	@Test(groups = "Music")
	private void wynkMusic() {

		System.out.println("wynkmusic");
	}
	
	@Test(groups = "Social Media")
	private void facebook() {

		System.out.println("Facebbok");
	}
	
	@Test(groups = "Social Media")
	private void watsapp() {

		System.out.println("watsapp");
	}
	
	@Test(groups = "Social Media")
	private void twitter() {
	
		System.out.println("twitter");
	}
	
	@Test(groups = "Social Media")
	private void instagram() {
		
		System.out.println("instagram");

	}
	
	@Test(groups = "Books")
	private void novels() {

		System.out.println("novels");
	}
	
	@Test(groups = "Books")
	private void literatures() {

		System.out.println("literatures");
	}
	
	@Test(groups = "Shopping")
	private void women() {

		System.out.println("women");
	}
	
	@Test(groups = "Shopping")
	private void dresses() {

		System.out.println("dresses");
	}
	
	@Test(groups = "Shopping")
	private void tshirts() {

		System.out.println("tshirts");
	}
}
