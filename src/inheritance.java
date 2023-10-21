


class A{
	static void fun() {
		System.out.println("hi");
	}
}
class Start extends A{
	static void fun1(int a) {
		System.out.println(a);
	}
	public static void main(String args[]) {
		Start.fun();
		Start.fun1(24);
			}
		}



//class A{
//    static String fun(String s){
//        return s;
//    }
//}
//class B extends  A{
//    static int fun1(int a,int b){
//        return  a+b;
//    }
//}
//
//
//public class inheritance {
//    public static void main(String args[]){
//        B obj=new B();
//        System.out.print(obj.fun("java"));
//        System.out.print(obj.fun1(23,5));
//    }
//}



//    void without params
//class A {
//    void fun() {
//        System.out.print("hi");
//    }
//}
//class B extends A {
//    void fun1() {
//        System.out.print("hlo");
//    }
//}
//public class inheritance {
//    public static void main(String args[]) {
//        B obj = new B();
//        obj.fun();
//        obj.fun1();
//    }
//}



//    void with params
//class A{
//    void fun(String s){
//        System.out.print(s);
//    }
//}
//class B extends  A{
//    void fun1(int a){
//        System.out.print(a);
//    }
//}
//public class inheritance {
//    public static void main(String args[]){
//        B obj=new B();
//        obj.fun("java");
//        obj.fun1(23);
//    }
//}


//hierarchy
// class AA {
//	void fun1(){
//		System.out.print("hi");
//	}
//}
//class BB extends  AA{
//	void fun2() { System.out.print("hlo");
//	}
//}
//class CC extends AA{
//	void fun3(){
//		System.out.print("hlo");
//	}
//	class Inn{
//		public  static void main(String args[]){
//			BB r=new BB();
//			CC r1=new CC();
//			r.fun2();
//			r.fun1();
//			r1.fun3();
//
//		}
//
//	}
//
//}




// multi--level
//	 class Parent1 {
////  void fun() {
////
////    System.out.println("Parent1");
////  }
////}
////class Parent2 extends Parent1{
////  void fun1() {
////
////    System.out.println("Parent2");
////  }
////}
////class inheritance extends Parent2 {
////  public static void main(String args[]) {
////    inheritance t = new inheritance();
////    t.fun();
////    t.fun1();
////  }
////}
//




// hybrid
// class GrandFather
//{
//	public void showG()
//	{
//		System.out.println("He is grandfather.");
//	}
//}
//class Father extends GrandFather
//{
//	public void showF()
//	{
//		System.out.println("He is father.");
//	}
//}
//class Son extends Father
//{
//	public void showS()
//	{
//		System.out.println("He is son.");
//	}
//}
//public class Oop extends Father
//{
//	public void showD()
//	{
//		System.out.println("She is daughter.");
//	}
//	public static void main(String args[])
//	{
//
//		Son obj = new Son();
//		obj.showS();
//		obj.showF();
//		obj.showG();
//		Oop obj2 = new Oop();
//		obj2.showD();
//		obj2.showF();
//		obj2.showG();
//	}
//}






//inheritance super class



//
//package variables;
//
//public class A {
//	public void hello() {
//		System.out.println("Hello I am from Class A (Super Class)");
//	}
//}
//package variables;
//
//public class B extends A{
////	public static void main(String[] args) {
////		B b=new B();
////		b.hello();
////	}
//
//	public void hello() {
//		System.out.println("Hello: I am from Class B (Sub Class)");
//	}
//}
//package variables;
//
//public class UserClass {
//
//	public static void main(String[] args) {
//		A b=new B();
//		b.hello();
//
//	}
//
//}








//interface & multiple inheritance

////Interface1
//
//package variables;
//
//public interface InterI1 {
//
//	public void run();
//	public void jump();
//}
////Interface2
//
//package variables;
//
//public interface InterI2 {
//	public void sleep();
//}
////Concrete Implementing Sub Class to provide implementations for Interfaces
//
//package variables;
//
//public class MultipleInt implements InterI1, InterI2{
//
//	@Override
//	public void sleep() {
//		System.out.println("Hiiii I am from Sleep Method");
//	}
//
//	@Override
//	public void run() {
//		System.out.println("Hiiii I am from Run Method");
//	}
//
//	@Override
//	public void jump() {
//		System.out.println("Hiiii I am from Jump Method");
//	}
//
//}
////User Logic Class to Run the methods
//
//package variables;
//
//public class MultipleInheritanceInterface {
//
//	public static void main(String[] args) {
//		MultipleInt mi=new MultipleInt();
//
//		mi.run();
//		mi.jump();
//		mi.sleep();
//
//	}
//
//}





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


