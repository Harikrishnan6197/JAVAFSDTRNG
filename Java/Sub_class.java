package com.ust.examples;

class Super_class{
	int num = 20;
	// Display method of superclass
	public void display() {
		System.out.println("This is the display method of superclass ");
	}
}
public class Sub_class extends Super_class{
int num = 10;
//display method of sub_class
public void display() {
System.out.println("This is the display method of subclass");
}
public void my_method() {
	// Instantiating subclass
	Sub_class sub = new Sub_class();

// invoking the display() method of subclass 
sub.display();

//invoking the display method of superclass
super.display();

// Printing the value of variable num of subclass
System.out.println("value of variable named num in Subclass:"+ sub.num);

// Printing the value of variable num of subclass
System.out.println("value of variable named num in superclass:"+ super.num);
}
	public static void main(String[] args) {
Sub_class obj = new Sub_class();
obj.my_method();
	}

}
