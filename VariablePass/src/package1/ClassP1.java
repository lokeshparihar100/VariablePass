package package1;

import com.package3.ClassP3;
import com.package2.*;
import com.package1.*;

public class ClassP1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClassComP1 p1 = new ClassComP1();
		p1.startTime();
		
		ClassP2 p2 = new ClassP2();
		p2.doSomthing();
		
		ClassP3 p3 = new ClassP3();
		p3.program();
		

	}

}
