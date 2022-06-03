package org.testing;

public class Company extends Client {
	private void companyName() {
System.out.println("company name = wibro");
	}
public static void main(String[] args) {
	Company c= new Company();
	c.clientName();c.companyName();
}
}
