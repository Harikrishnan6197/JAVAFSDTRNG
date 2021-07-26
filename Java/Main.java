package com.ust.examples;

class Cpu{
	double price;
	
	class Processor{
		double cores;
		String manufacturer;
		double getCache(){
			return 4.3;
		}
	}
	
	    protected class RAM{
		double memory;
		String manufacturer;
		double getClockSpeed() {
			return 5.5;
		}
	}
}
public class Main {

	public static void main(String[] args) {
Cpu cpu =new Cpu();

Cpu.Processor processor = cpu.new Processor();
Cpu.RAM ram = cpu.new RAM();
System.out.println("processor cache = "+processor.getCache());
System.out.println("Ram speed = "+ ram.getClockSpeed());



   }

	}

 
