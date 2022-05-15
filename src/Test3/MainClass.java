package Test3;

import Test1.ParentClass;
import Test2.ChildClass;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(" **************** Parent Class ********");
		ParentClass p = new ParentClass();		
		p.method1();
		p.method2();
		
		
		System.out.println(" **************** Child Class ********");
		ChildClass c = new ChildClass();
	
		c.method1();		
		c.method2();
		c.method3();
		
		System.out.println(" **************** Inheritance Class ********");
		ParentClass ref = new ChildClass();
		ref.method1();
		ref.method2();
		
	}

}
