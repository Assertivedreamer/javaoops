public class overriding {
}









//package variables;
////Method OverLoading
//public class VariableScope {
//
//	static int e=100;
//	public static void main(String[] args) {
//		run();
//		run(10,30);
//		run(10.0,70);
//	}
//
//	public static void run() {
//		VariableScope.run(e, e);
//		System.out.println(e);
//	}
//
//	public static void run(int a, int b) {
//		System.out.println("Product of a and b is: " + (a*b));
//	}
//	public static void run(double d1, int d2) {
//		System.out.println("Sum of d1 and d2 is: " + (d1+d2));
//	}
//	public static void run(int d, double a) {
//
//	}
//}






///Method Overriding Super Class
//
//		package variables;
//
//public class A{
//	public void hello(int a) {
//		System.out.println("Hello I am from Class A (Super Class)");
//	}
//}


//Polymorphism: 2 types: 1. Compile time Polymorphism(Eg:1. Method Over Loading, 2. Constructor Over Loading)
//2. Run time Polymorphism(Eg: Method Overriding)
//Method Overriding Sub Class
//
//package variables;
//
//public class B extends A{
////	public static void main(String[] args) {
////		B b=new B();
////		b.hello();
////	}
//
//	public void hello(int a) {
//		super.hello(a);//Inorder to access the Parent class method implementation, even after Method Overriding
//		System.out.println("Hello: I am from Class B (Sub Class)");
//	}
//}
////Method Overriding User Class
//
//package variables;
//
//public class UserClass {
//
//	public static void main(String[] args) {
//		A b=new B();
//		b.hello(10);
//
//	}
//
//}


//constructor

//package variables;

//public class ConstructorBP {
//
//	int length;
//	int breadth;
//	int heigth;
//
//
//	public ConstructorBP(int l, int b) {
//		this.length = l;
//		this.breadth = b;
//	}
//
//	public void area() {
//		System.out.println("Area is: " + (this.length*this.breadth));
//	}
//
//
//	public static void main(String[] args) {
//
//		ConstructorBP c1=new ConstructorBP(10,20);
//		c1.length=10;
//		c1.heigth=20;
//		c1.area();
//	}
//}



//constructor overloading
//package variables;
//
//public class ConstructorBP {
//
//	int length;
//	int breadth;
//	int heigth;
//
//	//Constructor OverLoading
//	public ConstructorBP(int l, int b) {
//		this.length = l;
//		this.breadth = b;
//	}
//
//
//	public ConstructorBP(int length, int breadth, int heigth) {
//		this.length = length;
//		this.breadth = breadth;
//		this.heigth = heigth;
//	}
//
//
//	public void area() {
//		if(this.heigth==0)
//			System.out.println("Area is: " + (this.length*this.breadth));
//		else
//			System.out.println("Volume is: " + (this.length*this.breadth*this.heigth));
//	}
//
//
//
//	public static void main(String[] args) {
//
//		ConstructorBP c1=new ConstructorBP(10,20);
////				c1.length=20;
////				c1.breadth=40;
//		c1.area();
//		ConstructorBP c2=new ConstructorBP(10,20,30);
//		c2.area();
//	}
//}
