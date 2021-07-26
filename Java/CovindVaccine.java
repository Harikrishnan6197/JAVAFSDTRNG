package com.ust.examples;
class Vaccination{
	private String name;
	private int age;
	private boolean vaccinated;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public boolean isVaccinated() {
		return vaccinated;
	}
	public void setVaccinated(boolean vaccinated) {
		this.vaccinated = vaccinated;
	}
	
}

public class CovindVaccine {

	public static void main(String[] args) {
	Vaccination v = new Vaccination();
	v.setName("Hari");
	v.setAge(24);
	v.setVaccinated(false);
	if (v.isVaccinated()==true) {
		System.out.println(v.getName()+" "+v.getAge()+" "+"Vaccinated");
	}
	else {
		System.out.println(v.getName()+" "+v.getAge()+" "+"Not Vaccinated");
	}
	}

	}


