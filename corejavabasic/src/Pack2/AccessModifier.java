package Pack2;

import Pack1.Modifiers;

public class AccessModifier extends Modifiers {

	public static void main(String[] args) {
		AccessModifier a1 = new AccessModifier();
		System.out.println("private variable: " + a1.num1);
		System.out.println("default variable: " + a1.num2);
		System.out.println("protected variable: " + a1.num3);
		System.out.println("public variable: " + a1.num4);
		
		Modifiers m1 = new Modifiers();
		System.out.println("public variable:"+m1.num4);
		//System.out.println("protected variable: " + m1.num3);by using parent class we only access public class
	}

	}


